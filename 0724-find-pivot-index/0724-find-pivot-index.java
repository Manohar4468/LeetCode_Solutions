class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre1= new int[nums.length];
        int[] pre2= new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            pre1[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            pre2[i]=sum;
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(pre1[i]==pre2[i])
            {
                return i;
            }
        }
        return -1;
    }
}
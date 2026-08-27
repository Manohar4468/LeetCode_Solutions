class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n=330_001;
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=arr[1]=false;
        for(int i=2;i*i<n;i++)
        {
            if(arr[i]==true)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    arr[j]=false;
                }
            }
        }
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++)
        {
            if(arr[nums[i]])
            {
                left=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(arr[nums[i]])
            {
                right=i;
                break;
            }
        }
        return right-left;
        
    }
}
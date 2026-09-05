class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int minElement=Integer.MAX_VALUE;
        int maxElement=Integer.MIN_VALUE;
        int[] mini= new int[nums.length];
        int[] maxi= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>maxElement)
            {
                maxElement=nums[i];
            }
             maxi[i]=maxElement;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]<minElement)
            {
                minElement=nums[i];
            }
            mini[i]=minElement;
        }
        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.print(maxi[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.print(mini[i]+" ");
        // }        
        boolean flag=false;
        int index=-1;
       // int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if((maxi[i]-mini[i]<=k))
            {
                return i;
            }
        }
        return -1;
    }
}
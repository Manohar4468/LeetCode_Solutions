class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=4_030_001;
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
        int maxEle=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(arr[nums[i][i]] && nums[i][i]>maxEle)
            {
                maxEle=nums[i][i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(arr[nums[i][nums.length-i-1]] && nums[i][nums.length-i-1]>maxEle)
            {
                maxEle=nums[i][nums.length-i-1];
            }
        }
        if(maxEle==-1)
        {
            return 0;
        }
        return maxEle;
    }
}
class Solution {
    static int[] dp;
    static int fun(int index, int[] nums)
    {
        if(index >=nums.length)
        {
            return 0;
        }
        if(dp[index]!=-1)
        {
            return dp[index];
        }
        //pick
        int pick=nums[index]+fun(index+2,nums);
        //non-pick
        int non_pick=fun(index+1,nums);
        return dp[index]=Math.max(pick,non_pick);
    }
    public int rob(int[] nums) {
        dp= new int[nums.length];
        Arrays.fill(dp,-1);
       return fun(0,nums);
    }
}

class Solution {
    static int find(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return find(b,a%b);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return find(nums[0],nums[nums.length-1]);
    }
}
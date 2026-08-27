class Solution {
    public int minOperations(int[] nums) {

        int cnt = 0;

        for(int i = nums.length - 2; i >= 0; i--)
        {
            if(nums[i] <= nums[i + 1])
            {
                continue;
            }

            int f = 2;

            while(f * f <= nums[i] && nums[i] % f != 0)
            {
                f++;
            }

            if(nums[i] % f != 0)
            {
                return -1;
            }

            int temp = nums[i] / f;
            nums[i] = nums[i] / temp;

            if(nums[i] <= nums[i + 1])
            {
                cnt++;
            }
            else
            {
                return -1;
            }
        }

        return cnt;
    }
}
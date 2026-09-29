class Solution {
    static void fun(int index, ArrayList<Integer> current, List<List<Integer>> ans, int[] nums)
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        //pick
        current.add(nums[index]);
        fun(index+1,current,ans,nums);
        current.remove(current.size()-1);
        //non-pick
        fun(index+1,current,ans,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> current= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        fun(0,current,ans,nums);
        return ans;
    }
}
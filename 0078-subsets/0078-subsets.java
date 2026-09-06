class Solution {
    public static List<List<Integer>> find(int index,int[] nums,List<Integer> temp, List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return ans;
        }
        //pick
        temp.add(nums[index]);
        find(index+1, nums, temp, ans);
        temp.remove(temp.size()-1);
        find(index+1,nums,temp,ans);
        return ans;
        //non-pick
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        return find(0,nums, temp,ans);
    }
}
class Solution {
    public static List<List<Integer>> combination(int index, int[] nums, List<Integer> temp, List<List<Integer>> ans,int k)
    {
        
            if(temp.size()==k)
            {
                ans.add(new ArrayList<>(temp));
                return ans;
            }
            if (index == nums.length) {
                return ans;
            }
        //pick
        temp.add(nums[index]);
        combination(index+1,nums,temp,ans,k);
        temp.remove(temp.size()-1);
        combination(index+1,nums,temp,ans,k);
        //non-pick
        return ans;
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=i+1;
        }
        List<Integer> temp= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        return combination(0,nums,temp,ans,k);
    }
}
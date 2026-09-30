class Solution {
    static void fun(int index, ArrayList<Integer> current, List<List<Integer>>ans, int[] candidates, int target,int sum)
    {
        if(sum==target)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index==candidates.length || sum>target)
        {
            return;
        }
        //pick
        current.add(candidates[index]);
        sum+=candidates[index];
        fun(index,current,ans,candidates, target, sum);
        sum-=candidates[index];
        current.remove(current.size()-1);
        //non-pick
        fun(index+1,current,ans,candidates,target,sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> current= new ArrayList<>();
        int sum=0;
        fun(0,current,ans,candidates,target,sum);
        return ans;
    }
}
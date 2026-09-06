class Solution {
       public  static List<List<Integer>> find(int index, int[] candidates,int target,List<Integer> arr,List<List<Integer>> ans)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(arr));
                return  ans;
            }
            if(index==candidates.length || target<0)
            {
                return ans;
            }
            arr.add(candidates[index]);
            find(index,candidates,target-candidates[index],arr,ans);
            arr.remove(arr.size()-1);
            find(index+1,candidates,target,arr,ans);
            
            return ans;

        }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        return find(0, candidates, target, arr, ans);
        //return ans;
        
    }
}
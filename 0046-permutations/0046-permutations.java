class Solution {
    static void fun(ArrayList<Integer> current,int[] visited, int[] nums,List<List<Integer>> ans)
    {
        if(current.size()==nums.length)
        {
            ans.add(new ArrayList<>(current));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]==0)
            {
                visited[i]=1;
                current.add(nums[i]);
                fun(current, visited, nums,ans);
                current.remove(current.size()-1);
                visited[i]=0;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int k= nums.length;
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> current= new ArrayList<>();
        int[] visited= new int[k];
        fun(current, visited, nums,ans);
        return ans;
    }
}
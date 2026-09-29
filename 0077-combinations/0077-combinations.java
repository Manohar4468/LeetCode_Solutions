class Solution {
    static void fun(int index,int k, ArrayList<Integer> current, int[] visited, List<List<Integer>> ans, int[] arr)
    {
        if(current.size()==k)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(visited[i]==0)
            {
                visited[i]=1;
                current.add(arr[i]);
                fun(i+1,k,current,visited,ans,arr);
                current.remove(current.size()-1);
                visited[i]=0;
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> current= new ArrayList<>();
        int[] visited= new int[n];
        fun(0,k,current,visited,ans,arr);
        return ans;
    }
}
class Solution {
    static void fun(int current, int temp, int k, int[] arr, int[] visited,int visitedCnt)
    {
        if(visitedCnt==arr.length-1)
        {
            return;
        }
        int tempNum=current;
        int find=0;
        boolean flag=true;
        while(flag)
        {
            if(visited[tempNum%arr.length]==0)
            {
                flag=false;
                tempNum=tempNum%arr.length;
            }
            else
            {
                tempNum++;
            }
        }
        if(temp==1)
        {
            visited[tempNum]=1;
            visitedCnt++;
            fun(tempNum+1,k,k,arr,visited,visitedCnt);
        }
        else
        {
            fun(tempNum+1,temp-1,k,arr,visited,visitedCnt);
        }
    }
    public int findTheWinner(int n, int k) {
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        int[] visited= new int[n];
        int visitedCnt=0;
        fun(0,k,k,arr,visited,visitedCnt);
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0)
            {
                ans=arr[i];
            }
        }
        return ans;
    }
}
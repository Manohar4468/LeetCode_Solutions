class Solution {
    static int count=0;
    static void fun(int index, ArrayList<Integer> current, int[] digits, int[] visited,int currentNum,Set<Integer> ans)
    {
        if(current.size()==3)
        {
            if( currentNum%2== 0){
                ans.add(currentNum);
            }
                return;
        }
        for(int i=0;i<digits.length;i++)
        {
            if(visited[i]==0)
            {
                if(current.size()==0 && digits[i]==0)
                {
                    continue;
                }
                visited[i]=1;
                current.add(digits[i]);
                currentNum*=10;
                currentNum+=digits[i];
                fun(i+1,current,digits,visited,currentNum,ans);
                currentNum-=digits[i];
                currentNum/=10;
                current.remove(current.size()-1);
                visited[i]=0;
            }
        }
    }
    public int totalNumbers(int[] digits) {
        ArrayList<Integer> current=new ArrayList<>();
        int[] visited= new int[digits.length];
       // ArrayList<Integer> ans= new ArrayList<>();
        int currentNum=0;
        Set<Integer> ans= new HashSet<>();
        fun(0,current,digits,visited,currentNum,ans);
        return ans.size();
    }
}
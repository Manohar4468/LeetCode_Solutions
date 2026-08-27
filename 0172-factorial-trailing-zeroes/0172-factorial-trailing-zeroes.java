class Solution {
    public int trailingZeroes(int n) {
       int cnt=0;
       for(int i=1;i<=n;i++)
       {
        if(i%5==0)//5
        {
            int temp=i;
           while(temp>0 && temp%5==0)//5>0
           {
            cnt+=1;//1
            temp=temp/5;//1
           }
        }
       }
       return cnt;


    }
}
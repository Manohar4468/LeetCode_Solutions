class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        int newNum=0;
        int cnt=1;
        while(n>=10)
        { 
            temp=n;
            while(temp>0)
            {
                newNum+=((temp%10)*(temp%10));
                temp=temp/10;
            }
           // System.out.println(newNum);
            n=newNum;
            if(newNum >=10)
            {
            newNum=0;
            }
        }
        if(newNum==1 || n==1 || newNum==7 || n==7)
        {
            return true;
        }
        return false;
    }
}
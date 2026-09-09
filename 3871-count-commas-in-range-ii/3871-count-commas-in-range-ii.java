class Solution {
    static int count(long x)
    {
        int cnt=0;
        while(x>0)
        {
            cnt+=1;
            x=x/10;
        }
        return cnt;
    }    
    public long countCommas(long n) {
        int digit=count(n);
       // System.out.println(digit);
        long ans=0;
        if(n<1000)
        {
            ans=0;
        }
        else if(digit >= 4 && digit<=6)
        {
            ans= n- (long)1e3+1;
        }
        else if(digit >= 7 && digit<=9)
        {
            ans+=(999999L-1000L)+1;
            ans+=((n-1000000L)+1)*2;
        }
        else if(digit >=10 && digit <=12)
        {
            ans+=(999999L-1000L+1);
            ans+=(999999999L-1000000L+1)*2;
            ans+=(n-1000000000L+1)*3;
        }
        else if(digit >=13 && digit <=15)
        {
            ans+=(999999L-1000L+1);
            ans+=(999999999L-1000000L+1)*2;
            ans+=(999999999999L-1000000000+1)*3;
            ans+=(n-1000000000000L+1)*4;
        }        
        else
        {
            ans+=(999999L-1000L+1);
            ans+=(999999999L-1000000L+1)*2;
            ans+=(999999999999L-1000000000+1)*3;
            ans+=(999999999999999L-1000000000000L+1)*4; 
            ans+=(n-1000000000000000L+1)*5;           
        }
        return  ans;
    }
}
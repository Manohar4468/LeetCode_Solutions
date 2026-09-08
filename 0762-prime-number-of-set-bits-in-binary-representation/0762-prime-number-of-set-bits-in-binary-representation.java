class Solution {
    static int n=1_000_000;
    static boolean[] sieve= new boolean[n+1];
    static void construct()
    {
        Arrays.fill(sieve,true);
        sieve[0]=sieve[1]=false;
        for(int i=2; 1L * i * i <= n;i++)
        {
            if(sieve[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    sieve[j]=false;
                }
            }
        }
    }
    public static int count(int x)
    {
        int cnt=0;
        while(x>0)
        {
            if((x&1)==1)
            {
                cnt+=1;
            }
            x=x/2;
        }
        return cnt;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        construct();
        for(int i=left;i<=right;i++)
        {
            if(sieve[count(i)])
            {
                ans+=1;
            }
        }
        return ans;
    }
}
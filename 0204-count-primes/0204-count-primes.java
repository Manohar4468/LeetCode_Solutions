class Solution {
    
    public int countPrimes(int n) {
        boolean[] arr=new boolean[n];
        
        Arrays.fill(arr,true);
        
        for(int i=2;i*i<n;i++)
        {
            if(arr[i]==true)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    arr[j]=false;
                }
            }
        }        
        int cnt1=0;
        for(int i=2;i<n;i++)
        {
            if(i>=n)
            {
                break;
            }
            else
            {
                if(arr[i]==true)
                {
                    cnt1++;
                }
            }
        }
        return cnt1;
    }
}
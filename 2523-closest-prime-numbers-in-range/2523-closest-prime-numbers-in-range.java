class Solution {
    public int[] closestPrimes(int left, int right) {
        int n=1_000_001;
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=arr[1]=false;
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
        int num1=-1;
        int num2=-1;
        int diff=98765432;
        int previous=-1;
        for(int i=left;i<=right;i++)
        {
            if(previous==-1 && arr[i]==true)
            {
                previous=i;
            }
            else if(arr[i]==true && (i-previous)<diff)
            {
                diff=i-previous;
                num1=previous;
                num2=i;
            }
            if(arr[i]==true)
            {
                previous=i;
            }
        }
            int[] ans=new int[2];
            ans[0]=num1;
            ans[1]=num2;
            return ans;
        }          
    }

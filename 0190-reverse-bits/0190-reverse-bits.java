class Solution {
    public int reverseBits(int n) {
        StringBuilder sb= new StringBuilder();
        while(n>0)
        {
            if(n%2==1)
            {
                sb.append("1");
            }
            else
            {
                sb.append("0");
            }
            n=n/2;
        }
        int remain=32-sb.length();
        if(remain!=0)
        {
            while(sb.length()<32)
            {
                sb.append("0");
            }
        }
        //sb=sb.reverse();
        int cnt=0;
        int result=0;
        for(int i=sb.length()-1;i>=0;i--)
        {
            if(sb.charAt(i)=='1'){
            result+=(int)Math.pow(2,cnt);
            }
            cnt++;
        }
        return result;
    }
}
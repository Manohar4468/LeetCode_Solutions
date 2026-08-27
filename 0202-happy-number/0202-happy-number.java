class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        int newNum=0;
        int cnt=1;
        Set<Integer> hashSet= new HashSet<>();
        while(true)
        { 
            temp=n;
            while(temp>0)
            {
                newNum+=((temp%10)*(temp%10));
                temp=temp/10;
            }
           // System.out.println(newNum);
            n=newNum;
            if(hashSet.contains(newNum))
            {
                return false;
            }
            else
            {
                hashSet.add(newNum);
            }
            if(newNum==1)
            {
                return true;
            }
            else
            {
                newNum=0;
            }
        }
    }
}
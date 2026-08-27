class Solution {
    public boolean isUgly(int n) {
        Set<Integer> hashSet= new HashSet<>();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(5);//2,3,4
        int[] fact={2,3,5};
        int f=fact[0];//
        int index=0;
        if(n==0)
        {
            return false;
        }
        while(true)
        {
           if(index > 2)
           {
            return false;
           }
           else if (n==1)
           {
            return true;
           }
            if(n%f ==0)//6%2 ==0
            {
                if(!hashSet.contains(f))//
                {
                    return false;
                }
                n=n/f;
            }
            else
            {
                index++;
                if(index >2)
                {
                    return false;
                }
                
                   
                    f=fact[index];
                
            }
        } 
       
        
    }
}
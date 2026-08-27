class Solution {
    public int singleNumber(int[] nums) {
       
        
        int count=0;
        int tempNum;
        int[] bit= new int[32];
        for(int i=0;i<nums.length;i++)
        {
           tempNum=nums[i];
            for(int j=0;j<32;j++)
            {
                if((tempNum & (1<<j)) !=0)
                {
                    bit[j]++;
                }
            }
            
        }
        int res=0;
        for(int i=0;i<bit.length;i++)
        {
            if(bit[i]%3 !=0)
            {
                res |= (1 << i);
            }
        }
        return res;

    }  
    
}
class Solution {
    public boolean uniformArray(int[] nums1) {
        int minEven=Integer.MAX_VALUE;
        boolean oddFlag=false;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==1)
            {
                continue;
            }
            else
            {
                oddFlag=true;
                break;
            }
        }
        boolean evenFlag=false;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0)
            {
                continue;
            }
            else
            {
                evenFlag=true;
                break;
            }
        }        
        if(oddFlag==false || evenFlag==false)
        {
            return true;
        }
        if(oddFlag==true){
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0 && nums1[i]<minEven)
            {
                minEven=nums1[i];
            }
        }
        int minOdd=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2 ==1 && nums1[i]<minOdd)
            {
                minOdd=nums1[i];
            }
        }
        if(minOdd < minEven)
        {
            return true;
        }

        }
        return false;
    }
}
class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex=-1;
        int maxIndex=-1;
        int minValue=Integer.MAX_VALUE;
        int maxValue=Integer.MIN_VALUE;
        if(nums.length==1)
        {
            return 1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<minValue)
            {
                minValue=nums[i];
                minIndex=i;
            }
            if(nums[i]>maxValue)
            {
                maxValue=nums[i];
                maxIndex=i;
            }
        }
        System.out.println("length = " + nums.length);
        System.out.println("minValue = " + minValue);
        System.out.println("minIndex = " + minIndex);
        System.out.println("maxValue = " + maxValue);
        System.out.println("maxIndex = " + maxIndex);
        int mid=nums.length/2;
        if(minIndex<= mid && maxIndex<=mid)
        {
            int temp=Math.max(minIndex,maxIndex);
            //System.out.println("<=mid "+temp);
            return temp+1;

        }
        else if((minIndex>= mid && maxIndex>=mid))
        {
            int temp=Math.min(minIndex,maxIndex);
           // System.out.println(">=mid "+temp);
            return nums.length-temp;
        }
        else
        {
            int left = Math.min(minIndex, maxIndex);
            int right = Math.max(minIndex, maxIndex);
            int front = right + 1;
            int back = nums.length - left;
            int first=Math.min(minIndex,(nums.length-minIndex-1));
            int second=Math.min(maxIndex,(nums.length-maxIndex-1));
            int opposite = first + second + 2;
            return Math.min(front, Math.min(back, opposite));
        }
      //  System.out.println(minIndex+" "+maxIndex);

        //return 0;
    }
}
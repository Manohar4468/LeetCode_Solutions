class Solution {
    public String convert(String s, int numRows) {
        char[] arr= s.toCharArray();//p a y p a l i s h i r  i  n  g 
                                    //0 1 2 3 4 5 6 7 8 9 10 11 12 13
        int temp1= ((numRows-1)*2)+2;//(6)
        int temp2= -2;//-2
        StringBuilder res = new StringBuilder();
        int temp=0;
        if(numRows == 1 || numRows >= s.length())
        {
            return s;
        }
    else
    {

       for(int i=0;i<numRows-1;i++)
       {
        temp1-=2;//2
        temp2+=2;//2
         temp=i;//1
        int cnt=0;
        if(i==0)
        {
            while(temp<s.length())//8<14
            {
                res.append(s.charAt(temp));//pahn
                temp+=temp1;//12
            }
        }

        else{
        while(temp<s.length())//15<14
        {
            cnt++;//7
            res.append(s.charAt(temp));//aplsig
            if(cnt%2!=0)
            {
                temp+=temp1;//15
            }
            else
            {
                temp+=temp2;//15
            }

        }
        }
       }
       temp=temp1+temp2;
       int i=numRows-1;
       while(i<s.length())
       {
        res.append(s.charAt(i));;
        i+=temp;
       }
    }
        return res.toString();
    }
}
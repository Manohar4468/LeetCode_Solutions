class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1= s.toCharArray();
        char[] arr2= t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String temp1=new String(arr1);
        String temp2= new String(arr2);
        System.out.println(arr1.toString()+"  "+arr2.toString());
        if(temp1.equals(temp2))
        {
            return true;
        }
        return false;
    }
}
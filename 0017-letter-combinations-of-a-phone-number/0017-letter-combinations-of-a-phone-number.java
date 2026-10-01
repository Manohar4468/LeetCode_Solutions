class Solution {
    static HashMap<Character, Character[]> map;
    static void fun(int index, StringBuilder current, List<String> ans, HashMap<Character,Character[]> map, String digits)
    {
        if(current.length()==digits.length())
        {
            ans.add(current.toString());
            return;
        }
        for(int i=0; i<map.get(digits.charAt(index)).length;i++)
        {
            current.append(map.get(digits.charAt(index))[i]);
            fun(index+1,current,ans,map,digits);
            current.deleteCharAt(current.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        map= new HashMap<>();
        map.put('2',new Character[]{'a','b','c'});
        map.put('3',new Character[]{'d','e','f'});
        map.put('4',new Character[]{'g','h','i'});
        map.put('5',new Character[]{'j','k','l'});
        map.put('6',new Character[]{'m','n','o'});
        map.put('7',new Character[]{'p','q','r','s'});
        map.put('8',new Character[]{'t','u','v'});
        map.put('9',new Character[]{'w','x','y','z'});
        StringBuilder current= new StringBuilder();
        List<String> ans= new ArrayList<>();
        fun(0,current,ans,map,digits);
        return ans;
    }
}
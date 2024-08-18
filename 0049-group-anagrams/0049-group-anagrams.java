class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>>res=new ArrayList<>();
        HashMap<String, List<String>> anagram=new HashMap<>();
        for(String s:strs)
        {
            char[]ch=s.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(!anagram.containsKey(str))
            {
                anagram.put(str, new ArrayList<>());
            }
            anagram.get(str).add(s);            
        }
        res.addAll(anagram.values());
        return res;
    }
}
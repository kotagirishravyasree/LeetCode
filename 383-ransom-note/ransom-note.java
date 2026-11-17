class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> hm1=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++)
        {
            hm1.put(ransomNote.charAt(i),hm1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++)
        {
            hm2.put(magazine.charAt(i),hm2.getOrDefault(magazine.charAt(i),0)+1);
        }
        if(hm2.size()<hm1.size())
        {
            return false;
        }
        else{
            for(char ch:hm1.keySet())
            {
                if(!hm2.containsKey(ch) || (hm2.containsKey(ch)&&hm2.get(ch)<hm1.get(ch)))
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}
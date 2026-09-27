class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> hm1=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();
        char ans='a';
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
        for(char ele:hm2.keySet())
        {
            if(!hm1.containsKey(ele) || hm2.get(ele)>hm1.get(ele))
            {
                ans=ele;
            }
        }
        return ans;
    }
}
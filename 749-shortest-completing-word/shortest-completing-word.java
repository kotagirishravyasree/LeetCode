class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String ans="";
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<licensePlate.length();i++)
        {
            char ch=licensePlate.charAt(i);
            if(Character.isLetter(ch))
            {
                ch = Character.toLowerCase(ch);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }
        for(int j=0;j<words.length;j++)
        {
            String s=words[j];
            boolean scw=true;
            Map<Character,Integer> hmWords=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                char ch = Character.toLowerCase(s.charAt(i));
                hmWords.put(ch, hmWords.getOrDefault(ch, 0) + 1);
            }
           
                for(char ele:hm.keySet())
                {
                    if(hmWords.getOrDefault(ele, 0) < hm.get(ele))
                    {
                        scw=false;
                        break;
                    }
                }
                if(scw && (ans.isEmpty() || s.length() < ans.length()))
                {
                   ans=s;
                }
            
        }
        return ans;

        
    }
}
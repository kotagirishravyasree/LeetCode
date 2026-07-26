class Solution {
    public int numJewelsInStones(String jewels, String stones) {
          HashMap <Character,Integer> hm1=new HashMap<>();
          HashMap <Character,Integer> hm2=new HashMap<>();
          int ans=0;
          for(int i=0;i<jewels.length();i++)
          {
            char ch=jewels.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
          }
          for(int i=0;i<stones.length();i++)
          {
            char ch=stones.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
          }
          for(int i=0;i<jewels.length();i++)
          {
            char ch=jewels.charAt(i);
            if(hm1.containsKey(ch)&&hm2.containsKey(ch))
            {
                ans=ans+hm2.get(ch);
            }
          }
          return ans;



        
    }
}
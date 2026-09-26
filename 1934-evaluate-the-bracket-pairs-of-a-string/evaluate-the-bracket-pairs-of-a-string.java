class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> hm=new HashMap<>();
        String ans="";
        for(int i=0;i<knowledge.size();i++)
        {
            hm.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        int i=0,j=i+1;
        while(i<s.length())
        {
            if(s.charAt(i)!='(')
            {
              ans+=s.charAt(i);
              i++;
            }
            else{
               if(s.charAt(j)==')')
               {
                 String sub=s.substring(i+1,j);
                 if(hm.containsKey(sub))
                 {
                    ans+=hm.get(sub);
                 }
                 else{
                    ans+="?";
                 }
                 i=j+1;

               }
            }
            j++;

        }
        return ans;

    
        
    }
}
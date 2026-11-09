class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
            String s=words.get(i);
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)!=separator)
                {
                    sb.append(s.charAt(j));
                }
                else if(!sb.toString().equals("")){
                    list.add(sb.toString());
                    sb=new StringBuilder();
                }
            }
             if(!sb.toString().equals("")){
                    list.add(sb.toString());
             }
        }
        return list;
        
        
    }
}
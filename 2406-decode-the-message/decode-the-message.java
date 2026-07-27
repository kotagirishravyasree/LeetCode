class Solution {
    public String decodeMessage(String key, String message) {
        HashMap <Character,Integer> hm=new HashMap<>();
        for(int i=0;i<key.length();i++)
        {
            char ch=key.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        char[] arr1=new char[26];
        int a=97;
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=(char)(a);
            a++;
        }
        ArrayList<Character> arr2=new ArrayList<Character>();
        for(int j=0;j<key.length();j++)
        {
            char ch=key.charAt(j);
            if(ch==' '||hm.get(ch)==0)
            {
                continue;
            }
            else if(hm.get(ch)!=0)
            {
             arr2.add(ch);
             hm.put(ch,0);
             
            }
        }
        String decode="";
        for(int i=0;i<message.length();i++)
        {
            char ch=message.charAt(i);
            if(ch==' ')
            {
                decode+=' ';
                continue;
            }
            else
            {
                int index=arr2.indexOf(ch);
                char c=arr1[index];
                decode+=c;
            }
        }
        return decode;


        
    }
}
class Solution {
    public String smallestPalindrome(String s) {
        TreeMap<Character,Integer> tm=new TreeMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        char[] arr1=new char[s.length()];
        int i=0,j=arr1.length-1;
       
        
            for(char ch:tm.keySet()){
            int freq=tm.get(ch);
            if(freq%2==0)
            {
               while(freq!=0)
              {
                arr1[i]=ch;
                arr1[j]=ch;
                i++;
                j--;
                freq-=2;
              }
            }
            else
            {
                while(freq!=1)
                {
                    arr1[i]=ch;
                    arr1[j]=ch;
                    i++;
                    j--;
                    freq-=2;
                }
            }

        
           
                if(freq==1)
                {
                    arr1[arr1.length/2]=ch;
                    
                }
            

        }
        String st=new String(arr1);
        return st;

        
    }
}
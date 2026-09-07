class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        {
            return false;
        }
        boolean valid=true;
        int v=0,c=0;
        if(word.length()>=3)
        {
            for(int i=0;i<word.length();i++)
            {
                String s=word.toLowerCase();
                char ch=s.charAt(i);
                if(!Character.isLetterOrDigit(ch))
                {
                    valid=false;
                    break;
                }
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                   v++;
                }
                if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&!Character.isDigit(ch))
                {
                   c++;
                }

            }
        }
        if(valid==true && v!=0 && c!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
        
    }
}
class Solution {
    public boolean detectCapitalUse(String word) {
        int len=word.length();
        boolean valid=false;
        int count=0;
        int index=-1;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                 if(i==0)
                 {
                    index=i;
                 }
                 count++;
            }
        }
        if(count==len || count==0 || (count==1 && index==0))
        {
            valid=true;
        }
        return valid;
        
    }
}
class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            boolean found=false;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    found=true;
                    break;
                }
            }
            if(found==false)
            {
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}


        
 
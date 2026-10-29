class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++)
        {
            int code=0;
            for(int j=0;j<strs.length;j++)
            {
                char ch=strs[j].charAt(i);
                if(code>(int)ch)
                {
                    count++;
                    break;
                }
                else{
                    code=(int)ch;
                }

            }

        }
        return count;
        
    }
}
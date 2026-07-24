class Solution {
    public int compress(char[] chars) {
        // if(chars.length==1)
        // {
        //     return 1;
        // }
        int i=0,j=0,write=0;
        while(j<chars.length)
        {
            if(chars[i]==chars[j])
            {
                j++;
            }
            else
            {
                int freq=j-i;
                chars[write]=chars[i];
                write++;
                if(freq>1){
                String st=String.valueOf(freq);
                for(char ch:st.toCharArray())
                {
                    chars[write]=ch;
                    write++;
                }
                }
                i=j;

            }
        }
         int freq=j-i;
                chars[write]=chars[i];
                write++;
                if(freq>1){
                String st=String.valueOf(freq);
                for(char ch:st.toCharArray())
                {
                    chars[write]=ch;
                    write++;
                }
                }
                i=j;

        return write;
        
    }
}
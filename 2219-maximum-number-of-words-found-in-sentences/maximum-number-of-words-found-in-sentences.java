class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
    //    int[] arr=new int [sentences.length];
        for(int i=0;i<sentences.length;i++)
        {
            int words=1;
            String st=sentences[i];
            for(int j=0;j<st.length();j++)
            {
                if(st.charAt(j)==' ')                    
                {
                    words++;
                }
            }
    //        arr[i]=words;
            if(words>max)
            {
                max=words;
            }

            
        }
        // int max=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>max)
        //     {
        //         max=arr[i];
        //     }
        // }
        return max;
        
    }
}
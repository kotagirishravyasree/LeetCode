class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countR=0;
        int countL=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='L'||ch=='_')
            {
                countL--;
            }
            else{
                countL++;
            }
        }
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='R'||ch=='_')
            {
                countR++;
            }
            else{
                countR--;
            }
        }
        countR=Math.abs(countR);
        countL=Math.abs(countL);
        return Math.max(countR,countL);
        
    }
}
class Solution {
    public int digitFrequencyScore(int n) {
        String s=n+"";
        int score=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int d=s.charAt(i)-'0';
            hm.put(d,hm.getOrDefault(d,0)+1);

        }
        for(int ele:hm.keySet())
        {
            score+=ele*hm.get(ele);
        }
        return score;
        
    }
}
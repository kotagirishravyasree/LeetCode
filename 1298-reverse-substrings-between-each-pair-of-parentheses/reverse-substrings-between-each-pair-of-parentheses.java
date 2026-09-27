class Solution {
    public String reverseParentheses(String s) {
        while(s.lastIndexOf("(")!=-1)
        {
            int index1=s.lastIndexOf("(");
            int index2=s.indexOf(")",index1);
            StringBuilder middle=new StringBuilder(s.substring(index1+1,index2)).reverse();
            s=s.substring(0,index1)+
            middle.toString()+
            s.substring(index2+1);
        }
        return s;
        
    }
}
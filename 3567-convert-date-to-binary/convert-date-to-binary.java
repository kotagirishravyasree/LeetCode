class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String[] arr=date.split("-");
        for(int i=0;i<arr.length;i++)
        {
            String binary = Integer.toBinaryString(Integer.parseInt(arr[i]));
            sb.append(binary);
            if(i<=arr.length-2)
            sb.append("-");
        }
        return sb.toString();

        
    }
}
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int row1=0,col1=0;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    col1=j;
                }
            }
            for(int k=0;k<matrix.length;k++)
            {
                if(matrix[k][col1]>max)
                {
                    max=matrix[k][col1];
                }
                 
            }
           
            if(min==max)
            {
                list.add(min);
            }
        }
        return list;
        
    }
}
        

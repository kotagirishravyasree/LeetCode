class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i-1>=0 && i-1<matrix.length && j-1>=0 && j-1<matrix[0].length)
                {
                    if(matrix[i-1][j-1]!=matrix[i][j])
                    {
                       return false;
                    }

                }
            }
        }
        return true;
        
    }
}
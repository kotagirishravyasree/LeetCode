class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] answer=new int[matrix.length][matrix[0].length];
        for(int j=0;j<matrix[0].length;j++)
        {
            int index=-1;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++)
            {
                if(matrix[i][j]>max)
                {
                    max=matrix[i][j];
                }
                // if(matrix[i][j]<0)
                // {
                //     index=i;
                // }
                answer[i][j]=matrix[i][j];
            }
            // if(index!=-1){
            // answer[index][j]=max;
            for(int i=0;i<answer.length;i++)
            {
                if(answer[i][j]<0)
                {
                    answer[i][j]=max;
                }
            }
            
        }
        return answer;
        

        
    }
}
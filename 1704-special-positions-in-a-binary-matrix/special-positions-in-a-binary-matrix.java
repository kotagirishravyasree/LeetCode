class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            int row1=0,col1=0,row2=0,col2=0,sum1=0,sum2=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    row1=i;
                    col1=j;
                }
                sum1+=mat[i][j];
            }
            if(sum1==1)
            {
               for(int k=0;k<mat.length;k++)
               {
                  if(mat[k][col1]==1)
                  {
                    row2=k;
                  }
                  sum2+=mat[k][col1];
               }
            }
            if(sum1==1 && sum2==1 && row1==row2)
            {
                count++;
            }
        }
        return count;
        
    }
}
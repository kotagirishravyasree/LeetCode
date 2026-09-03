class Solution {
    public boolean checkXMatrix(int[][] grid) {
        boolean diagonal=true,nonDiagonal=true;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if((i==j || i+j==grid.length-1))
                {
                    if(grid[i][j]==0)
                    {
                        diagonal=false;
                        //break;
                    }
                }
                else
                {
                    if(grid[i][j]!=0)
                    {
                        nonDiagonal=false;
                        //break;
                    }
                }
            }
            if(diagonal==false || nonDiagonal==false)
            {
                break;
            }
        }
        if(diagonal==false || nonDiagonal==false)
        {
            return false;
        }
        else
        {
            return true;
        }

        
    }
}
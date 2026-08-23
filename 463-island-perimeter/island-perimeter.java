class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int p=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    if(j==0 || (j-1>=0 && grid[i][j-1]==0))
                    {
                        p++;
                    }
                    if(j==c-1 || (j+1<=c-1 && grid[i][j+1]==0))
                    {
                        p++;
                    }
                    if(i==0 || (i-1>=0 && grid[i-1][j]==0))
                    {
                        p++;
                    }
                    if(i==r-1 || (i+1<=r-1 && grid[i+1][j]==0))
                    {
                        p++;
                    }
                }
            }
        }
        return p;
        
    }
}
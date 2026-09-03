class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max_count=0;
        int[] arr=new int[2];
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
            }
            if(max_count<count)
            {
                max_count=count;
                arr[1]=max_count;
                arr[0]=i;
            }
        }
        return arr;
        
    }
}
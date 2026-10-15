class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        List<Integer> list=new ArrayList<>();
        int diff=0;
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
       for(int i=0;i<pieces.length;i++)
       {
        int[] ans=pieces[i];
        for (int ele : ans) {
    if (!list.contains(ele)) {
        return false;
    }
}
        if(ans.length>1)
        {
            for(int j=0;j<ans.length;j++)
            {
                int ele=ans[j];
                if (list.indexOf(ans[j]) != list.indexOf(ans[0]) + j) {
    return false;
}
                

            }
            
        }
      }
       return true;
    }
}
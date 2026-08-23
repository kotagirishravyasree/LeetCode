class Solution {

    public List<List<Integer>> findDisappearedNumbers(
            int[] nums, int lower, int upper) {

        List<List<Integer>> list2D = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            {
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }

        for (int i = lower; i <= upper; i++) {
            if (hm.containsKey(i)==false) {
                list.add(i);
            }
        }

        int i = 0, j = 1;

        while (j < list.size()) {

            if(list.get(j)==list.get(j-1)+1) {
                j++;
            } 
            else {
                List<Integer> arr = new ArrayList<>();

                arr.add(list.get(i));
                arr.add(list.get(j - 1));

                list2D.add(arr);

                i = j;
                j++;
            }
        }

       if (!list.isEmpty()) {
    List<Integer> arr = new ArrayList<>();
    arr.add(list.get(i));
    arr.add(list.get(j - 1));
    list2D.add(arr);
}
        return list2D;
    }
}
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        Arrays.sort(nums2);
        for(int i=0;i<nums2.length;i++)
        {
            if(hm.getOrDefault(nums2[i],0)!=0)
            {
                return nums2[i];
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        StringBuilder sb=new StringBuilder();
        if(nums1[0]<nums2[0])
        {
            sb.append(nums1[0]);
            sb.append(nums2[0]);
        }
        else{
            sb.append(nums2[0]);
            sb.append(nums1[0]);
        }
        String ans=sb.toString();
        return Integer.parseInt(ans);

        
    }
}
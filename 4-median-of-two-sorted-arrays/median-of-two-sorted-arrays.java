class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[]= new int[nums1.length + nums2.length];
        int j = 0;
        for(int i = 0 ; i<nums1.length;i++)
        {
            nums3[j++]=nums1[i];
        }
         for(int i = 0 ; i<nums2.length;i++)
        {
            nums3[j++]=nums2[i];
        }
        Arrays.sort(nums3);
        int n = nums3.length;
        double median=0;
        if(n%2==1)
        {
           median= nums3[n / 2];
        }
        else
        {
           median= (nums3[n / 2 - 1] + nums3[n / 2]) / 2.00;
        }
        return median;

        
    }
}
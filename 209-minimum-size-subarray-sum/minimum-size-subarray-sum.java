class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
       int minwindow=Integer.MAX_VALUE;
       int currsum=0;
       int low=0;
       int high=0;
       while(high<nums.length)
       {
        currsum +=nums[high];
        high++;

        while(currsum>=target)
        {
            int currwindowsize=high-low;
            minwindow=Math.min(minwindow,currwindowsize);

            currsum -=nums[low];
            low++;
        }
       }
        return minwindow==Integer.MAX_VALUE?0 : minwindow;
    }
}
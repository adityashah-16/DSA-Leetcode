class Solution {
    public boolean canJump(int[] nums) {
        int totaljump=0;
        int coverage=0;
        int lastjump=0;
        int destination=nums.length-1;

        for(int i=0;i<nums.length;i++)
        {
            coverage=Math.max(coverage,i+nums[i]);
            if(i==lastjump)
            {
                lastjump=coverage;
            }
            if(coverage>=destination)
            {
                return true;
            }
            if(i==coverage)
            {
                return false;
            }
        }
        return false;
        
    }
}
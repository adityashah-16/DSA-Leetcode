class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int max=1;
       int consecutive=1;

       if(nums.length==0)
       {
        return 0;
       }
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i+1]-nums[i]==1)
        {
            consecutive++;
        }
        else if(nums[i+1]==nums[i])
        {
            continue;
        }
        else
        {
            consecutive=1;
        }
        max=Math.max(consecutive,max);
       }
       return max;
    }
}
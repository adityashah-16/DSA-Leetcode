class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
         if(nums.length==0)
            {
                return 0;
            }
        int cons=1;
        int max=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]==1)
            {
                cons++;
            }
           
            else if(nums[i+1]==nums[i])
            {
                continue;
            }
            else
            {
                cons =1;
            }

            max= Math.max(max,cons);
            
        }
        return max;
        
    }
}
class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {

        int count=0;
        int result[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                result[count]=nums[i];
                count++;
            }
        }
         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                result[count]=nums[i];
                count++;
            }
        }
        return result;
        
    } 
}
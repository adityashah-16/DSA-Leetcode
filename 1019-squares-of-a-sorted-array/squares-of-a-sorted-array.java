class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]= new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            result[count]=nums[i]*nums[i];
            count++;
        }
        Arrays.sort(result);
        return result;
        
    }
}
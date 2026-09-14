class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[]= new int[nums.length];
        int prodleft=1;
        int prodright=1;
        int n=nums.length;
        int count=0;

        for(int i=n-1;i>=0;i--)
        {
            result[i]=prodright;
            prodright=prodright *nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            result[i]= result[i]*prodleft;
            prodleft=prodleft *nums[i];
        }
        return result;
        
    }
}
class Solution {
    public int climbStairs(int n) {
        if(n==1)
        {
            return 1;
        }
        int op[]=new int[n+1];
        op[1]=1;
        op[2]=2;

        for(int i =3;i<=n;i++)
        {
            op[i]=op[i-1]+op[i-2];
        }
        return op[n];
        
    }
}
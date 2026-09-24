class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        int first=0;
        int low=0;

        for(char ch:word.toCharArray())
        {
            if(ch>=65 && ch<=90)
            {
                cap++;
                if(first==0)
                {
                    first=1;
                }

            }
            else
            {
                low++;
                if(first==0)
                {
                    first=2;
                }
            }
           
        }
         if(cap==0 || low==0 || first==1 && cap==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {

        // char ch[]=s.toCharArray();
        // char ch2[]=goal.toCharArray();
        // int i=0;
        // int j=ch.length-1;

        // while(i<j)
        // {
        //     if(ch==ch2)
        //     {
        //         return true;
        //     }
        //     else
        //     {
        //     char temp=ch[i];
        //     ch[i]=ch[j];
        //     ch[j]=temp;
        //     i++;
        //     j--;
        //     }
        // }
        // return false;

        if(s.length()!=goal.length())
        {
            return false;
        }
        
        String temp=s+s;

        return temp.contains(goal);
        
    }
}
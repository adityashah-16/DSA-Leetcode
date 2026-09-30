class Solution {
    public int secondHighest(String s) {
        char ch[] = s.toCharArray();
        int largest = -1;
        int second = -1;
        for (int i = 0; i < ch.length; i++) 
        {
            if (Character.isDigit(ch[i])) {
                int num = ch[i] - '0';
                if (num > largest) 
                {
                    second = largest;
                    largest = num;
                }
                else if ( num > second && num < largest) 
                {
                    second = num;
                }
            }
        }
return second;
    }
}
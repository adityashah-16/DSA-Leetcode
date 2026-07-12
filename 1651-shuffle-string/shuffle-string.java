class Solution {
    public String restoreString(String s, int[] indices) {
        char op[] = new char[s.length()];
        for(int i = 0; i<s.length();i++)
        {
           op[indices[i]] = s.charAt(i);
        }
        return new String(op);
        
    }
}
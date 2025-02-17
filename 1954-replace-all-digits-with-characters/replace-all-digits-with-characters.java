class Solution {
    public String replaceDigits(String s) {
         StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(i % 2 == 0)
                str.append(s.charAt(i));
            else {
                str.append((char)(s.charAt(i-1) + s.charAt(i) - '0'));
            }
        }
        return str.toString();
    }
}
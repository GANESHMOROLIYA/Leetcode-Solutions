class Solution {
    public String toLowerCase(String s) {
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(asci>=65 && asci<=90){
                asci +=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        return str.toString();
       
    
    }
}

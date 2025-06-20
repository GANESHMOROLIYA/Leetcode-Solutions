class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()||(ch==')'&&st.pop()!='(')||(ch==']'&&st.pop()!='[')||
                (ch=='}'&&st.pop()!='{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
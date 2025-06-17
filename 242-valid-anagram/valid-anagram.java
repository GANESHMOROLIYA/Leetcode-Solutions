class Solution {
    public boolean isAnagram(String s, String t) {
        //First approach 
    //     Map<Character,Integer> mp1=new HashMap<>();
    //     Map<Character,Integer> mp2=new HashMap<>();
        
    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    //     for(int i=0;i<s.length();i++){
    //         if(!mp1.containsKey(s.charAt(i))){
    //             mp1.put(s.charAt(i),1);
    //         }else{
    //             mp1.put(s.charAt(i),mp1.get(s.charAt(i))+1);
    //         }
    //     }
    //     for(int i=0;i<t.length();i++){
    //         if(!mp2.containsKey(t.charAt(i))){
    //             mp2.put(t.charAt(i),1);
    //         }else{
    //             mp2.put(t.charAt(i),mp2.get(t.charAt(i))+1);
    //         }
    //     }

    //   return mp1.equals(mp2);
    //Secound apporoach
        if(s.length()!=t.length()){
            return false;
        }
         Map<Character,Integer> mp=new HashMap<>();
         for(int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }else{
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!mp.containsKey(ch)){
                return false;
            }else{
               int val=mp.get(ch);
               mp.put(ch,val-1);
            }
            
        }
        for(int i:mp.values()){
            if(i!=0) return false;
        }
        return true;
    }
}
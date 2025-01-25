import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int total = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            int currentVal = romanValues.get(s.charAt(i));
            if (i + 1 < length && currentVal < romanValues.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        
        return total;
    }
}
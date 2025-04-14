import java.util.HashSet;

public class J1_LongestSubstring {
        // we are going to solve the longest substring without repeating the 
        // character's.

        public static int lenghtofLongestSubstring(String s){
            HashSet<Character> set = new HashSet<>();
            int left = 0;
            int right = 0;
            int maxLenght =0 ;
            for(right = 0;right<s.length();right++){
                if(!set.contains(s.charAt(right))){
                    set.add(s.charAt(right));
                    maxLenght = Math.max(maxLenght, right-left+1);
                } else{
                    while(set.contains(s.charAt(right))){
                        set.remove(s.charAt(left));
                        left++;
                    }
                    set.add(s.charAt(right));
                }
            }
            return maxLenght;
        }
        public static void main(String[] args) {
            String s = "abcabcbb";
            System.out.println("The longest substring is : "+lenghtofLongestSubstring(s));
        }
}

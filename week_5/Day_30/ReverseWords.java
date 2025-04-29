
public class ReverseWords {
    public static String reverseString(String s){
        String []words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i != 0) sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        ReverseWords obj = new ReverseWords();
        System.out.println(obj.reverseString(s));
    }
}

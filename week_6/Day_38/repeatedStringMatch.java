
public class repeatedStringMatch {
    public static int repeated_StringMatch(String a, String b){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }
        // check if b is now a substring
        if(sb.toString().contains(b)) return count;
        // as b can cross the boundary so try once more 
        sb.append(a);
        count++;

        if(sb.toString().contains(b)) return count;

        // if not found
        return -1;
    }

    public static void main(String[] args) {
        String a1 = "abcd";
        String b1 = "cdabcdab";
        System.out.println("Output 1: " + repeated_StringMatch(a1, b1));
    }
}

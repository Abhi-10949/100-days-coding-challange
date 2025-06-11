
public class FirstOccuranceInString {
    public int strStr(String haystack , String needle){
        for(int i = 0, j = needle.length(); j<= haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return  i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccuranceInString obj = new FirstOccuranceInString();
        
       String haystack = "sadbutsad";
       String needle = "sad";

       int result = obj.strStr(haystack, needle);
       System.out.println(result);
    }
}

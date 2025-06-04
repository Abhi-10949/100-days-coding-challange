public class AnswerString {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) return word;
        String res = "";
        int length = word.length() - numFriends + 1;
        for (int i = 0; i < word.length(); i++) {
            String temp;
            if (i + length <= word.length())
                temp = word.substring(i, i + length);
            else
                temp = word.substring(i);
            if (temp.compareTo(res) > 0)
                res = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        AnswerString sol = new AnswerString();
        
        String word = "apple";
        int numFriends = 3;
        String result = sol.answerString(word, numFriends);
        System.out.println("Result: " + result);
    }
}

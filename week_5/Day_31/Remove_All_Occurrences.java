public class Remove_All_Occurrences {
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    public static void main(String[] args) {
        String s1 = "daabcbaabcbc";
        String part1 = "abc";
        System.out.println(removeOccurrences(s1, part1));

        String s2 = "axxxxyyyyb";
        String part2 = "xy";
        System.out.println(removeOccurrences(s2, part2));
    }
}

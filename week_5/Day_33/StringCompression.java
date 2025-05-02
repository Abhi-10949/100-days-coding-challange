class StringCompression {
    public int compress(char[] chars) {
        StringBuilder newString = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            newString.append(chars[i]);
            if (count > 1) {
                newString.append(String.valueOf(count));
            }
        }

        for (int j = 0; j < newString.length(); j++) {
            chars[j] = newString.charAt(j);
        }

        return newString.length();
    }

    public static void main(String[] args) {
        StringCompression solution = new StringCompression();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length = solution.compress(chars);

        System.out.print("Compressed array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println("\nLength: " + length);
    }
}

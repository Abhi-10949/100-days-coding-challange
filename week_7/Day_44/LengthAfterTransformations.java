public class LengthAfterTransformations {
    private static final int MOD = 1_000_000_007;

    public int lengthAfterTransformations(String s, int t) {
        long[] freq = new long[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        long totalLength = s.length();

        for (int step = 0; step < t; step++) {
            long[] newFreq = new long[26];
            for (int i = 0; i < 26; i++) {
                if (i == 25) {
                    newFreq[0] = (newFreq[0] + freq[i]) % MOD;
                    newFreq[1] = (newFreq[1] + freq[i]) % MOD;
                    totalLength = (totalLength + freq[i]) % MOD;
                } else {
                    newFreq[i + 1] = (newFreq[i + 1] + freq[i]) % MOD;
                }
            }
            freq = newFreq;
        }

        return (int) totalLength;
    }

    public static void main(String[] args) {
        LengthAfterTransformations obj = new LengthAfterTransformations();
        System.out.println(obj.lengthAfterTransformations("abcyy", 2));  // Output: 7
    }
}

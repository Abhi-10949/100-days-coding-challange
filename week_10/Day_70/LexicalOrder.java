import java.util.*;

class LexicalOrder {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            solve(i, n, ans);
        }
        return ans;
    }

    static void solve(int prod, int n, List<Integer> ans) {
        if (prod > n) return;
        ans.add(prod);
        for (int j = 0; j < 10; j++) {
            int next = prod * 10 + j;
            if (next > n) return;
            solve(next, n, ans);
        }
    }

    public static void main(String[] args) {
        LexicalOrder sol = new LexicalOrder();
        int n = 13; 
        List<Integer> result = sol.lexicalOrder(n);
        System.out.println("Lexicographical Order from 1 to " + n + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

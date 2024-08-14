import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(solve(N, M));
        }
    }
    
    private static int solve(int N, int M) {
        char[] s = new char[N];
        // Initially, the string is all '1's
        for (int i = 0; i < N; i++) {
            s[i] = '1';
        }
        Map<String, Set<String>> memo = new HashMap<>();
        Set<String> uniqueStrings = generateStrings(s, M, memo);
        return uniqueStrings.size();
    }
    
    private static Set<String> generateStrings(char[] s, int M, Map<String, Set<String>> memo) {
        String currentState = new String(s) + M;
        if (memo.containsKey(currentState)) {
            return memo.get(currentState);
        }

        Set<String> uniqueStrings = new HashSet<>();
        if (M == 0) {
            uniqueStrings.add(new String(s));
        } else {
            // Operation 1: Flip all characters
            flipAll(s);
            uniqueStrings.addAll(generateStrings(s, M - 1, memo));
            flipAll(s); // revert back to the original

            // Operation 2: Flip all characters at odd indexes
            flipOdd(s);
            uniqueStrings.addAll(generateStrings(s, M - 1, memo));
            flipOdd(s); // revert back to the original

            // Operation 3: Flip all characters at even indexes
            flipEven(s);
            uniqueStrings.addAll(generateStrings(s, M - 1, memo));
            flipEven(s); // revert back to the original

            // Operation 4: Flip all characters at (3k + 1) indexes
            flip3k1(s);
            uniqueStrings.addAll(generateStrings(s, M - 1, memo));
            flip3k1(s); // revert back to the original
        }

        memo.put(currentState, uniqueStrings);
        return uniqueStrings;
    }
    
    private static void flipAll(char[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = (s[i] == '1') ? '0' : '1';
        }
    }
    
    private static void flipOdd(char[] s) {
        for (int i = 0; i < s.length; i += 2) {
            s[i] = (s[i] == '1') ? '0' : '1';
        }
    }
    
    private static void flipEven(char[] s) {
        for (int i = 1; i < s.length; i += 2) {
            s[i] = (s[i] == '1') ? '0' : '1';
        }
    }
    
    private static void flip3k1(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (i % 3 == 0) {
                s[i] = (s[i] == '1') ? '0' : '1';
            }
        }
    }
}

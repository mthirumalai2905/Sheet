package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(solve(str, str.length() - 1));
    }

    private static String solve(String str, int idx) {
        if (idx < 0) return "";
        return str.charAt(idx) + solve(str, idx - 1);
    }
}


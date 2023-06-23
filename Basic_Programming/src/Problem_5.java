import java.util.Scanner;

public class Problem_5 {
    public static boolean Palindrome(String kata) {
        kata = kata.replaceAll("\\s+", "").toLowerCase();

        int length = kata.length();
        for (int i = 0; i < length / 2; i++) {
            if (kata.charAt(i) != kata.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukan kata : ");
        String input = scn.next();
        if (Palindrome(input)) {
            System.out.println("Ini merupakan kata Palindrome ");
        } else {
            System.out.println("Ini bukan kata Palindrome");
        }
    }
}



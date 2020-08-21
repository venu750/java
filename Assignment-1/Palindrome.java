import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        temp t = new temp();
        //System.out.println(t.CheckPalindrome(s1,s2));
        System.out.println(t.CheckPalindrome(s1.toLowerCase(), s2.toLowerCase()));
    }
}

/*
logic:-
starts with first string first character and second string last character and compare
at any point of if both are not equal then return false, provided that both string indices
should not cross over
else return true.
 */
class temp {
    boolean CheckPalindrome(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 != l2)
            return false;//both string length is not same then both strings are not palindromes
        int i = 0, j = l2 - 1;
        while (i < j) {
            if (s1.charAt(i) != s2.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

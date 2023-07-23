package DSA;
import java.util.*;
public class Longest_Palindromic_Substring {
        public int maxLen = 0;
       public  int lo = 0;
        public String longestPalindrome(String s) {
            char[] input = s.toCharArray();
            if(s.length() < 2) {
                return s;
            }

            for(int i = 0; i<input.length; i++) {
                expandPalindrome(input, i, i);
                expandPalindrome(input, i, i+1);
            }
            return s.substring(lo, lo+maxLen);
        }

        public void expandPalindrome(char[] s, int j, int k) {
            while(j >= 0 && k < s.length && s[j] == s[k]) {
                j--;
                k++;
            }
            if(maxLen < k - j - 1) {
                maxLen = k - j - 1;
                lo = j+1;
            }
        }

    public static void main(String[] args) {
        Scanner In=new Scanner(System.in);
        Longest_Palindromic_Substring i=new Longest_Palindromic_Substring();
        System.out.println("Enter the string: ");
        String input=In.next();
       String o= i.longestPalindrome(input);
        System.out.println("The answer is: "+ o);
    }
}

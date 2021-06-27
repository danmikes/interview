package hard;

import java.util.ArrayList;
import java.util.List;

/**
 * return longest palindrome in string
 */
public class LongestPalindrome {

  public static void main(String[] args) {
    var lst = new ArrayList<String>();
    lst.add("abattd");//aba
    lst.add("abc");//a
    lst.add("abcba");//abcba
    lst.add("thhwerw");//hh
    run(lst);
  }

  public static void run(List<String> lst) {
    for (var s : lst) {
      System.out.println(longestPalindrome(s));
    }
  }

  public static String longestPalindrome(String s) {
    for (int x = s.length(); x >= 1; --x) {
      for (int i = 0; i <= s.length()-x; ++i) {
        String abc = s.substring(i, i + x);
        String bca = new StringBuilder(abc).reverse().toString();
        if (abc.equals(bca)) {
          return abc;
        }
      }
    }
    return "ERROR";
  }
}

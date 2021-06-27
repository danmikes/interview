package hard;

/**
 * return longest common substring of two strings
 */
public class LongestSequence {

  public static void main(String[] args) {
    System.out.println(findLongestCommonSequence("abattd", "gdgeaba"));//aba
    System.out.println(findLongestCommonSequence("abc", "sdsad"));//a
    System.out.println(findLongestCommonSequence("abcba", "abcba"));//abcba
    System.out.println(findLongestCommonSequence("thhwerwaaa", "aaa"));//aaa
  }

  public static String findLongestCommonSequence(String s1, String s2) {
    String min = s1.length() < s2.length() ? s1 : s2;
    String max = s1.length() >= s2.length() ? s1 : s2;
    for (int x = min.length(); x >= 1; --x) {
      for (int i = 0; i <= min.length() - x; ++i) {
        String sub = min.substring(i, i + x);
        if (max.contains(sub)) {
          return sub;
        }
      }
    }
    return null;
  }
}

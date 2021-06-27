package medium;

/**
 * return if word is palindrome
 */
public class Palindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome("hello"));
    System.out.println(isPalindrome("abba"));
  }

  public static boolean isPalindrome(String word) {
    // while loop
    int i1 = 0;
    int i2 = word.length() - 1;
    while (i2 > i1) {
      if (word.charAt(i1) != word.charAt(i2)) {
        return false;
      }
      ++i1;
      --i2;
    }
    return true;

    // StringBuilder
//    StringBuilder sb = new StringBuilder(word);
//    String reverse = sb.reverse().toString();
//    return word.equals(reverse);
  }
}

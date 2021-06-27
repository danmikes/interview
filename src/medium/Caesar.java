package medium;

/**
 * return Caesar cipher on string for N=5
 */
public class Caesar {

  final int N = 5;

  public static void main(String[] args) {
    System.out.println(decode("abc stu vwx xyz"));//-> "fgh xyz abc cde"
    System.out.println(decode("hello, how are you"));//-> "mjqqt, mtb fwj dtz"
  }

  public static String decode(String code) {
    StringBuilder res = new StringBuilder();
    int lenAbc = 'z' - 'a' + 1;
    for (char c : code.toCharArray()) {
      if (c < 'a' || c > 'z') {
        res.append(c);
      } else if (c + 5 <= 'z') {
        res.append((char) (c + 5));
      } else {
        res.append((char) (c + 5 - lenAbc));
      }
    }
    return res.toString();
  }
}

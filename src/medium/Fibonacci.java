package medium;

/**
 * return Fibonacci serie up to
 */
public class Fibonacci {

  public static void main(String[] args) {
    var n = 10;
    for (var i = 0; i < n; ++i) {
      System.out.println(fibonacci(i));
    }
  }

  private static int fibonacci(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 0) {
      return 0;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}

package medium;

/**
 * return sum of Fibonacci serie up to n
 */
public class FibonacciSum {

  public static void main(String[] args) {
    var n = 100;
    for (var i = 0; i < n; ++i) {
      System.out.println(evenFibonacciSum(i));
    }
  }

  private static int evenFibonacciSum(int n) {
    var prev = 0;
    var curr = 1;
    var even = 0;
    do {
      if (curr % 2 == 0) {
        even += curr;
      }
      int temp = curr + prev;
      prev = curr;
      curr = temp;
    } while (curr < n);
    return even;
  }
}

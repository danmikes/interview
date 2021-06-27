package hard;

import java.util.stream.IntStream;

/**
 * return largest prime factor of n
 */
public class LargestPrimeFactor {

  public static void main(String[] args) {
    var arr = new int[]{0, 1, 2, 55, 455, 1015, 13195};
    run(arr);
  }

  public static void run(int[] arr) {
    for (var x : arr) {
      System.out.println(largestPrimeFactor(x));
    }
  }

  public static Integer largestPrimeFactor(Integer n) {
    if (n <= 1) {
      return -1;
    }
    for (var i = 2; i * i <= n; ++i) {
      if (n % i != 0) {
        continue;
      }
      while (n % i == 0) {
        n /= i;
      }
    }
    return n;
  }
}



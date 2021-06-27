package medium;

/**
 * return prime numbers up to n
 */
public class Prime {

  public static void main(String[] args) {
    var n = 5;
    for (var i = 2; i <= n; ++i) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  public static Boolean isPrime(Integer n) {
    for (var i = n - 1; i > 1; --i) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

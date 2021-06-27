package medium;

/**
 * return Greatest Common Divisor for (p,q)
 */
public class GCD {

  public static void main(String[] args) {
    System.out.println(gcd(0,1));
    System.out.println(gcd(1,0));
    System.out.println(gcd(1,2));
    System.out.println(gcd(2,4));
    System.out.println(gcd(3,9));
    System.out.println(gcd(8,80));
  }

  public static Integer gcd(Integer p, Integer q) {
    if (q == 0) {
      return p;
    }
    return gcd(q, p % q);
  }
}

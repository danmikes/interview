package various;

/**
 * return n-th root of positive number x
  */
public abstract class FindRoot {

  static double root(double x, int n) {
    double start = 0;
    double end = x;
    double result;
    double mid = 0;
    final double ERROR = 0.001;

    do {
      mid = (start + end) / 2.0;
      result = Math.pow(mid,n);

      if (result > x) {
        end = mid;
      } else if (result < x) {
        start = mid;
      } else {
        return mid;
      }
    } while (Math.abs(result - x) >= ERROR);

    return mid;
  }

  public static void main(String[] args) {
    System.out.println(root(9,1));
  }
}

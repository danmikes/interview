package various;

import java.util.Arrays;

/**
 * fill array with array-indices
 */
public interface FillArray {

  static int[] fillArray(int[] arr) {
    Arrays.setAll(arr, p -> p > 9 ? 0 : p);

    return arr;
  }

  static void main(String[] args) {
    int[] array = fillArray(new int[10]);

    System.out.println(Arrays.toString(array));
  }
}

package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * return if given big and small rice bags can attain goal weight
 */
public class Rice {

  static List<int[]> list = new ArrayList<>();

  public static void main(String[] args) {
    addArray(1, 1, 1);//T
    addArray(2, 2, 2);//T
    addArray(2, 2, 5);//T
    addArray(2, 2, 6);//T
    addArray(2, 2, 12);//T
    addArray(1, 1, 2);//F
    addArray(2, 2, 4);//F
    addArray(2, 2, 3);//F
    addArray(2, 2, 8);//F
    addArray(2, 2, 13);//F
    addArray(2, 2, 15);//F
    run(list);
  }

  public static Boolean packageRice(int[] a) {
    int big = a[0];
    int small = a[1];
    int goal = a[2];

    if (big * 5 >= goal) {
      return small >= goal % 5;
    }
    return small >= goal - big * 5;
  }

  private static void addArray(int big, int small, int goal) {
    list.add(new int[]{big, small, goal});
  }

  private static void run(List<int[]> list) {
    for (int[] a : list) {
      System.out.println(Arrays.toString(a) + " " + packageRice(a));
    }
  }
}

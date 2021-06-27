package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * return if at least one pair which sums to target
 */
public class TwoSum {

  public static void main(String[] args) {
    Integer[] arr;
    arr = new Integer[]{1,3,4};
    System.out.println(sumsToTarget(arr, 5));//T
    arr = new Integer[]{2,4,6};
    System.out.println(sumsToTarget(arr, 5));//F
    arr = new Integer[]{-1,4,2,1};
    System.out.println(sumsToTarget(arr, 0));//T
    arr = new Integer[]{-1,4,2,1};
    System.out.println(sumsToTarget(arr, 1));//T
  }

  public static Boolean sumsToTarget(Integer[] arr, Integer target) {
    // Set
    Set<Integer> set = new HashSet<>();
    for (int i: arr) {
      int complement = target - i;
      if (set.contains(complement)) {
        return true;
      } else {
        set.add(i);
      }
    }
    return false;

    // Map
//    Map<Integer,Integer> map = new HashMap<>();
//    for (int i = 0; i < arr.length; ++i) {
//      int complement = target - arr[i];
//      if (map.containsKey(complement)) {
//        return true;
//      } else {
//        map.put(arr[i], i);
//      }
//    }
//    return false;

    // brute force
//    for (int i = 0; i < arr.length; ++i) {
//      for (int j = i + 1; j < arr.length; ++j) {
//        if (arr[i] + arr[j] == target) {
//          return true;
//        }
//      }
//    }
//    return false;
  }
}

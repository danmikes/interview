package medium;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * return comma separated string of integers
 * 'e' precedes even number
 * 'o' precedes odd number
 */
public class CommaString {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5);

    System.out.println(getString(list));
  }

  public static String getString(List<Integer> list) {
    return list.stream()
      .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
      .collect(joining(","));
  }
}

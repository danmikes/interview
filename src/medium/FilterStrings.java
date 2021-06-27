package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * return list of strings starting with 'a' and length = 3
 */
public class FilterStrings {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("hello");
    list.add("goodbye");
    list.add("ark");
    list.add("Art");
    list.add("alone");
    list.add("afterparty");
    list.add("Ashley");
    System.out.println(search(list));
  }

  public static List<String> search(List<String> list) {
    return list.stream()
      .filter(s -> s.startsWith("a"))
      .filter(s -> s.length() == 3)
      .collect(Collectors.toList());
  }
}

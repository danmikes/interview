package various;

import java.util.ArrayList;
import java.util.List;

/**
 * find average value from integer list
 */
public class GetAverage<T extends Number> {

  public static void main(String[] args) {
    var intAverage = new GetAverage<Integer>();
    List<Integer> iList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    intAverage.average(iList);
    intAverage.print(iList);

    var doubleAverage = new GetAverage<Double>();
    List<Double> dList = new ArrayList<>(List.of(1.1, 2.2, 3.3, 4.4, 5.5));
    doubleAverage.average(dList);
    doubleAverage.print(dList);
  }

  public Double averageNumber(List<T> list) {
    T t = list.get(0);
    if (t instanceof Integer) {
      return list.stream()
        .mapToInt(i -> (int) i)
        .average()
        .getAsDouble();
    }
    if (t instanceof Double) {
      return list.stream()
        .mapToDouble(d -> (double) d)
        .average()
        .getAsDouble();
    }
    return null;
  }

  private void average(List<T> list) {
    long top = System.nanoTime();
    averageNumber(list);
    long end = System.nanoTime();
    System.out.println(end - top);
  }

  private void print(List<T> list) {
    T t = list.get(0);
    if (t instanceof Integer) {
      list.forEach(x -> System.out.printf("%2d ", x));
    }
    if (t instanceof Double) {
      list.forEach(x -> System.out.printf("%2f ", (double) x));
    }
    System.out.println(" ms");
  }
}

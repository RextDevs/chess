package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
  public <T extends Comparable<T>> ArrayList<T> sort(T[] arr) {
    var newarr = new ArrayList<T>(Arrays.asList(arr));
    for (int i = 0; i < newarr.size() - 1; i++) {
      int min = i;
      for (int j = i + 1; j < newarr.size(); j++) {
        if (newarr.get(j).compareTo(newarr.get(min)) < 0) {
          min = j;
        }
      }
      if (min != i) {
        T temp = newarr.get(i);
        newarr.set(i, newarr.get(min));
        newarr.set(min, temp);
      }
    }
    return newarr;
  }
}
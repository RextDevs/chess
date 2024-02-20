package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
  public <T extends Comparable<T>> ArrayList<T> sort(T[] arr) {
    var newarr = new ArrayList<T>(Arrays.asList(arr));
    for (int i = 1; i < newarr.size(); i++) {
      T key = newarr.get(i);
      int j = i - 1;
      while (j >= 0 && newarr.get(j).compareTo(key) > 0) {
        newarr.set(j + 1, newarr.get(j));
        j--;
      }
      newarr.set(j + 1, key);
    }
    return newarr;
  }
}

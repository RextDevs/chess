package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
  public <T extends Comparable<T>> ArrayList<T> sort(T[] arr) {
    var newarr = new ArrayList<T>(Arrays.asList(arr));
    for (int i = 0; i < newarr.size() - 1; i++) {
      for (int j = 0; j < newarr.size() - i - 1; j++) {
        if (newarr.get(j).compareTo(newarr.get(j + 1)) > 0) {
          T temp = newarr.get(j);
          newarr.set(j, newarr.get(j + 1));
          newarr.set(j + 1, temp);
        }
      }
    }
    return newarr;
  }
  
}

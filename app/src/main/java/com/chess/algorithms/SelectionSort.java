package com.chess.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase para el algoritmo de ordenamiento por selección
 * @param <T> Tipo de dato
 * @return ArrayList
 */
public class SelectionSort extends SortAlgorithm {

  @Override
  public <T extends Comparable<T>> ArrayList<T> sort(T[] arr, Integer espera) {
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
      render(newarr.toArray());
      try {
        Thread.sleep(espera);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      interacciones++;
      cooldown += espera;
    }
    return newarr;
  }
}
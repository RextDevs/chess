package com.chess.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase para el algoritmo de ordenamiento por inserción
 * @param <T> Tipo de dato
 * @return ArrayList<T>
 */
public class InsertionSort extends SortAlgorithm {

  @Override
  public <T extends Comparable<T>> ArrayList<T> sort(T[] arr, Integer espera) {
    if (espera == null) {
      espera = 0;
    }
    var newarr = new ArrayList<T>(Arrays.asList(arr));
    for (int i = 1; i < newarr.size(); i++) {
      T key = newarr.get(i);
      int j = i - 1;
      while (j >= 0 && newarr.get(j).compareTo(key) > 0) {
        newarr.set(j + 1, newarr.get(j));
        j--;
        try {
          Thread.sleep(espera);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        interacciones++;
        cooldown += espera;
      }
      newarr.set(j + 1, key);
    }
    return newarr;
  }
}

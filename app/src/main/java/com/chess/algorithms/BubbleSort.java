package com.chess.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase para el algoritmo de ordenamiento por burbuja
 * @param <T> Tipo de dato
 * @return ArrayList
 */
public class BubbleSort extends SortAlgorithm {

  @Override
  public <T extends Comparable<T>> ArrayList<T> sort(T[] arr, Integer espera) {
    if (espera == null) {
      espera = 0;
    }
    var newarr = new ArrayList<T>(Arrays.asList(arr));
    for (int i = 0; i < newarr.size() - 1; i++) {
      for (int j = 0; j < newarr.size() - i - 1; j++) {
        if (newarr.get(j).compareTo(newarr.get(j + 1)) > 0) {
          T temp = newarr.get(j);
          newarr.set(j, newarr.get(j + 1));
          newarr.set(j + 1, temp);
        }
        try {
          Thread.sleep(espera);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        interacciones++;
        cooldown += espera;
      }
    }
    return newarr;
  }
}

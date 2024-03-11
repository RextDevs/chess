package com.chess.algorithms;

import java.util.ArrayList;

/**
 * Clase abstracta para los algoritmos de ordenamiento
 * @param interacciones Interacciones del algoritmo
 * @param cooldown Tiempo de espera del algoritmo
 * @return int
 */
public abstract class SortAlgorithm {
  protected int interacciones = 0;
  protected int cooldown = 0;

  public abstract <T extends Comparable<T>> ArrayList<T> sort(T[] arr, Integer espera);

  public int getInteracciones() {
    return interacciones;
  }

  public int getCooldown() {
    return cooldown;
  }

  public void render(Object[] arr) {
    StringBuilder sb = new StringBuilder();
    sb.append("|--|--|--|--|--|--|--|--|\n");
    int i = 0;
    for (Object t : arr) {
      sb.append("|");
      sb.append(t);
      if (t.toString().length() == 1) {
        sb.append(" ");
      }
      i++;
      if (i % 8 == 0) {
        sb.append("|\n");
        sb.append("|--|--|--|--|--|--|--|--|\n");
      }
    }
    System.out.println(sb.toString());
  }
}
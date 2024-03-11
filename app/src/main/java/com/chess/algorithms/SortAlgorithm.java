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
}
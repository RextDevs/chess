package com.chess.utils;

import java.util.ArrayList;
import java.util.List;
import com.chess.enums.*;
import com.chess.algorithms.*;

/**
 * Clase para procesar los argumentos de la linea de comandos
 * @param args Argumentos de la linea de comandos
 * @return String[]
 * @param v Valores de los argumentos
 * @return String[]
 * @param algorithm Algoritmo de ordenamiento
 * @return SortAlgorithm
 */
public class Process {
  public String[] args(String[] args) {
    var o = new String[] { "a", "t", "o", "in", "r", "s" };
    var v = new String[] { null, null, null, null, null, null };
    if (args.length == 6) {
      for (int i = 0; i < o.length; i++) {
        for (int j = 0; j < args.length; j++) {
          var key = args[j].substring(0, args[j].indexOf("="));
          if (o[i].equals(key)) {
            v[i] = args[j].substring(args[j].indexOf("=") + 1);
            break;
          }
        }
      }
    }
    return v;
  }

  public String[] values(String[] v) {
    var algorithms = new ArrayList<>(List.of("s", "b", "i"));
    var types = new ArrayList<>(List.of("n", "c"));
    var colors = new ArrayList<>(List.of("b", "w"));
    var values = new String[6];
    if (v[0] != null && algorithms.contains(v[0])) {
      values[0] = Algorithms.fromLetter(v[0]);
    }
    if (v[1] != null && types.contains(v[1])) {
      values[1] = Types.fromLetter(v[1]);
    }
    if (v[2] != null && colors.contains(v[2])) {
      values[2] = Colors.fromLetter(v[2]);
    }
    if (v[3] != null && v[3].equals("r")) {
      values[3] = "r";
      values[4] = v[4];
    }
    // v(6) debe ser un entero entre 100 y 1000
    if (v[5] != null) {
      var S = Integer.parseInt(v[5]);
      if (S >= 100 && S <= 1000) {
        values[5] = String.valueOf(S);
      } else {
        values[5] = null;
      }
    }
    return values;
  }

  public SortAlgorithm algorithm(String algorithm) {
    if (algorithm.equals("Selection Sort")) {
      return new SelectionSort();
    }
    if (algorithm.equals("Bubble Sort")) {
      return new BubbleSort();
    }
    if (algorithm.equals("Insertion Sort")) {
      return new InsertionSort();
    }
    return null;
  }
}

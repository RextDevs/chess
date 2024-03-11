package com.chess;

import com.chess.algorithms.SortAlgorithm;
import com.chess.utils.CreatePieces;
import com.chess.utils.Process;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase principal que ejecuta el programa
 * @param args Argumentos de la linea de comandos
 * @return void
 */
public class CHESS {
  String av = null;
  String tv = null;
  String cv = null;
  // Lista para guardar [interacciones, timpo total]
  ArrayList<Integer> stats = new ArrayList<>();
  int time = 0;
  ArrayList<Object> data = new ArrayList<>();
  ArrayList<Object> sortedData = null;

  public void run(String[] args) {
    Process ProcessArgs = new Process();
    var v = ProcessArgs.args(args);
    var values = ProcessArgs.values(v);
    // si hay valores nulos, retornar
    for (String value : values) {
      if (value == null) {
        return;
      }
    }
    av = values[0];
    tv = values[1];
    cv = values[2];
    data = CreatePieces.createPieces(Integer.parseInt(values[4]), tv);
    Collections.shuffle(data);
    // Select algorithm
    SortAlgorithm algorithm = ProcessArgs.algorithm(av);
    sortedData = algorithm.sort((Comparable[]) data.toArray(new Comparable[0]), Integer.parseInt(v[5]));
    stats.add(algorithm.getInteracciones());
    stats.add(algorithm.getCooldown());
  }

  @Override
  public String toString() {
    return "Ordenamiento: " + (this.av == null ? "Invalido" : "[" + this.av + "]") + "\n" +
        "Tipo: " + (this.tv == null ? "Invalido" : "[" + this.tv + "]") + "\n" +
        "Color: " + (this.cv == null ? "Invalido"
            : "[" + this.cv + "]" + "\n" +
                "Valores: " + (this.data == null ? "Invalido"
                    : this.data.toString() + "\n" +
                        "Ordenamiento: " + (this.sortedData == null ? "Invalido" : this.sortedData.toString()) + "\n" +
                        "Tiempo total: " + this.stats.get(1) + "ms"));
  }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

import enums.Algorithms;
import enums.Colors;
import enums.Types;
import algorithms.BubbleSort;
import algorithms.SelectionSort;

public class CHESS {
  String av = null;
  String tv = null;
  String cv = null;
  ArrayList<Comparable> data = null;
  ArrayList<Comparable> sortedData = null;

  public static void main(String[] args) {
    args = new String[] { "a=s", "t=n", "o=b" };
    var c = new CHESS();
    c.process(args);
    System.out.println(c);
  }

  public void process(String[] args) {
    var o = new String[] { "a", "t", "o" };
    var v = new String[] { null, null, null };
    if (args.length == 3) {
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

    var algorithms = new ArrayList<>(List.of("s", "b", "i"));
    var types = new ArrayList<>(List.of("n", "c"));
    var colors = new ArrayList<>(List.of("b", "w"));
    if (v[0] != null && algorithms.contains(v[0])) {
      this.av = Algorithms.fromLetter(v[0]);
    }
    if (v[1] != null && types.contains(v[1])) {
      this.tv = Types.fromLetter(v[1]);
    }
    if (v[2] != null && colors.contains(v[2])) {
      this.cv = Colors.fromLetter(v[2]);
    }
    if (this.av == null || this.tv == null || this.cv == null) {
      return;
    }
    System.out.println(this.av + " " + this.tv + " " + this.cv);
    if (this.av.equals("Selection Sort")) {
      createData();
      Comparable[] arr = new Comparable[this.data.size()];
      arr = this.data.toArray(arr);
      var s = new SelectionSort();
      this.sortedData = s.sort(arr);
    }
    if (this.av.equals("Bubble Sort")) {
      createData();
      Comparable[] arr = new Comparable[this.data.size()];
      arr = this.data.toArray(arr);
      var s = new BubbleSort();
      this.sortedData = s.sort(arr);
    }
    if (this.av.equals("Insertion Sort")) {
      createData();
      Comparable[] arr = new Comparable[this.data.size()];
      arr = this.data.toArray(arr);
      var s = new SelectionSort();
      this.sortedData = s.sort(arr);
    }
  }

  public void createData() {
    var a = new ArrayList<Comparable>();
    if (this.tv.equals("numeros")) {
      a = new ArrayList<Comparable>(List.of(5, 8, 15, 16, 1, 2, 9, 
      10, 11, 6, 7, 13, 14, 3, 4, 12));
    } else if (this.tv.equals("caracteres")) {
      a = new ArrayList<Comparable>(List.of("m", "j", "k", "l", "e",
          "n", "c", "d", "b", "g", "h", "i", "f", "o", "p", "a"));
    } 
    this.data = a;
    System.out.println(this.data);
  }

  @Override
  public String toString() {
    return "Ordenamiento: " + (this.av == null ? "Invalido" : "[" + this.av + "]") + "\n" +
        "Tipo: " + (this.tv == null ? "Invalido" : "[" + this.tv + "]") + "\n" +
        "Color: " + (this.cv == null ? "Invalido"
            : "[" + this.cv + "]" + "\n" +
                "Valores: " + (this.data == null ? "Invalido"
                    : this.data.toString() + "\n" +
                        "Ordenamiento: " + (this.sortedData == null ? "Invalido" : this.sortedData.toString())));
  }
}

package com.chess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CHESSTest {
  @Test
  public void testArgs1() {
    var c = new CHESS();
    c.run(new String[] { "a=s", "t=n", "o=b", "in=r", "r=16", "s=100" });
    Assertions.assertEquals("Ordenamiento: [Selection Sort]\n" +
        "Tipo: [numeros]\n" +
        "Color: [negras]\n" +
        "Valores: " + c.data.toString() + "\n" +
        "Ordenamiento: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]\n" +
        "Tiempo total: " + c.stats.get(0) * 100 + "ms", c.toString());
  }

  @Test
  public void testArgs2() {
    var c = new CHESS();
    c.run(new String[] { "a=b", "t=c", "o=w", "in=r", "r=16", "s=100" });
    Assertions.assertEquals("Ordenamiento: [Bubble Sort]\n" +
        "Tipo: [caracteres]\n" +
        "Color: [blancas]\n" +
        "Valores: " + c.data.toString() + "\n" +
        "Ordenamiento: [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p]\n" +
        "Tiempo total: " + c.stats.get(0) * 100 + "ms", c.toString());
  }

  @Test
  public void testArgs3() {
    var c = new CHESS();
    c.run(new String[] { "a=i", "t=n", "o=b", "in=r", "r=16", "s=500" });
    Assertions.assertEquals("Ordenamiento: [Insertion Sort]\n" +
        "Tipo: [numeros]\n" +
        "Color: [negras]\n" +
        "Valores: " + c.data.toString() + "\n" +
        "Ordenamiento: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]\n" +
        "Tiempo total: " + c.stats.get(0) * 500 + "ms", c.toString());
  }

  @Test
  public void testArgs4() {
    var c = new CHESS();
    c.run(new String[] { "a=t", "t=x", "o=z" });
    Assertions.assertEquals("Ordenamiento: Invalido\nTipo: Invalido\nColor: Invalido", c.toString());
  }

  // Ejemplos del examen
  @Test
  public void ejemplo1() {
    var c = new CHESS();
    c.run(new String[] { "a=i", "t=c", "o=b", "in=r", "r=8", "s=230" });
    Assertions.assertEquals("Ordenamiento: [Insertion Sort]\n" +
        "Tipo: [caracteres]\n" +
        "Color: [negras]\n" +
        "Valores: " + c.data.toString() + "\n" +
        "Ordenamiento: " + c.sortedData.toString() + "\n" +
        "Tiempo total: " + c.stats.get(0) * 230 + "ms", c.toString());
  }

  @Test
  public void ejemplo2() {
    var c = new CHESS();
    c.run(new String[] { "a=q", "t=c", "o=w", "in=r", "r=16", "s=100" });
    // Fallara porque el algoritmo no existe
    Assertions.assertEquals("Ordenamiento: Invalido\n" +
        "Tipo: Invalido\n" +
        "Color: Invalido", c.toString());
  }

  @Test
  public void ejemplo3() {
    var c = new CHESS();
    c.run(new String[] { "a=1", "t=H", "o=w" });
    // Fallara porque el tipo no existe
    Assertions.assertEquals("Ordenamiento: Invalido\n" +
        "Tipo: Invalido\n" +
        "Color: Invalido", c.toString());
  }

  @Test
  public void ejemplo4() {
    var c = new CHESS();
    c.run(new String[] { "a=b", "t=c", "o=w", "in=r", "r=6", "s=500" });
    Assertions.assertEquals("Ordenamiento: [Bubble Sort]\n" +
        "Tipo: [caracteres]\n" +
        "Color: [blancas]\n" +
        "Valores: " + c.data.toString() + "\n" +
        "Ordenamiento: " + c.sortedData.toString() + "\n" +
        "Tiempo total: " + c.stats.get(0) * 500 + "ms", c.toString());
  }

  @Test
  public void randomTest() {
    // Generar pruebas aleatorias
    var r = new java.util.Random();
    var a = new String[] { "s", "b", "i" };
    var t = new String[] { "n", "c" };
    var o = new String[] { "b", "w" };
    var R = new int[] { 1, 2, 4, 6, 8, 10, 16 };
    var S = new int[] { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
    for (int i = 0; i < 5; i++) {
      var c = new CHESS();
      var av = a[r.nextInt(a.length)];
      var tv = t[r.nextInt(t.length)];
      var cv = o[r.nextInt(o.length)];
      var Rv = R[r.nextInt(R.length)];
      var Sv = S[r.nextInt(S.length)];
      c.run(new String[] { "a=" + av, "t=" + tv, "o=" + cv, "in=r", "r=" + Rv, "s=" + Sv });
      StringBuilder sb = new StringBuilder();
      if (av.equals("s")) {
        sb.append("Ordenamiento: [Selection Sort]\n");
      } else if (av.equals("b")) {
        sb.append("Ordenamiento: [Bubble Sort]\n");
      } else if (av.equals("i")) {
        sb.append("Ordenamiento: [Insertion Sort]\n");
      }
      if (tv.split(",")[0].equals("n")) {
        sb.append("Tipo: [numeros]\n");
      } else if (tv.split(",")[0].equals("c")) {
        sb.append("Tipo: [caracteres]\n");
      }
      if (cv.equals("b")) {
        sb.append("Color: [negras]\n");
      } else if (cv.equals("w")) {
        sb.append("Color: [blancas]\n");
      }
      sb.append("Valores: " + c.data.toString() + "\n");
      sb.append("Ordenamiento: " + c.sortedData.toString() + "\n");
      sb.append("Tiempo total: " + c.stats.get(0) * Sv + "ms");
      Assertions.assertEquals(sb.toString(), c.toString());
    }
  }

  @Test
  public void badTimeTest() {
    var c = new CHESS();
    c.run(new String[] { "a=s", "t=n", "o=b", "in=r", "r=16", "s=10000" });
    // Fallara porque el tiempo es mayor a 1000
    Assertions.assertEquals("Ordenamiento: Invalido\n" +
        "Tipo: Invalido\n" +
        "Color: Invalido", c.toString());
  }
}

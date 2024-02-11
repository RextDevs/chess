import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CHESSTest {
  @Test
  public void testArgs1() {
    var c = new CHESS();
    c.process(new String[] { "a=s", "t=n", "o=b" });
    Assertions.assertEquals("Ordenamiento: [Selection Sort]\n"+
    "Tipo: [numeros]\n" +
    "Color: [negras]\n" +
    "Valores: [5, 8, 15, 16, 1, 2, 9, 10, 11, 6, 7, 13, 14, 3, 4, 12]\n" +
    "Ordenamiento: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]", c.toString());
  }

  @Test
  public void testArgs2() {
    var c = new CHESS();
    c.process(new String[] { "a=b", "t=c", "o=w" });
    //"[m,j,k,l,e,n,c,d,b,g,h,i,f,o,p,a]"
    Assertions.assertEquals("Ordenamiento: [Bubble Sort]\n"+
    "Tipo: [caracteres]\n" +
    "Color: [blancas]\n" +
    "Valores: [m, j, k, l, e, n, c, d, b, g, h, i, f, o, p, a]\n" +
    "Ordenamiento: [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p]", c.toString());
  }

  @Test
  public void testArgs3() {
    var c = new CHESS();
    c.process(new String[] { "a=i", "t=n", "o=b" });
    Assertions.assertEquals("Ordenamiento: [Insertion Sort]\n"+
    "Tipo: [numeros]\n" +
    "Color: [negras]\n" +
    "Valores: [5, 8, 15, 16, 1, 2, 9, 10, 11, 6, 7, 13, 14, 3, 4, 12]\n" +
    "Ordenamiento: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]", c.toString());
  }

  @Test
  public void testArgs4() {
    var c = new CHESS();
    c.process(new String[] { "a=t", "t=x", "o=z" });
    Assertions.assertEquals("Ordenamiento: Invalido\nTipo: Invalido\nColor: Invalido", c.toString());
  }

  //Ejemplos del examen
  @Test
  public void ejemplo1() {
    var c = new CHESS();
    c.process(new String[] { "a=i", "t=c", "o=b" });
    Assertions.assertEquals("Ordenamiento: [Insertion Sort]\n"+
    "Tipo: [caracteres]\n" +
    "Color: [negras]\n" +
    "Valores: [m, j, k, l, e, n, c, d, b, g, h, i, f, o, p, a]\n" +
    "Ordenamiento: [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p]", c.toString());
  }

  @Test
  public void ejemplo2() {
    var c = new CHESS();
    c.process(new String[] { "a=q", "t=c", "o=w" });
    //Fallara porque el algoritmo no existe
    Assertions.assertEquals("Ordenamiento: Invalido\n"+
    "Tipo: [caracteres]\n" +
    "Color: [blancas]\n" +
    "Valores: Invalido", c.toString());
  }

  @Test
  public void ejemplo3() {
    var c = new CHESS();
    c.process(new String[] { "a=1", "t=H", "o=w" });
    //Fallara porque el tipo no existe
    Assertions.assertEquals("Ordenamiento: Invalido\n"+
    "Tipo: Invalido\n" +
    "Color: [blancas]\n" +
    "Valores: Invalido", c.toString());
  }
}

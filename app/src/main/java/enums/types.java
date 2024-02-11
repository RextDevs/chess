package enums;

public enum Types {
  CARACTERES("c", "caracteres"),
  NUMEROS("n", "numeros");

  private String letter;
  private String type;

  Types(String letter, String type) {
    this.letter = letter;
    this.type = type;
  }

  public String getLetter() {
    return letter;
  }

  public String getType() {
    return type;
  }

  public static String fromLetter(String letter) {
    String search = null;
    for (Types t : values()) {
      if (t.getLetter().equals(letter)) {
        search = t.getType();
        break;
      }
    }
    return search;
  }
}
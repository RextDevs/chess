package enums;

public enum Colors {
  NEGRAS("b", "negras"),
  BLANCAS("w", "blancas");

  private String letter;
  private String color;

  Colors(String letter, String color) {
    this.letter = letter;
    this.color = color;
  }

  public String getLetter() {
    return letter;
  }

  public String getColor() {
    return color;
  }

  public static String fromLetter(String letter) {
    String search = null;
    for (Colors c : values()) {
      if (c.getLetter().equals(letter)) {
        search = c.getColor();
        break;
      }
    }
    return search;
  }
}
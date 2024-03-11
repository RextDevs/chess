package com.chess.enums;

/**
 * Enumerador para los algoritmos de ordenamiento
 * @param letter Letra del algoritmo
 * @param phrase Frase del algoritmo
 * @return String
 */
public enum Algorithms {
  SELECT("s", "Selection Sort"),
  BUBBLE("b", "Bubble Sort"),
  INSERTION("i", "Insertion Sort");

  private String letter;
  private String phrase;

  Algorithms(String letter, String phrase) {
    this.letter = letter;
    this.phrase = phrase;
  }

  public String getLetter() {
    return letter;
  }

  public String getPhrase() {
    return phrase;
  }

  public static String fromLetter(String letter) {
    String search = null;
    for (Algorithms a : values()) {
      if (a.getLetter().equals(letter)) {
        search = a.getPhrase();
        break;
      }
    }
    return search;
  }
}
package com.chess.enums;

/**
 * Enumerador para las piezas del ajedrez
 * @param stringValue Valor de la pieza
 * @param intValue Valor numérico de la pieza
 * @param type Tipo de pieza
 * @return String
 */
public enum Pieces {
  REY("a", 1),
  REINA("b", 2),
  TORRE_I("c", 3),
  TORRE_II("d", 4),
  ALFIL_I("e", 5),
  ALFIL_II("f", 6),
  CABALLO_I("g", 7),
  CABALLO_II("h", 8),
  PEON_I("i", 9),
  PEON_II("j", 10),
  PEON_III("k", 11),
  PEON_IV("l", 12),
  PEON_V("m", 13),
  PEON_VI("n", 14),
  PEON_VII("o", 15),
  PEON_VIII("p", 16);

  private final String stringValue;
  private final int intValue;
  private String type;

  Pieces(String stringValue, int intValue) {
    this.stringValue = stringValue;
    this.intValue = intValue;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Object getValue() {
    if (type.equals("numeros")) {
      return this.intValue;
    } else {
      return this.stringValue;
    }
  }



  @Override
  public String toString() {
    if (this.type.equals("numeros")) {
      return String.valueOf(this.intValue);
    } else {
      return this.stringValue;
    }
  }

}

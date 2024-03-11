package com.chess.utils;

import java.util.ArrayList;
import com.chess.enums.Pieces;

/**
 * Clase para crear las piezas del ajedrez
 * @param R Número de piezas
 * @param type Tipo de pieza
 * @return ArrayList<Object>
 */
public class CreatePieces {
  public static ArrayList<Object> createPieces(int R, String type) {
    ArrayList<Object> pieces = new ArrayList<>();
    if (R != 0) {
      if (R == 1) {
        pieces.add(Pieces.REY);
      } else if (R == 2) {
        pieces.add(Pieces.REY);
        pieces.add(Pieces.REINA);
      } else if (R == 4) {
        pieces.add(Pieces.REY);
        pieces.add(Pieces.REINA);
        pieces.add(Pieces.ALFIL_I);
        pieces.add(Pieces.ALFIL_II);
      } else if (R == 6) {
        pieces.add(Pieces.REY);
        pieces.add(Pieces.REINA);
        pieces.add(Pieces.ALFIL_I);
        pieces.add(Pieces.ALFIL_II);
        pieces.add(Pieces.CABALLO_I);
        pieces.add(Pieces.CABALLO_II);
      } else if (R == 8) {
        pieces.add(Pieces.REY);
        pieces.add(Pieces.REINA);
        pieces.add(Pieces.ALFIL_I);
        pieces.add(Pieces.ALFIL_II);
        pieces.add(Pieces.CABALLO_I);
        pieces.add(Pieces.CABALLO_II);
        pieces.add(Pieces.TORRE_I);
        pieces.add(Pieces.TORRE_II);
      } else if (R == 10) {
        pieces.add(Pieces.REY);
        pieces.add(Pieces.REINA);
        pieces.add(Pieces.ALFIL_I);
        pieces.add(Pieces.ALFIL_II);
        pieces.add(Pieces.CABALLO_I);
        pieces.add(Pieces.CABALLO_II);
        pieces.add(Pieces.TORRE_I);
        pieces.add(Pieces.TORRE_II);
        pieces.add(Pieces.PEON_I);
        pieces.add(Pieces.PEON_II);
        pieces.add(Pieces.PEON_III);
        pieces.add(Pieces.PEON_IV);
        pieces.add(Pieces.PEON_V);
        pieces.add(Pieces.PEON_VI);
        pieces.add(Pieces.PEON_VII);
        pieces.add(Pieces.PEON_VIII);
      } else if (R == 16) {
        pieces.add(Pieces.REY);
        pieces.add(Pieces.REINA);
        pieces.add(Pieces.ALFIL_I);
        pieces.add(Pieces.ALFIL_II);
        pieces.add(Pieces.CABALLO_I);
        pieces.add(Pieces.CABALLO_II);
        pieces.add(Pieces.TORRE_I);
        pieces.add(Pieces.TORRE_II);
        pieces.add(Pieces.PEON_I);
        pieces.add(Pieces.PEON_II);
        pieces.add(Pieces.PEON_III);
        pieces.add(Pieces.PEON_IV);
        pieces.add(Pieces.PEON_V);
        pieces.add(Pieces.PEON_VI);
        pieces.add(Pieces.PEON_VII);
        pieces.add(Pieces.PEON_VIII);
      }
    } else {
      pieces.add(Pieces.REY);
      pieces.add(Pieces.REINA);
      pieces.add(Pieces.ALFIL_I);
      pieces.add(Pieces.ALFIL_II);
      pieces.add(Pieces.CABALLO_I);
      pieces.add(Pieces.CABALLO_II);
      pieces.add(Pieces.TORRE_I);
      pieces.add(Pieces.TORRE_II);
      pieces.add(Pieces.PEON_I);
      pieces.add(Pieces.PEON_II);
      pieces.add(Pieces.PEON_III);
      pieces.add(Pieces.PEON_IV);
      pieces.add(Pieces.PEON_V);
      pieces.add(Pieces.PEON_VI);
      pieces.add(Pieces.PEON_VII);
      pieces.add(Pieces.PEON_VIII);
    }
    for (Object piece : pieces) {
      Pieces p = (Pieces) piece;
      p.setType(type);
    }
    return pieces;
  }
}

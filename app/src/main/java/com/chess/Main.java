package com.chess;
public class Main {
  public static void main(String[] args) {
    args = new String[] { "a=s", "t=n", "o=b", "in=r", "r=16", "s=1000" };
    var c = new CHESS();
    c.run(args);
    System.out.println(c.toString());
  }
}

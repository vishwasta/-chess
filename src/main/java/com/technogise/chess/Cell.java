package com.technogise.chess;

public class Cell {
  private String row;
  private String column;

  public Cell(String row, String column) {
    this.row = row;
    this.column = column;
  }

  public String getCellName() {
    return row + column;
  }
}

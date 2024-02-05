package com.technogise.chess;

public class Cell {
  private int row;
  private char column;

  public Cell(int row, char column) {
    this.row = row;
    this.column = column;
  }

  public String getCellName() {
    return String.valueOf(column) + String.valueOf(row);
  }

  public int getRow() {
    return row;
  }

  public char getColumn() {
    return column;
  }
}

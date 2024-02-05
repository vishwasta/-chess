package com.technogise.chess;

public record Cell(int row, char column) {

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

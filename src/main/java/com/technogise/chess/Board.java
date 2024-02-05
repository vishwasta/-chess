package com.technogise.chess;

import java.util.List;
import java.util.stream.Stream;

public record Board(List<List<Cell>> cells) {

  public Board() {
    this(Stream.iterate(1, it -> it < 9, i -> i + 1)
      .map(row -> Stream.iterate(65, column -> column < 73, j -> j + 1)
        .map(column -> new Cell(row, (char) column.intValue()))
        .toList())
      .toList());
  }

  public List<List<Cell>> getCells() {
    return cells;
  }


  public int getRowCount() {
    return cells.size();
  }

  public int getColumnCount() {
    return cells.get(0).size();
  }

  public int getColumn(Cell cell) {
    return switch (cell.getColumn()) {
      case 'A':
        yield 0;
      case 'B':
        yield 1;
      case 'C':
        yield 2;
      case 'D':
        yield 3;
      case 'E':
        yield 4;
      case 'F':
        yield 5;
      case 'G':
        yield 6;
      case 'H':
        yield 7;
      default:
        throw new RuntimeException("Invalid value provided");
    };
  }

  public int getRow(Cell cell) {
    return cell.getRow() - 1;
  }

  public boolean isValidCell(int row, int column) {
    return (column >= 0 && column <= getColumnCount() - 1) && (row >= 0 && row <= getRowCount() - 1);
  }
}

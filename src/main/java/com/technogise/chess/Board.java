package com.technogise.chess;

import java.util.List;
import java.util.stream.Stream;

public class Board {
  private List<List<Cell>> cells;

  public Board() {
    this.cells = Stream.iterate(1, it -> it < 9, i -> i + 1)
      .map(row -> Stream.iterate(65, column -> column < 73, j -> j + 1)
        .map(column -> new Cell(row, (char) column.intValue()))
        .toList())
      .toList();
  }
}

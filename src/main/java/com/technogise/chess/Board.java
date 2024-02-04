package com.technogise.chess;

import java.util.List;
import java.util.stream.Stream;

public class Board {
  private List<List<Cell>> cells;

  public Board() {
    this.cells = Stream.iterate(0, it -> it < 9, i -> i + 1)
      .map(row -> Stream.iterate(0, column -> column < 9, j -> j + 1)
        .map(column -> new Cell(row.toString(), column.toString()))
        .toList())
      .toList();
  }
}

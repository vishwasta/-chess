package com.technogise.chess;

import java.util.List;

public class PawnMovement implements Movement {

  @Override
  public List<Cell> getPossibleMoves(Board board, Cell cell) {
    List<List<Cell>> cells = board.getCells();
    int row = board.getRow(cell);
    int column = board.getColumn(cell);
    int rowAbove = row + MovementType.VERTICAL_UP.getX();
    if (rowAbove < board.getRowCount()) {
      return List.of(cells.get(rowAbove).get(column));
    }
    return List.of();
  }
}

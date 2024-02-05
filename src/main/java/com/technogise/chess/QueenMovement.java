package com.technogise.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueenMovement implements Movement {

  @Override
  public List<Cell> getPossibleMoves(Board board, Cell cell) {
    int row = board.getRow(cell);
    int column = board.getColumn(cell);
    List<Cell> possibleCells = new ArrayList<>();
    Arrays.stream(MovementType.values())
      .forEach(it -> {
        for (int j = 1; j < 8; j++) {
          int columnNumber = column + j * it.getY();
          int rowNumber = row + j * it.getX();
          if (board.isValidCell(rowNumber, columnNumber)) {
            possibleCells.add(board.getCells().get(rowNumber).get(columnNumber));
          } else {
            break;
          }
        }
      });
    return possibleCells;
  }
}

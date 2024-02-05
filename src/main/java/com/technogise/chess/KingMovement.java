package com.technogise.chess;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class KingMovement implements Movement {

  @Override
  public List<Cell> getPossibleMoves(Board board, Cell cell) {
    List<List<Cell>> cells = board.getCells();
    int row = board.getRow(cell);
    int column = board.getColumn(cell);
    return Arrays.stream(MovementType.values())
      .map(it -> {
        int columnNumber = column + it.getY();
        int rowNumber = row + it.getX();
        if (board.isValidCell(rowNumber, columnNumber)) {
          return Optional.of(cells.get(rowNumber).get(columnNumber));
        }
        return Optional.<Cell>empty();
      })
      .filter(Optional::isPresent)
      .map(Optional::get)
      .toList();
  }


}

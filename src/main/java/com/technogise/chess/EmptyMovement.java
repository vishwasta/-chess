package com.technogise.chess;

import java.util.List;

public class EmptyMovement implements Movement {
  @Override
  public List<Cell> getPossibleMoves(Board board, Cell cell) {
    return List.of();
  }
}

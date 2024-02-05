package com.technogise.chess;

import java.util.List;

public interface Movement {
  List<Cell> getPossibleMoves(final Board board, Cell cell);
}

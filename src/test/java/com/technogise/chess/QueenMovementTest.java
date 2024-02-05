package com.technogise.chess;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class QueenMovementTest {

  @Test
  void shouldGetPossibleMovementsForQueen() {
    Board board = new Board();
    Cell cell = new Cell(4, 'E');
    QueenMovement queenMovement = new QueenMovement();

    List<Cell> possibleMoves = queenMovement.getPossibleMoves(board, cell);

    List<String> expectedCells = Stream.of(new Cell(4, 'A'), new Cell(4, 'B'), new Cell(4, 'C'),
        new Cell(4, 'D'), new Cell(4, 'F'), new Cell(4, 'G'), new Cell(4, 'H'),
        new Cell(1, 'E'), new Cell(2, 'E'), new Cell(3, 'E'), new Cell(5, 'E'), new Cell(6, 'E'),
        new Cell(7, 'E'), new Cell(8, 'E'), new Cell(8, 'A'), new Cell(7, 'B'),
        new Cell(6, 'C'), new Cell(5, 'D'), new Cell(3, 'F'), new Cell(2, 'G'),
        new Cell(1, 'H'), new Cell(1, 'B'), new Cell(2, 'C'), new Cell(3, 'D'),
        new Cell(5, 'F'), new Cell(6, 'G'), new Cell(7, 'H'))
      .map(Cell::getCellName)
      .toList();

    assertTrue(possibleMoves.stream().map(Cell::getCellName).toList().containsAll(expectedCells));
  }
}
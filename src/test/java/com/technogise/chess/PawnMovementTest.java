package com.technogise.chess;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PawnMovementTest {

  @Test
  void shouldGetPossibleMovementForPawn() {
    Board board = new Board();
    Cell cell = new Cell(5, 'D');
    PawnMovement pawnMovement = new PawnMovement();

    List<Cell> possibleMoves = pawnMovement.getPossibleMoves(board, cell);

    List<String> expectedCells = Stream.of(new Cell(6,'D')).map(Cell::getCellName)
      .toList();
    assertTrue(possibleMoves.stream().map(Cell::getCellName).toList().containsAll(expectedCells));
  }

  @Test
  void shouldGetPossibleMovementForPawnAtTheLastRow() {
    Board board = new Board();
    Cell cell = new Cell(8, 'D');
    PawnMovement pawnMovement = new PawnMovement();

    List<Cell> possibleMoves = pawnMovement.getPossibleMoves(board, cell);

    assertTrue(possibleMoves.isEmpty());
  }
}
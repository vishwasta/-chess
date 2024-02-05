package com.technogise.chess;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class KingMovementTest {

  @Test
  void shouldGetAllPossibleMovesForKing() {
    Board board = new Board();
    Cell cell = new Cell(5, 'D');
    KingMovement kingMovement = new KingMovement();

    List<Cell> possibleMoves = kingMovement.getPossibleMoves(board, cell);

    List<String> expectedCells = Stream.of(new Cell(4, 'C'), new Cell(5, 'C'), new Cell(6, 'C'),
        new Cell(4, 'D'), new Cell(6, 'D'), new Cell(4, 'E'), new Cell(5, 'E'), new Cell(6, 'E')).map(Cell::getCellName)
      .toList();
    assertTrue(possibleMoves.stream().map(Cell::getCellName).toList().containsAll(expectedCells));
  }

  @Test
  void shouldGetAllPossibleMovesForKingAtTheFirstRow() {
    Board board = new Board();
    Cell cell = new Cell(1, 'D');
    KingMovement kingMovement = new KingMovement();

    List<Cell> possibleMoves = kingMovement.getPossibleMoves(board, cell);

    possibleMoves.forEach(it -> System.out.println(it.getCellName()));
    List<String> expectedCells = Stream.of(new Cell(1, 'C'), new Cell(1, 'E'), new Cell(2, 'D'),
        new Cell(2, 'C'), new Cell(2, 'E'))
      .map(Cell::getCellName)
      .toList();

    assertTrue(possibleMoves.stream().map(Cell::getCellName).toList().containsAll(expectedCells));
  }

  @Test
  void shouldGetAllPossibleMovesForKingAtTheFirstRowAndFirstColumn() {
    Board board = new Board();
    Cell cell = new Cell(1, 'A');
    KingMovement kingMovement = new KingMovement();

    List<Cell> possibleMoves = kingMovement.getPossibleMoves(board, cell);

    List<String> expectedCells = Stream.of(new Cell(1, 'B'),
        new Cell(2, 'A'), new Cell(2, 'B'))
      .map(Cell::getCellName)
      .toList();
    assertTrue(possibleMoves.stream().map(Cell::getCellName).toList().containsAll(expectedCells));
  }

  @Test
  void shouldGetAllPossibleMovesForKingAtTheFirstColumn() {
    Board board = new Board();
    Cell cell = new Cell(4, 'H');
    KingMovement kingMovement = new KingMovement();

    List<Cell> possibleMoves = kingMovement.getPossibleMoves(board, cell);

    List<String> expectedCells = Stream.of(new Cell(5, 'H'), new Cell(3, 'H'), new Cell(3, 'G'),
        new Cell(4, 'G'), new Cell(5, 'G'))
      .map(Cell::getCellName)
      .toList();
    assertTrue(possibleMoves.stream().map(Cell::getCellName).toList().containsAll(expectedCells));
  }

}
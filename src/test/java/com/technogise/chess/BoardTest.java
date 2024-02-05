package com.technogise.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

  @Test
  void shouldCreateBoardWith8RowsAnd8Columns() {
    Board board = new Board();

    assertEquals(8, board.getCells().size());
    assertEquals(8, board.getCells().get(0).size());
  }

  @Test
  void shouldGetColumnCountOfTheBoard() {
    Board board = new Board();

    Integer columnCount = board.getColumnCount();

    assertEquals(8, columnCount);
  }

  @Test
  void getColumnOfTheGivenCellInTheBoard() {
    Board board = new Board();
    Cell cell = new Cell(8, 'D');

    Integer columnNumber = board.getColumn(cell);

    assertEquals(3, columnNumber);
  }

  @Test
  void shouldGetRowOfTheGivenCellInTheBoard() {
    Board board = new Board();
    Cell cell = new Cell(8, 'D');

    Integer rowNumber = board.getRow(cell);

    assertEquals(7, rowNumber);
  }

  @Test
  void shouldGiveTrueIfGivenRowNumberAndColumnIsValidForACell() {
    Board board = new Board();

    boolean isValid = board.isValidCell(7, 7);

    assertTrue(isValid);
  }

  @Test
  void shouldGiveFalseIfGivenRowNumberAndColumnIsInValidForACell() {
    Board board = new Board();

    boolean isValid = board.isValidCell(8, 9);

    assertFalse(isValid);
  }

}
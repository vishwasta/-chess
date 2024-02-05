package com.technogise.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CellTest {
  @Test
  void shouldCreateCell() {
    Cell cell = new Cell(8, 'D');

    assertEquals(8, cell.getRow());
    assertEquals('D', cell.getColumn());
  }

  @Test
  void shouldCreateCellAndGiveBackCellName() {
    Cell cell = new Cell(8, 'D');

    assertEquals("D8", cell.getCellName());
  }
}
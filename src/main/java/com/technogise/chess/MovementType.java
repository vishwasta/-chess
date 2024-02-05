package com.technogise.chess;

public enum MovementType {
  VERTICAL_UP(1, 0), VERTICAL_DOWN(-1, 0), HORIZONTAL_FRONT(0, 1), HORIZONTAL_BACKWARD(0, -1),
  DIAGONAL_TOP_RIGHT(1, 1), DIAGONAL_TOP_LEFT(1, -1), DIAGONAL_BOTTOM_LEFT(-1, -1), DIAGONAL_BOTTOM_RIGHT(-1, 1);
  private int x;
  private int y;

  MovementType(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
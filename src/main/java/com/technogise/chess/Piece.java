package com.technogise.chess;

public enum Piece {
  KING(new KingMovement()), QUEEN(new QueenMovement()), ROOK(new EmptyMovement()), BISHOP(new EmptyMovement()), HORSE(new EmptyMovement()), PAWN(new PawnMovement());
  private final Movement movement;

  Piece(Movement movement) {
    this.movement = movement;
  }

  public Movement getMovement() {
    return movement;
  }
}

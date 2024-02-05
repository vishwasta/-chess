package com.technogise;

import com.technogise.chess.Board;
import com.technogise.chess.Cell;
import com.technogise.chess.Piece;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Board board = new Board();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter piece type and cell number comma separated");
    String input = scanner.nextLine();
    String[] inputs = input.split(",");
    Piece piece = Piece.valueOf(inputs[0]);
    Cell cell = new Cell(Character.getNumericValue(inputs[1].charAt(1)), inputs[1].charAt(0));
    piece.getMovement().getPossibleMoves(board, cell)
      .forEach(cells -> System.out.println(cells.getCellName()));
  }
}

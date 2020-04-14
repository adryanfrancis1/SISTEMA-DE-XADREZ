package application;

import java.util.Scanner;

import boardgame.UI;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ChessMatch cm = new ChessMatch();
		
		while(true) {
			UI.printBoard(cm.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = cm.performChessMove(source, target);
		}
		
		//System.out.println(b);
	}

}

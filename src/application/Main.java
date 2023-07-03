package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean gameOver = false;
			
			System.out.println("Input 1 to play.");
			int play = sc.nextInt();
			
			if(play!=1) {
				break;
			}
			
			System.out.println("Initial board");
			Board board = new Board();
			
			board.initializeBoard();
			board.displayBoard();
			
			int space;
			boolean spaceSet;
			
			while(true) {
				if(gameOver) {
					break;
				}
				
				spaceSet = false;
				
				while(!spaceSet) {
					System.out.print("Player 1: Input space (1-9): ");
					space = sc.nextInt();
					spaceSet = board.setSpace('X', space);
					gameOver = board.checkForWin();
					
					if(gameOver) {
						System.out.println("Game over! Player 1 wins!");
						break;
					}
				}
				
				spaceSet = false;
				
				while(!spaceSet) {
					System.out.print("Player 2: Input space (1-9): ");
					space = sc.nextInt();
					spaceSet = board.setSpace('O', space);
					gameOver = board.checkForWin();
					
					if(gameOver) {
						System.out.println("Game over! Player 2 wins!");
						break;
					}
				}
			}
			
		}
		System.out.println("Thanks for playing!");
		sc.close();
	}
	
}
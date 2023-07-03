package application;

public class Board {

	private char[] spaces = new char[9];
	
	public void initializeBoard() {
		for(int x = 0; x < spaces.length; x++) {
			spaces[x] = '-';
		}
	}
	
	public void displayBoard() {		
		for (int x = 0; x < spaces.length; x++) {
			if(x%3==0) {
				System.out.print("\n");
			}
			System.out.print(spaces[x] + " ");
		}
		System.out.print("\n");
	}
	
	public boolean setSpace(char shape, int space) {
		if(spaces[space-1] == '-') {
			spaces[space-1] = shape;
			displayBoard();
			return true;
		} else {
			System.out.println("Can not overwrite space");
			return false;
		}
		
	}
	
	public boolean checkForWin() {
		
		int[][] winningCombinations = {
		        {0, 1, 2},
		        {3, 4, 5},
		        {6, 7, 8},
		        {0, 3, 6},
		        {1, 4, 7},
		        {2, 5, 8},
		        {0, 4, 8},
		        {2, 4, 6}
		    };
		
		for (int[] combination : winningCombinations) {
	        char first = spaces[combination[0]];
	        char second = spaces[combination[1]];
	        char third = spaces[combination[2]];

	        if (first == second && second == third && first != '-') {
	            return true;
	        }
	    }
		
		return false;
	}
	
}

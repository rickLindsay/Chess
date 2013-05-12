package Chess;

public class Board {

	private final static int BOARD_SIZE = 6, KNIGHT_START = 1, PAWN_START = 1;
	Cell[][] board;
	public static void main(String[] args) {
		Board b = new Board();
		b.drawBoard();
		System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
	}
	
	public Board () {
		board = new Cell[BOARD_SIZE][BOARD_SIZE];
		
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int col = 0; col < BOARD_SIZE; col++) {
				if ( row % (BOARD_SIZE - 1) == 0 && ( col == KNIGHT_START || col == BOARD_SIZE - (KNIGHT_START * 2)) ) {
					if (row == 0)
						board[row][col] = new Cell(CellPiece.KNIGHT,CellPlayer.BLACK);
					else
						board[row][col] = new Cell(CellPiece.KNIGHT,CellPlayer.WHITE);
				} else if ( row == PAWN_START || row == BOARD_SIZE - (PAWN_START * 2) ) {
					if (row == PAWN_START)
						board[row][col] = new Cell(CellPiece.PAWN,CellPlayer.BLACK);
					else
						board[row][col] = new Cell(CellPiece.PAWN,CellPlayer.WHITE);
				} else {
					board[row][col] = new Cell();
				}
			} 
		}
	}
	
	public void drawBoard() {
		for (int row = 0; row < BOARD_SIZE; row++) {
			String b = "";
			for (int col = 0; col < BOARD_SIZE; col++) {
				if ( col == 0) 
					if (row == 0) 
						b += " ----";
					else
						b += " |--+";
				else if ( col == BOARD_SIZE - 1 )
					if (row == 0)
						b += "---";
					else
						b += "--|";
				else
					if (row == 0)
						b += "---";
					else 
						b+="--+";
			}
				
			System.out.println(b);
			b =  (BOARD_SIZE - row) + "|";
			for (int col = 0; col < BOARD_SIZE; col++)
				b += board[row][col].getString() + "|";
			System.out.println(b);
		}
		
		String b = "";
		for (int col = 0; col < BOARD_SIZE; col++) {
			if ( col == 0 )
				b += " -";
			b += "---";
		}
		System.out.println(b);
		
		b = "  ";
		// a = 97 in the ASCII table
		int i = 97;
		for (int col = 0; col < BOARD_SIZE; col++) {
			b += (char)(i + col) + "  ";
		}

		System.out.println(b);
	}

}

package Chess;

public class Cell {
	CellPiece piece;
	CellPlayer player;
	
	public Cell() {
		this.piece = CellPiece.EMPTY;
		this.player = CellPlayer.EMPTY;
	}
	
	public Cell(CellPiece piece, CellPlayer player) {
		this.piece = piece;
		this.player = player;
	}
	
	public CellPiece getPiece() {
		return piece;
	}
	
	public CellPlayer getPlayer() {
		return player;
	}
	
	public String getString() {
		String val = "";
		switch (player) {
		case WHITE:
			val += "W";
			break;
		case BLACK:
			val += "B";
			break;
		case EMPTY:
			val += " ";
		}
		switch (piece) {
		case KNIGHT:
			val += "K";
			break;
		case PAWN:
			val += "P";
			break;
		case EMPTY:
			val += " ";
		}
		
		return val;
	}
	
}

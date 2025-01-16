package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// only classes and subclasses can access
	protected Board getBoard() {
		return board;
	}
	
	
}

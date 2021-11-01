// Based on: https://www.youtube.com/watch?v=koqj7xlkPNQ

public class Chess {

	public ChessBoard board; // List<Cell>, 
	private List<Player> players;
	public Player currentPlayer;
	List<Move> moves; // history of Moves
	GameStatus gameStatus;
	
	public boolean startGame();
	public boolean endGame() ;
	public boolean playerMove(CellPosition from, CellPosition to, Piece piece);

}

public class Move {
	Player turn;
	Piece piece;
	Piece killedPiece;
	CellPosition start;
	CellPosition end;

}

public enum GameStatus {
	ACTIVE, PAUSED, FORFEITED, BLACK_WIN, WHITE_WIN
}


public class CellPosition {
	Char c;
	Integer i;
}

public class ChessBoard {
	
	private List<List<Cell>> cells;
	
	public void resetBoard();
	public boolean updateBoard(Move move);
	
}



public class Account {
	private String userId;
	private String name;
	private String email;
	private String password;
}


public enum Color {
	WHITE,
	BLACK
}

public class Time {
	int mins;
	int secs;
	
}

public Player extends Account {
	private Color playerSide;
	Time timeLeft;
	private makeMove();

}

public Admin extends Account {
	
	private void addPlayer(Player player);
	private void removePlayer(Player player);
	private void banPlayer(Player player);
	..
	
}

public class Cell {
	private Piece piece; // 8 pawn, 2 rook, 2 bishop, 1 queen ,1 king, 2 knights
	private Color color;
	private CellPosition position; // uniquely identify the cell
}

public enum PieceType {
	QUEEN,
	KING, 
	KNIGHT,
	BISHOP, 
	ROOK,
	PAWN
}


public abstract class Piece {
	Color color;
	
	public boolean move(CellPosition start, CellPosition end);
	public List<CellPosition> possibleMoves(CellPosition currentPosition);
	public boolean validateMove(CellPosition from, CellPosition end);
}

public class Knight extends Piece {

	public boolean move(CellPosition fromPosition, CellPositionb toPosition);
	public List<CellPosition> possibleMoves(CellPosition fromPosition);
	public boolean validate(CellPosition fromPosition, CellPositionb toPosition);

}

public class Bishop extends Piece {
	
	public boolean move(CellPosition fromPosition, CellPositionb toPosition);
	public List<CellPosition> possibleMoves(CellPosition fromPosition);
	public boolean validate(CellPosition fromPosition, CellPositionb toPosition);

}

public class rook extends Piece {
	
	public boolean move(CellPosition fromPosition, CellPositionb toPosition);
	public List<CellPosition> possibleMoves(CellPosition fromPosition);
	public boolean validate(CellPosition fromPosition, CellPositionb toPosition);

}

public class King extends Piece {
	
	public boolean move(CellPosition fromPosition, CellPositionb toPosition);
	public List<CellPosition> possibleMoves(CellPosition fromPosition);
	public boolean validate(CellPosition fromPosition, CellPositionb toPosition);

}

public class Queen extends Piece {
	
	public boolean move(CellPosition fromPosition, CellPositionb toPosition);
	public List<CellPosition> possibleMoves(CellPosition fromPosition);
	public boolean validate(CellPosition fromPosition, CellPositionb toPosition);

}

public class Pawn extends Piece {
	
	public boolean move(CellPosition fromPosition, CellPositionb toPosition);
	public List<CellPosition> possibleMoves(CellPosition fromPosition);
	public boolean validate(CellPosition fromPosition, CellPositionb toPosition);

}

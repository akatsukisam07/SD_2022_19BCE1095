public class Game {
    private Board board = new Board();
    private Player A;
    private Player B;
    public Game() {
        super();
    }

    public void setColorWhite(Player player) {
        this.A = player;
    }

    public void setColorBlack(Player player) {
        this.B = player;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getWhite() {
        return A;
    }

    public void setWhite(Player white) {
        this.A = A;
    }

    public Player getBlack() {
        return B;
    }

    public void setBlack(Player black) {
        this.B = B;
    }

    public boolean initializeBoardGivenPlayers() {
        if(this.B == null || this.A == null)
            return false;
        this.board = new Board();
        for(int i=0; i<B.getPieces().size(); i++){
            board.getSpot(B.getPieces().get(i).getX(), B.getPieces().get(i).getY()).occupySpot(B.getPieces().get(i));
        }
        return true;
    }

}

public class Player {
    public final int PAWNS = 5;
    public boolean A;

    private List<Piece> pieces = new ArrayList<>();

    public Player(boolean A) {
        super();
        this.A = A;
    }

    public List<Piece> getPieces() {
        return pieces;
    }


    public void initializePieces(){
        if(this.A == true){
            for(int i=0; i<PAWNS; i++){ // draw pawns
                pieces.add(new Pawn(true,i,0));
            }
            
        }
        else{
            for(int i=0; i<PAWNS; i++){ // draw pawns
                pieces.add(new Pawn(true,i,4));
            }
            
        }

    }
}

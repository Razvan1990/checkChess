package checking;

public class ChessCheck {

    public boolean checkIfChess(String king, String queen, int kingNumber, int queenNumber){
        int diffPos = pieceNumberDifference(kingNumber, queenNumber);
        if((king.charAt(0) == queen.charAt(0)) || (king.charAt(1) == queen.charAt(1) )){
            return true;
        }else if((diffPos %7 ==0)||(diffPos % 9 ==0)){
            return true;
        }
        else{
            return false;
        }
    }

    public int pieceNumberDifference(int a, int b){
        int diff = Math.abs(a-b);
        return diff;
    }
}

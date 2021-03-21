package runner;

import checking.ChessCheck;
import initialization.Positions;
import initialization.Printing;
import pieces.PlayerPieces;
import piecesPositioning.ChoosePosition;


public class Main {

    public Positions positions;
    public Printing printing;
    public ChoosePosition choosePosition;
    public ChessCheck chessCheck;

    public Main(Positions positions, Printing printing, ChoosePosition choosePosition, ChessCheck chessCheck) {
        this.printing = printing;
        this.positions = positions;
        this.choosePosition = choosePosition;
        this.chessCheck = chessCheck;
    }


    public static void main(String[] args) {
        try {
            Positions positions = new Positions();
            Printing printing = new Printing();
            ChoosePosition choosePosition = new ChoosePosition();
            ChessCheck chessCheck = new ChessCheck();


            //  System.out.println(positions.kingPosition());

            char[][] chessTable = {
                    /*0*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    /*1*/
                    {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                    /*2*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    /*3*/
                    {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                    /*4*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    /*5*/
                    {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                    /*6*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    /*7*/
                    {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                    /*8*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    /*9*/
                    {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                    /*10*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    /*11*/
                    {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                    /*12*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    /*13*/
                    {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                    /*14*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    /*15*/
                    {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                    /*16*/
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},

            };



            printing.showTable(chessTable);

            String kingPosition = positions.kingPosition();
            String queenPosition = positions.queenPosition();

            int kingNumber = choosePosition.setPiecePositionInNumber(chessTable, PlayerPieces.piecesArray[0], kingPosition);
            int queenNumber = choosePosition.setPiecePositionInNumber(chessTable, PlayerPieces.piecesArray[1], queenPosition);

            printing.showTable(chessTable);

            System.out.println("Is this position chess?");

            Thread thread = new Thread();
            thread.sleep(1500);

            System.out.println(chessCheck.checkIfChess(kingPosition, queenPosition, kingNumber, queenNumber));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
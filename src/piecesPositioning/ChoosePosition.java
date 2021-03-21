package piecesPositioning;

public class ChoosePosition {

    public char setPieceType(String piece) {
        if (piece.equals("king")) {
            return 'K';
        } else if (piece.equals("queen")) {
            return 'Q';
        } else {
            return '_';
        }

    }


    public int setPiecePositionInNumber(char[][] chessTable, String piece, String position) {
        char tablePiece = setPieceType(piece);

        switch (position) {
            //1. randul 8
            case "a8":
                chessTable[1][1] = tablePiece;

                return 1;
            case "b8":
                chessTable[1][3] = tablePiece;

                return 2;
            case "c8":
                chessTable[1][5] = tablePiece;

                return 3;
            case "d8":
                chessTable[1][7] = tablePiece;

                return 4;
            case "e8":
                chessTable[1][9] = tablePiece;

                return 5;
            case "f8":
                chessTable[1][11] = tablePiece;

                return 6;
            case "g8":
                chessTable[1][13] = tablePiece;

                return 7;
            case "h8":
                chessTable[1][15] = tablePiece;

                return 8;
            //2. randul 7
            case "a7":
                chessTable[3][1] = tablePiece;

                return 9;
            case "b7":
                chessTable[3][3] = tablePiece;

                return 10;
            case "c7":
                chessTable[3][5] = tablePiece;

                return 11;
            case "d7":
                chessTable[3][7] = tablePiece;
                ;
                return 12;
            case "e7":
                chessTable[3][9] = tablePiece;

                return 13;
            case "f7":
                chessTable[3][11] = tablePiece;

                return 14;
            case "g7":
                chessTable[3][13] = tablePiece;

                return 15;
            case "h7":
                chessTable[3][15] = tablePiece;
                ;
                return 16;
            //3. randul 6
            case "a6":
                chessTable[5][1] = tablePiece;

                return 17;
            case "b6":
                chessTable[5][3] = tablePiece;

                return 18;
            case "c6":
                chessTable[5][5] = tablePiece;

                return 19;
            case "d6":
                chessTable[5][7] = tablePiece;

                return 20;
            case "e6":
                chessTable[5][9] = tablePiece;

                return 21;
            case "f6":
                chessTable[5][11] = tablePiece;

                return 22;
            case "g6":
                chessTable[5][13] = tablePiece;

                return 23;
            case "h6":
                chessTable[5][15] = tablePiece;

                return 24;
            //4. randul 5
            case "a5":
                chessTable[7][1] = tablePiece;

                return 25;
            case "b5":
                chessTable[7][3] = tablePiece;

                return 26;
            case "c5":
                chessTable[7][5] = tablePiece;

                return 27;
            case "d5":
                chessTable[7][7] = tablePiece;

                return 28;
            case "e5":
                chessTable[7][9] = tablePiece;

                return 29;
            case "f5":
                chessTable[7][11] = tablePiece;

                return 30;
            case "g5":
                chessTable[7][13] = tablePiece;

                return 31;
            case "h5":
                chessTable[7][15] = tablePiece;

                return 32;
            //5. randul 4
            case "a4":
                chessTable[9][1] = tablePiece;

                return 33;
            case "b4":
                chessTable[9][3] = tablePiece;

                return 34;
            case "c4":
                chessTable[9][5] = tablePiece;

                return 35;
            case "d4":
                chessTable[9][7] = tablePiece;

                return 36;
            case "e4":
                chessTable[9][9] = tablePiece;

                return 37;
            case "f4":
                chessTable[9][11] = tablePiece;

                return 38;
            case "g4":
                chessTable[9][13] = tablePiece;

                return 39;
            case "h4":
                chessTable[9][15] = tablePiece;

                return 40;
            //6. randul 3
            case "a3":
                chessTable[11][1] = tablePiece;

                return 41;
            case "b3":
                chessTable[11][3] = tablePiece;

                return 42;
            case "c3":
                chessTable[11][5] = tablePiece;

                return 43;
            case "d3":
                chessTable[11][7] = tablePiece;

                return 44;
            case "e3":
                chessTable[11][9] = tablePiece;

                return 45;
            case "f3":
                chessTable[11][11] = tablePiece;

                return 46;
            case "g3":
                chessTable[11][13] = tablePiece;

                return 47;
            case "h3":
                chessTable[11][15] = tablePiece;

                return 48;
            //7. randul 2
            case "a2":
                chessTable[13][1] = tablePiece;

                return 49;
            case "b2":
                chessTable[13][3] = tablePiece;

                return 50;
            case "c2":
                chessTable[13][5] = tablePiece;

                return 51;
            case "d2":
                chessTable[13][7] = tablePiece;

                return 52;
            case "e2":
                chessTable[13][9] = tablePiece;

                return 53;
            case "f2":
                chessTable[13][11] = tablePiece;

                return 54;
            case "g2":
                chessTable[13][13] = tablePiece;

                return 55;
            case "h2":
                chessTable[13][15] = tablePiece;

                return 56;
            // 8. randul 1
            case "a1":
                chessTable[15][1] = tablePiece;

                return 57;
            case "b1":
                chessTable[15][3] = tablePiece;

                return 58;
            case "c1":
                chessTable[15][5] = tablePiece;

                return 59;
            case "d1":
                chessTable[15][7] = tablePiece;

                return 60;
            case "e1":
                chessTable[15][9] = tablePiece;

                return 61;
            case "f1":
                chessTable[15][11] = tablePiece;

                return 62;
            case "g1":
                chessTable[15][13] = tablePiece;

                return 63;
            case "h1":
                chessTable[15][15] = tablePiece;

                return 64;
            default:
                System.out.println("Something went wrong");


        }

        return 0;
    }

}


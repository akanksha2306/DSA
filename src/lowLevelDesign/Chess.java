//package lowLevelDesign;
//
//import java.sql.Time;
//
//public class Chess {
//
//    public class ChessGame{
//        ChessBoard chessBoard;
//
//        Player[] players;
//        Player currentPlayer;
//        Move makeMove;
//
//    }
//
//    public class Account{
//        int accountId;
//        String AccountName;
//        String emailId;
//        String password;
//        String name;
//        String Address;
//    }
//    public class ChessBoard{
//        Cell cell;
//        Piece piece;
//        Player player;
//        void resetBoard(){};
//        void updateBoard(Move move){};
//    }
//
//    public class Admin extends Account {
//
//    }
//    public class Player extends Account {
//
//        Color color;
//        Time timeLeft;
//    }
//    public class Time{
//        int seconds;
//        int minutes;
//    }
//
//    public class Move{
//
//        Player turn;
//        Piece pieceMoved;
//        Piece killedPiece;
//
//    }
//
//    public class Piece{
//        Color color;
//        Cell cell;
//        boolean move(CellPosition fromPosition, CellPosition toPosition){};
//        boolean validate(CellPosition fromPosition, CellPosition toPosition){};
//
//    }
//
//    public class knight extends Piece{};
//    public class bishop extends Piece{};
//    public class rook extends Piece{};
//    public class king extends Piece{};
//    public class queen extends Piece{};
//    public class pawn extends Piece{};
//
//
//    public class CellPosition{
//
//    }
//
//    public class Color{
//        String black;
//        String white;
//
//    }
//    public class Cell{
//        Color color;
//        Piece piece;
//        CellPosition position;
//    }
//    public enum GameStatus{
//        ACTIVE, FORFEIT, BLOCKED, BLACK_WIN, WHITE_WIN;
//    }
//
//    public enum playerStatus{
//        FAILED, RESIGNED, BLOCKED;
//    }
//
//
//
//
//}

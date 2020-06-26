package model;

public class Board{

    private int width;
    private int height;
    private Piece[][] board;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        init();
    }

    public Board init() {
        board = new Piece[height][width];
        return this;
    }
    public Piece getPiece(int x, int y) {
        if (validation(x, y)) return board[y][x];
        else return null;
    }
    public boolean putPiece(Piece piece, int x, int y) {
        if(validation(x, y)) {
            board[y][x] = piece;
            return true;
        } else return false;
    }
    public boolean validation(int x, int y) {
        if (-1 < x && x < width && -1 < y && y < height) return true;
        else return false;
    }
}
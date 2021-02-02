package com.example.mobiletetris.model.piece;

public class PieceImpl implements Piece{
    private int x, y;
    private int[][] blocks;

    public PieceImpl(int[][] blocks) {
        this.x = 0;
        this.y = 0;
        this.blocks = blocks;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int[][] blocks() {
        return blocks;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void rotateLeft() {

    }

    @Override
    public void rotateRight() {

    }

    @Override
    public void setPiece() {

    }
}

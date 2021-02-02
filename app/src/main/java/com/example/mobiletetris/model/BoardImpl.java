package com.example.mobiletetris.model;

public class BoardImpl implements Board{
    private boolean[][] cells;

    public BoardImpl() {
        cells = new boolean[20][10];
    }

    @Override
    public boolean[][] getCells() {
        return cells;
    }

    @Override
    public int clearLines() {
        return 0;
    }
}

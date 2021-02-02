package com.example.mobiletetris.model;

import com.example.mobiletetris.model.piece.Piece;
import com.example.mobiletetris.model.piece.PieceGenerator;

public class ModelImpl implements Model {
    private Board board;
    private PieceGenerator pieceGenerator;

    public ModelImpl(PieceGenerator pieceGenerator) {
        board = new BoardImpl();
        this.pieceGenerator = pieceGenerator;
    }

    @Override
    public Board getBoard() {
        return board;
    }

    @Override
    public Piece nextPiece() {
        return pieceGenerator.nextPiece();
    }

    @Override
    public void tick() {

    }

}

package com.example.mobiletetris.model;

import com.example.mobiletetris.model.piece.Piece;

public interface Model {
    Board getBoard();
    Piece nextPiece();
    void tick();
}

package com.example.mobiletetris.model;

import com.example.mobiletetris.model.piece.Piece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    Model model;

    @BeforeEach
    void setUp() {
        model = new ModelImpl();
    }

    @Test
    void boardInit() {
        Board board = model.getBoard();

        assertNotNull(board);

        boolean[][] cells = board.getCells();

        assertEquals(20, cells.length);


        for(boolean[] row: cells) {
            assertEquals(10, row.length);
        }
    }

    @Test
    void pieceInit() {
        Piece piece;

        piece = model.nextPiece();

        assertNull(piece);


        model.generatePiece();
        piece = model.nextPiece();

        assertNotNull(piece);

    }
}
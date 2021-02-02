package com.example.mobiletetris.model;

public interface Board {
    boolean[][] getCells();

    /**
     * Clears full rows.
     * @return the score gained by clearing the lines
     */
    int clearLines();
}

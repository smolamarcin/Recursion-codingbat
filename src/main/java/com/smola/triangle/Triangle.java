package com.smola.triangle;

public class Triangle {
    public int triangle(int rows) {
        if (rows == 0) {
            return rows;
        }
        return rows + triangle(rows -1);
    }
}

package com.company;

import java.util.Random;

public class Matrix {
    public int[][] matrix;
    private final int sizeAxis0;
    private final int sizeAxis1;

    public Matrix(int sizeAxis0, int sizeAxis1) {
        matrix = new int[sizeAxis0][sizeAxis1];
        this.sizeAxis0 = sizeAxis0;
        this.sizeAxis1 = sizeAxis1;
    }

    public void print() {
        for (int i = 0; i < sizeAxis0; i++) {
            for (int j = 0; j < sizeAxis1; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int getSizeAxis0() {
        return sizeAxis0;
    }

    public int getSizeAxis1() {
        return sizeAxis1;
    }

    public void generateRandomMatrix() {
        for (int i = 0; i < sizeAxis0; i++) {
            for (int j = 0; j < sizeAxis1; j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(100);
            }
        }
    }
}


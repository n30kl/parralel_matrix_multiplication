package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static int thread;

    public static void main(String[] args) {
        while (true)
        {
            System.out.print("К-ть потоків: ");
            Scanner scanner = new Scanner(System.in);
            //int a = scanner.nextInt();
            int a = 1000;
            int thread = scanner.nextInt();

            //--------------------Для тестування стрічкового алгоритму--------------------

            int[][] MatrixA = MatrixGeneratorUtil.generateMatrix(a, a);
            int[][] MatrixB = MatrixGeneratorUtil.generateMatrix(a, a);
            int[][] resultMatrix = new int[MatrixA.length][MatrixB[0].length];

            Date start = new Date();
            ParallelThreadsCreator.multiply(MatrixA, MatrixB, resultMatrix);
            Date end = new Date();

            System.out.println("Витрачений час: " + (end.getTime() - start.getTime()) + "\n");

        }

    }
}

//--------------------Для тестування алгоритму Фокса--------------------

            /*Matrix MatrixA = new Matrix(a, a);
            Matrix MatrixB = new Matrix(a, a);

            MatrixA.generateRandomMatrix();
            MatrixB.generateRandomMatrix();

            FoxAlgorithm fa = new FoxAlgorithm(MatrixA, MatrixB, thread);

            Date start = new Date();
            var  resultMatrix = fa.multiply();
            Date end = new Date();*/





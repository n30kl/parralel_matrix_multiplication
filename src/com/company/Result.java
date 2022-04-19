package com.company;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List <int [][]> SA = new ArrayList<>();
    public static List <Matrix> FA = new ArrayList<>();

    public static void Add(int[][] matrix)
    {
        SA.add(matrix);
        System.out.println("\nРезультат множення записаний в об’єкт класу Result.");
    }

    public static void Add(Matrix matrix)
    {
        FA.add(matrix);
        System.out.println("\nРезультат множення записаний в об’єкт класу Result.");
    }
}

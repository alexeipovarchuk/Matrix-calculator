package com.povarchuk.pet;

public class MatrixDemo {
    public MatrixDemo() {
    }

    public static void main(String[] args) {
        int[][] matrix1 = Matrix.createMatrix(3, 3);
        System.out.println("Первая матрица:");
        Matrix.printMatrix(matrix1);
        System.out.println();
        int[][] matrix2 = Matrix.createMatrix(3, 3);
        System.out.println("Вторая матрица:");
        Matrix.printMatrix(matrix2);
        System.out.println();
        System.out.println("Сумма матриц:");
        Matrix.printMatrix(Matrix.matrixSum(matrix1, matrix2));
        System.out.println();
        int number = 5;
        System.out.println("Умножение первой матрицы на " + number + ":");
        Matrix.printMatrix(Matrix.multiplyMatrixByNumber(matrix1, number));
        System.out.println();
        System.out.println("Умножение двух матриц:");
        Matrix.printMatrix(Matrix.multiplyMatrixByMatrix(matrix1, matrix2));
    }
}

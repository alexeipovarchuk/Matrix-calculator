package com.povarchuk.pet;
/*
Class Matrix has two value line and column and some array of type int.
It has next methods:
1) method for create matrix with the specified lines and column. Values in array is random
2) method for print matrix
3) method for adding matrices
4) method for multiplication matrix to number
5) method for multiplication matrices
 */
public class Matrix {


    public static int[][] createMatrix(int line, int column) {
        if (line != 0 && column != 0) {
            int[][] matrix = new int[line][column];

            for(int i = 0; i < line; ++i) {
                for(int j = 0; j < column; ++j) {
                    matrix[i][j] = (int)(Math.random() * 10.0);
                }
            }

            return matrix;
        } else {
            throw new RuntimeException("It's impossible to create a matrix without lines and columns");
        }
    }

    public static int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            int[][] newMatrix = new int[matrix1.length][matrix1[0].length];

            for(int l = 0; l < matrix1.length; ++l) {
                for(int m = 0; m < matrix1[0].length; ++m) {
                    newMatrix[l][m] = matrix1[l][m] + matrix2[l][m];
                }
            }

            return newMatrix;
        } else {
            throw new RuntimeException("These matrices can't be added because they are not the same size!");
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int[] numbers : matrix) {
            for (int j = 0; j < matrix[0].length; ++j) {
                System.out.print(numbers[j] + " ");
            }

            System.out.println();
        }

    }

    public static int[][] multiplyMatrixByNumber(int[][] matrix, int number) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[0].length; ++j) {
                newMatrix[i][j] = matrix[i][j] * number;
            }
        }

        return newMatrix;
    }

    public static int[][] multiplyMatrixByMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new RuntimeException("These matrices can't be multiplied because the number of columns in the first matrix is not equal to the number of lines in the second matrix!");
        } else {
            int[][] newMatrix = new int[matrix1.length][matrix2[0].length];

            for(int i = 0; i < newMatrix.length; ++i) {
                for(int j = 0; j < newMatrix[0].length; ++j) {
                    for(int k = 0; k < matrix1[0].length; ++k) {
                        newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            return newMatrix;
        }
    }
}

package com.povarchuk.pet;
/*
Test for methods of class Matrix
 */

import org.junit.Test;

import static com.povarchuk.pet.Matrix.*;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    public void createMatrix_correctMatrix_shouldReturnMatrix() {

        int[][] result = createMatrix(2, 2);
        assertEquals(2, result.length, "A count of lines is not corresponds to the declared");
        assertEquals(2, result[0].length, "A count of columns is not corresponds to the declared");
    }

    @Test
    public void matrixSum_correctSum_shouldReturnSum() {
        int[][] oneM = {{1, 1}, {2, 2}};
        int[][] twoM = {{3, 3}, {4, 4}};
        assertArrayEquals(new int[][]{{4, 4}, {6, 6}}, matrixSum(oneM, twoM), "Test addition of matrices failed");
    }

    @Test
    public void multiplyMatrixByNumber_correctResult_shouldReturnMatrix(){
        int[][] oneM = {{1, 1}, {2, 2}};
        int number = 2;
        assertArrayEquals(new int[][]{{2, 2}, {4, 4}}, multiplyMatrixByNumber(oneM, number), "Test multiplication of matrix to number failed");
    }

    @Test
    public void multiplyMatrixByMatrix_correctResult_shouldReturnMatrix(){
        int[][] oneM = {{1, 1, 1}, {2, 2, 2}};
        int[][] twoM = {{3, 3}, {4, 4}, {5, 5}};
        assertArrayEquals(new int[][] {{12, 12}, {24, 24}}, multiplyMatrixByMatrix(oneM, twoM),"Test multiplication of matrix to matrix failed");
    }

// Стараются делать так: в названии тестового метода сперва указывать
// название тестируемого метода, затем информацию о данных,
// затем что надо получить. Например: sum_correctData_shouldReturnSum

}

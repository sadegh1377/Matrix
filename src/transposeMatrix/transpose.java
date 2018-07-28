package transposeMatrix;

import java.util.Scanner;

/**
 * Created by sadegh pc on 7/14/2018.
 */
public class transpose {
    public static void main(String[] args) {
        int r = 0;
        int c = 0;
        int row = getRow(r);
        int column = getColumn(c);
        int[][] matrix = new int[row][column];
        getMatrix(matrix, row, column);
        System.out.println("you enter the following matrix : ");
        outPut(matrix, row, column);
        transposeMatrix(matrix, row, column);
    }

    public static int getRow(int x) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the row : ");
        x = scanner.nextInt();
        return x;
    }

    public static int getColumn(int x) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the column : ");
        x = scanner.nextInt();
        return x;
    }

    public static int[][] getMatrix(int[][] matrix, int row, int column) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("please enter [ " + i + " ] [ " + j + " ] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void outPut(int[][] matrix, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] matrix, int row, int column) {
        System.out.println("\nthe transpose matrix : ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }
    }

}

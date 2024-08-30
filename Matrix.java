/*Write a java menu driven program to perform the following operations on
multidimensional array ie matrix:
i.Addition
ii.Multiplication
iii.Transpose of any matrix.
iv. Exit*/

import java.util.Scanner;

public class Matrix {

    // Method to add two matrices
    public static void add(int[][] m1, int[][] m2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        display(result, rows, cols);
    }

    // Method to multiply two matrices
    public static void multi(int[][] m1, int[][] m2, int rows1, int cols1, int cols2) {
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        System.out.println("Product of the matrices:");
        display(result, rows1, cols2);
    }

    // Method to find the transpose of a matrix
    public static void transposeMatrix(int[][] m, int rows, int cols) {
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = m[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        display(result, cols, rows);
    }

    // Method to display a matrix
    public static void display(int[][] m, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Enter the number of rows and columns of the first matrix:");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int[][] m1 = new int[rows1][cols1];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of the second matrix:");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int[][] m2 = new int[rows2][cols2];

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        do {
      
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrices");
            System.out.println("3. Transpose a matrix");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (rows1 == rows2 && cols1 == cols2) {
                        add(m1, m2, rows1, cols1);
                    } else {
                        System.out.println("Matrices cannot be added. Dimensions do not match.");
                    }
                    break;
                case 2:
                    if (cols1 == rows2) {
                        multi(m1, m2, rows1, cols1, cols2);
                    } else {
                        System.out.println("Matrices cannot be multiplied. Invalid dimensions.");
                    }
                    break;
                case 3:
                    System.out.println("Select which matrix to transpose (1 or 2):");
                    int transposeChoice = sc.nextInt();
                    if (transposeChoice == 1) {
                        transposeMatrix(m1, rows1, cols1);
                    } else if (transposeChoice == 2) {
                        transposeMatrix(m2, rows2, cols2);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}


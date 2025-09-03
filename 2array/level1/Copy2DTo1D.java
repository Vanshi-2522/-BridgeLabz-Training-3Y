package level1;
import java.util.Scanner;

public class Copy2DTo1D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][cols];

        // Input elements for 2D array
        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array to copy elements
        int[] array = new int[rows * cols];
        int index = 0;

        // Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display 2D array
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display 1D array
        System.out.println("\n1D Array (Copied from 2D):");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}

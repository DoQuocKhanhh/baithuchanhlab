import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int rows = input.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cols = input.nextInt();

       int[][] matrix = new int[rows][cols];
        System.out.println("Nhap gia tri cho tung phan tu trong ma tran:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        int maxElement = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + maxElement);
        System.out.println("Vi tri cua phan tu đo la: matrix[" + maxRow + "][" + maxCol + "]");
    }
}

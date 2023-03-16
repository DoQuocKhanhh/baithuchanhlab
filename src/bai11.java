import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        System.out.println("Nhap gia tri cho mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Mang so ban dau:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        System.out.println("\nMang da sap xep theo thu tu tang dann:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so nguyen thu " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / n;
        System.out.println("Trung binh cong cua " + n + " so nguyen da nhap la " + average);
    }
}

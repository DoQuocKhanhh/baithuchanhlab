import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Nhap vao so nguyen: ");
            number = scanner.nextInt();
            sum += number;
        } while (sum <= 100);

        System.out.println("Tong cac so vua nhap la: " + sum);
    }
}

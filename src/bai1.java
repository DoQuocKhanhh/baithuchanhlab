import java.util.Scanner;

public class bai1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so thu 1: ");
            int num1 = sc.nextInt();
            System.out.print("Nhap so thu 2: ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            int diff = num1 - num2;
            int product = num1 * num2;
            int quotient = num1 / num2;
            int remainder = num1 % num2;

            System.out.println("Tong cua " + num1 + " va " + num2 + " la: " + sum);
            System.out.println("Hieu của " + num1 + " va " + num2 + " la: " + diff);
            System.out.println("Tich của " + num1 + " va " + num2 + " la: " + product);
            System.out.println("Thuong của " + num1 + " va " + num2 + " la: " + quotient);
            System.out.println("Chia lay du caa " + num1 + " va " + num2 + " la: " + remainder);

            if (num1 > num2) {
                System.out.println(num1 + " lon hon " + num2);
            } else if (num1 < num2) {
                System.out.println(num1 + " nho hon " + num2);
            } else {
                System.out.println(num1 + " bang " + num2);
            }
        }
    }

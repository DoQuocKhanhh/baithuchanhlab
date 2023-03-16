import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ten cua ban: ");
        String name = sc.nextLine();

        System.out.print("Nhap vao nam sinh cua ban: ");
        int yearOfBirth = sc.nextInt();

        int age = 2023 - yearOfBirth;

        if (age < 16) {
            System.out.println("Ban " + name + " vi thanh nien.");
        } else if (age >=16 && age < 18) {
            System.out.println("Ban " + name + "truong thanh.");
        } else {
            System.out.println("Ban " + name + " da gia.");
        }
    }
}


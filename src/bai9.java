import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chuoi: ");
        String str = scanner.nextLine();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }

        System.out.println("so ky tu in hoa trong chuoi: " + upperCaseCount);
        System.out.println("So ky tu in thuong trong chuoi: " + lowerCaseCount);
        System.out.println("So ky tu so trong chuoi: " + numberCount);
    }
}

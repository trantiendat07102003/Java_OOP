package slide47.java;

import java.util.Scanner;

public class Slide47Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        while (sum < 100) {
            System.out.println("nhap vao mot so nguyen: ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("ket qua = " + sum);
    }

}

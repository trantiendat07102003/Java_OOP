package slide35.java;

import java.util.Scanner;

public class Slide35Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("nhap vao so nguyen a = ");
        a = scanner.nextInt();
        System.out.println("nhap vao so nguyen b = ");
        b = scanner.nextInt();
        int min = Math.min(a, b);
        System.out.println("so nho nhat trong 2 so la " + min);

    }

}

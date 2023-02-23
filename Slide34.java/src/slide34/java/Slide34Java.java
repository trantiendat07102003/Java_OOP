package slide34.java;

import java.util.Scanner;

public class Slide34Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, x1, x2;

        System.out.println("nhap vao he so a = ");
        a = scanner.nextInt();
        if (a == 0) {
            System.out.println("so nhap vao khong hop le");
        }
        System.out.println("nhap vao he so b = ");
        b = scanner.nextInt();
        System.out.println("nhap vao he so c = ");
        c = scanner.nextInt();
        double denta = (b*b) - (4 * a * c);
        System.out.println("denta = " + denta);
        if (denta < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (denta == 0) {
            double x = -b / 2 * a;
            System.out.println("x1 = x2 = " + x);

        } else if (denta > 0) {
            double z = (-b - Math.sqrt(denta)) / (2 * a);
            System.out.println("x1 = " + z);
            double y = (-b + Math.sqrt(denta)) / (2 * a);
            System.out.println("x2 = " + y);
        }

    }

}

package slide40.java;

import java.util.Scanner;

public class Slide40Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("nhap vao mot so nguyen tu 1 den 7");
        number = scanner.nextInt();
        
        switch(number){
            case 1 : System.out.println("chu nhat");
            break;
            case 2 : System.out.println("thu hai");
            break;
            case 3 : System.out.println("thu ba");
            break;
            case 4 : System.out.println("thu tu");
            break;
            case 5 : System.out.println("thu nam");
            break;
            case 6 : System.out.println("thu sau");
            break;
            case 7 : System.out.println("thu bay");
            break;
            default : System.out.println("so vua nhap khong hop le");
            break;
        }
        
    }
    
}

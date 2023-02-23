
package slide30.java;

import java.util.Scanner;


public class Slide30Java {

        public static void main(String[] args) {
            int sum = 0;
           
            System.out.println("nhap mot so nguyen duong n = ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            while(n > 0){
                int digit = n%10;
                sum += digit;
                n/=10;
            }
            System.out.println("sum = " +sum);
            
    }
        
    
}

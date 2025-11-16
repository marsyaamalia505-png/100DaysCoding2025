
package Marsya;

import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
          Scanner isc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
            int panjang= isc.nextInt();
        System.out.print("Masukkan lebar: ");
            int lebar= isc.nextInt();
    
            for (int i = 1; i <= lebar; i++) {
                for (int j = 1; j <= panjang; j++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
    
    }
    
}

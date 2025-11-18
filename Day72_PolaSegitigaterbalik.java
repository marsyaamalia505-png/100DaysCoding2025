
package Marsya;

import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
                Scanner isc = new Scanner(System.in);
                
            System.out.print("Masukkan nilai: ");
                int ra= isc.nextInt();
                for (int i = ra; i>=1 ; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                        System.out.println();
                }
        

    }
}

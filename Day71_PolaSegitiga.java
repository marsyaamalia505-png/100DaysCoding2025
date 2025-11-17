
package Marsya;

import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
            System.out.print("Pola: ");
            int N = isc.nextInt();
            
            for (int i = 1; i <= N; i++) {
                 for (int j = 1; j <= i; j++) {
                     System.out.print("* ");
                 }
                 System.out.println();
        }


    }
}

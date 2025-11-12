
package Marsya;

import java.util.Scanner;
 
public class Day66 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
            System.out.print("Masukkan angka: ");
            int angka = isc.nextInt();
       
             for (int i = 1; i <= angka; i++) {
                    for (int j = 1; j <= angka; j++) {
                        System.out.print("o"+" ");
                       
                }
                    System.out.print("\n");
        }
        
        
    }
}

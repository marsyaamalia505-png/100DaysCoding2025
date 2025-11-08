
package Marsya;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int A= isc.nextInt();
        int tamp=0;
        for (int i = 1; i <=A; i++) {
            tamp+=i;
        }System.out.println("Hasil penjumlahan 1-"+A+" adalah: "+tamp);
        
   
    }
    
}

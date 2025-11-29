
package Marsya;

import java.util.Arrays;
import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan: ");
        int scan= isc.nextInt();
        int [] nilai= new int [scan];
        int tamp=0;
        for (int i = 0; i < scan; i++) {
        System.out.print("Masukkan value: ");
            nilai[i]=isc.nextInt();
            tamp+=nilai[i];
        }
        System.out.println(Arrays.toString(nilai));
        System.out.println("Jumlah array: "+tamp);
    }
    
}

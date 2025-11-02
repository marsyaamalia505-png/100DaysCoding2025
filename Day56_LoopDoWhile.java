
package Marsya;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);    
        System.out.println("PERULANGAN DO-WHILE");
        System.out.print("masukkan angka: "); 
        int angka = isc.nextInt();
        do {
            System.out.println("Angka ke-"+angka);
            angka++;
        }while (angka <= 15);
    

    }
}

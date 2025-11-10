
package Marsya;

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("masukkan angka yang ingin dipangkatkan: ");
        int M = isc.nextInt();
        System.out.print("masukkan angka untuk pangkat: ");
        int awal = 1, N=isc.nextInt();
        int hasilKali= 1;
        while(awal<= N){
            hasilKali*=M;
            awal++;
           
        }
        System.out.println("Hasil "+M+ " pangkat "+N+" adalah: "+hasilKali);
    }
 
}

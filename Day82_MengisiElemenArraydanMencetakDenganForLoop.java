
package Marsya;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Siswa: ");
            int a= isc.nextInt();
            isc.nextLine();
        String [] nama = new String [a];
        int [] nilai= new int [a];
        
        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan nama: ");
            nama[i]= isc.nextLine();
            System.out.print("Masukkan nilai: ");
            nilai[i]= isc.nextInt();
            isc.nextLine();
        }
            System.out.println();
        for (int i = 0; i < a; i++) {
            System.out.print("Nama: "+nama[i]+" dengan Nilai: "+ nilai[i]);
            System.out.println();
        }
        
        
        
    }
    
}

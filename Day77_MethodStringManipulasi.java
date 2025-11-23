
package Marsya;

import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
            System.out.println("Masukkan kalimat dan berikan spasi di awal dan akhir: ");
            String kata= isc.nextLine();
                    System.out.println("Penggunaan method Replace()\t: "+kata.replace(' ', '-'));//mengganti spasi kosong dgn karakter -
                        System.out.println("Pengunaan method Substring()\t: "+kata.trim());// menghilangkan spasi di pingir kalimat
        
                        System.out.println("Penggunaan method Substring(): ");
                        for (int i = 1; i <= kata.length(); i++) {
           System.out.println(kata.substring(i));// mengambil kata sesuai indeks di i
        
        }
    }
  
}

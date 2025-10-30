
package tebakkata;

import java.util.Scanner;
public class Day53 {
    public static void main(String[] args) {
        Scanner isc = new Scanner (System.in);
        System.out.println("KEYWORD BREAK");
        while(true){
            System.out.print("masukkan angka: ");
            int angka = isc.nextInt();
            if(angka == 0){
                break;
            }
        }
        System.out.println("program selesai");
   
    }
}

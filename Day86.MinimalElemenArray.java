
package Marsya;

import java.util.Arrays;
import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Batas Array: ");
                int jum= isc.nextInt();
        int [] angka= new int [jum];
        int nilaimaks=angka[0];
        int nilaimim=angka[0];
        
         for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan jumlah: ");
                angka[i]=isc.nextInt();
                
        }
            for (int i = 0; i< angka.length; i++) {
                if(angka[i]>nilaimaks){
                    nilaimaks=angka[i];
                       
                }
            }
            nilaimim=nilaimaks;
            for (int i = 0; i< angka.length; i++) {
                    if(angka[i]<nilaimim){                   
                    nilaimim=angka[i];
                }          
        }
        System.out.println(Arrays.toString(angka));
        System.out.println("Angka terkecil: "+ nilaimim);
        
    }
}

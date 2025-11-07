
package Marsya;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        
        System.out.print("Masukkan Angka N: ");
        int N= isc.nextInt();
        System.out.print("Masukkan Bilangan Kelipatan: ");
        int M=isc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if(i%M==0){
                System.out.print(i+" ");
            }
        }
        
        
    }
 
}

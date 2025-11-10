  
package Marsya;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan angka faktorial: ");
            int F= isc.nextInt();
            System.out.print(F+"! = ");
            int hasil=1;
            for (int i = F; i >= 1; i--) {
            hasil*=i;
                System.out.print(i+" x ");
        }
            System.out.println("\b\b= "+hasil);
    }
    
}

package Marsya;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Msukkan angka N: ");
        int N= isc.nextInt();
        int tamp=1;
        for (int i = 1; i <= N; i++) {
            tamp*=i;
            System.out.print(i+" x ");
        }
        System.out.print("= "+tamp+"\n");
        
        
    }
}

package Marsya;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
             Scanner isc = new Scanner(System.in);
                int N= isc.nextInt();
        
              for (int i = 1; i <= N; i++) {
                         System.out.print(i+" ");
                }
                             System.out.println("\t");
              for (int j = N; j >= 1; j--) {
                         System.out.print(j+" ");
                     }
   
    }
}

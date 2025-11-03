package Marsya;

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int angka = isc.nextInt();//misal 5
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print((i+j)+" ");
                
            }
             System.out.println("\t");
//             contoh ouput: 
//             2 3 4 5 6 	
//             3 4 5 6 7 	
//             4 5 6 7 8 	
//             5 6 7 8 9 	
//             6 7 8 9 10
        }

    }
}

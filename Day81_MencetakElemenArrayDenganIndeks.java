
package Marsya;

import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        
        String [] nama= {
          "Marsya Amalia", "Nuralfiana","Airinda", "Mulfa Rahma", "Fina Aulya"   
        };
        System.out.print("indeks ke (0-4): ");
        int i= isc.nextInt();
        System.out.println("Nama saya adalah "+ nama[i]);
    }
}

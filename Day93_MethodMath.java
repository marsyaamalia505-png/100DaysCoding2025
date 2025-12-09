
package Marsya;

import java.util.Scanner;

public class Day93 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        double a= isc.nextDouble();
        double b= isc.nextDouble();
        marsya(a,b);
    }
    static void marsya(double a, double b){
        double hasil = a * b;
        System.out.println("hasil ceil(): "+Math.ceil(hasil));
        System.out.println("hasil floor(): "+Math.floor(hasil));
        System.out.println("hasil round(): "+Math.round(hasil));        
      
    } 
}

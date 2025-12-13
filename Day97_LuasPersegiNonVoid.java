
package Marsya;

import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int  s = isc.nextInt();
        
        System.out.println(marsya(s));
        
    }
    static String marsya(int a){

       return "Luas persegi: "+Math.powExact(a, 2); 
    } 
}

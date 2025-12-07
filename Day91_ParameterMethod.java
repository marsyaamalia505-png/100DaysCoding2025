
package Marsya;

import java.util.Scanner;

public class Day91 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int a= isc.nextInt();
        System.out.println(marsya(a));
    }
     static String marsya(int a){
            String hasil="Bilangan Ganjil";
        if(a%2==0){
         hasil="Bilangan Genap";
        }
         return hasil;
     }   
      
}

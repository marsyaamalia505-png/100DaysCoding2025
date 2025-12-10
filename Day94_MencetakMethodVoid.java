
package Marsya;

import java.util.Scanner;

public class Day94 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int a=isc.nextInt();       
        mama(a);
    }
    static void mama(int a){
        int tamp=1;
        if(a>0){
            for (int i = 1; i <= a; i++) {
                tamp*=i;
            }
        }else{
            System.out.println("gaboleh");
        }
        System.out.println("Faktorial dari "+a+" adalah "+tamp);
        
    } 
        
        
        
        
        
        
        
}

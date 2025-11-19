
package Marsya;

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int tamp=0;
        do{
            System.out.print("Masukkan: ");
                int a= isc.nextInt();           
            tamp+=a;
                 if(a<0){
                    break;
                }
        } while(true);
        System.out.print("total jumlah: "+tamp);
        System.out.println();
        
       
    }
}

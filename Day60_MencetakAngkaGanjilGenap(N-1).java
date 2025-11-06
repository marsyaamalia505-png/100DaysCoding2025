
package Marsya;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
            System.out.print("Masukkan angka N: ");
        int N= isc.nextInt();
        System.out.print("Ganjil\t: ");
        for (int i = N; i >= 1; i--) {
            if(i%2!=0){ 
               System.out.print( i+ " ");              
            }else{
               System.out.print(" ");
            } 
        }
          System.out.println("\t");
            System.out.print("Genap\t: ");
          for (int j = N; j >= 1; j--) {
            if(j%2==0){ 
               System.out.print(j+ " ");              
            }else{
               System.out.print(" ");
            } 
        }
        
  
    }
}

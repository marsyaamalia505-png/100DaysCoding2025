
package Marsya;

import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("batas array: ");
            int a= isc.nextInt();
            int [] nilai=new int [a];
        //mengisi value array    
            for (int i = 0; i < nilai.length; i++) {
                System.out.print("masukkan nilai: ");
            nilai[i]=isc.nextInt();
        }
            
        // mencari dengan indeks
        System.out.print("\nmasukkan indeks yg di cari: ");
        int b= isc.nextInt();
        System.out.println("nilai indeks ke-"+b+" adalah "+nilai[b]);
        
        //mencari dengan nilai
        System.out.print("\nmasukkan nilai yg di cari: ");
        int c= isc.nextInt();
        int tamp=0;
         for(int j=0;j<nilai.length;j++){
             if(c==nilai[j]){
                 tamp=j;
             }
         }
          System.out.println("nilai "+c+" adalah pada indeks ke-"+tamp);   
         
        
        
    }
 
}

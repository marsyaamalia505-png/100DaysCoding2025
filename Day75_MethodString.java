
package Marsya;

import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
               System.out.print("Masukkan Kalimat: ");
                   String i=isc.nextLine();
                     System.out.println("before: "+i);
                       String hasil="";
                           for (int j = 0; j < i.length(); j++) {
                               char c = i.charAt(j);
                                   if(Character.isLowerCase(c)){ // apabila huruf itu terbaca huruf KECIL maka:
                                      hasil+=Character.toUpperCase(c); // program akan mengubahnya menjadi huruf BESAR
                                }else{                                 // jika tidak terbaca huruf KECIL: 
                            hasil+=Character.toLowerCase(c);           // program akan mengubahnya menjadi huruf KECIL
                        }
                    }
                            System.out.println("After: "+hasil);
       
    }
}

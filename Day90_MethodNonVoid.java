
package Marsya;

import java.util.Scanner;

public class Day90 {
    public static void main(String[] args) {
     System.out.println(marsya());
    }
        
     static String marsya(){
        Scanner isc = new Scanner(System.in);
        int a= isc.nextInt();
        String hasil="";
        if(a%2==0){
            hasil="bilangan genap";
        }else{
            hasil="bilangan ganjil";
        }
         return hasil;   
     }   
        
        
        
        
        
        
        
        
        
        
        
        
}

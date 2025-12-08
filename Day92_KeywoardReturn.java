
package Marsya;

import java.util.Scanner;

public class Day92 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
             int a= isc.nextInt();
        
     if(mama(a)==true){
         System.out.println(a+" bilangan prima");
     }else{
         System.out.println(a+" bukan prima");
     }
    }
       static boolean mama(int a){
           if(a<2){
            return false;
           }
           for (int i = 2; i < a; i++) {
               if(a%i==0){
            return false;
               }
           }           
          return true;         
       }
    
}

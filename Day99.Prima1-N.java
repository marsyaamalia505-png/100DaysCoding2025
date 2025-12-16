
package Marsya;

import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
     int a= isc.nextInt();
        mama(a);
    }
       static void mama(int a){
         boolean prima = true;
           for (int j = 2; j <=a ; j++) {
               prima= true;
               
          for (int i = 2; i < j; i++) {
               if(j%i==0){
                   prima= false;
                   break;
               }
             }                 
           if(prima){
               System.out.print(j+" ");
            }
           
           }
           System.out.print("\b");
       }
                      
}

       
        
        
        
        
        
        
        
        
        
        
 

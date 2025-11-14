
package Marsya;

import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi:");
            int sisi= isc.nextInt();
                System.out.println("================");
                    int i=1;
                        while(i<=sisi){
                            int j=1;
                        while(j<=sisi){
                            if(i==1||i==sisi||j==1||j==sisi){
                                System.out.print("O ");
                            }else{
                                  System.out.print("  ");
                                }
                               j++;
                            }
                        System.out.print("\n");
                        i++;
                    }
                System.out.println("================");
    }
    
}

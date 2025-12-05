
package Marsya;

import java.util.Arrays;
import java.util.Scanner;

public class Day89 {
    public static void main(String[] args) {
        marsya();
    }
    
    public static void marsya(){
        Scanner isc = new Scanner(System.in);
        System.out.print("masukkan range array: ");
        int a = isc.nextInt();
        isc.nextLine();
        String [] hewan=new String [a];
        
        for (int i = 0; i < hewan.length; i++) {
            hewan[i]=isc.nextLine();
        }
        System.out.println(Arrays.toString(hewan));
        
    }
}

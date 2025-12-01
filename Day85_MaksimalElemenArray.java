
package Marsya;

import java.util.Arrays;
import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Batas Array: ");
        int jum= isc.nextInt();
        int []arr=new int [jum];
        int maks=0;
        for (int i = 0; i < jum; i++) {
            arr[i]=isc.nextInt();
            if(arr[i]>maks){
                maks=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nilai Maksimal Array: "+maks);
    }
}

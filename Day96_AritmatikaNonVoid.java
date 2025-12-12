package Marsya;

import java.util.Scanner;

public class Day96 {
    public static void main(String[] args) {
        System.out.println(marsya());
    }
 static String marsya(){
     Scanner isc = new Scanner(System.in);
     int a = isc.nextInt();
     int b = isc.nextInt();
     
     int jum= a+b;
     int kur= a-b;
     int kal= a*b;
     int bagi= a/b;

     return "penjumlahan: "+jum+"\npengurangan: "+kur+"\nperkalian: "+kal+"\npembagian: "+bagi;
     }



}

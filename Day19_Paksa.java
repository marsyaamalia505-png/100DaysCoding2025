import java.util.Scanner;

public class Day19{
  public static void main (String[] args) {
   Scanner isc = new Scanner (System.in);
   System.out.println("KONVERSI PAKSA TIPE DATA TERBESAR-TERKECIL");
    double angka=isc.nextDouble();
    System.out.println("angka double: "+angka);
    long angka1= (long)angka;
    System.out.println("angka long: "+angka1);
    int angka2 = (int)angka;
    System.out.println("angka int: "+angka2);
    short angka3 = (short)angka;
    System.out.println("angka short: "+angka3);
    byte angka4 = (byte)angka;
    System.out.println("angka byte: "+angka4);
     // jika angka yang di input rangenya melebihi range tipe data dibawahnya maka hasilnya akan (-) atau modulus dari angka yang di input 

      }
     }

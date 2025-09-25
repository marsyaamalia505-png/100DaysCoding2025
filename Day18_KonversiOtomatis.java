import java.util.Scanner;
public class Day18{
  public static void main (String[] args) {
   Scanner isc = new Scanner (System.in);
   System.out.println("KONVERSI OTOMATIS TIPE DATA TERKECIL - TERBESAR");
     byte angka1= isc.nextByte();// angka harus memehuni range byte meski akan di konversi ke tipe data besar
     System.out.print("angka byte\t: "+angka1);
     short angka2= angka1;
     System.out.print("\nangka short\t: "+angka2);
     int angka3= angka1;
     System.out.print("\nangka int\t: "+angka3);
     long angka4= angka1;
     System.out.print("\nangka long\t: "+angka4);
     double angka5 = angka1;
     System.out.print("\nangka double\t: "+angka5);
     
     
    /* sistem ini hanya bekerja dari tipe data kecil ke besar jika sebaliknya maka harus dipaksa
    atau akan overflow
    */
    
      }
     }

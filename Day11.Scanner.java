import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
      Scanner isc = new Scanner(System.in);
      
      String nama = isc.nextLine();
      String alamat = isc.next();
      //nextLine dapat membaca nilai dengan spasi sedangkan next tidak 
      int umur= isc.nextInt();
      double tinggi = isc.nextDouble();
      
      System.out.println("Nama aku: "+nama);
      System.out.println("Domisiliku: "+alamat);
      System.out.println("umurku: "+umur);
      System.out.println("tinggiku: "+tinggi);
      
    }
}

import java.util.Scanner;

public class Da15 {
    public static void main(String[] args) {
    Scanner isc = new Scanner (System.in);
    System.out.println("===CARA PERTAMA===");
    System.out.print("Masukkan Angka ke-1: \n");
    int a,b;
    a = isc.nextInt();
    System.out.print("Masukkan Angka ke-2: \n");
    b=isc.nextInt();
    System.out.printf("Hasil Penjumlahan a+b : %d%nHasil Pengurangan a-b: %d%n ",(a+b),(a-b));
    
    System.out.println("===CARA KEDUA===");
    System.out.print("Masukkan Angka ke-3: \n");
    int c,d;
    c = isc.nextInt();
    System.out.print("Masukkan Angka ke-4: \n");
    d=isc.nextInt();
    int jumlah= c+d;
    int kurang = c-d;
    System.out.printf("Hasil Penjumlahan c+d: %d%nHasil Pengurangan c-d: %d%n ",jumlah,kurang);
    
    
  }
}

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
      Scanner isc= new Scanner (System.in);
      
      String angka=isc.nextLine(), angka1= isc.nextLine();
      long A= Long.parseLong(angka);// contoh : 12
      long B= Long.parseLong(angka1);// contoh: 15
      System.out.printf("A: %d%nB: %d%n",A,B);
      
      A+=B; // A= 12+15 >> 27 (nilai varibel A ter-update dari 12 jadi 27)
      B=A-B; // B = 27-15 >> 12 
      A-=B; // A= 27- 12 >> 15 
      System.out.println("Nilai A sekarang: "+A);
      System.out.print("Nilai B sekarang: "+B);
      
  }
}

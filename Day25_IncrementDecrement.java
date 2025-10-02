import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
      Scanner isc = new Scanner (System.in);
      System.out.printf("OPERASI INCREMENT(JUMLAH 1)");
      int a = isc.nextInt();
      a++;  
      System.out.print("\nHasil ditambah 1: "+a);
      a++; 
      System.out.print("\nHasil ditambah 1: "+a);
      a++;
      System.out.print("\nHasil ditambah 1: "+a);
       //++ berfungsi untuk menambah nilai 1 divariabel jadi variabel tersebut nilainya akan terupdate
     System.out.printf("%n%nOPERASI DECREMENT(KURANG 1)");
      int b = isc.nextInt();
      b--;
      System.out.print("\nHasil dikurang 1: "+b);
      b--;
      System.out.print("\nHasil dikurang 1: "+b);
      b--;
      System.out.print("\nHasil dikurang 1: "+b);
      //-- berfungsi untuk mengurangkan nilai 1 divariabel jadi variabel tersebut nilainya akan terupdate
  }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner isc= new Scanner (System.in);
      System.out.println("LUAS PERSEGI PANJANG");
      String a = isc.nextLine(), b=isc.nextLine();
      int panjang = Integer.parseInt(a), lebar= Integer.parseInt(b);
      System.out.print("Panjang Persegi Panjang: "+panjang+"cm");
      System.out.print("\nLebar Persegi panjang: "+lebar+"cm");
      panjang*=lebar;
      System.out.print("\nluas: "+panjang+"cm");
 
       
  }
}

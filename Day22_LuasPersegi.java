import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
      Scanner isc= new Scanner (System.in);
      System.out.println("PROGRAM LUAS PERSEGI");
      double sisi = isc.nextDouble();
      System.out.print("sisi persegi: "+sisi+"cm");
      sisi *=sisi;
      System.out.print("\nluas persegi: "+sisi+"cm2");
  }
}

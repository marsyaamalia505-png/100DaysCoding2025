import java.util.Scanner;

public class Day17{
  public static void main (String[] args) {
  
  Scanner isc = new Scanner (System.in);
  String nilai = isc.nextLine();
  int string = Integer.parseInt(nilai);
    System.out.print("Nilai Inputan\t: "+ string + "\n");
  int sisa, bagi;
    bagi = string / 2;
    System.out.print("Hasil dibagi 2\t: "+bagi+"\n");
    sisa = string % 2;
  System.out.println("\tJIKA GENAP HASILNYA (0) dan GANJIL HASILNYA (1)");
  System.out.print("Hasil Sisa Bagi\t: "+sisa);
    
  }
} 

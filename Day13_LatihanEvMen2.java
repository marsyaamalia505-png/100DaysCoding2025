import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
      Scanner isc= new Scanner (System.in);
     //isc.nextLine();
      System.out.print("============BIODATA==============\n");
      String nama = isc.nextLine();
      int umur = isc.nextInt();
      isc.nextLine();
      String nim= isc.nextLine();
      double tinggi= isc.nextDouble();
      boolean status= isc.nextBoolean();
      isc.nextLine();
      String alamat= isc.nextLine();
      
      System.out.print("Nama\t\t: "+nama+"\n");
      System.out.print("Umur\t\t: "+umur+"\n");
      System.out.print("NIM\t\t: "+nim+"\n");
      System.out.print("Tinggi\t\t: "+tinggi+"\n");
      System.out.print("Status\t\t: "+status+"\n");
      System.out.print("Alamat\t\t: "+alamat+"\n");
      System.out.print("==================================");
    
      
    }
}

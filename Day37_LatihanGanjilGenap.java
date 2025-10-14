import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 Scanner isc = new Scanner (System.in);
      int tahun = isc.nextInt();
      int tahunsekarang= 2025;
      if(tahunsekarang-tahun%2==0){
        tahunsekarang-=tahun;
        System.out.printf("Umur saya tahun ini: %d tahun%n",tahunsekarang);
        System.out.println("Genap");
      }else{
        System.out.printf("Umur saya tahun ini: %d tahun%n",tahunsekarang);
        System.out.println("Ganjil");
        
      }
      
      
  }
}

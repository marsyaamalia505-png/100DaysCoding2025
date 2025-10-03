import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
     Scanner isc= new Scanner (System.in);
     System.out.println("Operator Penugasan");
    
     int angka = isc.nextInt(), angka2=isc.nextInt();
     angka+=angka2; 
     System.out.println("hasil operator penambahan: "+angka);
     angka-=angka2;
     System.out.println("hasil operator pengurangan: "+angka);
     angka*=angka2;
     System.out.println("hasil operator perkalian: "+angka);
     angka/=angka2;
     System.out.println("hasil operator pembagian: "+angka); 
     }
}

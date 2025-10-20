import java.util.Scanner;

public class  Day43{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
    int angka = isc.nextInt();
    
    
    if(angka%3==0 && angka%5==0){
      
      System.out.println("Angka habis di bagi 3  dan 5");
    }else if(angka%5==0){
      System.out.println("Angka habis di bagi 5");
    }else if(angka%3==0){
      System.out.println("Angka habis dibagi 3");
    }else {
      System.out.println("Angka tidak bisa dibagi dengan 5 atau 3");
    }
    

      
    }
}

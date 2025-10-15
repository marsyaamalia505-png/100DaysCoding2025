import java.util.Scanner;

public class Day38 {
 public static void main(String[] args) {
 Scanner isc = new Scanner (System.in);
     int umursaya= isc.nextInt(), umurkaka= isc.nextInt(), umuradek= isc.nextInt();
     
     if(umurkaka-umursaya==0){
       System.out.println("Jarak umur kaka dan saya adalah 0");
     }
     if(umuradek-umursaya==0){
       System.out.println("Jarak umur adek dan saya adalah 0"); 
     }
       if (umurkaka-umursaya > 0){
        System.out.println("Jarak umur kaka dan saya adalah "+(umurkaka-umursaya)+" Positif");
     }
      if(umuradek-umursaya < 0){
        System.out.println("Jarak umur adek dan saya adalah "+(umuradek-umursaya)+" Negatif");
     }
     
     
      
  }
}

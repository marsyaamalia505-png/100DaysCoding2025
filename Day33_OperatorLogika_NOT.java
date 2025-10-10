import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
     System.out.println("OPERATOR LOGIKA NOT (!)");
     boolean keadaan = isc.nextBoolean();
  
     boolean keadaan2= !keadaan;
     System.out.println(keadaan2);
    
  }
}

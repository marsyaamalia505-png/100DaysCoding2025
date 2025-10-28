import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int perkalian = isc.nextInt();
       
        for (int awal=1; awal<=10 ;awal++ ){
          
          System.out.printf("%n%d x %d = %d",awal,perkalian, awal*perkalian);
        } 
 
 
    }
}

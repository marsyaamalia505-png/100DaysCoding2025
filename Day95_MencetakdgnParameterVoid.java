
package Marsya;
import java.util.Scanner;

public class Day95 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int a = isc.nextInt();
        
        marsya(a);
    }
    static void marsya(int a){
            String tam = "";
            for (int i = 1; i <=a; i++) {
            if(i%2==0){
                tam+=i+". saya anak rajin\n";
                continue;
            }else{
                tam+=i+". saya anak baik\n";
            }
        }
            System.out.println(tam);
         
    }
         
}

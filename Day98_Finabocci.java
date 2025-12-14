
package Marsya;

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
      Scanner isc = new Scanner(System.in);
        int a =isc.nextInt();
        marsya(a);
    }
  static void marsya(int o){
      int a=0;
      int b=1;
      for (int i = 1; i <= o; i++) {
          System.out.print(a+" ");
          int c=a+b;
            a=b;
            b=c;
          
          
      }
  }
}

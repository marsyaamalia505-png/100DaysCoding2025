import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
  Scanner isc = new Scanner (System.in);
  System.out.println("Operator Sama Dengan(==) dan Tidak Sama Dengan(!=) ");
  int a = isc.nextInt(), b= isc.nextInt();
  boolean bandingkan = a == b, bandingkan2= a!=b;
  System.out.println("Keadaan pertama: "+ bandingkan+" \nKeadaan kedua: "+ bandingkan2);
  
  
     
    }
}

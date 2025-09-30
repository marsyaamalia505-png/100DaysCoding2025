import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
    Scanner isc= new Scanner (System.in);
      System.out.println("LUAS LINGKARAN");
     byte jarijari= isc.nextByte();
     double phi= 3.14;
       System.out.printf("jarijari lingkaran: %d%nphi lingkaran: %.2f%n", jarijari,phi);
     jarijari*=jarijari;
     phi*= jarijari;
      System.out.printf("Luas lingkarannya (phi*r*r) adalah: %.2f", phi);
      
       
    }
}

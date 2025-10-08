import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner isc = new Scanner (System.in);
    int a= isc.nextInt(), b=isc.nextInt();
   // operator && untuk memberikan 2/ lebih konidisi namun semua kondisi itu harus benar
      Boolean rentangA = a>=b && b>0, rentangB= a!= 20;
       System.out.println(rentangA+"\n"+rentangB);
       
       //cara lain
      System.out.println(a<=b && b>0 );       
       
      
    }
}

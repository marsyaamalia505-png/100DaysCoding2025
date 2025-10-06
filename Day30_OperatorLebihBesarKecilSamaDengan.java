import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner isc = new Scanner (System.in);
    int a= isc.nextInt();
    char b = isc.next().charAt(0);
   
    boolean bandingkan = a>= 15;
    System.out.println(bandingkan);
    boolean bandingkan2 = a<= 20;
    System.out.println(bandingkan2);
    boolean bandingkan3 = b>= 'a';
    System.out.println(bandingkan3);
    boolean bandingkan4 = b<= 'j';
    System.out.println(bandingkan4);
    
    
    
      
    }
}

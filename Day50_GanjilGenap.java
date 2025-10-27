import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int angka = isc.nextInt();
        
        String hasil = (angka%2==0)? "genap": "ganjil";
        System.out.println(hasil);

 
    }
}

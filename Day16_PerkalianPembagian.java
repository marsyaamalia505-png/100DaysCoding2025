import java.util.Scanner;
public class Day16NgodingMarsya {
    public static void main(String[] args) {
        Scanner isc= new Scanner (System.in); 
        System.out.println("====Promo Diskon 20% Pembelian Baju Lebaran====");
        System.out.print("Masukkan jumlah pembelian Baju Anda: ");
        int uang= isc.nextInt();
        double diskon = uang * 20 / 100;
        System.out.print("\nPotongan yang anda dapatkan: "+diskon);
        double bayar = uang - diskon;
        System.out.printf("%nYang Harus Anda Bayarkan: %.2f%n",bayar);
        bayar = bayar + 10000.0;
        System.out.println("Karena anda membeli di weekday anda dapat bonus 10ribu, jadi totalnya: "+bayar);
        
    }
    
}

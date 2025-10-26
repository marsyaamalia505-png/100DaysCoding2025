import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner isc= new Scanner(System.in);

        System.out.print("Masukkan suhu (°C): ");
        int suhu = isc.nextInt();

        String kondisi = (suhu >= 32) ? "Panas" : "Dingin";

        System.out.println("cuacanya: " + kondisi);
    }
}

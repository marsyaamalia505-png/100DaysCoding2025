import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = isc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = isc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = isc.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '^':
              hasil= Math.pow(angka1,angka2);
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Pembagian dengan nol tidak bisa dilakukan!");
                }
                break;

            default:
                System.out.println("Operator tidak valid!");
        }

       
    }
}

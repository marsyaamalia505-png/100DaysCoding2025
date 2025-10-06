 import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner isc = new Scanner (System.in);
   System.out.println("\tOPERATOR PERBANDINGAN LEBIH KECIL(<) DAN LEBIH BESAR (>)");
   System.out.print("\n\t====Sistem Pengecekan Syarat Masuk Wahana Roller Coaster====");
   System.out.print("\nJika umur anda <17 tahun dan tinggi anda <140cm MAKA ANDA TIDAK BOLEH NAIK.\nTapi jika umur anda >17 tahun Namun tinggi anda <140 cm ANDA HARUS DUDUK DITENGAH\n");
    System.out.print("\nMasukkan Umur: \n");
     int umur= isc.nextInt();
    System.out.print("Masukkan Tinggi: \n");
    double tinggi = isc.nextDouble();
 boolean syaratUmur= umur >17;
 System.out.println("Umur anda ("+syaratUmur+")");
 boolean syaratTinggi= tinggi > 1.4;// jika false anda tidak boleh masuk
 System.out.println("Tinggi anda ("+syaratTinggi+")");// tapi jika ini false maka boleh masuk namun harus duduk di tengah


    }
} 

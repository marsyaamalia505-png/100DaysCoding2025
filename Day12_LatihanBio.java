import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
  Scanner isc = new Scanner (System.in);
  System.out.println("\t>>Selamat Datang Beranda Infomasi Berbasis Inputan<<\n\nSilahkan Masukkan Data Diri: ");
  String nama, alamat, acc,tempat;
    nama =isc.nextLine();
    alamat = isc.nextLine();
    acc =isc.nextLine();
    tempat =isc.nextLine();
  int umur = isc.nextInt();
  int tanggal,tahun;
    tanggal= isc.nextInt();
    tahun = isc.nextInt();
  double tb, bb;
    tb = isc.nextDouble();
    bb = isc.nextDouble();
  char goldar = isc.next().charAt(0);
  boolean data= isc.nextBoolean();
  
  System.out.printf("Nama: %s \nUmur: %d \nTTL: %s, %d Mei %d \nAlamat: %s  \nSosmed: %s \nGolDar: %c \nTb/Bb: %.1f/%.1f \nData yang anda masukkan: %b \n",nama,umur,tempat,tanggal,tahun,alamat,acc,goldar,tb,bb,data);
  System.out.print("\n\t\t>>Terimakasih atas infomasi anda<< \nJika ada data yang ingin diubah silahkan klik dibawah ini: \n\n");
  tb = isc.nextDouble();
  System.out.println("Setelah update tb: "+tb);
  final double tinggi= isc.nextDouble();
  System.out.println("Infomasi fiks tb: "+tinggi);
  
  
    }
}

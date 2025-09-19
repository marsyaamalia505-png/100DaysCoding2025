import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
  Scanner isc = new Scanner (System.in);
  System.out.println("\t>>Selamat Datang di Beranda Infomasi Siswa<<\n\nSilahkan Masukkan Data Diri Anda: ");
  
  System.out.printf("Nama Siswa: %n");
  isc.nextLine();// ini saya tambahkan agar string bisa mengambil inputan nama dan bukan newline (%n)
  final String nama = isc.nextLine();
  System.out.printf("NIM: %n");
  long nim= isc.nextLong();
  System.out.printf("Umur: %n"); 
  double umur= isc.nextDouble();
  System.out.printf("Jenis Kelamin: %n");
  char gender = isc.next().charAt(0);
  System.out.printf("Alamat: %n");
  String alamat,hobi;
  isc.nextLine(); // jika tidak ada ini maka inputan alamat akan pindah ke hobi 
  alamat= isc.nextLine();
  System.out.printf("Hobi: %n");
  hobi = isc.nextLine();
  
  System.out.println("Baik, Terimakasih Atas Kontribusi Anda!! \n\t\t>>Data diri anda sudah diverifikasi<<\nSilahkan Lihat Infomasi Anda:");
  System.out.printf("Nama\t\t: %s%nNIM\t\t: D%d%nUmur\t\t: %.1f%njenis Kelamin\t: %c%nAlamat\t\t: %s%nHobi\t\t: %s%n",nama,nim,umur,gender,alamat, hobi );
  
  
    }
}


import java.util.Scanner;

public class  Day41{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
        //SOAL 1
  System.out.println("Masukkan nilai Asep: ");
  int asep= isc.nextInt();
  System.out.println("MAsukkan nilai Budi: ");
  int budi= isc.nextInt();
  
  if (asep>budi){
    System.out.println("Asep memiliki nilai yang lebih tinggi dari Budi");
  } else if(asep<budi){
    System.out.println("Budi memiliki nilai yang lebih tinggi dari Asep");
  }else{
    System.out.println("Asep memiliki nilai yang sama dengan Asep");
  }
  
  // SOAL 2
  System.out.println("Masukkan daya listrik (watt): ");
  int watt= isc.nextInt();
  
  if(watt>2200){
    System.out.println("Daya tidak aman");
  }else if(watt!=2200){
     System.out.println("Daya aman");
  }else{
     System.out.println("Daya tidak aman");
  }
  
  // SOAL 3
  System.out.println("Apakah anda member?(true/false): ");
  boolean mem= isc.nextBoolean();
  System.out.println("Masukkan total belanja: ");
  int belanja = isc.nextInt();
  
  if(mem==true && belanja>500000){
    System.out.println("Anda dapat diskon 25%");
    
  }else if(mem==true || belanja>500000){
    System.out.println("Anda dapat diskon 10%");
  }else{
    System.out.println("Anda tidak dapat diskon ");
  }
  //SOAL 4
  System.out.println("Masukkan kecepatan kendaraan : ");
  int kec = isc.nextInt();
  System.out.println("Masukkan batas jalan:  ");
  int batas = isc.nextInt();
  
  if(kecepatan>batas+ 20){
    System.out.println("Bahaya! anda melaju terlalu cepat");
     
  }else if(kecepatan>batas && kecepatan<=batas + 20) {
 
    System.out.println("Hati-hati! anda melebihi batas!");
  }else if(kecepatan>=40 && kecepatan<=batas){
    
    System.out.println("kecepatan normal");
  }else{
    f(kecepatan>batas+20){
    System.out.println("terlalu lambat, bisa menggangu lalu lintas");
  }
  
     //SOAL 5
     double hp = 15.000;
     double cap = 20.000;
     double latte = 25.000;
     double mangga = 12.000;
     double jeruk = 10.000;
  System.out.println("=== ISC Cafe ===");
  System.out.println("1. Kopi \n2.Jus \n3.Keluar");
  System.out.println("Pilih kategori (1-3): ");
  int input = isc.nextInt();
  
  if (input==1) {
     System.out.println("=== Menu Kopi ===");
  System.out.println("1. Kopi Hitam  (Rp15.000)\n2.Cappucino (Rp20.000) \n3.Latte (Rp25.000)");
  System.out.println("Pilih menu (1-3): ");
  int menu = isc.nextInt();
    System.out.println("Masukkan jumlah pesanan: ");
    int jumlah= isc.nextInt();
    if(menu==1){
      System.out.println("\nAnda memesan "+jumlah+" Kopi Hitam");
      double bayar = hp*jumlah;
      System.out.printf("Total bayar: Rp%.3f", bayar);
      
    }else if(menu==2){
       System.out.println("\nAnda memesan "+jumlah+" Cappucino");
      double bayar = cap*jumlah;
      System.out.printf("Total bayar: Rp%.3f", bayar);
      
    }else{
      System.out.println("\nAnda memesan "+jumlah+" Latte");
      double bayar = latte*jumlah;
      System.out.printf("Total bayar: Rp%.3f", bayar);
      
    }
   
  
    
  }else if(input==2){
    System.out.println("=== Menu Jus ===");
  System.out.println("1.Jus mangga  (Rp12.000)\n2.Jus Alpukat (Rp15.000) \n3.Jus jeruk (Rp10.000)");
  System.out.println("Pilih menu (1-3): ");
  int menu = isc.nextInt();
    System.out.println("Masukkan jumlah pesanan: ");
    int jumlah= isc.nextInt();
    if(menu==1){
      System.out.println("\nAnda memesan "+jumlah+" Jus mangga");
      double bayar = mangga*jumlah;
      System.out.printf("Total bayar: Rp%.3f", bayar);
      
    }else if(menu==2){
       System.out.println("\nAnda memesan "+jumlah+" Jus Alpukat");
      double bayar = hp*jumlah;
      System.out.printf("Total bayar: Rp%.3f", bayar);
      
    }else{
      System.out.println("\nAnda memesan "+jumlah+" Jus jeruk");
      double bayar = jeruk*jumlah;
      System.out.printf("Total bayar: Rp%.3f", bayar);
         
    }
   
  
  }else {
    System.out.println("Terimaka kasih telah berkunjung ke ISC Cafe!");
  }

  System.out.println("\nPilih metode pembayaran: ");
  System.out.println("1.Cash \n2.QRIS");
  System.out.println("Masukkan pilihan (1-2): ");
  int pembayaran= isc.nextInt();
  
  if(pembayaran==1){
    System.out.println("pembayaran dengan CASH. Silahkan bayar di kasir.");
    System.out.println("=== TERIMAKASIH TELAH BERBELANJA DI ISC CAFE!");
  }else {
    System.out.println("pembayaran dengan QRIS. Silahkan Scan QR.");
    System.out.println("=== TERIMAKASIH TELAH BERBELANJA DI ISC CAFE!");
  }
  

    }
}

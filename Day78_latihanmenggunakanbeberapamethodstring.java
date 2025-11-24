
package Marsya;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
            Scanner isc = new Scanner(System.in);
            boolean m= true;
              
              System.out.println("\t=============HALAMAN LOGIN=============");  
              while(m){
              System.out.print("Masukkan Email Anda: ");
              String mail= isc.nextLine();
              if(mail.isEmpty()){
                  System.out.println("EMAIL TIDAK BOLEH KOSONG");
                  continue;
              }else{
                  if(!mail.contains("@gmail.com")){
                      System.out.println("EMAIL ANDA TIDAK TERDETEKSI GUNAKAN FORMAT (@gmail.com)");
                  continue;
                  }else{
                      System.out.println("\n======================================================");
                        System.out.println("1. Pegawai\n2. Mahasiswa\n3.Pelajar SMA/SMP/SD ");
                      System.out.print("Masukkan Status (1-3): ");
                      int st= isc.nextInt();
                      isc.nextLine();
                      switch(st){
                          case 1:
                                    System.out.println("\n======================================================");
                                        for (int i = 1; i <= 3; i++) {
                                    System.out.println("-Masukkan kode CAPTCHA berikut untuk memastikan anda bukan Robot-");
                                        System.out.println("[X7P9QmA43d]");
                                            String a= isc.nextLine();
                                  if(a.equals("X7P9QmA43d")){
                                      System.out.println(">>>>LOGIN BERHASIL<<<<");
                                      m=false;
                                      break;
                                  }
                                         if(i<3){
                                      System.out.println("\n>>COBA LAGI! PERCOBAAN KE-"+(i+1)+"<<");     
                                  }else{
                                      System.out.println(">>KESEMPATAN ANDA HABIS<<");
                                     return;     
                                         }
                                    }//for case 1                             
                            break;
                          case 2: 
                              System.out.println("\n======================================================");
                                        for (int i = 1; i <= 3; i++) {
                                    System.out.println("-Masukkan kode CAPTCHA berikut untuk memastikan anda bukan Robot-");
                                        System.out.println("[9FJ2KQW8ZL]");
                                            String a= isc.nextLine();
                                  if(a.equals("9FJ2KQW8ZL")){
                                      System.out.println(">>>>LOGIN BERHASIL<<<<");
                                      m=false;
                                      break;
                                  }
                                         if(i<3){
                                      System.out.println("\n>>COBA LAGI! PERCOBAAN KE-"+(i+1)+"<<");     
                                  }else{
                                      System.out.println(">>KESEMPATAN ANDA HABIS<<");
                                     return;      
                                         }
                                    }//for case 2                           
                             break;
                             
                          case 3:
                              System.out.println("\n======================================================");
                                        for (int i = 1; i <= 3; i++) {
                                    System.out.println("-Masukkan kode CAPTCHA berikut untuk memastikan anda bukan Robot-");
                                        System.out.println("[t6P4b]");
                                            String a= isc.nextLine();
                                  if(a.equals("t6P4b")){
                                      System.out.println(">>>>LOGIN BERHASIL<<<<");
                                      m=false;
                                      break;
                                  }
                                         if(i<3){
                                      System.out.println("\n>>COBA LAGI! PERCOBAAN KE-"+(i+1)+"<<");     
                                  }else{
                                      System.out.println(">>KESEMPATAN ANDA HABIS<<");
                                        return;
                                         }
                                    }//for case 3                           
                             break;
                          default:
                              System.out.println(">>>> KODE TIDAK VALID <<<<");
                              return;                              
                      }//switch
                     
                  }
              }                
        }//while
              
              for(;;){
                  System.out.println("\n===============HALO PENGUNJUNG PERPUSTAKAAN DIGITAL INDONESIA===============");
                  System.out.println("BUTUH SESUATU??\n1. Cari Tema Buku\n2. Cari Penulis Buku\n3. Berikan Ulasan");
                  System.out.print("Pilih (1-3): ");
                  int n= isc.nextInt();
                  isc.nextLine();
                  switch(n){
                      case 1:
                              System.out.println("\n======================================================");
                          System.out.println("[ROMANTIS, HISTORY, KOMIK]\nKetikan Yang Anda Cari: ");
                          String y= isc.nextLine();
                          if(y.toUpperCase().contains("ROMANTIS")){
                              System.out.println("silahkan masuk ke link berikut: https://PerpustakaanDigital.com/ROMANTIS-page");
                              return;
                          }else if(y.toUpperCase().contains("HISTORY")) {
                              System.out.println("silahkan masuk ke link berikut: https://PerpustakaanDigital.com/HISTORY-page");
                              return;
                          }else if(y.toUpperCase().contains("KOMIK")){
                              System.out.println("silahkan masuk ke link berikut: https://PerpustakaanDigital.com/KOMIK-page");
                              return;                             
                          }else{
                              System.out.println("MAAF YANG ANDA CARI TIDAK ADA DI SERVER KAMI");
                              return;
                          }
                          
                      case 2:
                              System.out.println("\n======================================================");
                          System.out.println("[Tere Liye, Andrea Hirata, Raditya Dika]\nKetikan Yang Anda Cari: ");
                          String s= isc.nextLine();
                          if(s.toLowerCase().contains("tere liye")){
                              System.out.println("silahkan masuk ke link berikut: https://PerpustakaanDigital.com/tereliye-page");
                              return;
                          }else if(s.toLowerCase().contains("andrea hirata")) {
                              System.out.println("silahkan masuk ke link berikut: https://PerpustakaanDigital.com/andreahirata-page");
                              return;
                          }else if(s.toLowerCase().contains("raditya dika")){
                              System.out.println("silahkan masuk ke link berikut: https://PerpustakaanDigital.com/radiytadika-page");
                              return;                             
                          }else{
                              System.out.println("MAAF YANG ANDA CARI TIDAK ADA DI SERVER KAMI");
                              return;
                          }
                      case 3:
                              System.out.println("\n======================================================");
                          System.out.println("Silahkan Ketik Ulasan Anda");
                          String ketik= isc.nextLine();
                          if(ketik.contains("jelek")){
                            System.out.println(ketik.replace("jelek", "***"));
                            return;
                          }else if(ketik.contains("buruk")){
                            System.out.println(ketik.replace("buruk", "***"));                             
                            return;
                          }else{
                              System.out.println(ketik);
                            return;
                          }
                      default:
                              System.out.println(">>>> KODE TIDAK VALID <<<<");
                              return;                                       
                          
                  } //switch  for

              } // for loop
              

        
        
        
        
        
        
        
        
    }
}

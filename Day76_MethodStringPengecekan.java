
package Marsya;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
             String updateUser= "";
             String updatePass= "";
            
            for (;;) {
                System.out.println("\n\t====SELAMAT DATANG DI WEBTOON INDONESIA====\nRules:\n1. Anda tidak bisa LOG IN jika belum SIGN UP\n2.jika anda sudah SIGN UP namun saat LOG IN anda salah memasukkan DATA maka anda tidak perlu SIGN UP lagi. ");
                System.out.println("\nLAKUKAN:\n1.Buat Akun baru(SIGN UP)\n2.Masuk dengan Akun yang sudah dibuat9(LOG IN)");           
                System.out.print("Masukkan: ");
                int l= isc.nextInt();
                isc.nextLine();
                switch(l){
                    
                    case 1:
                        System.out.println("\n\t==================HALAMAN SIGN UP======================");
                        System.out.println("HAI PENGGUNA BARU WEBTOON INDONESIA!! KAMI AKAN BANTU KAMU BUAT AKUN YA!");
                        System.out.print("Masukkan Email: ");
                        String z= isc.nextLine();
                        if(z.isEmpty()){
                            System.out.println("Email tidak boleh kosong");
                            continue;
                        }else{
                           if(z.contains("@gmail.com")){
                            System.out.println("===Email Berhasil!===");
                            System.out.print("\nMasukkan Username:");
                                    String y = isc.nextLine();
                                        updateUser=y;
                                System.out.println("===Username Berhasil!===");
                                System.out.print("\nMasukkan Password:");
                                    String x = isc.nextLine();
                                        updatePass=x;
                                System.out.println("===Password Berhasil!===");
                                System.out.println("****Terimakasih Informasi Anda Telah Kami Simpan, Silahkan lanjutkan Log In!!****");
                          
                                
                        System.out.println("\n\t==================HALAMAN LOG IN======================");
                        System.out.print("Masukkan Email: ");
                        String a= isc.nextLine();
                        if(a.isEmpty()){
                            System.out.println("Email tidak boleh kosong");
                            continue;
                        }else{
                            if(a.contains("@gmail.com")){
                            System.out.println("===Email Ditemukan!===");
                            System.out.print("\nMasukkan Username:");
                            String b = isc.nextLine();
                            
                                if(b.equalsIgnoreCase(updateUser)){
                                     System.out.println("===Username Ditemukan!===");
                                     System.out.print("\nMasukkan Password:");
                                         String c = isc.nextLine();
                                        if(c.equals(updatePass)){
                                            System.out.println("****Login Berhasil!!****");
                                                return;
                                            }else{
                                                System.out.println("****Password salah, Silahkan Ulang!!****");
                                                continue;
                                            }
                                }else{
                                     System.out.println("*****Username salah, Silahkan Ulang!!****");
                                        continue;
                                }                               
                            }else{
                                 System.out.println("***Email Tidak terdeteksi, coba gunakan (@gmail.com)***");
                               continue;
                            }                     
                        }
                           }else{
                               System.out.println("Email Tidak terdeteksi, coba gunakan (@gmail.com)");
                               continue;
                           }                           
                        }

//============================================================================================================                        
                    case 2:                        
                        System.out.println("\n\t==================HALAMAN LOG IN======================");
                        System.out.print("Masukkan Email: ");
                        String a= isc.nextLine();
                        if(a.isEmpty()){
                            System.out.println("Email tidak boleh kosong");
                            continue;
                        }else{
                            if(a.contains("@gmail.com")){
                            System.out.println("===Email Ditemukan!===");
                            System.out.print("\nMasukkan Username:");
                            String b = isc.nextLine();
                            
                                if(b.equalsIgnoreCase(updateUser)){
                                     System.out.println("===Username Ditemukan!===");
                                     System.out.print("\nMasukkan Password:");
                                         String c = isc.nextLine();
                                        if(c.equals(updatePass)){
                                            System.out.println("****Login Berhasil!!****");
                                                return;
                                            }else{
                                                System.out.println("****Password salah, Silahkan Ulang!!****");
                                                continue;
                                            }
                                }else{
                                     System.out.println("*****Username salah, Silahkan Ulang!!****");
                                        continue;
                                }                               
                            }else{
                                 System.out.println("***Email Tidak terdeteksi, coba gunakan (@gmail.com)***");
                               continue;
                            }                     
                        }
                    default:
                        System.out.println("\nMaintenence Server, Silahkan Ulang!");
                        continue;
                }
            }
      
       
    }
}


package Marsya;

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        
        String updateUser= "";
             String updatePass= "";
            
            for (;;){
                        System.out.println("\n\t==================HALAMAN SIGN UP======================");
                        System.out.print("Masukkan Email: ");
                        String z= isc.nextLine();
                        if(z.isEmpty()){
                            System.out.println("Email tidak boleh kosong");
                            continue;
                        }else{
                           if(z.contains("@gmail.com")){
                            System.out.println("===Email Berhasil===");
                            
                            System.out.print("\nMasukkan Username:");
                                    String y = isc.nextLine();
                                        if(y.length()>=8){
                                            updateUser=y;
                            System.out.println("===Username Berhasil===");
                                String nk= (updateUser.substring(1, 3)+ updateUser.substring(5, 7));
                                String na= (updateUser.substring(4, 5)+ updateUser.substring(0, 2));
                                String n1= (updateUser.length()+updateUser.length()+"1_123");
                                String n2= (updateUser.length()*updateUser.length()+"83*#");
                                
                                System.out.println("\n1. SARAN SANDI KUAT \n2. BUAT SANDI ANDA SENDIRI");
                                  int kak= isc.nextInt();
                                     switch(kak){
                                         case 1: 
                                             System.out.println("REKOMENDASI");
                                             System.out.printf("1. %s%s\n",nk,n1);
                                             System.out.printf("2. %s%s\nPILIH: ",na,n2);
                                                int la= isc.nextInt();
                                                isc.nextLine();
                                                if(la==1){
                                                    updatePass= nk+n1;
                                System.out.println("===Password Berhasil===");
                                System.out.println("****Terimakasih Informasi Anda Telah Kami Simpan, Silahkan lanjutkan Log In!!****");
                                               break;
                                                }else if(la==2){
                                                    updatePass= na+n2;
                                System.out.println("===Password Berhasil===");
                                System.out.println("****Terimakasih Informasi Anda Telah Kami Simpan, Silahkan lanjutkan Log In!!****");
                                               break;
                                                }else{
                                                    System.out.println("TIDAK VALID");
                                                }
                                         case 2:
                                            System.out.print("\nMasukkan Password:");
                                              String x = isc.nextLine();
                                              if(x.length()>=6){
                                                updatePass=x;
                                System.out.println("===Password Berhasil===");
                                System.out.println("****Terimakasih Informasi Anda Telah Kami Simpan, Silahkan lanjutkan Log In!!****");                                                 
                                               break;
                                              } else{
                                            System.out.println("PASSWORD HARUS LEBIH 6 KARAKTER");
                                                  continue;
                                              }
                                         default:
                                                    System.out.println("TIDAK VALID");
                                                    continue;
                                           
                                     }  
                                        }else{
                                            System.out.println("USERNAME HARUS LEBIH 8 KARAKTER");
                                            continue;
                                        }
                                }else{
                               System.out.println("Email Tidak terdeteksi, coba gunakan (@gmail.com)");
                               continue;
                           }    
                 }
                               
                           
                                for(;;){                                   
                        System.out.println("\n\t==================HALAMAN LOG IN======================");
                        System.out.print("Masukkan Email: ");
                        String a= isc.nextLine();
                        if(a.equals(z)){
                            
                        if(a.isEmpty()){
                            System.out.println("Email tidak boleh kosong");
                            continue;
                        }else{
                            if(a.contains("@gmail.com")){
                            System.out.println("===Email Ditemukan===");
                            System.out.print("\nMasukkan Username:");
                            String b = isc.nextLine();
                            
                                if(b.equalsIgnoreCase(updateUser)){
                                     System.out.println("===Username Ditemukan===");
                                     System.out.print("\nMasukkan Password:");
                                         String c = isc.nextLine();
                                        if(c.equals(updatePass)){
                                            System.out.println("****Login Berhasil****");
                                                return;
                                            }else{
                                                System.out.println("****Password salah, Silahkan Ulang****");
                                                continue;
                                            }
                                }else{
                                     System.out.println("*****Username salah, Silahkan Ulang****");
                                        continue;
                                }                               
                            }else{
                                 System.out.println("***Email Tidak terdeteksi, coba gunakan (@gmail.com)***");
                               continue;
                            }                     
                        }
                     }else{
                            System.out.println("EMAIL ANDA SALAH, PASTIKAN SESUAI DENGAN EMAIL SIGN UP");
                        }
                                                  
                   }
        }


        
                                      
        
        
    }
}

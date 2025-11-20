
package Marsya;

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("masukkan kode(*363#): ");  
        String kode = isc.nextLine();
            do{
                System.out.println("\n\t===========MENU TEKOMSEL=========");
                System.out.println("1. Flash Sale\n2. Super Seru\n3. Serbu\n4. Cek Kuota");
                    System.out.print("Masukkan pilihan: ");
                int u= isc.nextInt();
                    switch(u){
                        case 1: 
                            System.out.println("\n\t===========PROMO HARI INI=========");
                System.out.println("1. 45GB/28HR/80RB\n2. 65GB/28HR/100RB\n9. BACK");
                    System.out.print("Masukkan pilihan: ");
                    int A= isc.nextInt();
                    if(A==9){
                        continue;
                    }else{
                        switch(A){
                            case 1: 
                                String z= "\nAnda akan beli PROMO 45GB/28HR/80RB? \n1. yes 9. BACK";
                                System.out.println(z);
                                System.out.print("Masukkan pilihan: ");
                                int pilih= isc.nextInt();
                                switch(pilih){
                                    case 9:
                                    continue;
                                    case 1:
                                        System.out.println("Selamat, anda berhasil membeli PROMO 45GB/28HR/80RB!!");                                    
                                        return;
                                    default: 
                                         System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                                }   
                                    break;
                                
                            case 2: 
                                String x= "\nAnda akan beli PROMO 65GB/28HR/100RB? \n1. yes 9. BACK";
                                System.out.println(x);
                    System.out.print("Masukkan pilihan: ");
                                int pilih2= isc.nextInt();
                                if(pilih2==1){
                                    System.out.println("\nSelamat, anda berhasil membeli paket PROMO 65GB/28HR/100RB!!");
                                    return;
                                }else{
                                 System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                                    continue;
                                }  
                                
                            default:
                                 System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                        }
                        
                        break;
                    }
// ============================================================================================================                   
                        case 2:
                            System.out.println("\n\t===========SUPER SERU PROMO=========");
                System.out.println("1. 55GB/28HR/120RB\n2. 65GB/28HR/130RB\n9. BACK");
                    System.out.print("Masukkan pilihan: ");
                    int B= isc.nextInt();
                        if(B==9){
                        continue;
                    }else{
                        switch(B){
                            case 1: 
                                String z= "\nAnda akan beli Super Seru 55GB/28HR/120RB? \n1. yes 9. BACK";
                                System.out.println(z);
                                System.out.print("Masukkan pilihan: ");
                                int pilih= isc.nextInt();
                                switch(pilih){
                                    case 9:
                                    continue;
                                    case 1:
                                        System.out.println("Selamat, anda berhasil membeli paket super seru 55GB/28HR/120RB!!");                                    
                                   return;
                                    default:    
                                 System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                                }   
                                   break;
                                   
                                
                            case 2: 
                                String x= "\nAnda akan beli Super Seru 65GB/28HR/130RB? \n1. yes 9. BACK";
                                System.out.println(x);
                    System.out.print("Masukkan pilihan: ");
                                int pilih2= isc.nextInt();
                                if(pilih2==1){
                                    System.out.println("\nSelamat, anda berhasil membeli paket super seru 65GB/28HR/130RB!!");
                                return;
                                }else{
                                 System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                                    continue;
                                }
                                
                            default:
                                 System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                        }
                                 break;
                    }
// ============================================================================================================                   
                                              
                        case 3:
                            System.out.println("\n\t===========SERBU=========");
                System.out.println("1. 5.5GB/3HR/25RB\n2. 5GB/1HR/5RB\n9. BACK");
                    System.out.print("Masukkan pilihan: ");
                    int C= isc.nextInt();
                    if(C==9){
                        continue;
                    }else{
                        switch(C){
                            case 1: 
                                String z= "\nAnda akan beli SERBU 5.5GB/3HR/25RB? \n1. yes 9. BACK";
                                System.out.println(z);
                                System.out.print("Masukkan pilihan: ");
                                int pilih= isc.nextInt();
                                switch(pilih){
                                    case 9:
                                    continue;
                                    case 1:
                                        System.out.println("Selamat, anda berhasil membeli paket SERBU 5.5GB/3HR/25RB!!");                                    
                                   return;
                                    default:    
                                 System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                                }   
                                    break;
                                
                            case 2: 
                                String x= "\nAnda akan beli SERBU 5GB/1HR/5RB? \n1. yes 9. BACK";
                                System.out.println(x);
                    System.out.print("Masukkan pilihan: ");
                                int pilih2= isc.nextInt();
                                if(pilih2==1){
                                    System.out.println("\nSelamat, anda berhasil membeli paket SERBU 5GB/1HR/5RB!!");
                                return;
                                }else{
                                 System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                                    continue;
                                }
                                
                            default:
                                 System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");
                        }
                        break;
                    }
                    
// ============================================================================================================                   
                        case 4:
                            System.out.println("\n\t===========CEK KUOTA=========");
                System.out.println("Terimakasih permintaan anda sedang di proses, Silahkan cek sms yang dikirimkan ke nomor anda.");
                    return;
                       
                        default:
                            System.out.println("MAAF KODE MMI ANDA TIDAK VALID\nSILAHKAN ULANGI");        
                    }
                    
            }while(kode.equals("*363#"));
        
        
    }
 
}

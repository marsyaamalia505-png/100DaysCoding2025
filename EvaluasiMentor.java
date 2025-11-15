
package Marsya;

import java.util.Scanner;

public class EvaluasiMentor {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        //SOAL NOMOR1
         System.out.print("Masukkan Nilai N: ");
             int angka = isc.nextInt();
                 int tamp1= 0;
                    int tamp2=1;
                    int angka2=1;
                System.out.print("Deret 1 ke N: ");
                    for (int i = 1; i <=angka ; i++) {
                        System.out.print(i+" ");
                             tamp1+=i;           
                             }
                                 System.out.print("\nDeret N ke 1: ");
                                    do{
                                tamp2*=angka;
                            System.out.print(angka+" ");
                        angka--;
                    }while(angka>=angka2);
                 System.out.println("\nJumlah: "+ tamp1);
         System.out.println("Perkalian Faktorial: "+tamp2);
         
         //SOAL NOMOR 2
         System.out.print("\n(soal2)Masukkan Nilai N: ");
         int a= isc.nextInt();
            int awal=1;
             int tamp=0, jumlah1=0;
                 int ta2=0, jumlah2=0;
           
                    while(awal<=a){
                         if(awal%2!=0){
                             tamp++;
                                 jumlah1+=awal;                    
                             }else{
                         ta2++;
                    jumlah2+=awal;
                }
                awal++;
            }
                System.out.println("Total angka Ganjil\t: "+tamp);
                 System.out.println("Jumlah Nilai Ganjil\t: "+jumlah1);
                  System.out.println("Total angka Genap\t: "+ta2);
                    System.out.println("Jumlah Nilai Genap\t: "+jumlah2);

         //SOAL NOMOR 3
           System.out.print("\n(soal3)Masukkan Nilai N: ");
                long ang= isc.nextLong();
                 long faktorial=1;
                  long JumlahDigit= 0;
                        System.out.print("Hasil "+ang+"!= ");
                            for (long i = ang; i >= 1; i--) {
                                System.out.print(i+" x ");
                                     faktorial*=i;
                                    }
                                System.out.println("\b\b= "+faktorial);
                            for (; faktorial !=0; faktorial/=10) {
                         JumlahDigit++;
        }System.out.println("Jumlah Digit dari Hasil Faktrial: "+JumlahDigit);
         
         // SOAL NOMOR 4
         System.out.print("\n(soal4)Masukkan Ukuran N (persegi): ");
            int anka= isc.nextInt();
           
                int awa= 1; 
                    while(awa<=anka){
                         int awal2=1;
                            while(awal2<=anka){
                      awal2++;
                 System.out.print("* ");
            }
                         awa++;
                     System.out.print("\n");
            }
         
         // SOAL NOMOR 5
              System.out.print("\n(soal5)Masukkan Ukuran N (persegi): ");
                 int angk= isc.nextInt();
           
            int aal= 1; 
            while(aal<=angk){
                int awal2=1;
                while(awal2<=angk){
                    if(aal==1||aal==angk||awal2==1||awal2==angk){
                     System.out.print("* ");                  
                    }else{
                        System.out.print("  ");
                    }
                        awal2++;
                }
                aal++;
                System.out.print("\n");
            }
         //SOAL NOMOR 6
           System.out.print("\n(soal6)Masukkan Nilai N: ");
         int agka = isc.nextInt();
            int t=(agka+1)/2;
            for (int i = 1; i <= agka; i++) {
                for (int j = 1; j <= agka; j++) {
                    if(i==1||i==agka||j==1||j==agka)
                        System.out.print("* ");            
                        else if(i==t|| j==t)                 
                        System.out.print("* ");
                     else
                        System.out.print("  ");
                    }
                    System.out.println();

                   }
         
         
         
         
    }
 
}

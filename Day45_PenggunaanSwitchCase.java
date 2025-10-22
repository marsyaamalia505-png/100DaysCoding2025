import java.util.Scanner;

public class  Day45{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
     
    System.out.println("=== Tunjangan Sesuai Jabatan === \nA.Manager \nB.Supervisor \nC.Staff \nD.Magang");
    System.out.println("Masukkan Jabatan anda (A-D): ");
    
    char jabatan = isc.next().charAt(0);
    double gaji, Tunjangan;
    
    switch (jabatan){
       case 'A':
         gaji=4000.000;
         Tunjangan=gaji*40.0/100.0;
         System.out.printf("A.Manajer %nTotal Gaji %.3f dan Tunjangan= %.3f", gaji, Tunjangan);
         break;
        case 'B':
        gaji=3000.000;
         Tunjangan=gaji*30.0/100.0;
         System.out.printf("B.Supervisor %nTotal Gaji %.3f dan Tunjangan= %.3f", gaji, Tunjangan);
         break;
       case 'C':
         gaji=2500.000;
         Tunjangan=gaji*30.0/100.0;
         System.out.printf("C.Staff %nTotal Gaji %.3f dan Tunjangan= %.3f", gaji, Tunjangan);
       break;
       case 'D':
         gaji=1000.000;
         Tunjangan=gaji*20.0/100.0;
         System.out.printf("D.Magang %nTotal Gaji %.3f dan Tunjangan= %.3f", gaji, Tunjangan);
       break;
        default :
        System.out.println("Kode tidak ada");
      break;
      
    }
 
    }
}

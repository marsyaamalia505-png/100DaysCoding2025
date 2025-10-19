import java.util.Scanner;

public class Day42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gajikotor= sc.nextDouble();
        
        double kuota= 100.000; //kuota perbulan
        double administrasi = gajikotor *12.0/100.0; //biaya platform
        double bpjsmandiri = gajikotor*30.0/100.0; // bpjs mandiri
        double gajibersih= gajikotor- kuota -administrasi- bpjsmandiri;
       
        System.out.printf("Gaji bersih: %.3f" ,gajibersih );
                
        
        
    }
}

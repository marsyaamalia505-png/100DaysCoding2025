public class day4 {
    public static void main(String[] args) {
    System.out.println("\t# Mari kita Belajar Tipe Data Bilangan Bulat # "); 
    Byte a1,a2,t1,f;
    Short b1,b2,t2;
    int c1,c2,t3;
    long d1,d2,t4;
    f = 1;
    a1=-128;
    a2=127;
    b1=-32768;
    b2=32767;
    c1=-2147483648;
    c2=2147483647;
    d1=-9;
    d2=9;
  
    t1=8;
    t2=16;
    t3=32; 
    t4=64;
     
    
    System.out.printf("\nRentang ukuran *Byte yaitu: \n1. Mulai %d sampai %d atau sebanyak %d-bit",a1,a2,t1);
    System.out.printf("\n\nRentang ukuran *Short yaitu: \n2. Mulai %d sampai %d atau sebanyak %d-bit",b1,b2,t2); 
    System.out.printf("\n\nRentang ukuran *int yaitu: \n3. Mulai %d sampai %d atau sebanyak %d-bit",c1,c2,t3);
    System.out.printf("\n\nRentang ukuran *long yaitu: \n4. Mulai %d triliyun sampai %d triliyun atau sebanyak %d-bit%n",d1,d2,t4); 
    
    /* angka harus sesuai dengan kapsitas memori yang dicakup tipe data, jika lebih atau kurang maka akan terjadi
    overflow atau underflow yang menyebabkan error, crash, bahkan menurunkan keamanan program kita
    */
    System.out.print("\n\t\t  Sampai jumpa besok!!");
      
  }
}

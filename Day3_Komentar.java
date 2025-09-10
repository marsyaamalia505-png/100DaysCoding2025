public class Day3 {

  public static void main (String[] args) {
    System.out.println("menetukan rata-rata nilai ddp saya selama 3 semester:");
  int sem1 = 80;
  int sem2 = 75;
  int sem3 = 90;
  int jumlah = 3;
  
  System.out.printf("Semester 1: %d\nSemester 2: %d\nSemester 3: %d",sem1,sem2,sem3);
  
  int ratarata = sem1 + sem2 + sem3 /3;
  System.out.printf("\nrata rata nilai ddp saya:%d%n",ratarata);
  //menentukan rata-rata dari nilai ddp saya selama 3 semester
  
  double a= 185.0 ;
  System.out.println("sebelum update nilainya salah: "+a);
  // nilai rata-rata disini hasilnya salah jadi harus kita perbarui 
  a = 81.6667;
  System.out.println("sesudah update nilainya sudah benar: "+a);
  // rata-ratanya sudah tepat setelah diperbarui 
  final double c = 81.7 ;
  System.out.println("jawaban akhir fiks: "+ c);
  // final jawaban dan sudah tidak bisa diperbarui karena hasil setelahnya akan error

  }

}

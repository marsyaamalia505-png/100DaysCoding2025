import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
    Scanner isc = new Scanner (System.in);
    System.out.println("LATIHAN MENGGABUNGKAN BEBERAPA OPERATOR");
    System.out.print("\nMasukkan nilai tugas: "+"\nMasukkan nilai Uts: "+"\nMasukkan nilai Uas: \n");
     int tugas = isc.nextInt(), Uts = isc.nextInt(), Uas = isc.nextInt();
   /*
    pengimputan nilai mahasiswa dengan menggabungkan 30% nilai tugas, 30% nilai Uts, dan 40% nilai Uas.
    Apabila hasil ketiganya di atas 80-100 maka dia lulus dan akan mencetak hasil nilainya. namun, jika tidak lulus di hanya akan mencetak 0 
    tetapi karena si dosen hari itu berulang tahun yang ke 60 maka mahasiswa yang mendapat nilai 60 akan di luluskan 
    dan setiap mahasiswa akan mendapat 5 point baik dia lulus atau tidak lulus.
     */
     
      int  hasil = (tugas*30/100)+(Uts*30/100)+(Uas*40/100);
      boolean predikat = hasil>=80 && hasil <=100 || hasil==60;
      
      int ketentuan = Boolean.compare(predikat,false); // true, false (1) false, false(0) 
      ketentuan*=hasil;
      System.out.println("Hasilnya: "+ketentuan);
      ketentuan++;
      ketentuan++;
      ketentuan++;
      ketentuan++;
      ketentuan++;
      System.out.println("Hasil akhir: "+ketentuan);
      
      

  }
}      
    

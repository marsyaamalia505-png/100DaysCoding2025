public class Day2 {

public static void main(String[] args) {
    String nama= "Marsya";
    int  umur = 18;
    Float berat = 42.3f;
    char goldar = 'B';
    
  // println untuk mendeklarasikan hasil dengan baris baru
  System.out.println("Nama: "+nama);
  System.out.println("Umur: "+umur);
  System.out.println("Berat: "+berat);
  System.out.println("Golongan darah: " +goldar);
  // print untuk mendeklarasikan hasil dengan bersambungan
  System.out.print("nama:"+nama );
  System.out.print(" umur:"+umur);
  System.out.print(" berat:"+berat );
  System.out.print(" golongan darah:"+goldar );
    
  // printf untuk mendeklrasikan hasil baris baru atau bersambungan dengan format tertentu
  System.out.printf("\nnama:%s\numur:%d tahun\nberat:%1f\ngoldar:%c%n",nama,umur,berat,goldar);  
    
  }

}

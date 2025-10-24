import java.util.Scanner;

public class  Day47{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
     
      System.out.println("Masukkan jadwal anda: ");
    
      String a= isc.nextLine(); //senin: kuliah, tidur, presentasi
      String b= isc.nextLine(); // selasa: rapat, bimbingan, ujian
      String c= isc.nextLine(); // rabu : kuliah, ujian, praktikum
      String d= isc.nextLine();// kamis: periksa mata cek up ke dokter
      String e= isc.nextLine(); // jumat : libur bisa nyantai di kos
      String f= isc.nextLine();// sabtu: kuliah, tes, healing
      String g= isc.nextLine(); // minggu: libur lagi bisa nyantai
      
      
      System.out.println("Masukkan hari sekarang apa? ");
      
     
      String jadwal= isc.nextLine();
     
      switch (jadwal){
        case "senin":
          System.out.print("Jadwal anda adalah "+a);
          break;
        case "selasa":
         System.out.print("Jadwal anda adalah "+b);
          break;
        case "rabu":
         System.out.print("Jadwal anda adalah "+c);
         break;
        case "sabtu":
          System.out.print("Jadwal anda adalah "+f);
          break;
          
          default:
          if (jadwal.equalsIgnoreCase("jumat")){
            System.out.println("jadwal anda adalah "+e);
            
          } else if(jadwal.equalsIgnoreCase("minggu")){
              System.out.println("jadwal anda adalah "+g);
          }else if (jadwal.equalsIgnoreCase("kamis")){
            System.out.println("jadwal anda adalah "+d); 
            
          }else {
            System.out.println("ulangi!! tolong masukkan nama hari senin-minggu ");
          }
       
          
  
          
      }
   
      
    }
}

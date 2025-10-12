import java.util.Scanner;

public class Day35{
    public static void main(String[] args) {
   Scanner isc = new Scanner (System.in);
   int password = isc.nextInt(),kodekeamanan=isc.nextInt();
   
   if (password==155 && kodekeamanan==12567890)  {
     System.out.println("Selamat Datang di akun Google Anda");
   } else if(kodekeamanan==12567890||password==2025 ){
     System.out.println("Selamat Datang di akun Google Anda");
   }else{
     System.out.println("Akun Terblokir");
   }
   
   
     
  }
}

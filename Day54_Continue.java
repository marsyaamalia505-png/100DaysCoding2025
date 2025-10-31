
package Marsya;

import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner isc=new Scanner (System.in);
        while (true){
          System.out.print("Masukkan warna lampu: ");
          String lampu = isc.nextLine();
          switch(lampu){
              case "hijau":
                  System.out.println("Jalan!");
                  continue;
              case "kuning":
                  System.out.println("Hati-hati");
                  continue;
              case "merah":
                  System.out.println("Berhenti!");
                  continue;
              case "stop":
                  System.out.println("Sistem dimatikan");
                  return;
              default:
                  System.out.println("pesan error");
                  
            }   
          }
         
    }
}

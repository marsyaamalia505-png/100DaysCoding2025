import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
      Scanner isc= new Scanner (System.in);
      System.out.println("MENGUBAH TIPE DATA PRIMITIF KE STRING");
  //Menggunakan String.valueOf()      
      char string = isc.next().charAt(0);
      String pertama= String.valueOf(string);
      System.out.printf("Cara String.ValueOf: %s%n",pertama);
      
  //Menggunakan TipeData.toString()      
      short tring = isc.nextShort();
      String kedua= Short.toString(tring);
      System.out.printf("TipeData.toString: %s%n",kedua);
      
  //Menggunakan Petik+Variabel()      
      double ring = isc.nextDouble();
      String ketiga= ""+ring;
      System.out.printf("Petik+Variabel: %s%n",ketiga);
          
  //Menggunakan String.format()      
      boolean ing = isc.nextBoolean();
      String keempat= String.format("Cara String.format: %b",ing);
      System.out.print(keempat);
    
      
  }
}

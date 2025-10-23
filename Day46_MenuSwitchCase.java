package day1coding;

import java.util.Scanner;

public class  Day46{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
     System.out.print("\t==== Hello Honey, Welcome to Marsya's MatChaffe ==== ");
     System.out.print("\nOur Menu's:\n1.Authentic Matcha \tRp15.000 \n2.Cloud Matcha Creamy \tRp18.000 \n3.Matcha Latte \t\tRp18.000 \n4.Cheesy Matcha \tRp20.000 \n\nSelect Number by Menu's: ");
     int number = isc.nextInt();
     isc.nextLine();
    double price1=15.000, price2=18.000, price3= 18.000, price4=20.000;
    double Total=0;
     switch(number){
         case 1: 
            System.out.println("\nAuthentic Matcha \tRp15.000");
            System.out.println("with sugar (+Rp2.000)/less sugar(-Rp1.500), yes/no?");
            String pilih= isc.nextLine();
         switch(pilih){
             case "yes": 
                 Total+= price1;
                 Total+= 2.000;
                 System.out.printf("Your Total Rp%.3f",Total);
                 break;
             case "no":
                 Total+= price1-1.500;
                 System.out.printf("%nYour Total Rp%.3f",Total);
                 
      }break;
         case 2: 
            System.out.println("\nCloud Matcha Creamy \tRp18.000");
            System.out.println("with sugar (+Rp2.000)/less sugar(-Rp1.500), yes/no?");
            String pilih2= isc.nextLine();
          switch (pilih2){
              case "yes":
                  Total+=  price2;
                  Total+= 2.000;
                  System.out.printf("==Your Total Rp%.3f==",Total);
                  break;
              case "no":
                  Total+=  price2-1.500;
                  System.out.printf("%n==Your Total Rp%.3f==",Total);
        }break;
          
         case 3:
            System.out.println("\nMatcha Latte \tRp18.000");
            System.out.println("with sugar (+Rp2.000)/less sugar(-Rp1.500), yes/no?");
            String pilih3= isc.nextLine();
           switch (pilih3){
               case "yes":
                  Total=  price3;
                  Total+= 2.000;
                  System.out.printf("==Your Total Rp%.3f==",Total);
                  break;
               case "no":
                  Total+= price3-1.500;
                  System.out.printf("%n==Your Total Rp%.3f==",Total);
      }break;
      
         case 4:
            System.out.println("\nCheesy Matcha \tRp20.000");
            System.out.println("with sugar (+Rp2.000)/less sugar(-Rp1.500), yes/no?");
            String pilih4= isc.nextLine();
           switch (pilih4){
               case "yes":
                 Total+=  price4 ;
                 Total += 2.000;
                 System.out.printf("==Your Total Rp%.3f==",Total);
                 
               case "no":
                    Total+= price4 - 1.500;
                    System.out.printf("%n==Your Total Rp%.3f==",Total);
                    
      }
     }
       
     System.out.println("\n\nAny Toping: \n1.Whipped Cream +Rp7.000\n2.Ice Cream \t+Rp5.000\n3.Granola \t+Rp3.000 \n4.No Thanks");
     System.out.print("Select Number: ");
    
     int top= isc.nextInt();
     switch (top){
         case 1: 
                 double f= Total+ 7.000;
                 System.out.printf("%n==Your Total with Toping Rp%.3f==",f);
                 break;
         case 2:
                double g= Total+ 5.000;
                System.out.printf("%n==Your Total with Toping Rp%.3f==",g);
                break;
         case 3:
                double h= Total+ 3.000;
                System.out.printf("%n==Your Total with Toping Rp%.3f==",h);
                break;
         default:
        System.out.printf("%n==Your Total without Toping Rp%.3f==",Total);
      
     }

    
    }
    
}

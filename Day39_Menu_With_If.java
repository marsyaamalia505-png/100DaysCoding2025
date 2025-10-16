import java.util.Scanner;

public class  day39{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
     System.out.print("\t==== Hello Honey, Welcome to Marsya's MatChaffe ==== ");
     System.out.print("\nOur Menu's:\n1.Authentic Matcha \tRp15.000 \n2.Cloud Matcha Creamy \tRp18.000 \n3.Matcha Latte \t\tRp18.000 \n4.Cheesy Matcha \tRp20.000 \n\nSelect Number by Menu's: ");
     int number = isc.nextInt();
     isc.nextLine();
    double price1=15.000, price2=18.000, price3= 18.000, price4=20.000;
    double Total=0;
     if (number ==1){
      System.out.println("\nAuthentic Matcha \tRp15.000");
      System.out.println("with sugar (+Rp2.000)/less sugar(-Rp1.500), yes/no?");
      String pilih= isc.nextLine();
      if(pilih.equalsIgnoreCase("yes")){
        Total+= price1;
        Total+= 2.000;
        System.out.printf("Your Total Rp%.3f",Total);
      }else{
        Total+= price1-1.500;
        System.out.printf("%nYour Total Rp%.3f",Total);
      }
      
      
     } else if(number==2){
       System.out.println("\nCloud Matcha Creamy \tRp18.000");
      System.out.println("with sugar (+Rp2.000)/less sugar(-Rp1.500), yes/no?");
      String pilih= isc.nextLine();
      if(pilih.equalsIgnoreCase("yes")){
        Total+=  price2;
        Total+= 2.000;
        System.out.printf("==Your Total Rp%.3f==",Total);
      }else{
        Total+=  price2-1.500;
        System.out.printf("%n==Your Total Rp%.3f==",Total);
      }
      
     }else if(number==3){
       System.out.println("\nMatcha Latte \tRp18.000");
      System.out.println("with sugar (+Rp2.000)/less sugar(-Rp1.500), yes/no?");
      String pilih= isc.nextLine();
      if(pilih.equalsIgnoreCase("yes")){
        Total=  price3;
        Total+= 2.000;
        System.out.printf("==Your Total Rp%.3f==",Total);
      }else{
        Total+= price3-1.500;
        
        System.out.printf("%n==Your Total Rp%.3f==",Total);
      }
     }else if(number==4){
       System.out.println("\nCheesy Matcha \tRp20.000");
      System.out.println("with sugar (+Rp2.000)/less sugar(-Rp1.500), yes/no?");
      String pilih= isc.nextLine();
      if(pilih.equalsIgnoreCase("yes")){
         Total+=  price4 ;
        Total += 2.000;
        System.out.printf("==Your Total Rp%.3f==",Total);
      }else{
        Total+= price4 - 1.500;
        System.out.printf("%n==Your Total Rp%.3f==",Total);
      }
       
     }
     
     
     System.out.println("\n\nAny Toping: \n1.Whipped Cream +Rp7.000\n2.Ice Cream \t+Rp5.000\n3.Granola \t+Rp3.000 \n4.No Thanks");
     System.out.println("Select Number: ");
    
     int top= isc.nextInt();
     if(top==1){
       double f= Total+ 7.000;
        System.out.printf("%n==Your Total with Toping Rp%.3f==",f);
     }else if(top==2){
       double f= Total+ 5.000;
        System.out.printf("%n==Your Total with Toping Rp%.3f==",f);
     }else if(top==3){
       double f= Total+ 3.000;
        System.out.printf("%n==Your Total with Toping Rp%.3f==",f);
      }else{
        System.out.printf("%n==Your Total without Toping Rp%.3f==",Total);
      }
     

    }
}

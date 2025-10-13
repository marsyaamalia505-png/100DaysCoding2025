import java.util.Scanner;

public class  day12{
   public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
    int jarak= isc.nextInt();
    for (int i=1 ;i<=jarak ;i++ ){
       
       
      if (i==8){
        System.out.println("langkah ke-"+i+" sandalnya putus");
      }
      if(i==17){
       System.out.println("langkah ke-"+i+" dia melewati rumah budi");
        System.out.println("apakah dia akan singgah?");
        boolean jawaban = isc.nextBoolean();
        if(jawaban==true){
           System.out.println("masuk dan minum kopi");
           break;
          }
          
          }
        
        
        if(i==28){
           System.out.println("langkah ke-"+i+" dia melewati rumah mail");
            System.out.println("apakah dia akan masuk");
            boolean jawaban2= isc.nextBoolean();
            if(jawaban2== true){
               System.out.println("masuk dan main ps");
               break;
            }
          
        }
            if (i==47){
               System.out.println("langkah ke-"+i+" dia singgah ke toko beli sandal baru");
            } 
            
            if(i==123){
              System.out.println("langkah ke-"+i+" dia melewati lapangan sepak bola");
              System.out.println("apakah dia mau singgah");
              boolean jawaban3= isc.nextBoolean();
              if(jawaban3== true){
                System.out.println("berhenti dan main bola");
                break;
                
              }
              
            }
              
            
            System.out.println("langkah ke-"+i); 
           
            
        }
        
       }
       
      }


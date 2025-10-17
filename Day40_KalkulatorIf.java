import java.util.Scanner;

public class  Day40{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
    double a = isc.nextDouble();
    char op = isc.next().charAt(0);
   double  b = isc.nextDouble();
    
    if (op == '+'){
      a+=b;
      System.out.print("= "+a);
    } else if(op=='-'){
      a-=b;
      System.out.print("= "+a);
    }else if(op== 'x'){
      a*=b;
      System.out.print("= "+a);
    }else if(op=='^'){
      double hasil = Math.pow(a,b);
      System.out.print("= "+hasil);
    }else if (op=='/'){
      a/=b;
      if(b==0){
        System.out.print("tidak bisa dibagi nol");
      }else {
        System.out.print("= "+a);
      }
    }
    
  

    }
}

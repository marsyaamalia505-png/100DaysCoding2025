import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
    
    Scanner isc = new Scanner (System.in);
    
    String io= isc.nextLine();
    
    Integer amalia = Integer.parseInt(io);
    System.out.println(amalia);
    
    Byte ki= Byte.parseByte(io);
    System.out.println(ki);
    
    Short apa= Short.parseShort(io);
    System.out.println(apa);
    
    long ti = Long.parseLong(io);
    System.out.println(ti);
    
    Float ru = Float.parseFloat (io);
    System.out.println(ru);
    
    double wu= Double.parseDouble(io);
    System.out.println(wu);
    
    char pa = io.charAt(2);
    System.out.println(pa);
    
    String tu = "false";
    boolean qr = Boolean.parseBoolean(tu);
    System.out.println(qr);
    
    
    }
}
   

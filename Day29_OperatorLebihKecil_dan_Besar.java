import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner isc = new Scanner (System.in);
       int PermenMarsya= isc.nextInt(), PermenKakak= isc.nextInt();
       int permenKakek= 50;
           PermenMarsya+= PermenMarsya*50.0/100;
           PermenKakak+= PermenKakak*20.0/100;
            PermenMarsya-=10;
             PermenKakak-=3;
  
        boolean bandingkan= PermenMarsya > PermenKakak;
          System.out.println("Apakah permen marsya lebih banyak dari permen kakak: "+bandingkan);
              PermenMarsya+=PermenKakak;
              System.out.println("Hasil jumlah Permen Marsya dan kakak "+PermenMarsya);
        boolean bandingkan2= PermenMarsya<permenKakek;;
            System.out.println("Apakah permen marsya + kakak lebih sedikit dari permen kakek: "+bandingkan2);
 

    }
}

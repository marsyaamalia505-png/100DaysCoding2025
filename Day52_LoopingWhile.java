import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.println("PERULANGAN WHILE");
        System.out.println("menghitung tabungan");
        int tabungan = 0;
        int minggu = 0;
        int tambahan = isc.nextInt();
        int target = isc.nextInt();
        
        while (tabungan < target){
            minggu++;
            tabungan+= tambahan;
            System.out.println("minggu ke-"+minggu+" total tabungan= "+tabungan);
        }
        System.out.println("total minggu untuk mencapai target Rp "+ target +" adalah: "+minggu);
    }
}

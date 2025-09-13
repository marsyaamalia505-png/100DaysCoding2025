public class day7{

  public static void main (String[] args) {
  System.out.println("daftar golongan darah mahasiswa unsulbar: ");
  char a,b,c,M,N;
  a= 'A';
  b= 'B';
  c= 'O';
  M= '-';
  N= '+';
  
  System.out.printf("\ncici : %c%c\nsasa : %c%c\nbudi : %c%c\nsisil: %c%c\nputri: %c%c\n",a,M,b,N,c,M,a,b,c,N);
  System.out.println("pertanyaan tentang kebenaran golongan darah!!");
  boolean sasa, budi, sisil;
  sasa=true;
  budi=false;
  sisil=false;
  
  String G="1. apakah goldar sasa A-? ";
  String R="2. apakah goldar budi B+? ";
  String H="3. apakah goldar sisil O+? ";
  System.out.println(G+sasa);
  System.out.println(R+budi);
  System.out.println(H+sisil);
  
  // char hanya bisa memproses 1 karakter,huruf,simbol dengan aturan menggunakan ('') 
 // boolean hanya bisa memproses nilai true/false namun juga bisa dalam kondisi if else
  
  }
}

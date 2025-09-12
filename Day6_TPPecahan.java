public class day6{

  public static void main (String[] args) {
  
  System.out.println("\t*** Luas Wilayah Domilisi Saya Saat Ini ***"); 
  float a1,b1 ;
  double c2,d2;  
  a1 = 4.01f;  
  b1 = 30.04f;
  c2 = 55.199;
  d2 = 16787.18;
  
  System.out.printf("\nKelurahan Tande Timur seluas \t%.2f km2\nKecamatan Banggae Timur seluas \t%.2f km2\nKabupaten Majene seluas \t%.2f km2\nProvinsi Sulawesi Barat seluas \t%.2f km2",a1,b1,c2,d2);  
  /*
  penggunaan float mencapai 32 bit dengan 7 digit desimal serta penggunaan "f" diakhir nilai inputan
  penggunaan double mencapai 64 bit dengan 16 digit desimal 
  ketika mendeklarasikan float/double dengan printf menggunakan format %f 
  untuk membulatkan angkanya menggunakan %.1f (untuk 1 angka belakang koma) %.2f (untuk 2 angka belakang koma)
  */  
    
  }
}

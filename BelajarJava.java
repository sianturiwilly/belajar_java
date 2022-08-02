import java.util.Scanner;
import java.util.Locale;
 
class BelajarJava {
  public static void main(String args[]){
     
    String nama;
    int umur;
    double ipk;
    String alamat;
     
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
     
    System.out.println("## Biodata Mahasiswa ##");
    System.out.println("=======================");   
    System.out.println();
     
    System.out.print("Nama: ");
    nama = input.nextLine();
     
    System.out.print("Umur: ");
    umur = input.nextInt();
 
    System.out.print("IPK: ");
    ipk = input.nextDouble();   
    input.nextLine();
    
    System.out.print("Alamat: ");
    alamat = input.nextLine();
   
    System.out.println("=======================");   
    System.out.println();
     
    System.out.print(nama + " berusia "+ umur + " tahun, ");
    System.out.print("memiliki IPK " + ipk);
    System.out.print(" dan beralamat di " + alamat);
     
  }
}
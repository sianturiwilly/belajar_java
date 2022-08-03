import java.util.Scanner;
   
class BelajarJava {
  public static void main(String args[]){
       
    Scanner input = new Scanner(System.in);
       
    String[] siswa = new String[3];
   
    System.out.print("Siswa pertama: ");
    siswa[0] = input.nextLine();
      
    System.out.print("Siswa kedua: ");
    siswa[1] = input.nextLine();
     
    System.out.print("Siswa ketiga: ");
    siswa[2] = input.nextLine();
       
    System.out.println();
    System.out.println("## Hasil ##");
       
    System.out.print("Nama siswa adalah: ");
    System.out.println(siswa[0]+", "+siswa[1]+", "+siswa[2]);
  }
}
import java.util.Scanner;
 
class BelajarJava {
  public static void main(String args[]){
     
    int a;
    Scanner input = new Scanner(System.in);
     
    System.out.print("Input sembarang angka: ");
    a = input.nextInt();
 
    if (a % 2 == 0) {
      System.out.println(a + " adalah angka genap");
    }
    if (a % 2 == 1) {
      System.out.println(a + " adalah angka ganjil");
    }
    
  }
}
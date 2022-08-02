import java.util.Scanner;
 
class BelajarJava3 {
  public static void main(String args[]){
     
    Scanner input = new Scanner(System.in);
     
    byte  var1;
    short var2;
    int   var3;
    long  var4;
 
    System.out.print("var1 (byte): ");
    var1 = input.nextByte();
     
    System.out.print("var2 (short): ");
    var2 = input.nextShort();
     
    System.out.print("var3 (int): ");
    var3 = input.nextInt();
     
    System.out.print("var4 (long): ");
    var4 = input.nextLong();
     
    System.out.println();
    System.out.println("## Hasil ##");
     
    System.out.println("var1 = "+var1);
    System.out.println("var2 = "+var2);
    System.out.println("var3 = "+var3);
    System.out.println("var4 = "+var4);    
  }
}

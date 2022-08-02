import java.util.Scanner;

class Char {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        char var1, var2;

        System.out.print("var1: ");
        var1 = input.next().charAt(0);

        System.out.print("var2: ");
        var2 = input.next().charAt(0);

        System.out.println();
        System.out.println("## Hasil ##");

        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
    }
}
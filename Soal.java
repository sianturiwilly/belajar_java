// Nama: Willi
// Bahasa Pemrograman: Java
// Referensi: Duniailkom (https://www.duniailkom.com/)

import java.util.Scanner;

class Soal { 
    public static void main(String args[]){

        String Randomword = "ForzaBca";
        int B = 1;
        for (int i=B; i<=5; i++){
            int  C = Randomword.length();
            if (i < C){
                System.out.println(Randomword.substring(5));
            }else{
                System.out.println("wait");
            }
        }
    }
}
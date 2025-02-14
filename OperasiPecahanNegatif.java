// Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan 
// pecahan negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!

import java.util.Scanner;

public class OperasiPecahanNegatif {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan pecahan negatif pertama: ");
        float pecahanPertama = myObj.nextFloat();

        System.out.print("Masukkan pecahan negatif kedua: ");
        float pecahanKedua = myObj.nextFloat();

        System.out.print("Masukkan pecahan negatif ketiga: ");
        float pecahanKetiga = myObj.nextFloat();

        System.out.println("\nHasil Penjumlahan: " + (pecahanPertama + pecahanKedua + pecahanKetiga));
        System.out.println("Hasil Pengurangan: " + (pecahanPertama - pecahanKedua - pecahanKetiga));
        System.out.println("Hasil Perkalian: " + (pecahanPertama * pecahanKedua * pecahanKetiga));
        System.out.println("Hasil Pembagian: " + (pecahanPertama / pecahanKedua / pecahanKetiga));

        myObj.close();
    }
}

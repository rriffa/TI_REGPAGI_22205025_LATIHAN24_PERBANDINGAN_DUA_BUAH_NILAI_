/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan24;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Latihan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ulangi = true;

        while (ulangi) {
            System.out.print("Masukkan Nilai Pertama\t: ");
            int nilai1 = input.nextInt();
            System.out.print("Masukkan Nilai Kedua\t: ");
            int nilai2 = input.nextInt();

            if (nilai1 > nilai2) {
                System.out.println(nilai1 + "lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println(nilai1 + "lebih kecil dari" + nilai2);
            } else {
                System.out.println(nilai1 + "sama dengan" + nilai2);
            }
            System.out.print("ulangi aktifitas? (ya/tidak)");
            String aktifitas = input.next();
            if (aktifitas.equals("ya")) {
                System.out.print("Program akan diulangi");
            } else if (aktifitas.equals("tidak")) {
                System.out.print("Program Berhenti Terimakasih");
                ulangi = false;
            }
        }
    }
}

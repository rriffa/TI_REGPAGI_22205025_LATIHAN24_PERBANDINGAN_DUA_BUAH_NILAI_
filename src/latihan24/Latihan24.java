/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan24;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 Nama :Ma'rifatu Khirzah
 NIM :22205025
 Prodi :Teknik Informatika
 Deskripsi :Membuat Program dua buah nilai yang inputannya berasal dari user.
 */
public class Latihan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        
        while(ulangi){
            System.out.println("Masukan nilai pertama\t: ");
            int nilai1 = input.nextInt();
            System.out.println("Masukan nilai kedua\t: ");
            int nilai2 = input.nextInt();
            
            if(nilai1 > nilai2) {
                System.out.println(nilai1+ "Lebih besar dari" +nilai2);
            } else if(nilai1 < nilai2) {
                System.out.println(nilai1+"Lebih kecil dari" +nilai2);
            } else {
                System.out.println(nilai1+"sama dengan" +nilai2);
            }
            
            System.out.println("ulangi aktifitas? (ya/tidak)");
            String aktifitas = input.next();
            if(aktifitas.equals("ya")) {
                System.out.println("Program akan diulangi");
            } else if (aktifitas.equals("tidak")) {
                System.out.println("Program berhasil Terimakasih");
                ulangi = false;
            }
        }
    }
}

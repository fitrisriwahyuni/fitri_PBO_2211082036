/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PITI180323;

/**
 *
 * @author USER
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Modul612 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai ujian pertama: ");
        double nilai1 = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan nilai ujian kedua: ");
        double nilai2 = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan nilai ujian ketiga: ");
        double nilai3 = Double.parseDouble(reader.readLine());

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        System.out.print("Nilai rata-rata: " + rataRata);
        if (rataRata >= 60) {
            System.out.print(" :)");
        } else {
            System.out.print(" :(");
        }
    }
}

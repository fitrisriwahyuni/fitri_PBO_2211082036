/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PITI160323;

/**
 *
 * @author USER
 */
 import java.util.Scanner;
public class Modul641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int base = scanner.nextInt();

        System.out.print("Masukkan nilai pangkat: ");
        int exponent = scanner.nextInt();

        int result = 1;
        int count = 0;

        while (count < exponent) {
            result *= base;
            count++;
        }

        System.out.println(base + " pangkat " + exponent + " adalah " + result);
    }
}


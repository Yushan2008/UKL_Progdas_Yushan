/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal23;

/**
 *
 * @author CANDRA DEWI
 */
import java.util.Scanner;
import java.util.Random;
public class Uklsoal23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepGoing = true;

        while (keepGoing) {
            int angka1 = random.nextInt(10) + 1; 
            int angka2 = random.nextInt(10) + 1; 
            char[] operators = {'*', '/', '%'};
            char operator = operators[random.nextInt(operators.length)];

            System.out.print(angka1 + " " + operator + " " + angka2 + " = ");
            int jawabanUser = scanner.nextInt();

            int hasilBenar = 0;
            switch (operator) {
                case '*':
                    hasilBenar = angka1 * angka2;
                    break;
                case '/':
                    hasilBenar = angka1 / angka2;
                    break;
                case '%':
                    hasilBenar = angka1 % angka2;
                    break;
            }

            if (jawabanUser == hasilBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah: " + hasilBenar);
            }

            System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            String keputusan = scanner.next();
            if (keputusan.equalsIgnoreCase("tidak")) {
                keepGoing = false;
                System.out.println("Terima kasih telah bermain!");
            }
        }

    }
}
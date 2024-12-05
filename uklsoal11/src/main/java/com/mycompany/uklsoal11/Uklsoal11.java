/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal11;

/**
 *
 * @author CANDRA DEWI
 */
import java.util.Scanner;
public class Uklsoal11 {

    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);

        System.out.print("Apakah Anda memiliki kartu member? : ");
        String isMember = pepe.nextLine().trim().toLowerCase();

        System.out.print("Masukkan total belanja Anda: ");
        double totalBelanja = pepe.nextDouble();

        double diskon = 0;
        if (isMember.equals("ya")) {
            diskon = hitungDiskon(totalBelanja);
        }

        double totalBayar = hitungTotalBayar(totalBelanja, diskon);

        tampilkanHasil(totalBelanja, diskon, totalBayar, isMember);
    }

    public static double hitungDiskon(double totalBelanja) {
        double diskon = 0;
        if (totalBelanja >= 100000 && totalBelanja <= 200000) {
            diskon = totalBelanja * 0.10;
        } else if (totalBelanja > 200000) {
            diskon = totalBelanja * 0.20;
        }
        return diskon;
    }

    public static double hitungTotalBayar(double totalBelanja, double diskon) {
        return totalBelanja - diskon;
    }

    public static void tampilkanHasil(double totalBelanja, double diskon, double totalBayar, String isMember) {
        System.out.println("\n=== Rincian Belanja ===");
        System.out.println("Status member: " + (isMember.equals("ya") ? "Member" : "Bukan Member"));
        System.out.println("Total belanja: Rp" + totalBelanja);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);
    }
}
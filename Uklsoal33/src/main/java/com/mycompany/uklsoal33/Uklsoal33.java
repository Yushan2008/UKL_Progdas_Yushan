/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal33;

/**
 *
 * @author CANDRA DEWI
 */
public class Uklsoal33 {

    public static void main(String[] args) {
      
        int[] array = {8, 7, 8, 8, 3, 4, 5};
        int mostFrequent = 0;  
        int maxCount = 0;    

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                mostFrequent = array[i];
                maxCount = count;
            }
        }

        System.out.println("Elemen yang paling sering muncul adalah " + mostFrequent + " sebanyak " + maxCount + " kali");
    }
}
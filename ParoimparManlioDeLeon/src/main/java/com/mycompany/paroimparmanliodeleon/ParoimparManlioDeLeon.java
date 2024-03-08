/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paroimparmanliodeleon;

/**
 *
 * @author Ninja
 */
import java.util.Scanner;
public class ParoimparManlioDeLeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Este numero es par.");
        } else {
            System.out.println("Este numero es impar.");
        }
        scanner.close();
    }
}

package com.mycompany.testetecnico1;

import java.util.Scanner;

/**
 *
 * @author rosealquino
 */

public class TesteTecnico1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número 1: ");
            int numero1 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Digite o número 2: ");
            int numero2 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Digite o número 3: ");
            int numero3 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Digite o número 4: ");
            int numero4 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Os números pares entre " + numero1 + " , " + numero2 + " , " + numero3 + " , " + numero4 + " são: ");
            for (int numero = numero1; numero <= numero2; numero++)
                if (numero % 2 == 0) {
                    System.out.print(" " + numero);
                }
        }
    }
}
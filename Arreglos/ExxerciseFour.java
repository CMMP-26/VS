package Arreglos;

import java.util.Scanner;

/*Leer 10 nùmeros enteros, guardalos en un areglos
 * Debemos mostrarlos en el siguiente orden: el 1ro, el ultimo, el segundo, el penultimo, el tercero, etc.
 */
public class ExxerciseFour {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros [] = new int[10];

        System.out.println("Dijite 10 nùmeros:");

        for(int i=0; i<numeros.length;i++){
            System.out.print("Numero "+(i+1)+" :");
            numeros[i] = entrada.nextInt();
        }

        for(int i=0;i<=5; i++){
            System.out.println(numeros[i]);
            System.out.println(numeros[9-i]);
        }

        entrada.close();
    }
}

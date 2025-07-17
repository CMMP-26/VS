package Arreglos;

import java.util.Scanner;

//Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
public class ExerciseOne {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [5];

        for(int i=0; i < 5;i++){
            System.out.print("Numero "+(i+1)+" :");
            numeros [i]  = entrada.nextInt();
        }

        for(int i:numeros){
            System.out.println("Numeros: "+i);
        }
        entrada.close();
    }
}

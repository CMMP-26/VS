package Arreglos;
//Leer 5 nùmeros, guardarlos en un arreglo y mostrarlos en el orden inverso introducido
import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] numeros = new double[5];

        System.out.println("Dijite 5 numeros");

        for(int i=4; i>=0; i--){
            System.out.print("Numero "+(i+1)+" :");
            numeros[i] = entrada.nextDouble();
        }

        for(double i:numeros){
            System.out.println(i);
        }

        entrada.close();
    }    
}

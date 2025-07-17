package Arreglos;
//prueba uno de como funciona los arrays y el como podemos mostrarlo en un bucle for
public class PruebeCero {
    public static void main(String[] args) {
        int [] numeros = new int[3]; //Tipo de variable, nombre y cuantos elementos lleva 

        numeros[0] = 3; //Declaracion de la 1ra variable empezando por 0 y rellenandolo con un valor 
        numeros[1] = 2;
        numeros[2] = 500; 

        for(int i=0;i < 3; i++){ //Bucle de tipo for que indica al iterador hacer un bucle siempre y cuandos sea < 3
            System.out.println(numeros[i]); //Sout que muestra los arreglos que va a leer (i) para asi no poner uno por uno
        }

    }
}

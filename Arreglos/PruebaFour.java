package Arreglos;
//Bucle for each
public class PruebaFour {
    public static void main(String[] args) {
        String [] nombres = {"Carlos", "Ramon", "Ruben", "Julio", "Mariano", "Samuel", "Pepe", "Jhoaquin", "Jovanni"}; //Arreglos

        for(String i:nombres){ /*Mejora del bucle for con el nombre de for each el cual solamnete se le pone el tipo de array
            (String en este caso) el iterador (i) asi como el nombre de dicho arreglo (Nombres). Esto nos ayuda a no tener que 
            poner condicionales o codigo de mas  */
            System.out.println("Nombres: "+i); /*sout el cual ya no necesita el array sino que muetras dichos valores usando
            el iterador i para todo el array */
        }
    }
}

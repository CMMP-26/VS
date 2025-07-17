package Arreglos;
//Prueba numero uno iguapero en esta ocasion las variables se declaran dentro de una linea de codigo 
public class PruebaOne {
        public static void main(String[] args) {
        int [] numeros = {5,7,9,12}; /*Tipo de variable para los arreglos, nombre y especificacion de cuales son 
        dichas variables de la cual ya no debemos poner una por una */

        for(int i=0;i < 4; i++){ //Lo mismo bucle que toma al iterador y mientras este sea < 4 i++
            
            System.out.println(numeros[i]); /*Lo mismo las variables del array numeros 
            se van a leer cumpliendo la especificacion del bucle for*/
        }
    }
}

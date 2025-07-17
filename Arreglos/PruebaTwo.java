package Arreglos;
import java.util.Scanner;
//Prueba two de como llenar arreglos (suena como solicitar que se llene dicho arreglo de parte del usuario)
public class PruebaTwo {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); //Scanner que nos ayuda a ingresar datos a la consola
    int nElementos; //Declaracion de la variable de tipo numerico entero

    System.out.print("Digite la cantidad de elementos que desea: "); //Mensaje para el usuario
    nElementos = entrada.nextInt(); //Solicitud al usuario para que dijite dichos valores

    double[] numeros = new double[nElementos]; /*Array de tipo double de nombre numeros el cual tomara el valor dado a la variable
    nElementos para asi construir el array */

    System.out.println("En nuevo leon se bailal la cumbia");

    System.out.println("Dijite los elementos del arreglo");

    for(int i=0; i<nElementos;i++){  /*Bucle de tipo for con in iterador=0 el cual aumentara su valor mientras i<nElementos
        dando a entender que i se detrendra hasta que lea la cantidad de datos que se le pidio a dicho usuario*/
        System.out.print(i+"-. Dijite un numero decimal: ");

        numeros[i] = entrada.nextDouble(); /*Tomando en cuenta los valores que pidio el usuario se dijitaran 
        el array va apedir que dichos numeros sean dijitados para que ocupen un espacio en cada casilla */
    }

    System.out.println("\nLos caracteres del arreglos son:");

    for(int i=0; i<nElementos; i++){ /*bucle for independiente de el anterior el 
        cual auque haga lo mismo, el contenido dentro del bucle es diferente*/
        System.out.print(numeros[i]+" "); //sout que muestra el arreglo 
    }
    entrada.close(); //Cerramos el Scanner para que no haya fuga de datos
}
}


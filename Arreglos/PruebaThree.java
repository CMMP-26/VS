package Arreglos;
//Mejora del bucle for que no es for each
public class PruebaThree {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Ramon", "Ruben", "Julio", "Mariano", "Samuel", "Pepe", "Jhoaquin", "Jovanni"}; //Arreglos

        for(int i=0; i<nombres.length;i++){ /*Nombres.length nos ayuda a llevar la cuenta en caso 
                                            de no saber la cantidad de datos que llevamos */
            System.out.println(nombres[i]); 
        }
    }
}

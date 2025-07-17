package Arreglos;

import java.util.Scanner;

/*Leer 5 numeros  por tecleado, almacenarlos en un arreglo y a continuacion realizar la media de los nùmeros
positivos, negativos y contar los ceros */
public class ExerciseTree {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double [] numeros = new double[5]; //arreglo de tipo double que pide le guardemos 5 arreglos
        int contPos=0, contNeg=0, contCer=0;
        double resPos=0,resNeg=0,mediaPos=0,mediaNeg=0;

        System.out.println("Dijite 5 nùmeros:");

        for(int i=0;i<5;i++){
            System.out.print("Numero "+(i+1)+" :");
            numeros[i] = x.nextDouble();

            if(numeros[i]==0){
                contCer++;
            }else if(numeros[i]>0){
                contPos++;
                resPos+=numeros[i];
            }else{
                contNeg++;
                resNeg+=numeros[i];
            }


        }

        if(contPos==0){
            System.out.println("No se dijito ningun valor de tipo entero");
        }else{
            mediaPos = resPos/contPos;
            System.out.println("La media de los nùmeros positivos es: "+mediaPos);
        }

        if(contNeg==0){
            System.out.println("No se dijito ningun valor negativo");
        }else{
            mediaNeg = resNeg/contNeg;
            System.out.println("La media de los negativos es: "+mediaNeg);
        }

        System.out.println("Ceros dijitados: "+contCer);
        x.close();
    }
    
}

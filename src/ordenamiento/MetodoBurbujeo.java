package ordenamiento;

import java.util.Arrays;

public class MetodoBurbujeo {

    public static void main(String[] args) {

      /* Consigna: dado un arreglo de enteros desordenado, imprimirlo en su orden original, ordenarlo de menor a mayor
         con un algoritmo de burbujeo y volver a imprimir por consola con su nuevo orden  */

        int[] lista = {9,5,4,8,7,3,2,1,6};

        // 1.Mostrar los elementos de la colección desordenada
        System.out.println("Lista desordenada: " + Arrays.toString(lista));


        // 2.Ordenar los elementos de la colección de menor a mayor

       boolean bandera;
       for(int i = 0; i < lista.length-1; i++){
           bandera = false;

           for(int c = 0; c < lista.length-1 -i; c ++){

               if(lista[c] > lista[c+1]){
                   int auxiliar;
                   auxiliar = lista[c];

                 lista[c] = lista[c+1];
                 lista[c+1] = auxiliar;
                 bandera = true;
               }
           }

           if(bandera == false){break;}
       }

        System.out.println("Lista ordenada: " + Arrays.toString(lista));
    }
}

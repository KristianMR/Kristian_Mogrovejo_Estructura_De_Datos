package Modelo;

public class Orden {
    
    //metodo de ordenamiento burbuja
    public static void Burbuja(int[] arreglo){

        //ciclo for para recorrer el arreglo desde la posicion 0 hasta la penultima posicion 
        for(int i = 0; i < arreglo.length -1; i++){
            for(int j = 0; j < arreglo.length -i -1; j++){

                //si el elemento actual es mayor que el siguiente se intercambian los elementos
                if(arreglo[j] > arreglo[j + 1]){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j +1 ] = temp;
                }
            }
        }
    }

    //metodo de ordenamiento secuencial
    public static void Secuencial(int arreglo[]){

        //ciclo for parra recorrer el arreglo desde la posicion 0 hasta la penultima posicion
        for(int i = 0; i < arreglo.length -1; i++){ 
            int menor = i; //se asume que el menor es el primer elemento

            //ciclo for para recorrer el arreglo desde la posicion i + 1 hasta la ultima posicion
            for(int j = i + 1; j < arreglo.length; j++){
                //si el elemento actual es menor que el menor se asigna el valor de j a menor
                if(arreglo[j] < arreglo[menor]){
                    menor = j;
                }
            }
        }
    }

    //metodo de ordenamiento Quicksort
    public static void Quicksort(int[] arreglo, int inicio, int fin){

        if(inicio < fin){
            int indice = particion(arreglo, inicio, fin); //se llama al metodo particion
            Quicksort(arreglo, inicio, indice - 1); //se llama al metodo Quicksort para la parte izquierda
            Quicksort(arreglo, indice + 1, fin); //se llama al metodo Quicksort para la parte derecha
        }
    }

    //metodo de particion
    private static int particion(int[] arreglo, int inicio, int fin){
        int pivote = arreglo[fin]; //se asigna el pivote al ultimo elemento del arreglo
        int i = (inicio - 1); //se inicializa i en -1

        //ciclo for para recorrer el arreglo desde la posicion inicio hasta la posicion fin
        for(int j = inicio; j < fin; j++){

            //si el elemento actual es menor o igual que el pivote se incrementa i y se intercambian los elementos
            if(arreglo[j] <= pivote){
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        //intercambia el pivote con el elemento en la posicion i + 1
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1; //retorna la posicion del pivote
    }
}

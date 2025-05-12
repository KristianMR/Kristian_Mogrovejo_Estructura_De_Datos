package Vista;

import javax.swing.JOptionPane;

public class Vista {
    
    public int mostrarMenu(){
        String menu = "Seleccione el metodo de ordenamiento:\n"
                + "1. Burbuja\n"
                + "2. Secuencial\n"
                + "3. Quicksort\n"
                + "4. Salir";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return opcion;
    }

    //solicitar la cantidad de elementos y los valores del arreglo
    public int[] LeerArreglo(){
        int n = 0; // variable para almacenar la cantidad de elementos

        //solcitar la cantidad de elementos del arreglo
        try{
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglo:"));
        } catch(NumberFormatException e){
            Mensaje("Entrada no valida"); // mensaje de error en caso de que la entrada no sea un numero
            return null;
        }

        //crea el arreglo con la cantidad de elementos solicitada
        int[] arreglo = new int[n];
        //solicita los valores del arreglo
        for(int i = 0; i < n; i++){
            try{
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + (":")));
            }catch(NumberFormatException e){
                Mensaje("Entrada no valida. Se asignó 0 al elemento #" + (i + 1)); // mensaje de error en caso de que la entrada no sea un numero
                arreglo[i] = 0;
            }
        }
        return arreglo;
            
    }

    //muestra el arreglo como un String
    public void mostrarArreglo(int[] arreglo, String titulo) {
        StringBuilder sb = new StringBuilder();
        for (int num : arreglo) {
            sb.append(num).append(" ");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    //mostrar mensaje informativo
    public void Mensaje(String Mensaje){
        JOptionPane.showMessageDialog(null, Mensaje);
    }

}

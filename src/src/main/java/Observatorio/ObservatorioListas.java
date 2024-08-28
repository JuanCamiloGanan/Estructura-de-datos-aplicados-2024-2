package Observatorio;

import java.util.ArrayList;
import java.util.Scanner;

public class ObservatorioListas {
    private ArrayList<Double> temperaturas;

    public ObservatorioListas() {
        temperaturas = new ArrayList<>();
    }
     //Metodo para agregar temperaturas a la lista
    public void agregarTemperatura(double temperatura) {
        temperaturas.add(temperatura);
    }

    //Metodo para obtener la temperatura maxima, minima y promedio
    public void mostrarDatos(){
        if (temperaturas.isEmpty()){
            System.out.println("No hay temperaturas registradas");
            return;
        }

        double max = temperaturas.get(0);
        double min = temperaturas.get(0);
        double suma = 0;

        for (double temp : temperaturas){
            if (temp > max){
                max = temp;
            }
            if (temp < min){
                min = temp;
            }
            suma += temp;
        }

        double promedio = suma / temperaturas.size();

        System.out.println("Temperatura maxima: " + max);
        System.out.println("Temperatura minima: " + min);
        System.out.println("Temperatura promedio: " + promedio);

    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ObservatorioListas temperaturas = new ObservatorioListas();

        System.out.println("Ingrese temperaturas en grados Celsius. Para terminar ingrese fin");

        while (true){
            System.out.println(" Ingrese Temperatura: ");
            String linea = scanner.nextLine();

            if (linea.equals("fin")){
                break;
            }

            try {
                double temp = Double.parseDouble(linea);
                temperaturas.agregarTemperatura(temp);
            } catch (NumberFormatException e){
                System.out.println("Error: Ingrese un numero valido");
            }
        }

        temperaturas.mostrarDatos();
        scanner.close();
    }
}
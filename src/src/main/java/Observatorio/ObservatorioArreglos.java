package Observatorio;

import java.util.Scanner;

public class ObservatorioArreglos {
    private static final int MAX_TEMPERATURAS = 10;
    private double[] temperaturas;
    private int cantidadTemperaturas;

    //Constructor
    public ObservatorioArreglos(){
        temperaturas = new double[MAX_TEMPERATURAS];
        cantidadTemperaturas = 0;
    }

    //Metodo para agregar temperaturas al arreglo
    public void agregarTemperatura(double temperatura){
        if (cantidadTemperaturas < MAX_TEMPERATURAS){
            temperaturas[cantidadTemperaturas] = temperatura;
            cantidadTemperaturas++;
        }

        else{
            System.out.println("El arreglo esta lleno. No se pueden agregar mas temperaturas, ingrse fin para terminar");
        }
    }

    //Metodo para obtener la temperatura maxima, minima y promedio
    public void mostrarDatos(){
        if (cantidadTemperaturas == 0){
            System.out.println("No hay temperaturas registradas");
            return;
        }

        double max = temperaturas[0];
        double min = temperaturas[0];
        double suma = 0;

        for (int i = 0; i < cantidadTemperaturas; i++){
            double temp = temperaturas[i];
            if (temp > max){
                max = temperaturas[i];
            }
            if (temp < min){
                min = temperaturas[i];
            }
            suma += temperaturas[i];
        }

        double promedio = suma / cantidadTemperaturas;

        System.out.println("Temperatura maxima: " + max);
        System.out.println("Temperatura minima: " + min);
        System.out.println("Temperatura promedio: " + promedio);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ObservatorioArreglos temperaturas = new ObservatorioArreglos();

        System.out.println("Ingrese temperaturas en grados Celsius. Para terminar ingrese fin");

        while (true){
            System.out.println("Ingrese Temperatura: ");
            String linea = scanner.nextLine();

            if (linea.equals("fin")){
                break;
            }

            try {
                double temp = Double.parseDouble(linea);
                temperaturas.agregarTemperatura(temp);
            }
            catch (NumberFormatException e){
                System.out.println("Debe ingresar un numero valido");
            }
        }

        temperaturas.mostrarDatos();
        scanner.close();
    }
}

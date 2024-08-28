package Automovil;

public class Automovil {

    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private double nivelGasolina; //En galones
    private boolean motor_encendido;
    private double CAPACIDAD_MAXIMA_TANQUE = 12.0; //En galones

    //Constructor
    public Automovil(String marca, String modelo, String color, int año, double nivelGasolina, boolean motor_encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.nivelGasolina = nivelGasolina = 10.0; //Inicia en 10 galones
        this.motor_encendido = motor_encendido = false;
    }

    //Metodo para encender el motor
    public void encenderMotor(){
        if(motor_encendido){
            motor_encendido = true;
            System.out.println("Motor encendido");
        }
        else{
            System.out.println("Motor ya esta encendido");
        }
    }

    //Metodo para apagar el motor
    public void apagarMotor(){
        if(motor_encendido){
            motor_encendido = false;
            System.out.println("Motor apagado");
        }
        else{
            System.out.println("El motor ya esta apagado");
        }
    }

    //Metodo para acelerar el automovil
    public void acelerar (){
        if (motor_encendido) {
            System.out.println("No se puede acelerar, el motor esta apagado");
        }
        else if (nivelGasolina < 0.1) {
            System.out.println("No se puede acelerar, el tanque esta vacio");
        }
        else {
            nivelGasolina -= 1;
            System.out.println("Acelerando" + nivelGasolina + " galones");
        }
    }

    //Metodo para llenar el tanque de gasolina
    public void recargar (double cantidad){
        if (cantidad <=0){
            System.out.println("La cantidad de gasolina a recargar debe ser mayor a 0");
            return;
        }

        if (nivelGasolina + cantidad > CAPACIDAD_MAXIMA_TANQUE){ //Verifica si la cantidad de gasolina a recargar supera la capacidad maxima del tanque
            double combustible_recargado = CAPACIDAD_MAXIMA_TANQUE - nivelGasolina; //Calcula la cantidad de combustible que se recargara
            nivelGasolina = CAPACIDAD_MAXIMA_TANQUE;
            System.out.println("El tanque esta lleno, se recargaron " + combustible_recargado + " galones");
        }
        else{
            nivelGasolina += cantidad;
            System.out.println("Se recargaron " + cantidad + " galones");
        }
    }

    //Metodo para obtener la informacion del nivel de combustible actual
    public double obtenerNivelGasolina(){
        return nivelGasolina;
    }

    //Metodo para obtener la informacion del automovil
    public String obtenerMarca(){
        return marca;
    }

    public String obtenerModelo(){
        return modelo;
    }

    public String obtenerColor(){
        return color;
    }

    public int obtenerAño(){
        return año;
    }
}

package Automovil;

class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Audi", "2023", "White", 2020, 10.0, false);

        //Informacion del automovil
        System.out.println("Marca: " + automovil.obtenerMarca());
        System.out.println("Modelo: " + automovil.obtenerModelo());
        System.out.println("Color: " + automovil.obtenerColor());
        System.out.println("Año: " + automovil.obtenerAño());
        System.out.println("Nivel de gasolina: " + automovil.obtenerNivelGasolina());

        //Encender el motor
        automovil.encenderMotor();

        //Acelerar el automovil
        automovil.acelerar();

        //Mostrar nivel de gasolina
        System.out.println("Nivel de gasolina: " +  automovil.obtenerNivelGasolina());

        //Recargar gasolina
        automovil.recargar(5.0);

        //Mostrar nivel de gasolina despues de recargar
        System.out.println("Nivel de gasolina: " + automovil.obtenerNivelGasolina());

        //Apagar el motor
        automovil.apagarMotor();
    }
}

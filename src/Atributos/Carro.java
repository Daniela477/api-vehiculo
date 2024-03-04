
package Atributos;
import Interfaz.AccionVehiculo;

/**
 *
 * @author daniela
 */
public class Carro extends Vehiculo implements AccionVehiculo {
  String Fuerzadetraccion;

    public Carro(String marca, String modelo, String placa, int velocidadMaxima, String Fuerzadetraccion) {
        super(marca, modelo, placa, velocidadMaxima);
        this.Fuerzadetraccion = Fuerzadetraccion;
    }

    
  @Override
    public void resultado (){
        System.out.println( "\n---------- RESULTADO EN LA CATEGORIA DE CARROS ---------- \n");
    }
    @Override
    public void acelerar() {
        System.out.println("1. El carro con placa " + marca + " se encuentra acelerando.\n");
    }

    @Override
    public void frenar() {
        System.out.println("2. El carro con placa " + marca + " se encuentra frenado. \n");
    }

    @Override
    public void estacionar() {
        System.out.println("3. El carro con placa " + marca + " se encuentra estacionado. \n");
    }

    @Override
    public void girar() {
        System.out.println("4. El carro con placa " + marca + " se encuentra girando. \n");
    }
}
  


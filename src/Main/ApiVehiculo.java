package Main;

import Interfaz.AccionVehiculo;
import Atributos.*;
import java.util.Scanner;

/**
 *
 * @author daniela
 */
public class ApiVehiculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------CARROS-----------\n" );
        System.out.println("Ingrese los datos del carro \n");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Placa: ");
        String placaCarro = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaCarro = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.print("Fuerza de atracción: ");
        String traccionCarro = scanner.nextLine();

        Carro carro = new Carro(marcaCarro, modeloCarro, placaCarro, velocidadMaximaCarro, traccionCarro);
        System.out.println("\n----------MOTOS-----------\n" );
        System.out.println("\nIngrese los datos de la moto \n");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Placa: ");
        String placaMoto = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaMoto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.print("Cilindraje: ");
        int cilindrajeMoto = scanner.nextInt();
        Moto moto = new Moto(marcaMoto, modeloMoto, placaMoto, velocidadMaximaMoto, cilindrajeMoto);

        realizarPruebaRuta(carro);
        realizarPruebaRuta(moto);

        scanner.close();
    }
        // Método para realizar la prueba de ruta
    public static void realizarPruebaRuta(AccionVehiculo vehiculo) {
        vehiculo.resultado();
        vehiculo.acelerar();
        vehiculo.frenar();
        vehiculo.estacionar();
        vehiculo.girar();
    }
}


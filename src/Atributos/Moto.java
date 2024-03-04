/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos;

import Interfaz.AccionVehiculo;

/**
 *
 * @author daniela
 */
public class Moto extends Vehiculo implements AccionVehiculo {
    int cilindraje;

    public Moto(String marca, String modelo, String placa, int cilindraje, int velocidadMaxima) {
        super(marca, modelo, placa, velocidadMaxima);
        this.cilindraje = cilindraje;
    }
 @Override
    public void resultado (){
        System.out.println( "\n---------- RESULTADO EN LA CATEGORIA DE MOTOS ---------- \n");
    }
    @Override
    public void acelerar() {
        System.out.println("1. La moto con placa  " + marca + " se encuentra acelerando. \n");
    }

    @Override
    public void frenar() {
        System.out.println("2. La moto con placa " + marca + " se encuentra frenada. \n");
    }

    @Override
    public void estacionar() {
        System.out.println("3. La moto con placa  " + marca + " se encuentra estacionada. \n");
    }

    @Override
    public void girar() {
        System.out.println("4. La moto con placa " + marca + " se encuentra girando. \n");
    }
}
  

package com.company;

public class Hilo_Vendedor extends Thread{
    private AlmacenCuadros almacen;
    public Hilo_Vendedor(AlmacenCuadros a){
        almacen=a;
    }

    @Override
    public void run() {
        for (int i = 1; i <30 ; i++) {
            almacen.sacar();
        }
            }
}

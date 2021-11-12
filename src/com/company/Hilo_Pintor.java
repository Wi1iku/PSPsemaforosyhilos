package com.company;

public class Hilo_Pintor extends Thread{
    private AlmacenCuadros almacen;

    public Hilo_Pintor(AlmacenCuadros a){
        almacen=a;
    }
    public void run(){
        for (int i = 1; i <30 ; i++) {
            almacen.guardar();
        }
    }
}

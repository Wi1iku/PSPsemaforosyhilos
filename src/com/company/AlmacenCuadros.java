package com.company;

public class AlmacenCuadros {
    private int cuadros=0;

    public synchronized void guardar(){
        try {


        while (cuadros>0) {
            this.wait();
        }}
        catch (InterruptedException e){e.printStackTrace(); }
            cuadros++;

        System.out.println("Pintando cuadro: "+cuadros);
        this.notify();
        /*System.out.println("Pintando");
        cuadros++;
        System.out.println("Pintando cuadro: "+cuadros);*/

    }

    public synchronized void sacar(){
        /*System.out.println("Vendiendo");
        cuadros--;
        System.out.println("Vendiendo cuadro: "+cuadros);*/
        try {
            while (cuadros==0){
                this.wait();
            }
        }
        catch (InterruptedException e){e.printStackTrace();}
            cuadros--;
        System.out.println("Vendido cuadro: "+cuadros);
        this.notify();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gerald Reyes
 */
public class Television extends Electrodomestico{
    
    protected static final int RESOLUCION_DEF = 20;
    protected static final boolean SINTONIZADOR_DEF = false;
    
    
    protected int resolucion;
    protected boolean sintonizadorTDT;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion=resolucion;
    }

    public Television(int pulgadas, boolean sintonizadorTDT, double precioBase, String color, char consumoElectrico, double peso) {
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }


    public int getResolucion() {
        return resolucion;
    }

     public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal(){
  double precio=super.precioFinal();
  
        //Añadimos el codigo necesario
        if (resolucion>40){
            precio= precio +precioBase*0.3;
        }
        if (sintonizadorTDT==true){
            precio = precio+50;
        }
  
        return precio;
  
  }
    
    
    
}

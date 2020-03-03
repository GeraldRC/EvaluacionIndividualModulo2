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
public class Lavadora extends Electrodomestico{
    
    protected static final  int CARGA_DEF = 5;
    
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(double precioBase,double peso){
         super(precioBase,peso);
         this.carga=CARGA_DEF;
    }


    public Lavadora(int carga, double precioBase, String color, char consumoElectrico, double peso) {
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }
    
    public int getCarga(){
    return carga;
    }
    
    @Override
    public double precioFinal(){
        double extra =super.precioFinal();
        if (carga>30) {
           extra=50;
        }
        
     return extra;
  }
     
    
}

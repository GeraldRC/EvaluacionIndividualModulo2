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
public class Electrodomestico {
    
    
    protected static final  double PRECIO_BASE_DEF = 100000;
    protected static final char CONSUMO_ELEC_DEF =  'F';
    protected static final double PESO = 5;
    protected static final String COLOR_DEF ="blanco";
    
    protected double precioBase;
    protected String color ;
    protected char consumoElectrico;
    protected double peso;

    public Electrodomestico() {
       
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumoElectrico = CONSUMO_ELEC_DEF;
    }

    public Electrodomestico(double precioBase, String color, char consumoElectrico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoElectrico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    
  public boolean comprobarConsumoEnergetico(char letra){
      
      boolean correcto = false;
      char[] letras ={'A','B','C','D','E','F'};
      
      for (int i = 0; i < letras.length; i++) {
          
          if (letras[i] == letra) {
              correcto = true;
          }
          
          if (correcto ==true) {
              this.consumoElectrico= letra;
          }else{
              this.consumoElectrico = CONSUMO_ELEC_DEF;
          }
          
      }
  
      return correcto;
  }   
  
  public boolean comprobarColor(String color){
       
    boolean resultado = false;
      String[] colores= {"blanco","negro","rojo","azul","gris"};
      
      for (int i = 0; i <colores.length; i++) {
          
          if (colores[i].equalsIgnoreCase(color)) {
              resultado = true;
          }
      }
      
      if (resultado==true) {
          this.color=color;   
      }else{
          this.color=COLOR_DEF;
      }
   return false;
  
  }
  
  
  public double precioFinal(){
      double extra =0;
      
      switch (consumoElectrico) {
          case 'A':
              if (peso>=0 && peso<=19) {
                  extra = 110;
              }else if(peso>=20 && peso<=49){
                  extra = 150;
              }else if(peso>=50 && peso<=79){
                  extra = 180;
              }else if (peso>80)
                  extra=200;
              
              break;
          case  'B':
              if (peso>=0 && peso<=19) {
                  extra = 90;
              }else if(peso>=20 && peso<=49){
                  extra = 130;
              }else if(peso>=50 && peso<=79){
                  extra = 160;
              }else if (peso>80)
                  extra=180;
              
              break;
              
          case 'C':
              if (peso>=0 && peso<=19) {
                  extra = 70;
              }else if(peso>=20 && peso<=49){
                  extra = 110;
              }else if(peso>=50 && peso<=79){
                  extra = 150;
              }else if (peso>80)
                  extra=170;
              
              break;
              
          case 'D':
              if (peso>=0 && peso<=19) {
                  extra = 60;
              }else if(peso>=20 && peso<=49){
                  extra = 100;
              }else if(peso>=50 && peso<=79){
                  extra = 130;
              }else if (peso>80)
                  extra=150;
              
              break;
              
          case 'E':
              if (peso>=0 && peso<=19) {
                  extra = 40;
              }else if(peso>=20 && peso<=49){
                  extra = 90;
              }else if(peso>=50 && peso<=79){
                  extra = 110;
              }else if (peso>80)
                  extra=130;
              
              break;
              
          case 'F':
              if (peso>=0 && peso<=19) {
                  extra = 20;
              }else if(peso>=20 && peso<=49){
                  extra = 60;
              }else if(peso>=50 && peso<=79){
                  extra = 90;
              }else if (peso>80)
                  extra=110;
              
              
              break;
        
      }
      
  
  return precioBase+extra;
  }
     
    
}

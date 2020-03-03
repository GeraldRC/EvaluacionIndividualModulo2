
package vista;
import java.util.*;
import modelo.Electrodomestico;
import modelo.Lavadora;
import modelo.Television;
/**
 *
 * @author Gerald Reyes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Electrodomestico listaElectro[]=new Electrodomestico[10];
        
       listaElectro[0]= new Electrodomestico();
       listaElectro[1]= new Television(60,true,200,"verde",'A',80);
       listaElectro[2]= new Lavadora(40,150,"rojo",'F',50);
       listaElectro[3]= new Electrodomestico(100,50);
       listaElectro[4]= new Television(42,false,150,"verde",'D',60);
       listaElectro[5]= new Lavadora(10,150,"rojo",'B',100);
       listaElectro[6]= new Electrodomestico();
       listaElectro[7]= new Lavadora();
       listaElectro[8]= new Television();
       listaElectro[9]= new Electrodomestico(300,"negro",'D',200);
                       
        double sumaElectro=0;
        double sumaTel=0;
        double sumaLav=0;
       
        for (int i = 0; i < listaElectro.length; i++) {
            
            if (listaElectro[i] instanceof Electrodomestico) {
                sumaElectro = sumaElectro+listaElectro[i].precioFinal();
            }
            if (listaElectro[i] instanceof Lavadora) {
                sumaLav = sumaLav+listaElectro[i].precioFinal();
            }
            if (listaElectro[i] instanceof Television) {
                sumaTel = sumaTel+listaElectro[i].precioFinal();
            }
            
        }
        
        
        
        System.out.println("LA SUMA DE PRECIOS DE ELECRTODOMESTICOS ES :"+sumaElectro);
        System.out.println("LA SUMA DE PRECIOS DE LAVADORAS ES :"+sumaLav);
        System.out.println("LA SUMA DE PRECIOS DE TELEVISORES ES :"+sumaTel);
        
    }
    
}

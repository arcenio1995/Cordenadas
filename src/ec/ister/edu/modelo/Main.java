
package ec.ister.edu.modelo;

import ec.ister.edu.vista.Cordenadas;


public class Main {
    
    public static void main(String[] args) {
        
     Cordenadas co1= new Cordenadas( 10,8);
     
     Cordenadas co2 = new Cordenadas(16,4);
        
        
        co2.ingresarDatos();
       
        System.out.println("cordenadas del punto 1 : "+co1.getx());
        System.out.println("cordenada del punto 2 : "+co1.gety());
        System.out.println("cordenadas del punto 1 : "+co2.getx());
        System.out.println("cordenada del punto 2 : "+co2.gety());
        co2.setx(20);
        co2.sety(14);
        
        co2.ingresarDatos();
       
        
        
    }
    
}

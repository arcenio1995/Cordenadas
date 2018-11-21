
package ec.ister.edu.modelo;

import ec.ister.edu.vista.Cordenadas;


public class Main {
    
    public static void main(String[] args) {
        
     Cordenadas co1= new Cordenadas( 10,8);
     
     Cordenadas co2 = new Cordenadas(16,4);
        
        
        co2.ingresarDatos();
       
        System.out.println("cordenadas del punto 1 : "+co1.Getx());
        System.out.println("cordenada del punto 2 : "+co1.Gety());
        System.out.println("cordenadas del punto 1 : "+co2.Getx());
        System.out.println("cordenada del punto 2 : "+co2.Gety());
        co2.Setx(20);
        co2.Sety(14);
        
        co2.ingresarDatos();
       
        
        
    }
    
}

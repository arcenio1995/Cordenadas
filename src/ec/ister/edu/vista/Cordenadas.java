
package ec.ister.edu.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Cordenadas {
    
    int ejex;
    int ejey;
    
    public Cordenadas(int x , int y){
        
        this.ejex = x;
        this.ejey = y;
        
    }
    
    public void ingresarDatos(){
        
        System.out.println("la cordenada del eje x es : "+ejex);
       System.out.println("la cordenada del eje x es : "+ejey); 
       
    }
    
    public int getx(){
        
        return this.ejex;
    }
    public int gety(){
        
        return this.ejey;
    }
    
    public void setx(int x){
        
        this.ejex = x;
    
    }
    
    public void sety(int y){
        
        this.ejey = y;
    
    }
 
    
}

package Programacion.FrecuenciaCardiaca;

/**
 *
 * @author LI141
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaFrecuenciaCardiaca {
    
    
    public static  void main (String [] args){
        FrecuenciaCardiaca miCardio = new FrecuenciaCardiaca("Gustavo","Castillejos","07","07",2003,50,150,200);
        
        System.out.printf("Tu nombre es: "+miCardio.getNombre()+" "+miCardio.getApellido()+"Tu edad es: "+ miCardio.getEdad()+"Tu Frecuencia maxima es: "+ miCardio.getFrecuenciaMax()+ 
                "Tu Frecuencia esperada es: "+ miCardio.getFrecuenciaEsp());
       
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        miCardio.setNombre(nombre);
        
        String apellido = JOptionPane.showInputDialog("Escribe tu apellido");
        miCardio.setApellido(apellido);
        
  
        String dia = JOptionPane.showInputDialog("Escribe el dia de tu nacimiento");
        miCardio.setDia(dia);
        
         
        String mes = JOptionPane.showInputDialog("Escribe el mes de tu nacimiento");       
        miCardio.setMes(mes);
        
        
        String anio = JOptionPane.showInputDialog("Escribe tu año de nacimiento: ");
        int ani = Integer.parseInt(anio);
        miCardio.setAnio(ani);
        
        miCardio.setEdad(ani);
        miCardio.setFrecuenciaMax(miCardio.getEdad());
        miCardio.setFrecuenciaEsp(miCardio.getFrecuenciaMax());
        
        JOptionPane.showMessageDialog(null,"Tu nombre es: "+ miCardio.getNombre()+ " " + miCardio.getApellido()
        + "Tu edad es: " + miCardio.getEdad() + "Tu Frecuencia Maxima es: " +miCardio.getFrecuenciaMax() +
                "Tu frecuencia esperada es: " + miCardio.getFrecuenciaEsp());
        
        
                
    }
}

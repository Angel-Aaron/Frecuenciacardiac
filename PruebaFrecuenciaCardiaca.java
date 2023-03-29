package Programacion.FrecuenciaCardiaca;

/**
 *
 * @author LI141
 */
import java.util.Scanner;


public class PruebaFrecuenciaCardiaca {
    public static  void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        FrecuenciaCardiaca miCardio = new FrecuenciaCardiaca("Gustavo","Castillejos",07,07,2003,50,150,200);
        
        System.out.print("Escribe tu nombre: ");
        miCardio.getNombre();
        miCardio.getApellido();
        miCardio.getEdad();
        miCardio.getDia();
        miCardio.getMes();
        miCardio.getAnio();
        miCardio.getFrecuenciaMax();
        miCardio.getFrecuenciaEsp();
        
        System.out.printf("Tu nombre es: "+miCardio.getNombre()+" "+miCardio.getApellido()+"Tu edad es: "+ miCardio.getEdad()+"Tu Frecuencia maxima es: "+ miCardio.getFrecuenciaMax()+ 
                "Tu Frecuencia esperada es: "+ miCardio.getFrecuenciaEsp());
                
    }
}

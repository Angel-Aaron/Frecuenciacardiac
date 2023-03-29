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
        
        System.out.printf("Tu nombre es: "+miCardio.getNombre()+" "+miCardio.getApellido()+"Tu edad es: "+ miCardio.getEdad()+"Tu Frecuencia maxima es: "+ miCardio.getFrecuenciaMax()+ 
                "Tu Frecuencia esperada es: "+ miCardio.getFrecuenciaEsp());
        
        System.out.println("Escribe tu nombre: ");
        String nombre = entrada.nextLine();
        miCardio.setNombre(nombre);
        
        System.out.println("Escribe tu apellido: ");
        String apellido = entrada.nextLine();
        miCardio.setApellido(apellido);
        
        System.out.println("Escribe tu dia de nacimiento: ");
        int dia = entrada.nextInt();
        miCardio.setDia(dia);
        
           System.out.println("Escribe tu mes de nacimiento: ");
        int mes = entrada.nextInt();
        miCardio.setMes(mes);
        
           System.out.println("Escribe tu año de nacimiento: ");
        int anio = entrada.nextInt();
        miCardio.setAnio(anio);
        
        miCardio.setEdad(anio);
        miCardio.setFrecuenciaMax(miCardio.getEdad());
        miCardio.setFrecuenciaEsp(miCardio.getFrecuenciaMax());
        
        System.out.println("Tu nombre es: "+ miCardio.getNombre()+ " " + miCardio.getApellido()
        + "Tu edad es: " + miCardio.getEdad() + "Tu Frecuencia Maxima es: " +miCardio.getFrecuenciaMax() +
                "Tu frecuencia esperada es: " + miCardio.getFrecuenciaEsp());
        
        
                
    }
}

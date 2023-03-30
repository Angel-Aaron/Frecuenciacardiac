
package librocalificaciones;


public class LibroCalificaciones {

	String nomCurso;
	String nomProfesor;
	
	public LibroCalificaciones() 
	{
		
	}
	
	public LibroCalificaciones( String nombre, String nomProf ) 
	{
		nomCurso = nombre;
		nomProfesor = nomProf;
	}
	
	public void setNombreCurso( String nombre ) 
	{
		nomCurso = nombre;
	}
	
	public void setNombreProfesor( String nomProf ) 
	{
		nomProfesor = nomProf;
	}
	
	public String getNombreCurso() 
	{
		return nomCurso;
	}
	
	public String getNombreProfesor() 
	{
		return nomProfesor;
	}
	public void mostrarMensaje() 
	{		
		System.out.printf("%s %s\n","Bienvenido al Libro de Calificaciones para",getNombreCurso());
		System.out.printf("\n%s %s","Este curso es presntado por: ",nomProfesor);
		
	}
}
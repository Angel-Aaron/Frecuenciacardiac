/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

public class Empleado {

	String nombre;
	String apellido;
	double salario;
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		if ( salario >= 0.0 ) 
		{
			this.salario = salario;
		}
		
	}
	
	public Empleado() {
		
	}
	
	public Empleado( String n, String a, double s ) 
	{
		nombre = n;
		apellido = a;
		salario = s;
	}
	
	public double SueldoAnual() 
	{
		return salario * 12;
	}
	
	public double NuevoSueldo() 
	{
		return (salario + (salario *0.1)) * 12;
	}
	
}

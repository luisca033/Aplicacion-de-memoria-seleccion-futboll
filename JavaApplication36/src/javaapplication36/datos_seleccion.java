/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

/**
 *
 * @author Luis
 */
public class datos_seleccion {
    
   protected int id;
   protected String Nombre;
   protected String Apellidos;
   protected int Edad;
   protected String Cargo;

     public datos_seleccion(int id, String nombre, String apellidos, int edad,String cargo) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
                this.Cargo=cargo;
	}

    datos_seleccion(String Cargo, int ID, String Nombre, String Apellido, int Edad) {
       this.id = ID;
		this.Nombre = Nombre;
		this.Apellidos = Apellido;
		this.Edad = Edad;
    }
    public String getNombre()
    {
        return this.Nombre;
    }
    
    public String getApellidos()
    {
        return this.Apellidos;
    }
    public String getedad()
    {
    String edad=String.valueOf(this.Edad);
    return edad;
    }
    
    public String getid()
    {
    String id=String.valueOf(this.id);
    return id;
    }    
    public String getcar()
    {
    String car=String.valueOf(this.Cargo);
    return car;
    } 
   
}



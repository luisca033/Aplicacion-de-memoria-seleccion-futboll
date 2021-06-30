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
public class entrenador extends datos_seleccion
{
     //private String idFederacion;
    private int dorsal;
    
   public entrenador(String Cargo, int ID, String Nombre, String Apellido, int Edad,int dor) {
        super(Cargo, ID, Nombre, Apellido, Edad);
         this.id = ID;
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Edad = Edad;
                this.Cargo=Cargo;
                this.dorsal=dor;
    }

   
    
}

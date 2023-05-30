package modelo;

import java.util.ArrayList;

public class Empleado extends  Persona {
	
	//ENUM
	public enum Cargo{
	   GERENTE, DIRECTOR, RECEPCIONISTA, AUXILIAR, SEGURIDAD
   /**todos los cargos que `puede tener un empleado en un hotel */
   };

   ////////////////////////////////////////////////////////////////
   
   // ATRIBUTOS
   public Cargo cargo;
  private ArrayList<Factura>lstFactura;
   //REFERENCIAS
   
   private Hotel hotelref;
   
   public Empleado(){
	   this.lstFactura = new ArrayList<Factura>();
	     
   }
   
	//METODOS

	public void empleado() {
	
}
	 
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Cargo getCargo() {
		return cargo;
	}
	 
	

}

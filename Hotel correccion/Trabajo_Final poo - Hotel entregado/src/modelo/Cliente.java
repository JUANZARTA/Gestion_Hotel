package modelo;

import java.util.ArrayList;

/**
 * 
 */

/**
 * @param <refHotelCliente>
 * 
 *
 */
public class Cliente extends Persona{

	//ATRIBUTOS
	private String nacionalidad;
	private String nombre_emp;
	private Cliente refHotelCliente ;
	private ArrayList<Factura> lstFactura;
	
	
public  Cliente() {
		this.lstFactura = new ArrayList<Factura>();
}
	//GETTERS ANS SETTERS
	
	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre_emp() {
		return nombre_emp;
	}

	public void setNombre_emp(String nombre_emp) {
		this.nombre_emp = nombre_emp;
	}

	public Cliente getRefHotelCliente() {
		return refHotelCliente;
	}

	public void setRefHotelCliente(Cliente refHotelCliente) {
		this.refHotelCliente = refHotelCliente;
	}

	public ArrayList<Factura> getLstFactura() {
		return lstFactura;
	}

	public void setLstFactura(ArrayList<Factura> lstFactura) {
		this.lstFactura = lstFactura;
	}

	//METODOS
	public void Cliente() {
		
	}
}

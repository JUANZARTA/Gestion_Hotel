package modelo;
import java.util.ArrayList;

import modelo.Factura.medio_pago;

/**
	 * 
	 */

	/**
	 * @author Personal
	 *
	 */
public class Hotel {
	
	/**public void agregarEmpleado(enum Cargo){
		Empleado objEmpleado = new Empleado(Cargo);
	}*/
	
	//ATRIBUTOS
	private String nombre;
	private String direccion;
	private String email;
	private int telefono;
	private float ruc;
	private ArrayList<Empleado> lstEmpleado;
	private ArrayList<Cliente> lstCliente;
	private ArrayList<Factura> lstFactura;
	
	public Hotel(){
		this.lstCliente = new ArrayList<Cliente>();
		this.lstEmpleado = new ArrayList<Empleado>();
		this.lstFactura = new ArrayList<Factura>();
	}
	
	
	//GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public float getRuc() {
		return ruc;
	}


	public void setRuc(float ruc) {
		this.ruc = ruc;
	}


	public ArrayList<Empleado> getLstEmpleado() {
		return lstEmpleado;
	}


	public void setLstEmpleado(ArrayList<Empleado> lstEmpleado) {
		this.lstEmpleado = lstEmpleado;
	}


	public ArrayList<Cliente> getLstCliente() {
		return lstCliente;
	}


	public void setLstCliente(ArrayList<Cliente> lstCliente) {
		this.lstCliente = lstCliente;
	}


	public ArrayList<Factura> getLstFactura() {
		return lstFactura;
	}


	public void setLstFactura(ArrayList<Factura> lstFactura) {
		this.lstFactura = lstFactura;
	}


	public void agregar_cliente (Cliente perAuxiliar) {
		Cliente.add(perAuxiliar);
	}
		
	//METODOS
	public void crear_factura(int identificador, int numero_folio, String fecha_autorizacion,  String fecha_caducidad, medio_pago tipoMedio, float neto, float iva, float descuento,  float subTotal,  float total,  String nombre){
	 
		Factura objFactura = new Factura(identificador, numero_folio,  fecha_autorizacion,   fecha_caducidad, tipoMedio,  neto,  iva, descuento, subTotal,  total,   nombre);
	}
    public void Crear_empleado(Empleado perAxuiliar){}
      //  Empleado.add(perAuxiliar);
    public void Hotel(){}
	}

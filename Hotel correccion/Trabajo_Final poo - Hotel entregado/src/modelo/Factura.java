package modelo;

import java.util.List;
import java.util.ArrayList;

import modelo.Factura.medio_pago;

public class Factura {

	private Cliente clienteref;
	////////////////////////////////////////////////////////////////
	public enum medio_pago{
		  DIRENO_ELECTRONICO, EFECTIVO, TARJETA, OTROS
	   /**todos los medios de pago*/
	   };

	 //ATRIBUTOS
		private int identificador;
		private int numero_folio;
		private String fecha_autorizacion;
		private String fecha_caducidad;
		private medio_pago tipoMedio;
		private float neto;
		private float iva;
		private float descuento;
		private float subTotal;
		private float total;
		private String nombre;
		private Fecha refFechaFact;
		private Cliente refClienteFact;
		private Empleado refEmpleadoFact;
		private Hotel refHOtelFact;
		
		private ArrayList<Item> lstItem;
	
	/////////////////////////////////////////////////
	
	private List<Empleado> empleadolist;
	
	
	public Factura(){
		this.empleadolist = new ArrayList<Empleado>();
		//this.lstItem = new ArrayList<Item>();
	}
	//GETTERS AND SETTERS
		
	public Cliente getClienteref() {
		return clienteref;
	}
	public void setClienteref(Cliente clienteref) {
		this.clienteref = clienteref;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getNumero_folio() {
		return numero_folio;
	}
	public void setNumero_folio(int numero_folio) {
		this.numero_folio = numero_folio;
	}
	public String getFecha_autorizacion() {
		return fecha_autorizacion;
	}
	public void setFecha_autorizacion(String fecha_autorizacion) {
		this.fecha_autorizacion = fecha_autorizacion;
	}
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	public medio_pago getTipoMedio() {
		return tipoMedio;
	}
	public void setTipoMedio(medio_pago tipoMedio) {
		this.tipoMedio = tipoMedio;
	}
	public float getNeto() {
		return neto;
	}
	public void setNeto(float neto) {
		this.neto = neto;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getRefFechaFact() {
		return refFechaFact;
	}
	public void setRefFechaFact(Fecha refFechaFact) {
		this.refFechaFact = refFechaFact;
	}
	public Cliente getRefClienteFact() {
		return refClienteFact;
	}
	public void setRefClienteFact(Cliente refClienteFact) {
		this.refClienteFact = refClienteFact;
	}
	public Empleado getRefEmpleadoFact() {
		return refEmpleadoFact;
	}
	public void setRefEmpleadoFact(Empleado refEmpleadoFact) {
		this.refEmpleadoFact = refEmpleadoFact;
	}
	public Hotel getRefHOtelFact() {
		return refHOtelFact;
	}
	public void setRefHOtelFact(Hotel refHOtelFact) {
		this.refHOtelFact = refHOtelFact;
	}
	public ArrayList<Item> getLstItem() {
		return lstItem;
	}
	public void setLstItem(ArrayList<Item> lstItem) {
		this.lstItem = lstItem;
	}
	public List<Empleado> getEmpleadolist() {
		return empleadolist;
	}
	public void setEmpleadolist(List<Empleado> empleadolist) {
		this.empleadolist = empleadolist;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Factura(int identificador2, int numero_folio2, String fecha_autorizacion2, String fecha_caducidad2,
			medio_pago tipoMedio2, float neto2, float iva2, float descuento2, float subTotal2, float total2,
			String nombre2) {

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		// TODO Auto-generated constructor stub
	}
	public void agregarItem( String nombre, int cantidad, float precio, int fecha, String habitacion, int pu, int SubTotal) {
	
		Item objItem = new Item(nombre, cantidad, precio,  fecha,  habitacion, pu,  SubTotal);
	}
	public void agregarFecha(  int fechaIngreso,  int fechaSalida,  int fechaEmision) {
		
		Item objItem = new Item(fechaIngreso, fechaSalida,fechaEmision);
	}
		
	


	
	
//METODOS
	
	public void crear_fecha() {
		
	}
	public void crear_item() {
		
	}
	
	
	
}

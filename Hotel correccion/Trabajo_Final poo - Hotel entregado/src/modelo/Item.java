package modelo;
/**
 * 
 */

/**
 * @param <Factura>
 * 
 *
 */
//ATRIBUTOS
public class Item {
	private String fecha;
	private String detalle;
	private int cantidad;
	private float precio_unitario;
	private Factura refFacturaItem;
	
	//GETTERS AND SETTERS
	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public float getPrecio_unitario() {
		return precio_unitario;
	}


	public void setPrecio_unitario(float precio_unitario) {
		this.precio_unitario = precio_unitario;
	}


	public Factura getRefFacturaItem() {
		return refFacturaItem;
	}


	public void setRefFacturaItem(Factura refFacturaItem) {
		this.refFacturaItem = refFacturaItem;
	}

	//METODOS
	public Item(String nombre2, int cantidad2, float precio2, int fecha2, String habitacion2, int pu2, int subTotal2) {
		// TODO Auto-generated constructor stub
	}


	public Item(int fechaIngreso, int fechaSalida, int fechaEmision) {
		// TODO Auto-generated constructor stub
	}


	public void item(){
		
	}
}

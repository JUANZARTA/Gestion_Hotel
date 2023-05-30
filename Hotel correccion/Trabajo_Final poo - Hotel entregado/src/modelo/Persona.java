package modelo;
/**
 * 
 */

/**
 * @author Personal
 *
 */
public abstract class Persona {


	
	//ATRIBUTOS
	
	private String nombre;
	private int identificacion;
	private int telefono;
	private String direccion;
	
	//GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdentificcion() {
		return identificacion;
	}

	public void setIdentificcion(int identificcion) {
		this.identificacion = identificcion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//METODOS
	public void persona() {
		
	}

	public static void add(Persona perAuxiliar) {
		// TODO Auto-generated method stub
		
	}
	
	
}

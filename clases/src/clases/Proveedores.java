package clases;

public class Proveedores {
	
	private String nombre;
	private int telef;
	private String direccion;
	
	
	public Proveedores (String nombre, int telef, String direccion){
		this.direccion=direccion;
		this.nombre=nombre;
		this.telef=telef;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTelef() {
		return telef;
	}


	public void setTelef(int telef) {
		this.telef = telef;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Proveedores [nombre=" + nombre + ", telef=" + telef + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
	
	

}

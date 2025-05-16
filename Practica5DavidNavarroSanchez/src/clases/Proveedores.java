package clases;

import java.util.ArrayList;

public class Proveedores {
	
	private String nombre;
	private int telef;
	private String direccion;
    protected ArrayList<Producto> listaProductos; 

	
	
	public Proveedores (String nombre, int telef, String direccion){
		this.direccion=direccion;
		this.nombre=nombre;
		this.telef=telef;
		this.listaProductos = new ArrayList<Producto>();
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
	
	


	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	@Override
	public String toString() {
		return "Proveedores [nombre:" + nombre + ", telef:" + telef + ", direccion:" + direccion + " productos: "+ listaProductos + "]";
	}


	
	
	
	
	
	
	

}



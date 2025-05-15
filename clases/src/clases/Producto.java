package clases;


public abstract class Producto {
	private String nombre;
	private double precio;
	private String marca;
	private Proveedores proveedor;
	
	
	
	public Producto(String nombre, double precio, String marca, Proveedores proveedor) {
		this.marca=marca;
		this.nombre=nombre;
		this.precio=precio;
		this.proveedor=proveedor;
	}
	
	
		
	
	
	/**
	 * Indica si el producto tiene descuento.
	 * Se considera que los productos con precio superior a 10€
	 * deben recibir un descuento.
	 *
	 * return true si el precio es mayor de 10, false en caso contrario
	 */	
	public boolean tieneDescuento() {
		if (precio > 10){
			return true;
			
		}
	    return false;
	}

	

	//metodo abstracto que deberan todas las subclases
	
	public abstract boolean esPremium();
	
	







	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public Proveedores getProveedor() {
		return proveedor;
	}



	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}







	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", fechaIngreso="
				 + ", proveedor=" + proveedor + "]";
	}



	
	 

}

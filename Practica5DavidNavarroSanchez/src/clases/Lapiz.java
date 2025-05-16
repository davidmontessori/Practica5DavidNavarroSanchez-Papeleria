package clases;

public class Lapiz extends Producto{
	
	private String tipoMina;
	private String dureza;
	
	
	public Lapiz (String nombre, double precio, String marca, Proveedores proveedor, String tipoMina, String dureza) {
		super(nombre, precio, marca, proveedor);
		this.dureza=dureza;
		this.tipoMina=tipoMina;
		
	}
	
	/**
	 * 
	 * Metodo String que devuelve el tipo de trazado que tiene el lapiz, según la dureza establecida.
	 * En caso de no incluir una dureza correcta, el metodo delvera "Tipo de trazado no valido"
	 * 
	 * @return descripcion del tipo de trazado de la mina según la dureza establecida
	 */

	public String tipoTrazo() {
	    if (dureza.equalsIgnoreCase("HB") || dureza.equalsIgnoreCase("H")) {
	        return "Trazo suave";
	    } else if (dureza.equalsIgnoreCase("2B") || dureza.equalsIgnoreCase("B")) {
	        return "Trazo oscuro";
	    } else {
	        return "Tipo de trazo no valido";
	    }
	}
	
	
	@Override
	public boolean esPremium() {
		if(this.tipoMina.equalsIgnoreCase("artistico") && 
				this.getPrecio() >= 4) {
			return true;
			
		}
		
		else {
			return false;

		}
	}


	public String getTipoMina() {
		return tipoMina;
	}


	public void setTipoMina(String tipoMina) {
		this.tipoMina = tipoMina;
	}


	public String getDureza() {
		return dureza;
	}


	public void setDureza(String dureza) {
		this.dureza = dureza;
	}


	@Override
	public String toString() {
		return super.toString() + "Lapiz [tipoMina=" + tipoMina + ", dureza=" + dureza + "]";
	}
	
	
	


}

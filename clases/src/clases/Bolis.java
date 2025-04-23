package clases;

public class Bolis extends Producto{
	
	private boolean borrable;
	private String color;
	private String tipoTinta;
	
	
	public Bolis (String nombre, double precio, String marca, Proveedores proveedor, boolean borrable, String color, String tipoTinta) {
		super(nombre, precio, marca,proveedor);
		this.borrable=borrable;
		this.color=color;
		this.tipoTinta=tipoTinta;
	}


	public boolean isBorrable() {
		return borrable;
	}


	public void setBorrable(boolean borrable) {
		this.borrable = borrable;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTipoTinta() {
		return tipoTinta;
	}


	public void setTipoTinta(String tipoTinta) {
		this.tipoTinta = tipoTinta;
	}


	@Override
	public String toString() {
		return "Bolis [borrable=" + borrable + ", color=" + color + ", tipoTinta=" + tipoTinta + "]";
	}
	
	
	
	
	
	
}


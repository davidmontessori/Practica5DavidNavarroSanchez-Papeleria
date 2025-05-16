package clases;

import colores.Colores;

public class Bolis extends Producto {

	private boolean borrable;
	private Colores color;
	private String tipoTinta;	

	public Bolis(String nombre, double precio, String marca, Proveedores proveedor, boolean borrable, Colores color,
			String tipoTinta) {
		super(nombre, precio, marca, proveedor);
		this.borrable = borrable;
		this.color = color;
		this.tipoTinta = tipoTinta;
	}

	public String tipoEscritura() {
		if (borrable) {
			return "Escritura borrable con tinta de tipo" + tipoTinta;
		} else {
			return "Escritura permanente con tinta de tipo " + tipoTinta;
		}
	}

	/**
	 * Sobreescribimos el metodo getPrecio de la clase Producto. Los bolis tendrán
	 * un descuento del 10%, por lo que multiplicamos por 0.90 para quedarnos con el
	 * 90% del valor.
	 * @return precio con el descuento aplicado
	 */
	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.90;
	}

	@Override
	public boolean esPremium() {
		if (this.tipoTinta.equalsIgnoreCase("gel") && this.getPrecio() >= 1) {
			return true;

		}

		else {
			return false;

		}
	}

	public boolean isBorrable() {
		return borrable;
	}

	public void setBorrable(boolean borrable) {
		this.borrable = borrable;
	}


	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
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
		return super.toString()+"Bolis [borrable=" + borrable + ", color=" + color + ", tipoTinta=" + tipoTinta + "]";
	}


	

}



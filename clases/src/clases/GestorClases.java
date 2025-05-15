package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorClases {

	private ArrayList<Empleado> listaEmpleados;
	private ArrayList<Producto> listaProductos;
	private ArrayList<Proveedores> listaProveedores;

	public GestorClases() {
		listaEmpleados = new ArrayList<Empleado>();
		listaProductos = new ArrayList<Producto>();
		listaProveedores = new ArrayList<Proveedores>();

	}

	// alta productos

	/**
	 * Metodo que nos servirá para dar de alta un objeto de una clase recibe todos
	 * los paremetros que tenga el constructor de esa clase
	 * 
	 * @param nombre
	 * @param precio
	 * @param marca
	 * @param proveedor
	 * @param borrable
	 * @param color
	 * @param tipoTinta
	 */

	public void altaProducto(String nombre, double precio, String marca, Proveedores proveedor, boolean borrable,
			String color, String tipoTinta) {
		try {

			Bolis nuevoBoli = new Bolis(nombre, precio, marca, proveedor, borrable, color, tipoTinta);
			listaProductos.add(nuevoBoli);

		} catch (Exception e) {
			System.out.println("Error al crear un nuevo boli");
		}

	}

	public void altaProducto(String nombre, double precio, String marca, Proveedores proveedor, String tipoMina,
			String dureza) {

		try {
			listaProductos.add(new Lapiz(nombre, precio, marca, proveedor, tipoMina, dureza));
		} catch (Exception e) {
			System.out.println("Error al crear nuevo lapiz");

		}
	}

	public void altaEmpleado(String nombre, String puesto, double salario, String inicioContrato) {

		try {
			Empleado nuevoEmpleado = new Empleado(nombre, puesto, salario, inicioContrato);
			/**
			 * Para establecer un valor en inicioContrato, debemos inroducir la fecha en una
			 * variable String. Parseamos la varibale String que contiene la fecha a un
			 * LocalDate
			 */
			nuevoEmpleado.setInicioContrato(LocalDate.parse(inicioContrato));
			listaEmpleados.add(nuevoEmpleado);

		} catch (Exception e) {
			System.out.println("Error al crear nuevo empleado");
		}

	}

	public void altaProveedor(String nombre, int telef, String direccion) {
		try {

			Proveedores nuevoProveedor = new Proveedores(nombre, telef, direccion);
			listaProveedores.add(nuevoProveedor);
		} catch (Exception e) {
			System.out.println("Error al crear nuevo proveedor");
		}
	}

	// lista

	/**
	 * Metodo listar que nos devolverá por pantalla todos los objetos de una lista
	 * 
	 */
	public void listarEmpleados() {
		try {

			for (Empleado empleados : listaEmpleados) {
				if (empleados != null) {
					System.out.println(empleados);
				}
			}
		} catch (Exception e) {
			System.out.println("Error al mostrar la lista de empleados");
		}

	}

	public void listarProductos() {
		try {

			for (Producto productos : listaProductos) {
				if (productos != null) {
					System.out.println(productos);
				}
			}
		} catch (Exception e) {
			System.out.println("Error al mostrar la lista de productos");
		}
	}

	public void listarProveedores() {
		try {

			for (Proveedores proveedores : listaProveedores) {
				if (proveedores != null) {
					System.out.println(proveedores);
				}
			}

		} catch (Exception e) {
			System.out.println("Error al mostrar la lista de proveedores");
		}
	}

	// buscar

	/**
	 * metodo buscar que nos sirve para buscar un objeto concreto dentro de una
	 * lista
	 * 
	 * @param parametros que permitan diferenciar un elemento de otros dentro de la
	 *                   misma lista
	 * 
	 * @return devolvera el objeto que cumpla con los parametros dados, de otra
	 *         forma devolverá null
	 */

	public Empleado buscarEmpleado(String nombre) {
		try {
			
		
		for (Empleado empleados : listaEmpleados) {
			if (empleados != null && empleados.getNombre().equalsIgnoreCase(nombre)) {
				return empleados;
			}
		}
	} catch (Exception e) {
		System.out.println("Error al buscar empleado");
	}
		return null;

	}

	public Producto buscarProducto(String nombre, String marca) {
		try {
			
		for (Producto productos : listaProductos) {
			if (productos != null && productos.getNombre().equalsIgnoreCase(nombre)
					&& productos.getMarca().equalsIgnoreCase(marca)) {
				return productos;
			}
		}
		
	} catch(Exception e) {
		System.out.println("Error al buscar producto");
	}
		return null;
	}
	
	

	public Proveedores buscarProveedor(int telef) {
		try {
			
		for (Proveedores proveedor : listaProveedores) {
			if (proveedor != null && proveedor.getTelef() == telef) {
				return proveedor;
			}
		}
		
		} catch(Exception e) {
			System.out.println("Error al buscar proveedor");
		}
	

		return null;

	}

	// eliminar

	/**
	 * Metodo que emplea iterator para la eliminacion de un elemento de una lista
	 * 
	 * @param parametros que permitan diferenciar un elemento de otros dentro de la
	 *                   misma lista
	 */

	public void eliminarEmpleado(String nombre) {
		try {
			
		
		Iterator<Empleado> iteradorEmpleado = listaEmpleados.iterator();
		while (iteradorEmpleado.hasNext()) {
			Empleado empleado = iteradorEmpleado.next();
			if (empleado.getNombre().equalsIgnoreCase(nombre)) {
				iteradorEmpleado.remove();
			}
		}
	}
		catch (Exception e) {
			System.out.println("Error al eliminar empleado");
		}
	}

	public void elminarProducto(String nombre, String marca) {
		try {
			
		
		Iterator<Producto> iteratorProducto = listaProductos.iterator();
		while (iteratorProducto.hasNext()) {
			Producto producto = iteratorProducto.next();
			if (producto.getNombre().equalsIgnoreCase(nombre) && producto.getMarca().equalsIgnoreCase(marca)) {
				iteratorProducto.remove();
			}
		}

	} catch (Exception e) {
		System.out.println("Error al eliminar producto");
	}
	}

	public void eliminarProveedor(int telefono) {
		try {
		Iterator<Proveedores> iteratorProveedor = listaProveedores.iterator();
		while (iteratorProveedor.hasNext()) {
			Proveedores proveedor = iteratorProveedor.next();
			if (proveedor.getTelef() == telefono) {
				iteratorProveedor.remove();
			}
		}
	}
	catch(Exception e) {
		System.out.println("Error al eliminar proveedor");
	}
	}

	/**
	 * Metodo que introduce un producto a listaProductos solo si existe el proveedor
	 * dado para ese producto Al ser una herencia, debemos, con un mismo metodo,
	 * crear una instancia para las subclases de la clase padre Producto
	 * 
	 * @param nombreProducto  el nombre producto
	 * @param marcaProducto   el nombre de la marca
	 * @param nombreProveedor el nombre del proveedor
	 */

	// insertar un producto en un proveedor

	public void introducirProductoProveedor(String nombreProducto, String marcaProducto, String nombreProveedor) {
		try {
			
		
		if (existeProducto(nombreProducto, marcaProducto)) {
			if (existeProveedor(nombreProveedor)) {
				devuelveProveedor(nombreProveedor).listaProductos.add(devuelveProducto(nombreProducto, marcaProducto));
			} else {
				System.out.println("El proveedor no existe");
			}
		} else {
			System.out.println("El producto no existe");
		}
		
		} catch (Exception e) {
			System.out.println("Error al introducir el producto en un proveedor");
		}
	}

	// crear un producto solo si existe un proveedor

	public void crearProductoProveedor(String nombreProducto, double precio, String marcaProducto,
			String nombreProveedor, boolean borrable, String color, String tipoTinta) {
		
		try {
			
		
		if (existeProveedor(nombreProveedor)) {
			listaProductos.add(new Bolis(nombreProducto, precio, marcaProducto, devuelveProveedor(nombreProveedor),
					borrable, color, tipoTinta));
		} else {
			System.out.println("El proveedor no existe");
		}
		
		} catch(Exception e) {
			System.out.println("Error al crear boli, solo si existe el proveedor");
		}
	}

	public void crearProductoProveedor(String nombreProducto, double precio, String marcaProducto,
			String nombreProveedor, String tipoMina, String dureza) {
		try {
			
		
		if (existeProveedor(nombreProveedor)) {
			listaProductos.add(new Lapiz(nombreProducto, precio, marcaProducto, devuelveProveedor(nombreProveedor),
					tipoMina, dureza));
		} else {
			System.out.println("El proveedor no existe");
		}
		} catch(Exception e) {
			System.out.println("Error al crear lapiz, solo si existe proveedor");
		}
	}

	// existe

	/**
	 * metodo existeProducto que se usa para verificar si un producto está en
	 * listaProductos.
	 * 
	 * Parametros nombre y marca para mayor especificación
	 * 
	 * @param nombre
	 * @param marca
	 * @return true en caso de existir. false en caso contrario
	 */

	public boolean existeProducto(String nombre, String marca) {
		try {
			
		
		for (Producto productos : listaProductos) {
			if (productos.getNombre().equalsIgnoreCase(nombre) && (productos.getMarca().equalsIgnoreCase(marca))) {
				return true;

			}
		}
		
		} catch (Exception e) {
			System.out.println("error en verificar si existe el producto");
		}

		return false;

	}

	public boolean existeProveedor(String nombre) { 
		try {
			
		
		for (Proveedores proveedor : listaProveedores) {
			if (proveedor.getNombre().equalsIgnoreCase(nombre)) {
				return true;

			}
		}
		} catch(Exception e) {
			System.out.println("Error al verificar si existe el proveedor");
		}

		return false;

	}

	// devuelve

	/**
	 * metodo devuelveProducto que busca un producto en el ArrayList listaProductos
	 * en caso de encontarlo, el metodo devuelve el objeto con todos sus atributos.
	 * en caso contrario, devuelve null.
	 * 
	 * Parametros nombre y marca para mayor especificacion a la hora de buscar el
	 * producto.
	 * 
	 * @param nombre
	 * @param marca
	 * @return producto, en caso de encontrarlo. null si no hay ningun objeto en el
	 *         ArrayList que coincida con los parametros dados.
	 */

	public Producto devuelveProducto(String nombre, String marca) {
		try {
			
		
		for (Producto producto : listaProductos) {
			if (producto.getNombre().equalsIgnoreCase(nombre) && producto.getMarca().equalsIgnoreCase(marca)) {
				return producto;
			}
		}
		} catch(Exception e) {
			System.out.println("Error al devolver el producto");
		}

		return null;

	}

	public Proveedores devuelveProveedor(String nombre) {
		try {
			
		
		for (Proveedores proveedor : listaProveedores) {
			if (proveedor.getNombre().equalsIgnoreCase(nombre)) {
				return proveedor;

			}
		}
		
		} catch(Exception e) {
			System.out.println("Error al devolver el proveedor");
		}

		return null;

	}

}

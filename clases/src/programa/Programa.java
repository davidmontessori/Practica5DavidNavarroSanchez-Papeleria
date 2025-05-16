package programa;

import java.util.Scanner;

import clases.GestorClases;
import clases.Proveedores;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GestorClases gestor = new GestorClases();

        int opcion = 0;
        int opcion2 = 0;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Insertar empleado, producto o proveedor");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Eliminar empleado, producto o proveedor");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1: // Insertar
                    do {
                        System.out.println("¿Qué quieres insertar?");
                        System.out.println("1. Empleado");
                        System.out.println("2. Producto");
                        System.out.println("3. Proveedor");
                        System.out.println("4. Volver atrás");
                        opcion2 = input.nextInt();
                        input.nextLine();

                        switch (opcion2) {
                            case 1: // Empleado
                                System.out.println("Nombre:");
                                String nombre = input.nextLine();
                                System.out.println("Puesto:");
                                String puesto = input.nextLine();
                                System.out.println("Salario:");
                                double salario = input.nextDouble();
                                input.nextLine();
                                System.out.println("Inicio de contrato (Anyo-Mes-Dia):");
                                String fecha = input.nextLine();
                                gestor.altaEmpleado(nombre, puesto, salario, fecha);
                                break;

                            case 2: // Producto
                                System.out.println("Nombre:");
                                String nombreProducto = input.nextLine();
                                System.out.println("Precio:");
                                double precio = input.nextDouble();
                                input.nextLine();
                                System.out.println("Marca:");
                                String marca = input.nextLine();

                                System.out.println("Nombre del proveedor:");
                                String nombreProveedor = input.nextLine();
                                Proveedores proveedor = gestor.devuelveProveedor(nombreProveedor);

                                if (proveedor == null) {
                                    System.out.println("Proveedor no encontrado. Cree el proveedor primero.");
                                    break;
                                }

                                System.out.println("¿Tipo de producto? (1. Boli / 2. Lápiz):");
                                int tipo = input.nextInt();
                                input.nextLine();

                                if (tipo == 1) {
                                    System.out.println("¿Es borrable? (true/false):");
                                    boolean borrable = input.nextBoolean();
                                    input.nextLine();
                                    System.out.println("Color:");
                                    String color = input.nextLine();
                                    System.out.println("Tipo de tinta:");
                                    String tipoTinta = input.nextLine();
                                    gestor.altaProducto(nombreProducto, precio, marca, proveedor, borrable, color, tipoTinta);
                                } else {
                                    System.out.println("Tipo de mina:");
                                    String tipoMina = input.nextLine();
                                    System.out.println("Dureza:");
                                    String dureza = input.nextLine();
                                    gestor.altaProducto(nombreProducto, precio, marca, proveedor, tipoMina, dureza);
                                }
                                break;

                            case 3: // Proveedor
                                System.out.println("Nombre:");
                                String nombreProv = input.nextLine();
                                System.out.println("Teléfono:");
                                int telef = input.nextInt();
                                input.nextLine();
                                System.out.println("Dirección:");
                                String direccion = input.nextLine();
                                gestor.altaProveedor(nombreProv, telef, direccion);
                                break;

                            case 4:
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción no válida");
                        }

                    } while (opcion2 != 4);
                    break;

                case 2: // Mostrar
                    System.out.println("¿Qué quieres mostrar?");
                    System.out.println("1. Empleados");
                    System.out.println("2. Productos");
                    System.out.println("3. Proveedores");
                    System.out.println("4. Volver atrás");
                    opcion2 = input.nextInt();
                    input.nextLine();

                    switch (opcion2) {
                        case 1:
                            gestor.listarEmpleados();
                            break;
                        case 2:
                            gestor.listarProductos();
                            break;
                        case 3:
                            gestor.listarProveedores();
                            break;
                        case 4:
                            System.out.println("Volviendo...");
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;

                case 3: // Eliminar
                    System.out.println("¿Qué quieres eliminar?");
                    System.out.println("1. Empleado");
                    System.out.println("2. Producto");
                    System.out.println("3. Proveedor");
                    System.out.println("4. Volver atrás");
                    opcion2 = input.nextInt();
                    input.nextLine();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Nombre del empleado a eliminar:");
                            String nombreEmp = input.nextLine();
                            gestor.eliminarEmpleado(nombreEmp);
                            break;
                        case 2:
                            System.out.println("Nombre del producto:");
                            String nombreProd = input.nextLine();
                            System.out.println("Marca del producto:");
                            String marcaProd = input.nextLine();
                            gestor.elminarProducto(nombreProd, marcaProd);
                            break;
                        case 3:
                            System.out.println("Teléfono del proveedor:");
                            int tel = input.nextInt();
                            gestor.eliminarProveedor(tel);
                            break;
                        case 4:
                            System.out.println("Volviendo...");
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 4);

        input.close();
    }
}

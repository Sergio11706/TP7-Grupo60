package ar.edu.unju.escmi.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean band=true;
		
		do {
			System.out.println("*****MENU*****");
			System.out.println("1-Alta de cliente");
			System.out.println("2-Alta de producto");
			System.out.println("3-Vender productos");
			System.out.println("4-Buscar una factura por id");
			System.out.println("5-Eliminar una factura");
			System.out.println("6-Eliminar un producto");
			System.out.println("7-Modificar datos del cliente");
			System.out.println("8-Modificar precio del producto");
			System.out.println("9-Mostrar todas las facturas");
			System.out.println("10-Mostrar todos los clientes");
			System.out.println("11-Mostrar facturas con un precio mayor a $500.000");
			System.out.println("12-Salir");
			System.out.println("***************");
			System.out.print("Ingrese una opcion: ");
			String op = sc.nextLine();
			
			switch(op) {
			case "1":
				AltaCliente(sc);
			break;
			
			case "2":
				AltaProducto(sc);
			break;
			
			case "3":
				VenderProducto(sc);
			break;
			
			case "4":
				BuscarProducto(sc);
			break;
			
			case "5":
				EliminarFactura(sc);
			break;
			
			case "6":
				EliminarProducto(sc);
			break;
			
			case "7":
				ModificarCliente(sc);
			break;
			
			case "8":
				ModificarProducto(sc);
			break;
			
			case "9":
				MostrarClientes(sc);
			break;
			
			case "10":
				MostrarFacturas(sc);
			break;
			
			case "11":
				MostrarFacturasFiltradas(sc);
			break;
			
			case "12":
				System.out.println("*****FIN DEL PROGRAMA*****");
				band=false;
			break;
			
			default:
				System.out.println("Opcion no disponible");
			}
			
		}while(band);
		
		sc.close();
		
	}
	
	
	public static void AltaCliente(Scanner sc) {
		
	}

	
	public static void AltaProducto(Scanner sc) {
		
	}
	
	
	public static void VenderProducto(Scanner sc) {
		
	}
	
	
	public static void BuscarProducto(Scanner sc) {
		
	}
	
	
	public static void EliminarFactura(Scanner sc) {
		
	}
	
	
	public static void EliminarProducto(Scanner sc) {
		
	}
	
	
	public static void ModificarCliente(Scanner sc) {
		
	}
	
	
	public static void ModificarProducto(Scanner sc) {
		
	}
	
	
	public static void MostrarFacturas(Scanner sc) {
		
	}
	
	
	public static void MostrarClientes(Scanner sc) {
		
	}
	
	
	public static void MostrarFacturasFiltradas(Scanner sc) {
		
	}
	
	
}

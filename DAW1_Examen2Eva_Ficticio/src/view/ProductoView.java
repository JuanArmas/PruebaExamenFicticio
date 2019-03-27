package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import controller.ProductoController;
import javafx.collections.transformation.SortedList;
import model.Producto;

// RESPUESTA A LA PREGUNTA (E)

public class ProductoView {

	

	// RESPUESTA A LA PREGUNTA (E.1) - mostrar listado de productos sin filtros (ID    NOMBRE PRODUCTO   PRECIO   STOCK   CATEGORIA  ALMACEN)
	ProductoController datosController = new ProductoController();
	
	public void mostrarListado(ArrayList<Producto> listadoProductos, ArrayList<String> listadoCategorias, HashMap<String, String> listadoAlmacenes) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
		for(int i = 0; i < listadoProductos.size(); i++) {
			Producto unProducto = listadoProductos.get(i);
			
			Integer id = unProducto.getId();	
			String nombreProducto = unProducto.getNombreProducto();
			Double precio = unProducto.getPrecio();
			Integer stock = unProducto.getStock();
			Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
			Integer idAlmacen = unProducto.getIdAlmacen();
			String nombreCategoria = listadoCategorias.get(idCategoria-1);
			String nombreAlmacen = listadoAlmacenes.get(idAlmacen +"");
				
			System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreCategoria + "\t " + nombreAlmacen);
			
		}
	}
	
	
	// RESPUESTA A LA PREGUNTA (E.2) - mostrar listado de productos filtrado por una categoria, 
	// igual que el de antes pero sólo sale una categoría concreta
	
	public void mostrarListadoPorUnaCategoria(ArrayList<Producto> listadoProductos, ArrayList<String> listadoCategorias, HashMap<String, String> listadoAlmacenes, String nombreUnaCategoria) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
		for(int i = 0; i < listadoProductos.size(); i++) {
			Producto unProducto = listadoProductos.get(i);
			Integer id = unProducto.getId();	
			String nombreProducto = unProducto.getNombreProducto();
			Double precio = unProducto.getPrecio();
			Integer stock = unProducto.getStock();
			Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
			Integer idAlmacen = unProducto.getIdAlmacen();
			String nombreCategoria = listadoCategorias.get(idCategoria-1);
			String nombreAlmacen = listadoAlmacenes.get(idAlmacen +"");
			
			if(nombreCategoria.equals(nombreUnaCategoria)){
			System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreUnaCategoria + "\t " + nombreAlmacen);
			}
		}		
	}
	
	
	
	// RESPUESTA A LA PREGUNTA (E.3) - mostrar listado de productos ordenados por categorías
	
	public void mostrarListadoProductosOrdenadosPorCategorias(ArrayList<Producto> listadoProductos, ArrayList<String> listadoCategorias, HashMap<String, String> listadoAlmacenes) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
		
		for(int i = 0; i < listadoCategorias.size(); i++) {
			String nombreUnaCategoria = listadoCategorias.get(i);
			
			for(int j = 0; j < listadoProductos.size(); j++) {
				Producto unProducto = listadoProductos.get(j);
				Integer id = unProducto.getId();	
				String nombreProducto = unProducto.getNombreProducto();
				Double precio = unProducto.getPrecio();
				Integer stock = unProducto.getStock();
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
				Integer idAlmacen = unProducto.getIdAlmacen();
				String nombreCategoria = listadoCategorias.get(idCategoria-1);
				String nombreAlmacen = listadoAlmacenes.get(idAlmacen +"");
								
				if(nombreCategoria.equals(nombreUnaCategoria)){
					System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreUnaCategoria + "\t " + nombreAlmacen);
					}			
			}
		}
	}
	
	
	
	// RESPUESTA A LA PREGUNTA (E.4) - mostrar listado de productos ordenados por almacenes
	
	public void mostrarListadoProductosPorAlmacenes(ArrayList<Producto> listadoProductos, ArrayList<String> listadoCategorias, HashMap<String, String> listadoAlmacenes) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
		for(String nombreUnAlmacen:listadoAlmacenes.values()) {	
			for(int i = 0; i < listadoProductos.size(); i++) {
				Producto unProducto = listadoProductos.get(i);
				Integer id = unProducto.getId();	
				String nombreProducto = unProducto.getNombreProducto();
				Double precio = unProducto.getPrecio();
				Integer stock = unProducto.getStock();
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
				Integer idAlmacen = unProducto.getIdAlmacen();
				String nombreCategoria = listadoCategorias.get(idCategoria-1);
				String nombreAlmacen = listadoAlmacenes.get(idAlmacen +"");
								
				if(nombreAlmacen.equals(nombreUnAlmacen)){
					System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreCategoria + "\t " + nombreAlmacen);
				}			
			}
		}
		
	}
	
	
	
	// RESPUESTA A LA PREGUNTA (E.5) - mostrar los productos que tiene un almacén concreto
	public void mostrarListadoProductosPorUnAlmacen(ArrayList<Producto> listadoProductos, ArrayList<String> listadoCategorias, HashMap<String, String> listadoAlmacenes, String idUnAlmacen) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
			for(int i = 0; i < listadoProductos.size(); i++) {
				Producto unProducto = listadoProductos.get(i);
				Integer id = unProducto.getId();	
				String nombreProducto = unProducto.getNombreProducto();
				Double precio = unProducto.getPrecio();
				Integer stock = unProducto.getStock();
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
				String idAlmacen = unProducto.getIdAlmacen()+"";
				String nombreCategoria = listadoCategorias.get(idCategoria-1);
				String nombreAlmacen = listadoAlmacenes.get(idAlmacen +"");
								
				if(idAlmacen.equals(idUnAlmacen)){
					System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreCategoria + "\t " + nombreAlmacen);
				}			
			}
	}
	

	// RESPUESTA A LA PREGUNTA (E.6) - mostrar el stock total de la empresa
	
	public void mostrarStockTotal(ArrayList<Producto> listadoProductos) {	
		Integer stock = 0 ;
			for(int i = 0; i < listadoProductos.size(); i++) {
				Producto unProducto = listadoProductos.get(i);			
				stock += unProducto.getStock();				
			}
			System.out.println("STOCK TOTAL DE PRODUCTOS: " + stock + " unidades.");
	}
	
	
	// RESPUESTA A LA PREGUNTA (E.7) - mostrar el stock de productos que tiene cada almacen
	
	public void mostrarStockPorAlmacenes(ArrayList<Producto> listadoProductos, HashMap<String, String> listadoAlmacenes) {	
		System.out.println("---------------------------------------------");
		System.out.println("STOCK POR ALMACENES: ");
		System.out.println("---------------------------------------------");
		
		for(String idUnAlmacen:listadoAlmacenes.keySet()) {
			Integer stock = 0;
			String nombreUnAlmacen = listadoAlmacenes.get(idUnAlmacen);
			for(int i = 0; i < listadoProductos.size(); i++) {
				Producto unProducto = listadoProductos.get(i);
				String idAlmacen = unProducto.getIdAlmacen()+"";
				
				if(idUnAlmacen.equals(idAlmacen)) {	
					stock += unProducto.getStock();	
				}					
			}									
			System.out.println("STOCK "+  nombreUnAlmacen + ": " + stock + " unidades.");						
		}			
	}
	
	
	
	// RESPUESTA A LA PREGUNTA (E.8) - mostrar el stock de productos que tiene cada categoría
	public void mostrarStockPorCategorias(ArrayList<Producto> listadoProductos, ArrayList<String> listadoCategorias) {	
		System.out.println("---------------------------------------------");
		System.out.println("STOCK POR CATEGORIAS: ");
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i < listadoCategorias.size(); i++) {
			Integer stock = 0;
			String nombreCategoria = listadoCategorias.get(i);
			for(int j = 0; j < listadoProductos.size(); j++) {
				Producto unProducto = listadoProductos.get(j);
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria())-1;				
				if(idCategoria.equals(i)) {	
					stock += unProducto.getStock();	
				}					
			}									
			System.out.println("STOCK "+  nombreCategoria + ": " + stock + " unidades.");						
		}			
	}
	
	
}

package main;

import java.util.ArrayList;
import java.util.HashMap;

import controller.ProductoController;
import model.Producto;
import view.ProductoView;

public class MainProducto {

	public static void main(String[] args) {

		// RESPUESTA A LA PREGUNTA (B) - metódos para leer los tres ficheros de texto
		ProductoController controller = new ProductoController();
		ProductoView view = new ProductoView();
		
		ArrayList<Producto> listadoProductos = controller.listadoProductos();
		//System.out.println(listadoProductos);
		ArrayList<String> listadoCategorias = controller.listadoCategorias();
		//System.out.println(listadoCategorias);
		HashMap<String, String> listadoAlmacenes = controller.listadoAlmacenes();
		//System.out.println(listadoAlmacenes);
		controller.grabarFicheroObjetos(listadoProductos);
		HashMap<Integer, Producto> lecturaFicheroObjetos = controller.leerFicheroObjetos();
		//System.out.println(lecturaFicheroObjetos);
		
		
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.1) - mostrar listado de productos sin filtros (ID    NOMBRE PRODUCTO   PRECIO   STOCK   CATEGORIA  ALMACEN)
		view.mostrarListado(listadoProductos,listadoCategorias,listadoAlmacenes);
				
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.2) - mostrar listado de productos filtrado por una categoria, igual que el de antes pero sólo sale una categoría concreta
		view.mostrarListadoPorUnaCategoria(listadoProductos, listadoCategorias, listadoAlmacenes, "Electrónica");
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.3) - mostrar listado de productos ordenados por categorías
		view.mostrarListadoProductosOrdenadosPorCategorias(listadoProductos, listadoCategorias, listadoAlmacenes);
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.4) - mostrar listado de productos ordenados por almacenes
		view.mostrarListadoProductosPorAlmacenes(listadoProductos, listadoCategorias, listadoAlmacenes);
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.5) - mostrar los productos que tiene un almacén concreto
		view.mostrarListadoProductosPorUnAlmacen(listadoProductos, listadoCategorias, listadoAlmacenes, "44");
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.6) - mostrar el stock total de la empresa
		view.mostrarStockTotal(listadoProductos);
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.7) - mostrar el stock de productos que tiene cada almacen
		view.mostrarStockPorAlmacenes(listadoProductos, listadoAlmacenes);
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.8) - mostrar el stock de productos que tiene cada categoría
		view.mostrarStockPorCategorias(listadoProductos, listadoCategorias);
	}

}

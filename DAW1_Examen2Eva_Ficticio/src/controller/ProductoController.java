package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import model.Producto;

public class ProductoController {
	
	/*métodos para leer los tres ficheros de texto y almacenarlos (return) en los 
	siguientes tipos (estos métodos en la carpeta controller): (1.5 puntos)
	 productos.txt -> ArrayList<Producto>
	 categorias.txt-> ArrayList<String>
	 almacenes.txt-> HashMap<String, String>*/

	// apartado b)
	
	public ArrayList<Producto> listadoProductos(){
		ArrayList<Producto> listadoProducto= new ArrayList<Producto>();
		//ID    NOMBRE PRODUCTO  STOCK  PRECIO   CATEGORIA  ALMACEN
		try {
			FileReader fr = new FileReader("ficheros/productos.txt");
			BufferedReader br = new BufferedReader(fr);			
			String lineaFichero;
			while((lineaFichero = br.readLine()) !=null) {
				String[] arrayLineaFichero = lineaFichero.split("#");
				Integer id = Integer.parseInt(arrayLineaFichero[0]);
				String nombreProducto = arrayLineaFichero[1];
				Integer stock = Integer.parseInt(arrayLineaFichero[2]);
				Double precio = Double.parseDouble(arrayLineaFichero[3]);				
				String categoria = arrayLineaFichero[4];
				Integer idAlmacen = Integer.parseInt(arrayLineaFichero[5]);			
				Producto unProducto = new Producto(id, nombreProducto, precio, stock, categoria, idAlmacen);
				listadoProducto.add(unProducto);			
			}			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error FileNotFound");
		} catch (IOException e) {
			System.out.println("Error I/O");
		}		
		return listadoProducto;
	}
	
	// categorias.txt-> ArrayList<String>
	public ArrayList<String> listadoCategorias(){
		ArrayList<String> listadoCategoria= new ArrayList<String>();
		
		try {
			FileReader fr = new FileReader("ficheros/categorias.txt");
			BufferedReader br = new BufferedReader(fr);			
			String lineaFichero;
			while((lineaFichero = br.readLine()) !=null) {
				String[] arrayLineaFichero = lineaFichero.split("#");
				String nombreCategoria = arrayLineaFichero[1];						
				listadoCategoria.add(nombreCategoria);		
			}		
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error FileNotFound");
		} catch (IOException e) {
			System.out.println("Error I/O");
		}	
		return listadoCategoria;
	}
	
	// almacenes.txt-> HashMap<String, String>*/
		public HashMap<String, String> listadoAlmacenes(){
			HashMap<String, String> listadoAlmacen= new HashMap<String, String>();
			
			try {
				FileReader fr = new FileReader("ficheros/almacenes.txt");
				BufferedReader br = new BufferedReader(fr);			
				String lineaFichero;
				while((lineaFichero = br.readLine()) !=null) {
					String[] arrayLineaFichero = lineaFichero.split("#");
					String idAlmacen = arrayLineaFichero[0];
					String nombreAlmacen = arrayLineaFichero[1];				
					listadoAlmacen.put(idAlmacen, nombreAlmacen);					
				}		
				br.close();
				fr.close();
			} catch (FileNotFoundException e) {
				System.out.println("Error FileNotFound");
			} catch (IOException e) {
				System.out.println("Error I/O");
			}	
			return listadoAlmacen;
		}
		
		//c) método para grabar en un fichero de tipo objeto todos los productos individualmente
		// apartado c)
		
		
		public void grabarFicheroObjetos(ArrayList<Producto> listadoProductos) {		
			try {
				FileOutputStream fls = new FileOutputStream("ficheros/productos.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fls);
				for(int i=0; i < listadoProductos.size(); i++) {
					Producto unProducto = listadoProductos.get(i);
					oos.writeObject(unProducto);
				}			
				oos.close();
				fls.close();
			} catch (FileNotFoundException e) {
				System.out.println("Error FileNotFound");
			} catch (IOException e) {
				System.out.println("Error I/O");
			}	
		}
		
		// apartado d)
		public HashMap<Integer, Producto> leerFicheroObjetos(){
			HashMap<Integer, Producto> listadoProductos= new HashMap<Integer, Producto>();
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				fis = new FileInputStream("ficheros/productos.obj");
				ois = new ObjectInputStream(fis);	
				System.out.println("antes de entrar ");
				while(true) {
					Producto unProducto = (Producto) ois.readObject();		
					listadoProductos.put(unProducto.getId(), unProducto);
				}				
				/*
				System.out.println("antes de entrar " + ois.available()); // en este caso avaiable vale 0, por lo 
																		  // que no entra en el while				
				while(ois.available() > 0) { // el available hace una estimacion del espacio disponible por leer
					System.out.println("dentro del while");
					Producto unProducto = (Producto)ois.readObject();
					listadoProductos.put(unProducto.getId(), unProducto);				
				}
				 */				
			} catch (FileNotFoundException e) {
				System.out.println("Error FileNotFound");
			} catch (IOException e) {

			} catch (ClassNotFoundException e) {
				System.out.println("Error ClassNotFound");
			}finally {
				try {
					ois.close();			
					fis.close();
				} catch (Exception e) {
					
				}	
			}
			return listadoProductos;
		}
		
		
}

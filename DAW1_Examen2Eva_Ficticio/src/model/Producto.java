package model;

import java.io.Serializable;

// RESPUESTA A LA PREGUNTA (A) - Crear la clase producto sólamente

public class Producto implements Serializable{
	// apartado a)

	private static final long serialVersionUID = 1L;
	private Integer id;	
	private String nombreProducto;
	private Double precio;
	private Integer stock;
	private String idCategoria;
	private Integer idAlmacen;
	
	public Producto() {
		super();
	}

	public Producto(Integer id, String nombreProducto, Double precio, Integer stock, String idCategoria,
			Integer idAlmacen) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.stock = stock;
		this.idCategoria = idCategoria;
		this.idAlmacen = idAlmacen;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Integer getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(Integer idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", stock=" + stock
				+ ", idCcategoria=" + idCategoria + ", idAlmacen=" + idAlmacen + "]";
	}
	
	
}

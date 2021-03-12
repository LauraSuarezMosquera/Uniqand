package clases;

public class Producto {
	private int ID_producto;
	private String nombre_producto;
	private String stock;
	private String precio;
	private String descripcion;
	private Categoria ID_categoria;
	
public Producto() {
		
	}
	
	public Producto(int ID_producto,String nombre_producto, String stock, 
			String precio, String descripcion, Categoria ID_categoria) {
		this.ID_producto= ID_producto;
		this.nombre_producto= nombre_producto;
		this.stock= stock;
		this.precio=precio;
		this.descripcion=descripcion;
		this.ID_categoria= ID_categoria;
	
	}

	public int getID_producto() {
		return ID_producto;
	}

	public void setID_producto(int iD_producto) {
		ID_producto = iD_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getID_categoria() {
		return ID_categoria;
	}

	public void setID_categoria(Categoria iD_categoria) {
		ID_categoria = iD_categoria;
	}

	
}

package clases;

public class Categoria {
	private int ID_categoria;
	private String nombre_categoria;
	private String descripcion;
	
	
	public Categoria() {
		
	}
	
	public Categoria(int ID_categoria,String nombre_categoria, String descripcion) {
		this.ID_categoria= ID_categoria;
		this.nombre_categoria= nombre_categoria;
		this.descripcion= descripcion;
	
	}

	public int getID_categoria() {
		return ID_categoria;
	}

	public void setID_categoria(int iD_categoria) {
		ID_categoria = iD_categoria;
	}

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
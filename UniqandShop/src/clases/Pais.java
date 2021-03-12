package clases;

public class Pais {
	private int ID_pais;
	private String nombre_pais;
	
public Pais() {
		
	}
	
	public Pais(int ID_pais,String nombre_pais) {
		this.ID_pais= ID_pais;
		this.nombre_pais= nombre_pais;
	
	}

	public int getID_pais() {
		return ID_pais;
	}

	public void setID_pais(int iD_pais) {
		ID_pais = iD_pais;
	}

	public String getNombre_pais() {
		return nombre_pais;
	}

	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}

	
}

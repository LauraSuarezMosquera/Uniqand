package clases;

public class Comunidad_autonoma {
	private int ID_comunidad_autonoma;
	private String nombre_comunidad_autonoma;
	private Pais ID_pais;
	
public Comunidad_autonoma() {
		
	}
	
	public Comunidad_autonoma(int ID_comunidad_autonoma,String nombre_comunidad_autonoma, Pais ID_pais) {
		this.ID_comunidad_autonoma= ID_comunidad_autonoma;
		this.nombre_comunidad_autonoma= nombre_comunidad_autonoma;
		this.ID_pais= ID_pais;
	
	}

	public int getID_comunidad_autonoma() {
		return ID_comunidad_autonoma;
	}

	public void setID_comunidad_autonoma(int iD_comunidad_autonoma) {
		ID_comunidad_autonoma = iD_comunidad_autonoma;
	}

	public String getNombre_comunidad_autonoma() {
		return nombre_comunidad_autonoma;
	}

	public void setNombre_comunidad_autonoma(String nombre_comunidad_autonoma) {
		this.nombre_comunidad_autonoma = nombre_comunidad_autonoma;
	}

	public Pais getID_pais() {
		return ID_pais;
	}

	public void setID_pais(Pais iD_pais) {
		ID_pais = iD_pais;
	}

	

}

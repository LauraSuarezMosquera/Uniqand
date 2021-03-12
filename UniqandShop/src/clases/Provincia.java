package clases;

public class Provincia {
	private int ID_provincia;
	private String nombre_provincia;
	private Comunidad_autonoma ID_comunidad_autonoma;

	
public Provincia() {
		
	}
	
	public Provincia(int ID_provincia,String nombre_provincia, Comunidad_autonoma ID_comunidad_autonoma) {
		this.ID_provincia= ID_provincia;
		this.nombre_provincia= nombre_provincia;
		this.ID_comunidad_autonoma= ID_comunidad_autonoma;
	
	}

	public int getID_provincia() {
		return ID_provincia;
	}

	public void setID_provincia(int iD_provincia) {
		ID_provincia = iD_provincia;
	}

	public String getNombre_provincia() {
		return nombre_provincia;
	}

	public void setNombre_provincia(String nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}

	public Comunidad_autonoma getID_comunidad_autonoma() {
		return ID_comunidad_autonoma;
	}

	public void setID_comunidad_autonoma(Comunidad_autonoma iD_comunidad_autonoma) {
		ID_comunidad_autonoma = iD_comunidad_autonoma;
	}

	
	
	
}

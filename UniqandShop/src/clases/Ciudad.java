package clases;

public class Ciudad {
	 private int ID_ciudad;
	private String nombre_ciudad;
	private  Provincia ID_provincia;
	
public Ciudad() {
		
	}
	
	public Ciudad(int ID_ciudad,String nombre_ciudad, Provincia ID_provincia) {
		this.ID_ciudad= ID_ciudad;
		this.nombre_ciudad= nombre_ciudad;
		this.ID_provincia= ID_provincia;
	
	}

	public int getID_ciudad() {
		return ID_ciudad;
	}

	public void setID_ciudad(int iD_ciudad) {
		ID_ciudad = iD_ciudad;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}

	public Provincia getID_provincia() {
		return ID_provincia;
	}

	public void setID_provincia(Provincia iD_provincia) {
		ID_provincia = iD_provincia;
	}


	
}

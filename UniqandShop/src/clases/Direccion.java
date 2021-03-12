package clases;

public class Direccion {

	private int ID_direccion;
	private String calle_numero_puerta;
	private String codigo_postal;
	private String tipo_de_via;
	private Ciudad ID_ciudad;
	
public Direccion() {
		
	}
	
	public Direccion(int ID_direccion,String calle_numero_puerta, String codigo_postal,
			String tipo_de_via, Ciudad ID_ciudad) {
		this.ID_direccion= ID_direccion;
		this.calle_numero_puerta= calle_numero_puerta;
		this.codigo_postal= codigo_postal;
		this.tipo_de_via=tipo_de_via;
		this.ID_ciudad=ID_ciudad;
	
	}

	public int getID_direccion() {
		return ID_direccion;
	}

	public void setID_direccion(int iD_direccion) {
		ID_direccion = iD_direccion;
	}

	public String getCalle_numero_puerta() {
		return calle_numero_puerta;
	}

	public void setCalle_numero_puerta(String calle_numero_puerta) {
		this.calle_numero_puerta = calle_numero_puerta;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getTipo_de_via() {
		return tipo_de_via;
	}

	public void setTipo_de_via(String tipo_de_via) {
		this.tipo_de_via = tipo_de_via;
	}

	public Ciudad getID_ciudad() {
		return ID_ciudad;
	}

	public void setID_ciudad(Ciudad iD_ciudad) {
		ID_ciudad = iD_ciudad;
	}

	
	 
}

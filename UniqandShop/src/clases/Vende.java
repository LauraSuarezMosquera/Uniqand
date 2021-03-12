package clases;

public class Vende {
	private int ID_vende;
	private Producto ID_producto;
	private Usuario ID_usuario;
	
public Vende() {
		
	}
	
	public Vende(int ID_vende,Producto ID_producto, Usuario ID_usuario) {
		this.ID_vende= ID_vende;
		this.ID_producto= ID_producto;
		this.ID_usuario= ID_usuario;
	
	}

	public int getID_vende() {
		return ID_vende;
	}

	public void setID_vende(int iD_vende) {
		ID_vende = iD_vende;
	}

	public Producto getID_producto() {
		return ID_producto;
	}

	public void setID_producto(Producto iD_producto) {
		ID_producto = iD_producto;
	}

	public Usuario getID_usuario() {
		return ID_usuario;
	}

	public void setID_usuario(Usuario iD_usuario) {
		ID_usuario = iD_usuario;
	}

	
	

}

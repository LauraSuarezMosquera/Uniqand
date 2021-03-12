package clases;

public class Puntuacion {
	private int ID_puntuacion;
	private Double valor;
	private Usuario ID_usuario;
	private Producto ID_producto;

	
public Puntuacion() {
		
	}
	
	public Puntuacion(int ID_puntuacion,Double valor, Usuario ID_usuario, Producto ID_producto) {
		this.ID_puntuacion= ID_puntuacion;
		this.valor= valor;
		this.ID_usuario= ID_usuario;
		this.ID_producto= ID_producto;
	
	}

	public int getID_puntuacion() {
		return ID_puntuacion;
	}

	public void setID_puntuacion(int iD_puntuacion) {
		ID_puntuacion = iD_puntuacion;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Usuario getID_usuario() {
		return ID_usuario;
	}

	public void setID_usuario(Usuario iD_usuario) {
		ID_usuario = iD_usuario;
	}

	public Producto getID_producto() {
		return ID_producto;
	}

	public void setID_producto(Producto iD_producto) {
		ID_producto = iD_producto;
	}

	
}

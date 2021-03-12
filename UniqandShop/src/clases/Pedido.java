package clases;

public class Pedido {
	private int ID_pedido;
	private Double Precio_total;
	private Usuario ID_usuario;
	

public Pedido() {
		
	}
	
	public Pedido(int ID_pedido,Double Precio_total, Usuario ID_usuario) {
		this.ID_pedido= ID_pedido;
		this.Precio_total= Precio_total;
		this.ID_usuario= ID_usuario;
	
	}

	public int getID_pedido() {
		return ID_pedido;
	}

	public void setID_pedido(int iD_pedido) {
		ID_pedido = iD_pedido;
	}

	public Double getPrecio_total() {
		return Precio_total;
	}

	public void setPrecio_total(Double precio_total) {
		Precio_total = precio_total;
	}

	public Usuario getID_usuario() {
		return ID_usuario;
	}

	public void setID_usuario(Usuario iD_usuario) {
		ID_usuario = iD_usuario;
	}

	
	
	
}

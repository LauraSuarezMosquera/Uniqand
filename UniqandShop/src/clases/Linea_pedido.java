package clases;

import java.util.Date;

public class Linea_pedido {
	private int ID_Linea_pedido;
	private String cantidad;
	private String Precio;
	private Date fecha;
	private Pedido ID_pedido;
	private Producto ID_producto;
	
public Linea_pedido() {
		
	}
	
	public Linea_pedido(int ID_Linea_pedido,String cantidad, String Precio, Date fecha, Pedido ID_pedido,
			Producto ID_producto) {
		this.ID_Linea_pedido= ID_Linea_pedido;
		this.cantidad= cantidad;
		this.Precio= Precio;
		this.fecha= fecha;
		this.ID_pedido= ID_pedido;
		this.ID_producto= ID_producto;
	
	}

	public int getID_Linea_pedido() {
		return ID_Linea_pedido;
	}

	public void setID_Linea_pedido(int iD_Linea_pedido) {
		ID_Linea_pedido = iD_Linea_pedido;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Pedido getID_pedido() {
		return ID_pedido;
	}

	public void setID_pedido(Pedido iD_pedido) {
		ID_pedido = iD_pedido;
	}

	public Producto getID_producto() {
		return ID_producto;
	}

	public void setID_producto(Producto iD_producto) {
		ID_producto = iD_producto;
	}


}

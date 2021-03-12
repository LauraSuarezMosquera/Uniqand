package clases;

import java.util.Date;

public class Usuario {
	private int ID_usuario;
	private String nombre;
	private String apellidos;
	private Date fecha_nacimiento;
	private String email;
	private String nombre_usuario;
	private String contrasena;
	private Direccion ID_direccion;
	

	public Usuario() {
		
	}
	
	public Usuario(int ID_usuario,String nombre,String apellidos,Date fecha_nacimiento,
	String email,
	String nombre_usuario,
	String contrasena,
	Direccion ID_direccion) {
		
		this.ID_usuario = ID_usuario;
		this.nombre= nombre;
		this.apellidos= apellidos;
		this.fecha_nacimiento= fecha_nacimiento;
		this.email= email;
		this.nombre_usuario=nombre_usuario;
		this.contrasena=contrasena;
		this.ID_direccion=ID_direccion;
	}

	public int getID_usuario() {
		return ID_usuario;
	}

	public void setID_usuario(int iD_usuario) {
		ID_usuario = iD_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Direccion getID_direccion() {
		return ID_direccion;
	}

	public void setID_direccion(Direccion iD_direccion) {
		ID_direccion = iD_direccion;
	}


	
}

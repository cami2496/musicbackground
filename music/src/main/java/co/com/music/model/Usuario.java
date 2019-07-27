package co.com.music.model;

public class Usuario {
	private Integer id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String telefono;
	private String correo;
	private String fechaNacimiento;
	private String nombreUsuario;
	private String clave;
	private String[] tipoMusica;
	private String genero;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer id, String nombre, String primerApellido, String segundoApellido, String telefono,
			String correo, String fechaNacimiento, String nombreUsuario, String clave, String[] tipoMusica) {
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
		this.tipoMusica = tipoMusica;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String[] getTipoMusica() {
		return tipoMusica;
	}
	public void setTipoMusica(String[] tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}

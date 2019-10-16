public class persona {
	private String dni;
	private String nombre;
	
	/*Gets*/
	public String get_dni() {
		return dni;
	}
	public String get_nombre() {
		return nombre;
	}
	
	/*Sets*/
	public void set_persona(String dni,String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
}

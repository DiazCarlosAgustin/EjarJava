public class celular{
		
	private String numero;
	private String compa�ia;
	private String estado;
	
	/*Metodos set and get*/	
	
	public String get_numero() {
		return	numero;
	}
	
	public String get_compa�ia() {
		return	compa�ia;
	}

	public String get_estado() {
		return	estado;
	}
	
	/*Metodos Set */
	
	public void add(String numero,String compa�ia, String estado) {
		this.numero = numero;
		this.compa�ia = compa�ia;
		this.estado = estado ;
	}
	
	/*metodo de activar */
	public void activar() {
		this.estado = "Activa";
		
		System.out.println("---------------------------------");
		
		System.out.println(get_numero() + " " + get_compa�ia() + " " +get_estado());
	}
	
	/*metodo de suspender*/
	public void suspender() {
		this.estado = "Suspendida" ;
		
		System.out.println("---------------------------------");
		
		System.out.println(get_numero() + " " + get_compa�ia() + " " +get_estado());
	}
	
	/*metodo de cancelar*/
	public void cancelar() {
		this.estado = "Cancelada";
		
		System.out.println("---------------------------------");
		
		System.out.println(get_numero() + " " + get_compa�ia() + " " +get_estado());
	}
}


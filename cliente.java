
public class cliente extends persona{
	private celular celular;
	
	public celular get_celular() {
		return celular;
	}
	
	public void set_celular(celular celular) {
		this.celular = celular;
	}
	
	public void ver() {
		System.out.println("Cliente: " + this.get_nombre());
		System.out.println("DNI: " + this.get_dni());
		System.out.println(celular.get_numero() + " " + celular.get_compañia() + " " +celular.get_estado());
	}
}
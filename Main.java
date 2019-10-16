
public class Main {
	public static void main(String []args) {
	      // Following statement would create an object myPuppy
	      celular c = new celular();
	      cliente cl = new cliente();
	      
	      c.add("21321","Claro","Activa");
	      cl.set_persona("42314124", "Agustin ads");
	      cl.set_celular(c);
	      
	      c.suspender();
	      System.out.println("---------------------");
	      cl.ver();
	   }
}
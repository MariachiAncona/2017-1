public class Test1{
	
	public static void main(String args[]){

		Empleado itzel = new Empleado("Itzel", 5000);
		Empleado andrea = new Empleado("Andrea", 2000);
		Empleado andy = new Empleado("Andy", 5000);
		Gerente gerardo = new Gerente();
		Gerente jeanette = new Gerente("Jeanette", 10000);


		System.out.println(itzel);
		System.out.println(andrea);
		System.out.println(andy);
		System.out.println(gerardo);
		System.out.println(jeanette);


	}
}
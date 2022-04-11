
public class DemoEnum {

	public static void main(String[] args) {
		
		Semana hoy = Semana.Lunes;
		System.out.println(hoy.ordinal());
		for (Semana cu : Semana.values())
			System.out.println(cu);
	}

}

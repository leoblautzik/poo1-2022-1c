package generics;

public class DemoPila {

	public static void main(String[] args) {
		
		PilaGLL<Integer> pgll = new PilaGLL<Integer>();
		
		//pgll.pop();
		//pgll.peek();
		
		pgll.push(2);
		pgll.push(12);
		pgll.push(22);
		pgll.push(42);
		
		System.out.println(pgll);
		
		while(!pgll.isEmpty()) {
			System.out.println(pgll.pop());
		}
		
		PilaArray<String> pa = new PilaArray<String>(5);
		pa.pop();
		pa.push("Hola");
		pa.push("POO1");
		pa.push("3");
		System.out.println(pa.peek());
		System.out.println(pa);
		
	}

}

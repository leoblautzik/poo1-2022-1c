package deportistasPremiados;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Premiados {
	
	/*                                                                              
	 *  Se recibe una lista de deportistas premiados con indicación de campeonato y año del premio. 
	 *  Como resultado se debe devolver una lista ordenada por año y para cada año  
	 *  todos los deportistas premiados y el campeonato ganado.                     
	 *  Por ejemplo, si la lista que se recibe es                                   
	 *  [(“Gabriela Sabatini", 1990, “Individual F US Open"),                       
	 *   (“Gabriela Sabatini", 1988, “Dobles F US Open"),                           
	 *   (“Steffi Graf", 1988, “Dobles F US Open"),                                 
	 *   (“Gabriela Sabatini", 1991, “Dobles F Wimbledon"),                                          
	 *   (“Steffi Graf", 1991, “Dobles F Wimbledon")]                               
	 *                                                                              
	 *   el resultado debe ser                                                      
	 *   [(1988, [(“Steffi Graf", “Dobles F US Open"), (“Gabriela Sabatini", “Dobles F US Open")]), 
	 *    (1990, [(“Gabriela Sabatini", “Individual F US Open")]),                  
	 *    (1991, [(“Steffi Graf", “Wimbledon"), (“Gabriela Sabatini", “Dobles F Wimbledon")])].
	 *  Para resolver el ejercicio utilizar las estructuras estudiadas en clase     
	 *  (Pila, Cola, Lista, Conjunto y/o Diccionario).                              
	 *                                                                              
	 */   
	
	public Map<Integer, List<Deportista>> mapear(List<Deportista> lista){
		return null;
	}
	
	public static void main(String[] args) {
		List<Deportista> deportistas = new LinkedList<Deportista>();
		deportistas.add(new Deportista("Gabriela Sabatini", 1990, "Individual F US Open"));
		deportistas.add(new Deportista("Gabriela Sabatini", 1988, "Dobles F US Open"));
		deportistas.add(new Deportista("Steffi Graf", 1988, "Dobles F US Open"));
		deportistas.add(new Deportista("Gabriela Sabatini", 1991, "Dobles F Wimbledon"));
		deportistas.add(new Deportista("Steffi Graf", 1991, "Dobles F Wimbledon"));
		
	}
	
}

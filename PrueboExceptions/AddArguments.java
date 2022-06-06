

public class AddArguments{

    public static void main(String [] args) {
        int suma = 0;

        for(int i = 0; i < args.length; i++){
            try {
                suma += Integer.parseInt(args[i]);
            }
            catch (NumberFormatException nfe){
                System.err.println("Uno de los parámetros no es un entero");
            }
        }

        System.out.println(suma);

    }


}

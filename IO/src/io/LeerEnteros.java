package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerEnteros {
    public static void main(String [] arg) {
        int suma=0;
        FileReader fr = null;
        BufferedReader br =null;
        try
        {
            fr = new FileReader("./src/io/enteros.txt");
            br = new BufferedReader(fr);
            String linea;
            linea=br.readLine();
            while(linea !=null) {
                try {
                    suma += Integer.parseInt(linea);
                } catch (NumberFormatException e) {
                    System.err.println("Uno de los datos leídos no es un entero");
                }
                linea=br.readLine();
            }
            System.out.println("Suma = " + suma);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Finally Suma = " + suma);
            try{                    
                if( fr != null ){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
}
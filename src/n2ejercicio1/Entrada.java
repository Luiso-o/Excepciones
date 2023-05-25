package n2ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
 private static Scanner entrada = new Scanner(System.in);
	
 		//BYTES
	  public static byte leerByte(String mensaje) {
		  
	        while (true) {
	        	
	            try {
	                System.out.println(mensaje);
	                byte numero = entrada.nextByte();
	                entrada.nextLine(); // Limpiar el buffer
	                System.out.println(numero + " Es un numero tipo Byte :)\n");
	                return numero;
	                
	            } catch (InputMismatchException e) {
	                System.err.println("Error de formato :( Introduce un número válido.");
	                entrada.nextLine(); // Limpiar el buffer
	            }
	        }
	    }
	  
	  //INTEGER
	  public static int leerInt(String mensaje) {
		  
		  while (true) {
	        	
	            try {
	                int numero = entrada.nextInt();
	                entrada.nextLine(); // Limpiar el buffer
	                System.out.println(numero + " Es un numero tipo Entero :)\n");
	                return numero;
	                
	            } catch (InputMismatchException e) {
	                System.err.println("Error de formato :( Introduce un número válido.");
	                entrada.nextLine(); // Limpiar el buffer
	            }
	        }
	  }
	  
	  //FLOAT 
	  public static float leerFloat(String mensaje){
		  
		  while (true) {
		 
		  try { 
			  float numero = entrada.nextFloat();
              entrada.nextLine(); // Limpiar el buffer
              System.out.println(numero + " Es un numero tipo Float :)\n");
              return numero;	   	
              
          } catch (InputMismatchException e) {
              System.err.println("Error de formato :( Introduce un número de tipo Float.");
              entrada.nextLine(); // Limpiar el buffer
              
          	}
		 }		  
	  }
	  
	  //DOUBLE
	  public static Double leerDouble(String mensaje){
		  
		  while (true) {
		 
		  try {
			  Double numero = entrada.nextDouble();
              entrada.nextLine(); // Limpiar el buffer
              System.out.println(numero + " Es un numero tipo Double :)\n");
              return numero;	   	
              
          } catch (InputMismatchException e) {
              System.err.println("Error de formato :( Introduce un número de tipo Double.");
              entrada.nextLine(); // Limpiar el buffer
              
          }
	
		  
		  }
		  
	  }

	  //Char
	  public static char leerChar(String mensaje) {
		  
		  System.out.println(mensaje);

		    while (true) {
		        try {
		            String letra = entrada.nextLine();
		            if (letra.length() != 1) {
		                throw new IllegalArgumentException("Error de formato!");
		            }
		            
		            System.out.println(letra + " es un Char :)\n");
		            return letra.charAt(0);
		            
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }
		    }
		}
			   
	  
	  //String
	  public static String leerString(String mensaje) {
		  
		  System.out.println(mensaje);

	        while (true) {
	        	
	            try {
	            
	                return entrada.nextLine();
	          
	            } catch (Exception e) {
	                System.out.println(e.getMessage());
	                
	            }
	        }
	    }     
	       

	  public static boolean leerSiNo(String mensaje) {
		  
		  System.out.println(mensaje);

	        while (true) {
	            try {
	                String input = entrada.nextLine().toLowerCase();
	                if (input.equals("s")) {
	                    return true;
	                } else if (input.equals("n")) {
	                    return false;
	                } else {
	                    throw new Exception();
	                }
	            } catch (Exception e) {
	                System.out.println("Error en formato!");
	                
	            }
	        }
	    }     
	        
	  
}//llave de cierre clase




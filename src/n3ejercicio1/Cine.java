package n3ejercicio1;

import javax.swing.JOptionPane;

public class Cine {

	//Atributos
	private static int numeroFilasCinema;
	private static int asientosPorCadaFila;
	private static GestionButacas miGestion;
	
	public Cine() {
		
		miGestion = new GestionButacas();
		numeroFilasCinema = 0;
		asientosPorCadaFila = 0;
		
		pedirDatosIniciales();
	}
	
	//getters	
	public int getNumeroFilesCinema() {
		return numeroFilasCinema;
	}

	public int getAsientosPorCadaFila() {
		return asientosPorCadaFila;
	}
	
	public GestionButacas getMiGestion() {
		return miGestion;
	}


	//metodo iniciar
	public void iniciar() throws excepcionFilaIncorrecta, ExcepcionAsientoIncorrecto, ExcepcionNombrePersonaIncorrecto, excepcionButacaLibre, excepcionButacaOcupada {
		
		int indice;
		
		do {
			
		indice = menu();	
		
		switch(indice) {
		
		case 0:
			indice = 0;
			JOptionPane.showMessageDialog(null, "Hasta pronto :)");
		case 1:
			mostrarButacasReservadas();
			break;
		case 2:
			mostrarButacasPersona();
			break;
		case 3:
			reservarButaca();
			break;
		case 4:
			anularReservaButaca();
			break;
		case 5:
			anularReservaPersona();
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opcion no encontrada :(");	
			
			}
		
		}while(indice != 0);
		
	}
	
	//metodo menu
	public static int menu() {
		String opcion = JOptionPane.showInputDialog("Elige una opcion:\n\n"
				+ "\t1-Mostrar todas las butacas reservadas.\n"
				+ "\t2-Mostrar las butacas reservadas para una persona.\n"
				+ "\t3-Reservar butaca.\n"
				+ "\t4-Anular la reserva de una butaca.\n"
				+ "\t5-Anular todas las reservas de una persona.\n"
				+ "\t0-Salir.");
		
		return Integer.parseInt(opcion);
		
	}
	
	//Mostra totes les butaques reservades. //revisar
	public static void mostrarButacasReservadas() {	
		
		if(miGestion.getMisButacas().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No tenemos nunguna reserva de momento");
			
		}else {
			
			for (int i = 0; i < miGestion.getMisButacas().size(); i++) {
				System.out.println((i+1) + "-" + miGestion.getMisButacas().get(i).toString());
			}
			
		}
		
	}
	
	//Demana el nom de la persona que ha fet
	//la reserva i mostra totes les butaques reservades per aquesta persona.
	public static void mostrarButacasPersona() {
		
		if(miGestion.getMisButacas().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No tenemos nunguna reserva de momento");
				
		}else {
		
		String cliente = JOptionPane.showInputDialog("Introduce el nombre del cliente: ");
		
			for (int i = 0; i < miGestion.getMisButacas().size(); i++) {
				
				if(miGestion.getMisButacas().get(i).getNombrePersona().equalsIgnoreCase(cliente)) {
					System.out.println((i + 1) + "-" + miGestion.getMisButacas().get(i).toString());
					
				}else if(i > miGestion.getMisButacas().size()) {
					JOptionPane.showMessageDialog(null, "No tenemos nunguna reserva a este nombre");
				}
				
			}
		}
	}
	
	/*Demana a l’usuari/ària un número de fila (crida al mètode introduirFila),
	 *  un número de seient (crida al mètode introduirSeient), el nom de la
	 *   persona que fa la reserva (crida al mètode introduirPersona) i reserva la butaca.*/
	public static  void reservarButaca() throws excepcionFilaIncorrecta, ExcepcionAsientoIncorrecto, ExcepcionNombrePersonaIncorrecto, excepcionButacaOcupada {
			
		int numeroFila = introducirFila();
		int numeroAsiento = introducirAsiento();
		String nombrePersona = introducirPersona();
		
		miGestion.agregarButaca(new Butaca(numeroFila, numeroAsiento, nombrePersona));
		
	}
	
	/*Demana a l’usuari/ària un número de fila (crida al mètode introduirFila),
	 *  un número de seient (crida al mètode introduirSeient) i
	 *   elimina la reserva de la butaca.*/
	public static void anularReservaButaca() throws ExcepcionAsientoIncorrecto, excepcionFilaIncorrecta, excepcionButacaLibre {
		
		int numeroAsiento = introducirAsiento();
		int numeroFila = introducirFila();
		
		miGestion.eliminarButaca(numeroFila, numeroAsiento);
		
		JOptionPane.showMessageDialog(null, "Reserva anulada.");
			
	}
	
	public static void anularReservaPersona() {
			
		if(miGestion.getMisButacas().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No tenemos ninguna reserva de momento.");
			
		}else {
			String nombre = JOptionPane.showInputDialog("Introduce el nombre de la persona");
			int cuentaReservas = 0;
			
			for (int i = 0; i < miGestion.getMisButacas().size(); i++) {
				
				if(miGestion.getMisButacas().get(i).getNombrePersona().equalsIgnoreCase(nombre)) {
					miGestion.getMisButacas().remove(i);
					cuentaReservas++;
					
				}
				
			}
			
			JOptionPane.showMessageDialog(null, "Eliminadas : " + cuentaReservas + " reservas a "
					+ "nombre de " + nombre);
			
		}
		
	}
	
	/* demana a l’usuari/ària el nom de la persona i el retorna si és correcte.
	 *  Si conté números, llença una excepció personalitzada 
	 *  ExcepcioNomPersonaIncorrecte.*/
	public static String introducirPersona() throws ExcepcionNombrePersonaIncorrecto{

		 while (true) {
		        String nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente: ");
		        
		        if (nombre.matches("^[^\\d]+$")) {//verifica que la cadena no contiene numeros
		        	return nombre;
		        }
		        throw new ExcepcionNombrePersonaIncorrecto("ExcepcionNombrePersonaIncorrecto, vuelvelo a intentar:");
		    }
	}
	
	/*Demana a l’usuari/ària el nombre de files i seients i els guarda
	 *  en els atributs corresponents. */
	public void pedirDatosIniciales() {
		
		String pideFilas = JOptionPane.showInputDialog("Cuantas filas tiene el cine?");
		int numeroFilas = Integer.parseInt(pideFilas);
		numeroFilasCinema = numeroFilas;
		
		String pideAsientos = JOptionPane.showInputDialog("Cuantos asientos hay por fila?");
		int numeroAsientos = Integer.parseInt(pideAsientos);
		asientosPorCadaFila = numeroAsientos;
			
	}
	
	/*Demana el nombre de fila, si aquest està entre 1 i el 
	 * nombre de files totals, el retorna. Si no, retorna una
	 *  excepció personalitzada ExcepcioFilaIncorrecta.*/
	public static int introducirFila() throws excepcionFilaIncorrecta {
		
		 while (true) {
		        String fila = JOptionPane.showInputDialog("Introduce el número de la fila: ");
		        
		        if (fila.matches("\\d+")) {//verifica que la cadena contiene solo digitos
		            int numeroFila = Integer.parseInt(fila);
		            
		            if (numeroFila > 0 && numeroFila <= numeroFilasCinema) {
		                return numeroFila;
		                
		            }else {
		            	 throw new excepcionFilaIncorrecta("ExcepcionFilaIncorrecta, vuelve a intentarlo");
		            }  
		            
		        }
		       
		    }

	}
	
	/* Demana el seient, si el número està entre 1 i el nombre
	 *  total de seients, el retorna. Si no, retorna una excepció
	 *   del tipus ExcepcioSeientIncorrecte.*/
	public static int introducirAsiento() throws ExcepcionAsientoIncorrecto{
		
		 while (true) {
		        String asiento = JOptionPane.showInputDialog("Introduce el número del asiento: ");
		        
		        if (asiento.matches("\\d+")) {//verifica que la cadena contiene solo digitos
		            int numeroAsiento = Integer.parseInt(asiento);
		            
		            if (numeroAsiento > 0 && numeroAsiento <= asientosPorCadaFila) {
		                return numeroAsiento;
		            }
		        }
		        throw new ExcepcionAsientoIncorrecto("ExcepcionAsientoIncorrecto, vuelve a intentarlo");
		   }
	}

		
	
}//Llave clase

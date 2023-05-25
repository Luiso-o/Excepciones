package n3ejercicio1;

import javax.swing.JOptionPane;

public class Cine {

	//Atributos
	private int numeroFilesCinema;
	private int asientosPorCadaFila;
	//private GestionButacas miGestion;
	
	public Cine() {
		
		//miGestion = new GestionButacas.pedirDatosIniciales();
		numeroFilesCinema = 0;
		asientosPorCadaFila = 0;
	}
	
	//getters	
	public int getNumeroFilesCinema() {
		return numeroFilesCinema;
	}

	public int getAsientosPorCadaFila() {
		return asientosPorCadaFila;
	}


	//metodo iniciar
	public static void iniciar() {
		
		int indice = menu();
		
		do {
			
		switch(indice) {
		
		case 0:
			indice = 0;
			JOptionPane.showMessageDialog(null, "Hasta pronto :)");
		case 1:
			//Mostrar todas las butacas reservadas
			break;
		case 2:
			//Mostrar las butacas reservadas para una persona
			break;
		case 3:
			//Reservar butaca.
			break;
		case 4:
			//Anular la reserva de una butaca
			break;
		case 5:
			//Anular todas las reservas de una persona
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
	
	//Mostra totes les butaques reservades.
	public void mostrarButacasReservadas() {	
			
	}
	
	//Demana el nom de la persona que ha fet
	//la reserva i mostra totes les butaques reservades per aquesta persona.
	public void mostrarButacasPersona(String nombre) {
		
	}
	
	/*Demana a l’usuari/ària un número de fila (crida al mètode introduirFila),
	 *  un número de seient (crida al mètode introduirSeient), el nom de la
	 *   persona que fa la reserva (crida al mètode introduirPersona) i reserva la butaca.*/
	public void reservarButaca(int numeroFila) {
		
	}
	
	/*Demana a l’usuari/ària un número de fila (crida al mètode introduirFila),
	 *  un número de seient (crida al mètode introduirSeient) i
	 *   elimina la reserva de la butaca.*/
	public void anularReserva(int numeroFila) {
		
	}
	
	/* demana a l’usuari/ària el nom de la persona i el retorna si és correcte.
	 *  Si conté números, llença una excepció personalitzada 
	 *  ExcepcioNomPersonaIncorrecte.*/
	public void introducirPersona(String nombre) {
		
	}
	
	/*Demana a l’usuari/ària el nombre de files i seients i els guarda
	 *  en els atributs corresponents. */
	public void pedirDatosIniciales(String nombre) {
		
	}
	
	/*Demana el nombre de fila, si aquest està entre 1 i el 
	 * nombre de files totals, el retorna. Si no, retorna una
	 *  excepció personalitzada ExcepcioFilaIncorrecta.*/
	public void introducirFila() {
		
	}
	
	/* Demana el seient, si el número està entre 1 i el nombre
	 *  total de seients, el retorna. Si no, retorna una excepció
	 *   del tipus ExcepcioSeientIncorrecte.*/
	public void introducirAsiento() {
		
	}
	
}

package n3ejercicio1;

public class Butaca {

	//atributos
	private int numeroFila;
	private int numeroAsiento;
	private String nombrePersona;
	
	//constructor
	public Butaca(int numeroFila, int numeroAsiento, String nombrePersona) {
		this.numeroFila = numeroFila;
		this.numeroAsiento = numeroAsiento;
		this.nombrePersona = nombrePersona;
	}

	//getters
	public int getNumeroFila() {
		return numeroFila;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}
	
	//Equals: retornarà que dues butaques són iguales si la fila i el seient són iguals.
	public boolean sonIguales(Butaca miButaca) {	
		return (numeroFila == miButaca.getNumeroFila() && numeroAsiento == miButaca.getNumeroAsiento()); 
				
	}

	@Override
	public String toString() {
		return "Fila: " + numeroFila + ", Asiento: " + numeroAsiento + ", Persona: "
				+ nombrePersona + "\n";
	}
	
	
	
	
}

package n3ejercicio1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GestionButacas {
	//atributo
	private ArrayList<Butaca>misButacas;
	
	//constructor
	public GestionButacas() {
		misButacas = new ArrayList<>();

	}

	//Get
	public ArrayList<Butaca> getMisButacas() {
		return misButacas;
	}
	
	//Agregar butaca
	public void agregarButaca(Butaca nuevaButaca) throws excepcionButacaOcupada{
		
		 int indice = buscarButaca(nuevaButaca.getNumeroFila(), nuevaButaca.getNumeroAsiento());

		    if (indice != -1) {
		        throw new excepcionButacaOcupada("ExcepcionButacaOcupada");
		        
		    } else {
		        misButacas.add(nuevaButaca);
		 }				
	}
	
	//eliminar Butaca
	public void eliminarButaca(int numeroFila, int numeroAsiento) throws excepcionButacaLibre{
		
		int indice = buscarButaca(numeroFila, numeroAsiento);
		
		if (indice == -1) {
		    throw new excepcionButacaLibre("ExcepcionButacaLibre");
		    
		} else {
		    misButacas.remove(indice);
		    JOptionPane.showMessageDialog(null, "Butaca eliminada.");
		}
		
	}

	//buscarButaca
	public int buscarButaca(int miFila, int miAsiento) {
		
		int indice = -1;
		int contador = 0;
		
		while(contador < misButacas.size() && indice == -1) {
			
			if(miFila == misButacas.get(contador).getNumeroFila() && miAsiento == misButacas.get(contador).getNumeroAsiento()) {
				
				indice = contador;
				
			}
			
			contador++;
		}
		
		return indice;
		
	}
}

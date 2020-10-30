import java.util.ArrayList;

public class Albero {

	private Nodo radice;
	
	public Albero(Nodo n) {
		radice = n;
	}
	
	public int getRadice() {
		return radice.getVal();
	}
	
	public void inserisciValore(int numero) {
		radice.inserisciValore(numero);
	}
	
	public Boolean ricercaValore(int numero) {
		try {
		return radice.RicercaValore(radice ,numero);
		}catch(Exception e) {
			return false;
		}
	}
	
	public void eliminaNodo(int numero) {
		radice.eliminaNodo(numero);
	}
	
	public void stampaValori() {
		radice.stampaNodi(radice);
	}
	
	public int NumeroNodi() {
		ArrayList<Integer> tempAlbero = new ArrayList<Integer>(); 
		tempAlbero = radice.stampaNoditoArray(radice, new ArrayList<Integer>());
		
		return tempAlbero.size();
	}
	
	public void bilanciaAlbero() {
		ArrayList<Integer> tempAlbero = new ArrayList<Integer>(); 
		tempAlbero = radice.stampaNoditoArray(radice, new ArrayList<Integer>());

		radice = new Nodo(tempAlbero.get(tempAlbero.size()/2));
			tempAlbero.remove(tempAlbero.size()/2);
			for(int i=0;i<tempAlbero.size();i++) {
				inserisciValore(tempAlbero.get(i));
			}
		
	}
	
	public int getMin() {
		return radice.getMin();
	}
	
	public int getMax() {
		return radice.getMax();
	}
	
	public int getAltezza() {
		return radice.Altezza(radice);
	}
}


public class Albero {

	private Nodo radice;
	
	public Albero(Nodo n) {
		radice = n;
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
	
	public int getMin() {
		return radice.getMin();
	}
	
	public int getMax() {
		return radice.getMax();
	}
}

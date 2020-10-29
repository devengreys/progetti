
public class main {
public static void main(String[] args) {
	Nodo n = new Nodo(10);
	Albero a = new Albero(n);
	
	a.inserisciValore(5);
	a.inserisciValore(17);
	a.inserisciValore(11);
	a.inserisciValore(14);
	a.inserisciValore(13);
	a.inserisciValore(3);
	a.inserisciValore(8);
	
	a.stampaValori();

	
	
	
}
}

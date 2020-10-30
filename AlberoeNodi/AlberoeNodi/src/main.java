
public class main {
public static void main(String[] args) {
	//Nodo n = new Nodo(10);
	Nodo n = new Nodo(-3);
	Albero a = new Albero(n);
	a.inserisciValore(-1);
	a.inserisciValore(0);
	a.inserisciValore(5);
	a.inserisciValore(12);
	a.inserisciValore(23);
	a.inserisciValore(46);
	a.inserisciValore(51);
	a.inserisciValore(60);
	a.inserisciValore(64);
	a.inserisciValore(70);
	a.inserisciValore(78);
	a.inserisciValore(86);
	a.inserisciValore(83);
	a.inserisciValore(92);
	a.inserisciValore(100);
	/*
	a.inserisciValore(5);
	a.inserisciValore(17);
	a.inserisciValore(9);
	a.inserisciValore(11);
	a.inserisciValore(12);
	a.inserisciValore(14);
	a.inserisciValore(13);
	a.inserisciValore(3);
	a.inserisciValore(8);
	*/
	//System.out.println(a.getAltezza());
	System.out.println("Numero nodi : "+a.NumeroNodi());
	System.out.println("Radice : "+a.getRadice());
	a.bilanciaAlbero();
	System.out.println("Numero nodi : "+a.NumeroNodi());
	System.out.println("Radice : "+a.getRadice());
	//a.stampaValori();

	
	
	
}
}

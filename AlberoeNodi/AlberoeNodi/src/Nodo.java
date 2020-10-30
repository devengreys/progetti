import java.util.ArrayList;

public class Nodo {

	private Nodo dx;
	private Nodo sx;
	private int val;
	
	public Nodo(int val) {
		this.val = val;
		dx = null;
		sx = null;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public void setDx(Nodo n) {
		this.dx = n;
	}
	
	public void setSx(Nodo n) {
		this.sx = n;
	}
	
	
	public int getVal() {
		return val; 
	}
	
	public Nodo getDx() {
		return dx;
	}
	
	public Nodo getSx() {
		return sx;
	}
	
	public void inserisciValore(int numero) {
		Nodo vista;
		vista = this;
		Boolean condizione = true;
		while(condizione) {
			if(numero>vista.getVal()) {
				if(vista.getDx()==null) {
					vista.dx = new Nodo(numero);
					condizione = false;
				}else {
					vista = vista.getDx();
				}
			}
			if(numero<vista.getVal()) {
				if(vista.getSx()==null) {
					vista.sx = new Nodo(numero);
					condizione = false;
				}else {
					vista = vista.getSx();
				}
			}
		}
	}
	
	public int Altezza(Nodo n) {
		if(n==null)
			return -1;    
		else
		{
		int left=Altezza(n.getSx());   
        int right=Altezza(n.getDx()); 
         if (left > right)          
             return left+1; 
         else
            return right+1;
		}
		}

	public Boolean RicercaValore(Nodo n, int numero) {
	   
			if (n.getVal()<numero) {
						RicercaValore(n.getDx(), numero);
		    	}
		    if (n.getVal()>numero) {
		    			RicercaValore(n.getSx(), numero);
		    	}
		    return true;
		    
	    
	   }
	
	public void stampaValore(Nodo n, int numero) {
		String esistenza = "";
		try {   
			if (n.getVal()<numero) {
						RicercaValore(n.getDx(), numero);
		    	}
		    if (n.getVal()>numero) {
		    			RicercaValore(n.getSx(), numero);
		    	}
		    }catch(Exception e) {
		    	
		    }
		    if(n.getVal()==numero) {
		    	esistenza = n.getVal()+"";
		    }
		    
		    System.out.println(esistenza);
	    
	   }
	
	public int getMin() {
		Nodo vista;
		vista = this;
		while(vista.getSx()!=null) {
			vista = vista.getSx();
		} 
		return vista.getVal();
		
	}
		  
	
	public void stampaNodi(Nodo n) {
		if(n!=null) {
			stampaNodi(n.getSx());
			System.out.println(n.getVal());
			stampaNodi(n.getDx());
		}
	}
	
	public ArrayList<Integer> stampaNoditoArray(Nodo n, ArrayList<Integer> array) {
		if(n!=null) {
			stampaNoditoArray(n.getSx(), array);
			array.add(n.getVal());
			//System.out.println(n.getVal());
			stampaNoditoArray(n.getDx(), array);
		}
		return array;
	}
	
	
	
	public void eliminaNodo(int numero) {
		Nodo vista = this;
		Boolean condizione = true;
		while(condizione) {
			if(vista.getVal()<numero) {         
				if(vista.getDx().val!=numero) { 
					vista = vista.getDx();		
				}else {
					if(vista.getDx().val==numero) {
						Nodo vista2 = vista.getDx();
						Nodo tempSx = vista2.getSx();
						Nodo tempDx = vista2.getDx();
						
						vista.setSx(tempSx);
						vista.setDx(tempDx);
						System.out.println("Nodo eliminato");
						condizione = false;
					}
				}
			}
			
			if(vista.getVal()>numero) {         
				if(vista.getSx().val!=numero) { 
					vista = vista.getSx();		
				}else {
					if(vista.getSx().val==numero) {
						Nodo vista2 = vista.getSx();
						Nodo tempSx = vista2.getSx();
						Nodo tempDx = vista2.getDx();
						
						vista.setSx(tempSx);
						vista.setDx(tempDx);
						System.out.println("Nodo eliminato");
						condizione = false;
					}
				}
			}
			
		}
		
	}
	
	public Boolean isFoglia() {
		if(this.getDx()==null&&this.getSx()==null) {
			return true;
		}
		return false;
	}
	
	
	public int getMax() {
		Nodo vista;
		vista = this;
		while(vista.getDx()!=null) {
			vista = vista.getDx();
		} 
		return vista.getVal();
		
	}
	
	public String toString() {
		return "Valore nodo : "+val+", Nodo destra : "+dx.val+", Nodo sinistra : "+sx.val;
	}
}

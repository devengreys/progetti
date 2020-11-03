
public class main {

	public static void main(String[] args) {
		AlberoRedBlack bst = new AlberoRedBlack();
	    bst.insert(55);
	    bst.insert(40);
	    bst.insert(65);
	    bst.insert(60);
	    bst.insert(75);
	    bst.insert(57);
	    bst.printTree();

	    bst.deleteNode(40);
	    
	    System.out.println("\nDopo la cancellazione:");
	    bst.printTree();
	}

}

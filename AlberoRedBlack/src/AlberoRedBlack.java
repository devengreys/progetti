
public class AlberoRedBlack {

	
	private Nodo root;
	private Nodo TNULL;

	private void preOrderHelper(Nodo node) {
	    if (node != TNULL) {
	      System.out.print(node.getData() + " ");
	      preOrderHelper(node.getLeft());
	      preOrderHelper(node.getRight());
	    }
	  }

	  private void inOrderHelper(Nodo node) {
	    if (node != TNULL) {
	      inOrderHelper(node.getLeft());
	      System.out.print(node.getData() + " ");
	      inOrderHelper(node.getRight());
	    }
	  }

	  private void postOrderHelper(Nodo node) {
	    if (node != TNULL) {
	      postOrderHelper(node.getLeft());
	      postOrderHelper(node.getRight());
	      System.out.print(node.getData() + " ");
	    }
	  }

	  private Nodo searchTreeHelper(Nodo node, int key) {
	    if (node == TNULL || key == node.getData()) {
	      return node;
	    }

	    if (key < node.getData()) {
	      return searchTreeHelper(node.getLeft(), key);
	    }
	    return searchTreeHelper(node.getRight(), key);
	  }

	  private void fixDelete(Nodo x) {
	    Nodo s;
	    while (x != root && x.getColor() == 0) {
	      if (x == x.getParent().getLeft()) {
	        s = x.getParent().getRight();
	        if (s.getColor() == 1) {
	          s.setColor(0);
	          x.getParent().setColor(1);
	          leftRotate(x.getParent());
	          s = x.getParent().getRight();
	        }

	        if (s.getLeft().getColor() == 0 && s.getRight().getColor() == 0) {
	          s.setColor(1);
	          x = x.getParent();
	        } else {
	          if (s.getRight().getColor() == 0) {
	            s.getLeft().setColor(0);
	            s.setColor(1);
	            rightRotate(s);
	            s = x.getParent().getRight();
	          }

	          s.setColor(x.getParent().getColor());
	          x.getParent().setColor(0);
	          s.getRight().setColor(0);
	          leftRotate(x.getParent());
	          x = root;
	        }
	      } else {
	        s = x.getParent().getLeft();
	        if (s.getColor() == 1) {
	          s.setColor(0);
	          x.getParent().setColor(1);
	          rightRotate(x.getParent());
	          s = x.getParent().getLeft();
	        }

	        if (s.getRight().getColor() == 0 && s.getRight().getColor() == 0) {
	          s.setColor(1);
	          x = x.getParent();
	        } else {
	          if (s.getLeft().getColor() == 0) {
	            s.getRight().setColor(0);
	            s.setColor(1);
	            leftRotate(s);
	            s = x.getParent().getLeft();
	          }

	          s.setColor(x.getParent().getColor());
	          x.getParent().setColor(0);
	          s.getLeft().setColor(0);
	          rightRotate(x.getParent());
	          x = root;
	        }
	      }
	    }
	    x.setColor(0);
	  }

	  private void rbTransplant(Nodo u, Nodo v) {
	    if (u.getParent() == null) {
	      root = v;
	    } else if (u == u.getParent().getLeft()) {
	      u.getParent().setLeft(v);
	    } else {
	      u.getParent().setRight(v);
	    }
	    v.setParent(u.getParent());
	  }

	  private void deleteNodeHelper(Nodo node, int key) {
	    Nodo z = TNULL;
	    Nodo x, y;
	    while (node != TNULL) {
	      if (node.getData() == key) {
	        z = node;
	      }

	      if (node.getData() <= key) {
	        node = node.getRight();
	      } else {
	        node = node.getLeft();
	      }
	    }

	    if (z == TNULL) {
	      System.out.println("Non c'è la chiave nell'albero");
	      return;
	    }

	    y = z;
	    int yOriginalColor = y.getColor();
	    if (z.getLeft() == TNULL) {
	      x = z.getRight();
	      rbTransplant(z, z.getRight());
	    } else if (z.getRight() == TNULL) {
	      x = z.getLeft();
	      rbTransplant(z, z.getLeft());
	    } else {
	      y = minimum(z.getRight());
	      yOriginalColor = y.getColor();
	      x = y.getRight();
	      if (y.getParent() == z) {
	        x.setParent(y);
	      } else {
	        rbTransplant(y, y.getRight());
	        y.setRight(z.getRight());
	        y.getRight().setParent(y);
	      }

	      rbTransplant(z, y);
	      y.setLeft(z.getLeft());
	      y.getLeft().setParent(y);
	      y.setColor(z.getColor());
	    }
	    if (yOriginalColor == 0) {
	      fixDelete(x);
	    }
	  }

	  private void fixInsert(Nodo k) {
	    Nodo u;
	    while (k.getParent().getColor() == 1) {
	      if (k.getParent() == k.getParent().getParent().getRight()) {
	        u = k.getParent().getParent().getLeft();
	        if (u.getColor() == 1) {
	          u.setColor(0);
	          k.getParent().setColor(0);
	          k.getParent().getParent().setColor(1);
	          k = k.getParent().getParent();
	        } else {
	          if (k == k.getParent().getLeft()) {
	            k = k.getParent();
	            rightRotate(k);
	          }
	          k.getParent().setColor(0);
	          k.getParent().getParent().setColor(1);
	          leftRotate(k.getParent().getParent());
	        }
	      } else {
	        u = k.getParent().getParent().getRight();

	        if (u.getColor() == 1) {
	          u.setColor(0);
	          k.getParent().setColor(0);
	          k.getParent().getParent().setColor(1);
	          k = k.getParent().getParent();
	        } else {
	          if (k == k.getParent().getRight()) {
	            k = k.getParent();
	            leftRotate(k);
	          }
	          k.getParent().setColor(0);
	          k.getParent().getParent().setColor(1);
	          rightRotate(k.getParent().getParent());
	        }
	      }
	      if (k == root) {
	        break;
	      }
	    }
	    root.setColor(0);
	  }

	  private void printHelper(Nodo root, String indent, boolean last) {
	    if (root != TNULL) {
	      System.out.print(indent);
	      if (last) {
	        System.out.print("R----");
	        indent += "   ";
	      } else {
	        System.out.print("L----");
	        indent += "|  ";
	      }

	      String sColor = root.getColor() == 1 ? "RED" : "BLACK";
	      System.out.println(root.getData() + "(" + sColor + ")");
	      printHelper(root.getLeft(), indent, false);
	      printHelper(root.getRight(), indent, true);
	    }
	  }

	  public AlberoRedBlack() {
	    TNULL = new Nodo();
	    TNULL.setColor(0);
	    TNULL.setLeft(null);
	    TNULL.setRight(null);
	    root = TNULL;
	  }

	  public void preorder() {
	    preOrderHelper(this.root);
	  }

	  public void inorder() {
	    inOrderHelper(this.root);
	  }

	  public void postorder() {
	    postOrderHelper(this.root);
	  }

	  public Nodo searchTree(int k) {
	    return searchTreeHelper(this.root, k);
	  }

	  public Nodo minimum(Nodo node) {
	    while (node.getLeft() != TNULL) {
	      node = node.getLeft();
	    }
	    return node;
	  }

	  public Nodo maximum(Nodo node) {
	    while (node.getRight() != TNULL) {
	      node = node.getRight();
	    }
	    return node;
	  }

	  public Nodo successor(Nodo x) {
	    if (x.getRight() != TNULL) {
	      return minimum(x.getRight());
	    }

	    Nodo y = x.getParent();
	    while (y != TNULL && x == y.getRight()) {
	      x = y;
	      y = y.getParent();
	    }
	    return y;
	  }

	  public Nodo predecessor(Nodo x) {
	    if (x.getLeft() != TNULL) {
	      return maximum(x.getLeft());
	    }

	    Nodo y = x.getParent();
	    while (y != TNULL && x == y.getLeft()) {
	      x = y;
	      y = y.getParent();
	    }

	    return y;
	  }

	  public void leftRotate(Nodo x) {
	    Nodo y = x.getRight();
	    x.setRight(y.getLeft());
	    if (y.getLeft() != TNULL) {
	      y.getLeft().setParent(x);
	    }
	    y.setParent(x.getParent());
	    if (x.getParent() == null) {
	      this.root = y;
	    } else if (x == x.getParent().getLeft()) {
	      x.getParent().setLeft(y);
	    } else {
	      x.getParent().setRight(y);
	    }
	    y.setLeft(x);
	    x.setParent(y);
	  }

	  public void rightRotate(Nodo x) {
	    Nodo y = x.getLeft();
	    x.setLeft(y.getRight());
	    if (y.getRight() != TNULL) {
	      y.getRight().setParent(x);
	    }
	    y.setParent(x.getParent());
	    if (x.getParent() == null) {
	      this.root = y;
	    } else if (x == x.getParent().getRight()) {
	      x.getParent().setRight(y);
	    } else {
	      x.getParent().setLeft(y);
	    }
	    y.setRight(x);
	    x.setParent(y);
	  }

	  public void insert(int key) {
	    Nodo node = new Nodo();
	    node.setParent(null);
	    node.setData(key);
	    node.setLeft(TNULL);
	    node.setRight(TNULL);
	    node.setColor(1);

	    Nodo y = null;
	    Nodo x = this.root;

	    while (x != TNULL) {
	      y = x;
	      if (node.getData() < x.getData()) {
	        x = x.getLeft();
	      } else {
	        x = x.getRight();
	      }
	    }

	    node.setParent(y);
	    if (y == null) {
	      root = node;
	    } else if (node.getData() < y.getData()) {
	      y.setLeft(node);
	    } else {
	      y.setRight(node);
	    }

	    if (node.getParent() == null) {
	      node.setColor(0);
	      return;
	    }

	    if (node.getParent().getParent() == null) {
	      return;
	    }

	    fixInsert(node);
	  }

	  public Nodo getRoot() {
	    return this.root;
	  }

	  public void deleteNode(int data) {
	    deleteNodeHelper(this.root, data);
	  }

	  public void printTree() {
	    printHelper(this.root, "", true);
	  }

}

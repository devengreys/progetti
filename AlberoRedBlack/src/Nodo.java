
public class Nodo {
  private int data;
  private Nodo parent;
  private Nodo left;
  private Nodo right;
  private int color;
  
  public int getData() {
	return data;
  }

  public void setData(int data) {
	this.data = data;
  }

  public Nodo getParent() {
	return parent;
  }

  public void setParent(Nodo parent) {
	this.parent = parent;
  }

  public Nodo getLeft() {
	return left;
  }

  public void setLeft(Nodo left) {
	this.left = left;
  }

  public Nodo getRight() {
	return right;
  }

  public void setRight(Nodo right) {
	this.right = right;
  }

  public int getColor() {
	return color;
  }

  public void setColor(int color) {
	this.color = color;
  }
  
  
  
}
import java.awt.Polygon;

public class BSPNode {

	private BSPNode rightChild, leftChild;
	private Line line; // A.x, A.y, B.x, B.y (Directed A to B)
	private Polygon area;
	private boolean isIn;
	private boolean isLine;
	private boolean isArea;
	private boolean isFinishArea;

	public BSPNode(Line line) { // Line Node without children
		this.isIn = false;
		this.isLine = true;
		this.isArea = false;
		this.isFinishArea = false;
		this.line = line;
	}

	public BSPNode(Line line, BSPNode leftChild, BSPNode rightChild) { // Line Node with children
		this(line);
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public BSPNode(Polygon area, boolean isIn) // Area Node
	{
		this.isFinishArea = false;
		this.isIn = isIn;
		this.area = area;
		this.isLine = false;
		this.isArea = true;
		this.leftChild = null;
		this.rightChild = null;
	}

	public void setLeftChild(BSPNode leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(BSPNode rightChild) {
		this.rightChild = rightChild;
	}

	public BSPNode getRightChild() {
		return rightChild;
	}

	public BSPNode getLeftChild() {
		return leftChild;
	}

	public Polygon getArea() {
		return area;
	}

	public boolean isIn() {
		return isIn;
	}

	public Line getLine() {
		return line;
	}

	public boolean isLine() {
		return isLine;
	}

	public boolean isArea() {
		return isArea;
	}

	public boolean isFinishArea() {
		return isFinishArea;
	}

	public void setFinishArea(boolean isFinishArea) {
		this.isFinishArea = isFinishArea;
	}

}

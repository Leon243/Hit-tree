package imp;
public class Node {

	Node L;
	Node R;
	Node P;
	private int count,value;
	
	public Node(int val)
	{
		this.count = 0;
		this.L = null;
		this.R = null;
		this.P = null;
		this.value = val;
	}

	public Node getP() {
		return P;
	}

	public void setP(Node parent) {
		P = parent;
	}

	public Node getL() {
		return L;
	}

	public void setL(Node left) {
		L = left;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getR() {
		return R;
	}

	public void setR(Node right) {
		R = right;
	}
	public int numChildren() 
	   {
	      int children = 0;

	      if (L != null)
	         children = 1 + L.numChildren();

	      if (R != null)
	         children = children + 1 + R.numChildren();

	      return children;
	   }

	public int getCount() {
		return count;
	}

	public void setCount() {
		this.count++;
	}
	
}

package inter;

import imp.Node;

public interface HBT{
	
	public void insertNode(Node in);
	
	public Node removeNode(Node n);
	
	public boolean find(int Num);
	
	public boolean findNode(Node n);
	
	public Node getRoot();
	
	public int getNodeInTree();
	
	public Node rotationLeft( Node n);
	
	public Node rotationRight(Node temp);

}

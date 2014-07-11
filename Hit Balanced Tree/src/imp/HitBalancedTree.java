package imp;

import inter.HBT;

public class HitBalancedTree implements HBT {

	 Node root;
	 Node node1, node2;
	 int NodeInTree;

	public HitBalancedTree() {
		this.root = null;
		this.NodeInTree = 0;
	}

	public void insertNode(Node in) {
		if (root == null) {
			root = in;
		} else {
			node1 = in;
			node2 = root;
			while (node2 != null) {

				if (node2.getValue() < node1.getValue()) {
					if (node2.getR() == null) {
						node2.setR(node1);
						node1.setP(node2);
						break;
					}
					node2 = node2.getR();
				} else if (node2.getValue() >= node1.getValue()) {
					if (node2.getL() == null) {
						node2.setL(node1);
						node1.setP(node2);
						break;
					}
					node2 = node2.getL();
				}

			}
		}
		NodeInTree++;
	}

	public Node removeNode(Node n) {
		if (n.getL() == null && n.getR() == null) {
			n = null;
		} else if (n.getL() != null) {
			n.getL().setP(n.getP());
			n = null;
		} else if (n.getR() != null) {
			n.getR().setP(n.getP());
			n = null;
		}/*
		 * else { Node n2 = n.getR(); while (n2 != null) { if (n2.getL() == null
		 * && n2.getR() == null) {
		 * 
		 * } if (n.getR() != null) {
		 * 
		 * }
		 * 
		 * } }
		 */
		NodeInTree--;
		return n;
	}

	public boolean findNode(Node n) {
		if (root != null) {
			if (root.getValue() == n.getValue()) {
				return true;
			} else
				node2 = root;
			while (node2 != null) {
				if (node2.getValue() == n.getValue())

				{
					node2.setCount();
					return true;
				} else if (node2.getValue() > n.getValue()) {
					node2 = node2.getL();
				} else {
					node2 = node2.getR();
				}
			}
		}
		return false;
	}

	public boolean find(int inNum) {
		if (root != null) {
			if (root.getValue() == inNum) {
				return true;
			} else
				node2 = root;
			while (node2 != null) {
				if (node2.getValue() == inNum)

				{
					node2.setCount();
					return true;
				} else if (node2.getValue() > inNum) {
					node2 = node2.getL();
				} else {
					node2 = node2.getR();
				}
			}
		}
		return false;
	}

	public Node rotationLeft(Node temp) {
		Node r = temp.getR();
		r.setP(temp.getP());
		temp.setR(r.getL());

		if (temp.getR() != null) {
			temp.getR().setP(temp);
		}
		r.setL(temp);
		temp.setP(r);
		if (r.getP() != null) {
			if (r.getP().getR() == temp) {
				r.getP().setR(r);
			} else if (r.getP().getL() == temp) {
				r.getP().setL(r);
			}
			if (temp == root) {
				root = r;
			}
		}
		return r;
	}

	public Node rotationRight(Node temp) {
		Node r = temp.getR();
		r.setP(temp.getP());
		temp.setL(r.getR());

		if (temp.getL() != null) {
			temp.getL().setP(temp);
		}
		r.setR(temp);
		temp.setP(r);
		if (r.getP() != null) {
			if (r.getP().getR() == temp) {
				r.getP().setR(r);
			} else if (r.getP().getR() == temp) {
				r.getP().setR(r);
			}
			if (temp == root) {
				root = r;
			}
		}
		return r;
	}

	public Node getRoot() {
		return root;
	}

	public int getNodeInTree() {
		return NodeInTree;
	}
}
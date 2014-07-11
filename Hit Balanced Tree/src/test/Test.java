package test;

import imp.HitBalancedTree;
import imp.Node;
import junit.framework.TestCase;

import org.junit.Assert;

public class Test extends TestCase {
	
	public void testFind() {
		HitBalancedTree t1 = new HitBalancedTree();
		Node n1 = new Node(5);
		Node n2 = new Node(8);
		Node n3 = new Node(4);
		Node n4 = new Node(2);
		Node n5 = new Node(12);
		System.out.println("       " +n1.getValue() + "       ");
		System.out.println("               " +n2.getValue() + "       ");
		System.out.println("    " +n3.getValue() + "       ");
		System.out.println("" +n4.getValue() + "       ");
		System.out.println("               " +n5.getValue() + "       ");
		t1.insertNode(n1);
		t1.insertNode(n2);
		t1.insertNode(n3);
		t1.insertNode(n4);
		t1.insertNode(n5);
		Assert.assertEquals(t1.find(5), true);
		Assert.assertEquals(t1.find(8), true);
		Assert.assertEquals(t1.find(14), false);	
		Assert.assertEquals(t1.find(4), true);
		Assert.assertEquals(t1.find(20), false);
		Assert.assertEquals(t1.find(19), false);
		Assert.assertEquals(t1.find(2), true);
		Assert.assertEquals(t1.find(12), true);
		Assert.assertEquals(t1.findNode(n1), true);
		
		
	}

	public void testHit() {
		HitBalancedTree t1 = new HitBalancedTree();
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		Node n3 = new Node(4);
		Node n4 = new Node(2);
		Node n5 = new Node(10);
		t1.insertNode(n1);
		t1.insertNode(n2);
		t1.insertNode(n3);
		t1.insertNode(n4);
		t1.insertNode(n5);
		Assert.assertEquals(t1.getNodeInTree(), 5);
		Assert.assertEquals(t1.getRoot().getR().getValue(), 7);
		Assert.assertEquals(t1.getRoot().getL().getValue(), 4);
		Assert.assertEquals(t1.getRoot().getR().getR().getValue(), 10);
		Assert.assertEquals(t1.getRoot().getL().getL().getValue(), 2);
		Assert.assertEquals(t1.getRoot().getP(), null);
		Assert.assertEquals(t1.getRoot().getValue(), 5);
	}
	public void testNode() {
		HitBalancedTree t1 = new HitBalancedTree();
		Node n1 = new Node(4);
		t1.insertNode(n1);
		Assert.assertEquals(n1.getCount(), 0);
		n1.setCount();
		Assert.assertEquals(n1.getCount(), 1);
		Assert.assertEquals(n1.getR(), null);
		Assert.assertEquals(n1.getL(), null);
		n1.setValue(6);
		Assert.assertEquals(n1.getValue(), 6);
	}
	public void testRemove()
	{
		HitBalancedTree t1 = new HitBalancedTree();
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		Node n3 = new Node(4);
		Node n4 = new Node(2);
		Node n5 = new Node(10);
		t1.insertNode(n1);
		t1.insertNode(n2);
		t1.insertNode(n3);
		t1.insertNode(n4);
		t1.insertNode(n5);
		Assert.assertEquals(n3.getValue(), 4);
		Assert.assertEquals(n2.getP(),n1);
		System.out.println(n5.getValue());
		Assert.assertEquals(n2.getR(), n5);
		System.err.println(t1.getNodeInTree());
		System.out.println(t1.removeNode(n5));
		System.err.println(t1.getNodeInTree());
		Assert.assertEquals(t1.getNodeInTree(), 4);
	}
	public void testRotate()
	{
		HitBalancedTree t1 = new HitBalancedTree();
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		Node n3 = new Node(4);
		Node n4 = new Node(2);
		Node n5 = new Node(10);
		t1.insertNode(n1);
		t1.insertNode(n2);
		t1.insertNode(n3);
		t1.insertNode(n4);
		t1.insertNode(n5);
		t1.rotationLeft(n1);
		System.out.println(t1.getRoot().getP().getValue());
	}
	

}

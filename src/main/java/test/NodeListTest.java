package test;



import org.junit.jupiter.api.Test;

import interfaces.NodeList;
import junit.framework.TestCase;

class NodeListTest extends TestCase {

	
	private NodeList<String> node;
	private String m;
	private int num;
	public void stageOne() {
		
		num = 2;
		m = "t";
		node = new NodeList<String>(m, num);
		
	}
	
	@Test
	public void testGetInfo() {
		
		
		stageOne();
		
		assertEquals(node.getInfo(), m);
	}
	
	@Test
	public void testGetPriority() {
		
		
		stageOne();
		
		int s =  node.getKey();
		
		assertTrue(s == num);
	}
}

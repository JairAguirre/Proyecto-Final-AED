package test;



import org.junit.jupiter.api.Test;

import interfaces.Tree;
import junit.framework.TestCase;

class TreeTest extends TestCase{

	private Tree<String> tree;
	
	private String node;
	private String parent;
	
	
	public void stageOne() {
		
		tree =  new Tree<>();
		node = "1";
		parent = "2";
		
		for (int i = 0; i < 4; i++) {
			
			tree.add(node+i, parent+i);
		}
	}

	
	@Test
	public void testAdd() {
		
		stageOne();
		

		
	
		String root =  tree.getRoot().getElem();
		
		assertEquals(root, "10");
	}
	
	
}

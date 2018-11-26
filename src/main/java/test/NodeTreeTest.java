package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


import interfaces.NodeTree;
import junit.framework.TestCase;

class NodeTreeTest extends TestCase {

	
	private NodeTree<String> tree;
	private NodeTree<String> tree2;
	
	private String test;
	private String test2;
	
	public void stageOne() {
		test = "l";
		test2 = "2";
		
		tree =  new NodeTree<String>(test);
		tree2 =  new NodeTree<String>(test2);
		
		
	}
	
	
	
	@Test
	public void testAddChild() {
		
		stageOne();
		
		tree.addChild(tree2);
		
		NodeTree<String> m =  tree.getChilds().get(0);
				
		assertEquals(m, tree2);
	}

}

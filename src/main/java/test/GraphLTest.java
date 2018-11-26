package test;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import list.GraphL;
import matrix.GraphM;

class GraphLTest extends TestCase{

	private GraphL<String> graph;
	
	public void stageOne() {
		
		graph = new GraphL<>(4);
		
		
		
	}
	
	
	@Test
	public void testAddNode() {
		
		stageOne();
		
		for (int i = 0; i < 4; i++) {
			
			String m =  "re"+i;
			try {
				graph.addNode(m);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	assertTrue(graph.getTotalNodes() != 0);
		
	}
	
	@Test
	public void testBFs() throws Exception {
		
		stageOne();
		
		int m = graph.BFS();
		
		assertTrue(m == 0);
	}

}

package test;


import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import interfaces.Tree;
import junit.framework.TestCase;
import matrix.GraphM;
import matrix.NodeM;

class GraphMtest extends TestCase {

	private GraphM<String> graph;
	
	public void stageOne() {
		
		graph = new GraphM<>(4);
		
		for (int i = 0; i < 4; i++) {
			
			String m =  "re"+i;
			graph.addNodeM(m);
		}
		
	}

	@Test
	public void testIsEmpty() {
		
		
		stageOne();
		
		boolean is = graph.isEmpty();
		
		assertTrue(is == false);
		
	}
	
	
	@Test
	public void testAddNodeM() {
		
		stageOne();
		
		int limit = graph.getLimit();
		
		assertTrue(limit == 4);
	}
	
	@Test
	public void testSearchNodeM() {
		
		stageOne();
		
		NodeM<String> m =  graph.searchNodeM("re2");
		
		assertEquals(m.getElem(), "re2");
		
	}
	
	
	@Test 
	public void testDeleteEdge() {
		
		stageOne();
		
		graph.deleteEdge("re3", "re4");
		
	}
	
	@Test
	public void testAdjacentNode() {
		
		stageOne();
		
	boolean m = 	graph.adjacentNodeM("re1", "re3");
		
		assertTrue( m == false);
	}
	
	@Test
	public void tesGetDistance() {
		
		stageOne();
		
		//siempre retorna cero
		
		int m = graph.getDistance("re2", "re4");
		
		assertTrue(m ==0);
	}
	
	@Test
	public void testFloydWarshall() {
		
		stageOne();
		
		int[][] m =  graph.floydWarshall();
		
		int[][] g =  graph.floydWarshall();
		
		assertArrayEquals(m, g);
		
		
		}
	
	@Test 
	public void testDijkstra() {
		
		
		stageOne();
		
		double[]  arr =  graph.dijkstra("re0");
		double[]  arr2 =  graph.dijkstra("re0");
		assertEquals(arr, arr2);
	}
	
	
	@Test 
	public void testBFs() throws Exception {
		
		stageOne();
		
		Tree<String> m =  graph.BFS("re0");
		
		
		String root = m.getRoot().getElem();
		
		assertEquals(root, "re0");
		
	}
	
	@Test 
	public void testDFS() throws Exception  {
		
//		stageOne();
//		
//		ArrayList<String> m =  graph.DFS("re0");
//		
//		System.out.println(m.size());
////		
//		String root = m.get(0);
//		
//		System.out.println(root);
//		//assertEquals(root, "re0");
		
	}
}
	


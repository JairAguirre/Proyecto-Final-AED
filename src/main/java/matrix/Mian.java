package matrix;

import interfaces.Tree;

public class Mian {
	
	public static void main(String[] args) throws Exception {
		
		GraphM<Integer> g = new GraphM<Integer>(5);
//		Heap<Integer> h = new Heap<Integer>(10);
//		
//		h.insertMin(4, 4);
//	//	h.insertMin(1, 1);
//		h.insertMin(3, 3);
//		h.insertMin(6, 6);
//		h.insertMin(5, 5);
//		h.insertMin(7, 7);
//		h.insertMin(10, 10);
//		
//		System.out.println(h.removeMin());
//		
		g.addNodeM(1);
		g.addNodeM(30);
		g.addNodeM(22);
		g.addNodeM(6);
		g.addNodeM(4);
		
		g.addEdge(1, 30, 2);
		g.addEdge(30, 4, 7);
		g.addEdge(4, 30, 50);
		g.addEdge(1, 22, 6);
		g.addEdge(30, 6, 12);
		g.addEdge(4, 6, 5);
		g.addEdge(6, 4, 9);
		g.addEdge(22, 4, 1);
		
		
		
		
		int[] disktraj = g.dijkstra(22);
		NodeM<Integer> n = g.searchNodeM(6);
		
		
		System.out.println(disktraj[n.getPos()]);
		
		
		int[][] floyd = g.floydWarshall();
		
		NodeM<Integer> n1 = g.searchNodeM(4);
		NodeM<Integer> n2 = g.searchNodeM(6);
		
		System.out.println(floyd[n1.getPos()][n2.getPos()]);
		
		Tree<Integer> t = g.BFS(1);
		
		System.out.println(t.print());
		System.out.println(g.DFS(1));
		
		
	}

}

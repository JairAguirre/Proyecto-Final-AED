package matrix;

import java.util.ArrayList;
import java.util.LinkedList;

import interfaces.Heap;
import interfaces.IGraphM;
import interfaces.IHeap;
import interfaces.Queque;
import interfaces.StructureStackQueue;
import interfaces.Tree;

public class GraphM<T> implements IGraphM<T> {
	
	private int limit;
	private double[][] matrix;
	private LinkedList<NodeM<T>> nodes;
	private int[] parent;
	
	
	public GraphM(int nod) {
		matrix = new double[nod][nod];
		nodes = new LinkedList<NodeM<T>>();
		limit = 0;
	}
	
	public boolean isEmpty() {
		boolean empty = false;
		if(limit == 0) {
			empty = true;
		}
		return empty;
	}

	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}


	/**
	 * @return the matrix
	 */
	public double[][] getMatrix() {
		return matrix;
	}

	/**
	 * @param matrix the matrix to set
	 */
	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}

	/**
	 * @return the nodes
	 */
	public LinkedList<NodeM<T>> getNodes() {
		return nodes;
	}

	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(LinkedList<NodeM<T>> nodes) {
		this.nodes = nodes;
	}

	
	public void addNodeM(T key) {
		
		NodeM<T> node = searchNodeM(key);
		if(node == null) {
			node = new NodeM<T>(key);
			nodes.add(node);
			node.setPos(nodes.indexOf(node));
			limit++;
			
		}
		
	}
	@Override
	public void addEdge(T key, T key2, double dis) {
		
		NodeM<T> v1 = searchNodeM(key);
		NodeM<T> v2 = searchNodeM(key2);
		
		if(v1 == null) {
			addNodeM(key);
			v1 = searchNodeM(key);
		}
		if(v2 == null) {
			addNodeM(key2);
			v2 = searchNodeM(key2);
		}
		
		int pos1 = nodes.indexOf(v1);
		int pos2 = nodes.indexOf(v2);
		
		matrix[pos1][pos2] = dis;
		matrix[pos2][pos1] = dis; 
		v1.getAdjacents().add(v2);
		v2.getAdjacents().add(v1); 
		
	}


	public NodeM<T> searchNodeM(T key) {
		
		NodeM<T> node = null;
		boolean find = false;
		for(int i = 0; i < nodes.size() && !find; i++) {
			if(nodes.get(i).getElem().equals(key)) {
				node = nodes.get(i);
				find = true;
			}
		}
		return node;
	}

	
	public void deleteNodeM(T key) {
		NodeM<T> v = searchNodeM(key);
		if(v != null) {
			int pos = nodes.indexOf(v);
			for(int i = 0; i < limit; i++) {
				matrix[pos][i]= 0;
			}
			for(int i = pos; i < limit; i++) {
				for(int j = pos; j < limit; j++) {
					matrix[i][j] = matrix[i+1][j+1];
				}
			}
			limit--;
		}
		nodes.remove(v);
		
	}


	public void deleteEdge(T key, T key2) {
		NodeM<T> v1 = searchNodeM(key);
		NodeM<T> v2 = searchNodeM(key2);
		if (v1 != null && v2 != null) {
			int pos1 = nodes.indexOf(v1);
			int pos2 = nodes.indexOf(v2);
			matrix[pos1][pos2]= 0;
		}
		
	}

	
	public boolean adjacentNodeM(T key, T key2) {
		boolean y = false;
		
		NodeM<T> v1 = searchNodeM(key);
		NodeM<T> v2 = searchNodeM(key2);
		if (v1 != null && v2 != null) {
			int pos1 = nodes.indexOf(v1);
			int pos2 = nodes.indexOf(v2);
			if(matrix[pos1][pos2] != 0) {
				y = true;
			}
		}
		
		return y;
	}

	@Override
	public double getDistance(T key, T key2) {
		double dis = 0;
		
		NodeM<T> v1 = searchNodeM(key);
		NodeM<T> v2 = searchNodeM(key2);
		
		if (v1 != null && v2 != null) {
			int pos1 = nodes.indexOf(v1);
			int pos2 = nodes.indexOf(v2);
			dis = matrix[pos1][pos2];
		}
		return dis;
	}

	public double[] dijkstra(T key) {
		
		NodeM<T> v1 = searchNodeM(key);
		int origin = nodes.indexOf(v1);
		double[] distance = new double[nodes.size()];
		parent =  new int[nodes.size()];
		boolean[] visit = new boolean[nodes.size()];
		
		for(int i = 0; i < nodes.size(); i++) {
			distance[i] = Double.MAX_VALUE;
			parent[i] = -1;
			visit[i] = false;
		}
		
		distance[origin] = 0;
		IHeap<Integer> queue = new Heap<Integer>(100000);
		queue.insertMin(origin, origin);
		
		
		
		while(!(queue.size()==0)) {
			
//			int u = origin;
			int u = queue.removeMin();
			visit[u] = true;
			for(int i = 0; i < nodes.size(); i++) {
				
				if(matrix[u][i] != 0) {
					if(distance[i]> distance[u]+ matrix[u][i]) {
						distance[i] = distance[u] + matrix[u][i];
						parent[i] = u;
						queue.insertMin(i, i);
					}
				}
			}
		}
		return distance;
	}
	
	public int[] dijkstraParent(T key) {
		
		NodeM<T> v1 = searchNodeM(key);
		int origin = nodes.indexOf(v1);
		double[] distance = new double[nodes.size()];
		parent =  new int[nodes.size()];
		boolean[] visit = new boolean[nodes.size()];
		
		for(int i = 0; i < nodes.size(); i++) {
			distance[i] = Double.MAX_VALUE;
			parent[i] = -1;
			visit[i] = false;
		}
		
		distance[origin] = 0;
		IHeap<Integer> queue = new Heap<Integer>(100000);
		queue.insertMin(origin, origin);
		
		
		
		while(!(queue.size()==0)) {
			
//			int u = origin;
			int u = queue.removeMin();
			visit[u] = true;
			for(int i = 0; i < nodes.size(); i++) {
				
				if(matrix[u][i] != 0) {
					if(distance[i]> distance[u]+ matrix[u][i]) {
						distance[i] = distance[u] + matrix[u][i];
						parent[i] = u;
						queue.insertMin(i, i);
					}
				}
			}
		}
		return parent;
	}
	
	public void infinite(double[][] floyd) {
		
		for(int i = 0; i < limit; i++) {
			for(int j = 0; j < limit; j++) {
				if(floyd[i][j] == 0 && i != j) {
					floyd[i][j] = Double.MAX_VALUE;
				}
			}
		}
		
	}

	public double[][] floydWarshall(){
		
		double[][] floyd = new double[nodes.size()][nodes.size()];
		
		for(int i = 0; i < nodes.size(); i++) {
			for(int j = 0; j < nodes.size(); j++) {
				floyd[i][j] = matrix[i][j];
			}
		}
		
		infinite(floyd);
		for(int s = 0; s < limit; s++) {
			for(int i = 0; i < limit; i++) {
				for(int j = 0; j < limit; j++) {
					if(s != i && s != j) {
						long n = (long)floyd[i][s] + (long)floyd[s][j];
						if(floyd[i][j] > n) {
							floyd[i][j] = (double)n;
							
						}
					}
				}
			}
		}
		return floyd;
	}
	
	public Tree<T> BFS(T origin) throws Exception{
		
		Tree<T> bfs = new Tree<T>();
		NodeM<T> n = searchNodeM(origin);
		
		boolean[] visit = new boolean[nodes.size()] ;
		
		visit[n.getPos()] = true;
		Queque<Integer> queue = new StructureStackQueue<Integer>();
		bfs.add(nodes.get(n.getPos()).getElem(),null);
		queue.enqueque(n.getPos());
		
		while(!queue.isEmptyQ()) {
			int u = queue.dequeque();
			for(int i = 0; i< nodes.size(); i++) {
				if( !visit[i]) {
					queue.enqueque(i);
					bfs.add(nodes.get(i).getElem(),nodes.get(u).getElem());
					visit[i] = true;
					
				}
			}
			
		}
		
		return bfs;
	}
	
	public ArrayList<T> DFS(T origin) throws Exception {
		boolean[] visit = new boolean[nodes.size()];
		
		ArrayList<T> path = new ArrayList<T>();
		for(int i=0; i<nodes.size(); i++) {
			visit[i]=false;
		}
		
		NodeM<T> n = searchNodeM(origin);
		Queque<Integer> queque = new StructureStackQueue<>();
		visit[n.getPos()]=true;
		queque.enqueque(n.getPos());
		path.add(n.getElem());
		
		while(!queque.isEmptyQ()) {
			int u = queque.dequeque();
			for(int i=0; i<nodes.size(); i++) {
				if(!visit[i]) {
					queque.enqueque(i);
					visit[i]=true;
					path.addAll(DFS(nodes.get(i).getElem()));
					
				}
			}
		}
		return path;
	}

	@Override
	public int getPosN(T key) {
		
		NodeM<T> node = null;
		boolean find = false;
		for(int i = 0; i < nodes.size() && !find; i++) {
			if(nodes.get(i).getElem().equals(key)) {
				node = nodes.get(i);
				find = true;
			}
		}
		return node.getPos();
	}

	

}

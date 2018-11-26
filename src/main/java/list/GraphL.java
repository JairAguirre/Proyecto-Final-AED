package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;

import interfaces.DisjointSets;
import interfaces.IGraphL;
import interfaces.INodeL;
import interfaces.NodeAdyacentWeight;
import interfaces.Queque;
import interfaces.Stack;
import interfaces.StructureStackQueue;

public class GraphL<T> implements IGraphL<T> {
	
	private HashMap<T, NodeL<T>> nodes;
	
	int maxNodes;
	int totalNodes;
	
	public GraphL(int maxNodes) {
		nodes = new HashMap<>();
		this.maxNodes = maxNodes;
		totalNodes = 0;
	}

	public HashMap<T, NodeL<T>> getNodes(){
		return nodes;
	}
	
	@Override
	public void addNode(T node) throws Exception {
		NodeL<T> n = new NodeL<T>(node);
		if(nodes.get(node) != null) {
			throw new Exception("Nodo ya existente");
		}
		if(totalNodes == maxNodes) {
			throw new Exception("Número máximo de nodos alcanzados");
			
		}
		nodes.put(node, n);
		totalNodes++;
		
	}

	@Override
	public void addEdge(T node1, T node2, double distance) throws Exception {
		NodeL<T> n1 = nodes.get(node1);
		NodeL<T> n2 = nodes.get(node2);
		if(n1 == null || n2 == null) {
			throw new Exception("Uno de los nodos no existe");
		}
		n1.addAdjacents(n2);
		n1.addDistance(n2, distance);
		
//		n2.addAdjacents(n1);
//		n2.addDistance(n1, distance);
		
	}

	@Override
	public int BFS(T Norigin) throws Exception {
		for(T na : nodes.keySet()) {
			nodes.get(na).setVisit(false);
		}
		int find = 0;
		NodeL<T> act = nodes.get(Norigin);
		if(act == null) {
			throw new Exception("Nodo existe el nodo");
		}
		
		Queque<NodeL<T>> queque = new StructureStackQueue<NodeL<T>>();
		queque.enqueque(act);
		find++;
		act.setVisit(true);
		while(!queque.isEmptyQ()) {
			NodeL<T> n = queque.dequeque();
			ArrayList<INodeL<T>> adjacents = n.getAdjacents();
			for(int i = 0; i < adjacents.size(); i++) {
				if(!adjacents.get(i).isVisit()) {
					adjacents.get(i).setVisit(true);
					find++;
					adjacents.get(i).setParent(n);
					queque.enqueque((NodeL<T>)adjacents.get(i));
				}
			}
			n.setVisit(true);
		}
		
		return find;
	}

	@Override
	public int BFS() {
		int bfs;
		Set<T> keys = nodes.keySet();
		try {
			bfs = BFS(keys.iterator().next());
		}catch(Exception e) {
			bfs = 0;
		}
		return bfs;
	}

	@Override
	public void DFS() throws Exception {
	for(T actual : nodes.keySet()) {
		nodes.get(actual).setVisit(true);
	}
	
	for(T a: nodes.keySet()) {
		NodeL<T> act = nodes.get(a);
		if(!act.isVisit()) {
			Stack<NodeL<T>> stack = new StructureStackQueue<NodeL<T>>();
			stack.push(act);
			while(!stack.isEmpty()) {
				NodeL<T> actual = stack.pop();
				if(!actual.isVisit()) {
					actual.setVisit(true);
					ArrayList<INodeL<T>> adjacents = actual.getAdjacents();
					for(int i = 0; i < adjacents.size(); i++) {
						NodeL<T> add = (NodeL<T>) adjacents.get(i);
						if(!add.isVisit()) {
							stack.push(add);
							add.setParent(actual);
						}
					}
				}
			}
		}
	}
		
	}
	
	
	public NodeL<T> getNode(T elem){
		return nodes.get(elem);
	}
	

	@Override
	public IGraphL<T> prim() throws Exception {
		
		int cant = nodes.size();
		int cantReal = BFS();
		if(cant != cantReal)
			throw new Exception("Grafo no conexo");
		PriorityQueue<NodeAdyacentWeight<NodeL<T>>> queue = new PriorityQueue<>();
		GraphL<T> r = new GraphL<T>(maxNodes);
		HashMap<T, NodeL<T>> newNodes = new HashMap<>();
		for(T na : nodes.keySet()) {
			NodeL<T> actual = nodes.get(na);
			T elemActual = actual.getElem();
			actual.setVisit(false);
			r.addNode(elemActual);
			NodeL<T> n = r.getNode(elemActual);
			newNodes.put(elemActual, n);
			ArrayList<INodeL<T>> adjacents = actual.getAdjacents();
			for(int i = 0; i < adjacents.size(); i++) {
				queue.add(new NodeAdyacentWeight<NodeL<T>>(actual,actual.getDistanceAdjacent((NodeL<T>)adjacents.get(i)), (NodeL<T>)adjacents.get(i)));
				
			}	
		}
		
		NodeAdyacentWeight<NodeL<T>> lowEdge = queue.poll();
		NodeL<T> actual = lowEdge.getNode();
		queue = new PriorityQueue<>();
		queue.add(lowEdge);
		
		
		while(!queue.isEmpty()) {
			actual.setVisit(true);
			ArrayList<INodeL<T>> adjacents =actual.getAdjacents();
			for(int i = 0 ; i < adjacents.size(); i++) {
				NodeL<T>  adjcentActual= (NodeL<T>) adjacents.get(i);
				if(!adjcentActual.isVisit()) {
					NodeAdyacentWeight<NodeL<T>> newEdge=  new NodeAdyacentWeight<NodeL<T>>(actual, actual.getDistanceAdjacent(adjcentActual), adjcentActual);
					queue.add(newEdge);
				}
				
			}
			
			
			boolean add = false;
			while(!add && queue.isEmpty()) {
				NodeAdyacentWeight<NodeL<T>> nextEdge = queue.poll();
				if(!nextEdge.getAdjacent().isVisit()) {
					r.addEdge(nextEdge.getNode().getElem(), nextEdge.getAdjacent().getElem(), nextEdge.getDistance());
					add = true;
					actual = nextEdge.getAdjacent();
				}
			}
		
		}

		return r;
	}

	@Override
	public GraphL<T> Kruskal() throws Exception {
		// TODO Auto-generated method stub
		
		GraphL<T> gOut = new  GraphL<T>(maxNodes);
		DisjointSets set = new DisjointSets(maxNodes);
		
		for(int i = 0; i < totalNodes; i++) {
			try {
				gOut.addNode(nodes.get(i).getElem());
				nodes.get(i).setVisit(false);
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
		
		ArrayList<NodeAdyacentWeight<NodeL<T>>> edges = new ArrayList<>();
		
		for(T key : nodes.keySet()) {
			NodeL<T> actual = new NodeL<>(key);
		}
		
		
		Collections.sort(edges);
		
		for(int k = 0; k < edges.size(); k++) {
			NodeAdyacentWeight<NodeL<T>> edge = edges.get(k);
			NodeL<T> i = edge.getNode();
			NodeL<T> J = edge.getAdjacent();
		}
		return gOut;
	}

	@Override
	public WeightList<T> Dijkstra(T node1, T node2) throws Exception {
	
		HashMap<NodeL<T>, Double> l = new HashMap<>();
		HashMap<NodeL<T>, Double> s = new HashMap<>();
		
		for(T na : nodes.keySet()) {
			l.put(nodes.get(na), Double.MAX_VALUE);
		}
		
		NodeL<T>  n1 = nodes.get(node1);
		NodeL<T>  n2 = nodes.get(node2);
		if(n1 == null || n2 == null) {
			throw new Exception("Uno de los nodos no existe");
		}
		l.put(n1, 0.0);
		PriorityQueue<NodeL<T>> heap = new PriorityQueue<>();
		heap.add(n1);
		boolean find = false;
		while(s.get(n2) == null && !heap.isEmpty()) {
			NodeL<T> actual = heap.poll();
			HashMap<INodeL<T>, Double> actualDistances = actual.getDistances();
			double lActual = l.get(actual);
			
			s.put(actual, 0.0);
			if(actual == n2){
				find = true;
			}
			
			ArrayList<INodeL<T>> adjacents = actual.getAdjacents();
			for(int i = 0; i < adjacents.size(); i++) {
				NodeL<T> actualAdjacent = (NodeL<T>) adjacents.get(i);
				Double newActualDistances = actualDistances.get(actualAdjacent);
				if(newActualDistances + lActual < l.get(actualAdjacent)) {
					actualAdjacent.setParent(actual);
					actualAdjacent.setDistancePrevPath(newActualDistances + lActual);
					l.put(actualAdjacent, newActualDistances + lActual);
					heap.add(actualAdjacent);
				}
			}
			
			
			
		}
		
		if(!find)
			throw new Exception("Imposible llegar del nodo 1 al nodo 2");
		LinkedList<T> path = new LinkedList<T>();
		NodeL<T> actual = n2;
		while(actual != n1) {
			T elem = actual.getElem();
			path.addFirst(elem);
			actual = (NodeL<T>) actual.getParent();
		}
		path.addFirst(n1.getElem());
		
		return new WeightList<>(path, l.get(n2));
	}
	
	@Override
	public ArrayList<T> getAdjacents(T node) throws Exception {
		if(nodes.get(node)== null) {
			throw new Exception("Nodo no encontrado");
		}
		
		ArrayList<INodeL<T>> adjacents = nodes.get(node).getAdjacents();
		ArrayList<T> r = new ArrayList<T>();
		for(int i = 0; i <adjacents.size(); i++) {
			r.add(adjacents.get(i).getElem());
		}
		return r;
	}

	@Override
	public T getParent(T node) throws Exception {
		
		return nodes.get(node).getParent().getElem();
	}

	@Override
	public void deleteNode(T node) throws Exception {
		NodeL<T>  delete = nodes.get(node);
		if(delete == null)
			throw new Exception("Nodo no existe");
		for(T k : nodes.keySet()) {
			NodeL<T> actual = nodes.get(k);
			actual.getAdjacents().remove(delete);
			actual.getDistances().remove(delete);
		}
		nodes.remove(node);
		
	}

	@Override
	public void deleteEdge(T node1, T node2) throws Exception {
		NodeL<T> n1 = nodes.get(node1);
		NodeL<T> n2 = nodes.get(node2);
		
		if(n1==null || n2==null||n1.getDistanceAdjacent(n2)==null )
			throw new Exception("Arista o nodo no existente");
		
		n1.getAdjacents().remove(n2);
		n1.getDistances().remove(n2);
		
//		n1.getAdjacents().remove(n2);  no dirigido
//		n1.getDistances().remove(n2);

	}

	@Override
	public double getDistance(T node1, T node2) throws Exception {
		NodeL<T> n1 = nodes.get(node1);
		NodeL<T> n2 = nodes.get(node2);
		if(n1 == null || n2 == null || n1.getDistanceAdjacent(n2)== null)
			throw new Exception("Arista o nodo no existente");
		return n1.getDistances().get(n2);
	}
	
	

}

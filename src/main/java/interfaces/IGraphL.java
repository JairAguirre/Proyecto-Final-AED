package interfaces;

import java.util.ArrayList;

import list.GraphL;
import list.WeightList;


public interface IGraphL<T> {
	
	public void addNode (T node) throws Exception;
	public void addEdge (T node1, T node2, double distance) throws Exception;
	public int BFS (T Norigin) throws Exception;
	public int BFS ();
	public void DFS() throws Exception;
	public IGraphL<T> prim() throws Exception;
	public GraphL<T> Kruskal() throws Exception;
	public WeightList<T> Dijkstra  (T node1, T node2) throws Exception;
//	public double[][] FloydWarshall () throws Exception;
	public ArrayList <T> getAdjacents (T node) throws Exception;
	public T getParent (T node) throws Exception;
	public void deleteNode (T node) throws Exception;
	public void deleteEdge (T node1, T node2) throws Exception;
	public double getDistance (T node1, T node2) throws Exception;
	

}

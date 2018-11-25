package list;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.INodeL;
import interfaces.Node;

public class NodeL<T> extends Node<T> implements INodeL<T>, Comparable<NodeL<T>>{
	
	private ArrayList<INodeL<T>> adjacents;
	private HashMap<INodeL<T>, Double> distances;
	private double distancePrevPath;
	
	public NodeL(T elem) {
		super(elem);
		adjacents = new ArrayList<INodeL<T>>();
		distances = new HashMap<>();
	}

	@Override
	public int compareTo(NodeL<T> n) {
		if(distancePrevPath == n.distancePrevPath) {
			return 0;
		}else if(distancePrevPath < n.distancePrevPath) {
			return -1;
		}else {
			return 0;
		}
		
	}

	@Override
	public ArrayList<INodeL<T>> getAdjacents() {
		return adjacents;
	}

	@Override
	public HashMap<INodeL<T>, Double> getDistances() {
		return distances;
	}

	@Override
	public void addAdjacents(INodeL<T> n) {
		adjacents.add(n);
		
	}

	@Override
	public void addDistance(INodeL<T> adjacent, Double distance) {
		distances.put(adjacent, distance);
		
	}
	
	public void setDistancePrevPath(double distancePrevPath) {
		this.distancePrevPath = distancePrevPath;
	}
	
	public double getDistancePrevPath() {
		return distancePrevPath;
	}
	
	public Double getDistanceAdjacent(INodeL<T> n) {
		return distances.get(n);
	}
	
	
	
}

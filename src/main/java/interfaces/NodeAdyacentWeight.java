package interfaces;

public class NodeAdyacentWeight<N extends Node> implements Comparable<NodeAdyacentWeight<N>>{

	private N node;
	private double distance;
	private N adjacent;
	
	public NodeAdyacentWeight(N node, double distance, N adjacent) {
		this.node = node;
		this.distance = distance;
		this.adjacent = adjacent;
				
	}
	
	
	
	
	
	public N getNode() {
		return node;
	}





	public void setNode(N node) {
		this.node = node;
	}





	public double getDistance() {
		return distance;
	}





	public void setDistance(double distance) {
		this.distance = distance;
	}





	public N getAdjacent() {
		return adjacent;
	}





	public void setAdjacent(N adjacent) {
		this.adjacent = adjacent;
	}





	@Override
	public int compareTo(NodeAdyacentWeight<N> o) {
		Double d1 = distance;
		Double d2 = o.distance;
		return d1.compareTo(d2);
	}

	
	
}

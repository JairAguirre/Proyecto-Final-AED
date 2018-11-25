package interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public interface INodeL<T> extends INode<T> {
	
	ArrayList<INodeL<T>> getAdjacents();
	HashMap<INodeL<T>, Double> getDistances();
	void addAdjacents(INodeL<T> n);
	void addDistance(INodeL<T> adjacent, Double distance);

}

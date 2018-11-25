package matrix;

import java.util.LinkedList;

public class NodeM<T> {
	
	private T elem;
	private int pos;
	private boolean visit;
	private LinkedList<NodeM<T>> adjacents;
	
	public NodeM(T elem) {
		this.elem = elem;
		adjacents = new LinkedList<NodeM<T>>();
		visit = true;
	}

	/**
	 * @return the elem
	 */
	public T getElem() {
		return elem;
	}

	/**
	 * @param elem the elem to set
	 */
	public void setElem(T elem) {
		this.elem = elem;
	}

	/**
	 * @return the pos
	 */
	public int getPos() {
		return pos;
	}

	/**
	 * @param pos the pos to set
	 */
	public void setPos(int pos) {
		this.pos = pos;
	}

	/**
	 * @return the visit
	 */
	public boolean isVisit() {
		return visit;
	}

	/**
	 * @param visit the visit to set
	 */
	public void setVisit(boolean visit) {
		this.visit = visit;
	}

	/**
	 * @return the adjacents
	 */
	public LinkedList<NodeM<T>> getAdjacents() {
		return adjacents;
	}

	/**
	 * @param adjacents the adjacents to set
	 */
	public void setAdjacents(LinkedList<NodeM<T>> adjacents) {
		this.adjacents = adjacents;
	}
	
	

}

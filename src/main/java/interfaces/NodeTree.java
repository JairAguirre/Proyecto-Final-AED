package interfaces;

import java.util.ArrayList;

public class NodeTree<T> {

	private T elem;
	private String key;
	private ArrayList<NodeTree<T>> childs;
	private NodeTree<T> parent;
	
	
	public NodeTree(T elem) {
		this.elem = elem;
		childs = new ArrayList<NodeTree<T>>();
	}
	
	public void addChild(NodeTree<T> child) {
		childs.add(child);
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
	 * @return the childs
	 */
	public ArrayList<NodeTree<T>> getChilds() {
		return childs;
	}


	/**
	 * @param childs the childs to set
	 */
	public void setChilds(ArrayList<NodeTree<T>> childs) {
		this.childs = childs;
	}


	/**
	 * @return the parent
	 */
	public NodeTree<T> getParent() {
		return parent;
	}


	/**
	 * @param parent the parent to set
	 */
	public void setParent(NodeTree<T> parent) {
		this.parent = parent;
	}
	
	
	
}

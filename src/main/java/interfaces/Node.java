package interfaces;

public abstract class Node<T> implements INode<T> {
	
	private boolean visit;
	private T elem;
	private Node<T> parent;
	
	public Node(T elem) {
		this.elem = elem;
		visit = false;
		parent = null;
	}
	
	@Override
	public boolean isVisit() {
		return visit;
	}
	
	@Override
	public void setVisit(boolean visit) {
		this.visit = visit;
	}

	@Override
	public Node<T> getParent() {
		return parent;
	}

	@Override
	public void setParent(Node<T> parent) {
		this.parent = parent;
		
	}

	@Override
	public T getElem() {
		return elem;
	}

	@Override
	public void setElem(T elem) {
		this.elem = elem;
		
	}
	

}

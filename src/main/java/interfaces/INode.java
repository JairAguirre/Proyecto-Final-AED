package interfaces;

public interface INode<T> {
	
	public boolean isVisit();
	public void setVisit(boolean visit);
	public Node<T> getParent();
	public void setParent(Node<T> parent);
	public T getElem();
	public void setElem(T elem);

}

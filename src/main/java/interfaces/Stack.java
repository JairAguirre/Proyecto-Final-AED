package interfaces;

public interface Stack<A> {
	
	public void push(A a);
	
	public A pop() throws Exception;
	
	public A top() throws Exception;
	
	public boolean isEmpty();
	
//	public boolean buscar(A a);
		
	public void removeAll();
	
	public int size();

}

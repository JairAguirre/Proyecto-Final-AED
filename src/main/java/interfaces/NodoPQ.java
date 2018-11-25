package interfaces;

public class NodoPQ<A> {
	
	private A element;
	
	private NodoPQ<A> next;

	public NodoPQ(A element) {
		this.element = element;
		this.next = null;
	}

	/**
	 * @return the element
	 */
	public A getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(A element) {
		this.element = element;
	}

	/**
	 * @return the next
	 */
	public NodoPQ<A> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(NodoPQ<A> next) {
		this.next = next;
	}
	
	
	
	
	
}

package list;

import java.util.LinkedList;

public class WeightList<T> {
	
	private LinkedList<T> list;
	private double total;
	
	public WeightList(LinkedList<T> list, double total) {
		this.list = list;
		this.total = total;
	}

	public LinkedList<T> getList() {
		return list;
	}

	public void setList(LinkedList<T> list) {
		this.list = list;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public String toString() {
		return String.valueOf(total);
	}

}

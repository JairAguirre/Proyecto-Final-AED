package interfaces;

public class DisjointSets {
	
	private int[] array;
	
	public DisjointSets(int n) {
		array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = i;
		}
	}
	
	public int findSet(int i) {
		if (array[i] == i) {
			return i;
		} else {
			array[i] = findSet(array[i]); 
			return array[i];
		}
	}
	
	public boolean isSame(int i, int j) {
		return findSet(i)== findSet(j);
	}
	
	public void join(int i, int j) {
		if(!isSame(i,j)) {
			int x = findSet(i);
			int y = findSet(j);
			
			array[x] = y;
		}
	}
	
}

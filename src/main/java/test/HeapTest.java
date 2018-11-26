package test;



import org.junit.jupiter.api.Test;

import interfaces.Heap;
import junit.framework.TestCase;

public class HeapTest extends TestCase {

	private Heap<String> heap;
	
	public void stageOne() {
		
		heap = new Heap<>(7);
		for (int i = 7; i > 0; i--) {
			
		heap.insertMin("e"+i, i);
		}
	}
	
	public void stageTwo() {
		
		heap = new Heap<>(7);
		for (int i = 0; i < 7; i++) {
			
		heap.insertMax("e"+i, i);
		}
	}
	@Test
	public void testInsertMin() {
	
		stageOne();
	
		int m = heap.getSizeM();
	
		assertTrue(m == 7);
		
	}
	@Test
	public void testInsertMax() {
	
		stageTwo();
	
		int m = heap.getSizeM();
	
		assertTrue(m == 7);
		
	}
	
	@Test
	public void testRemoveMin() {
	
		stageTwo();
	
		heap.removeMin();
		int m = heap.getSizeM();
	
		System.out.println(m);
		assertTrue(m == 6);
		
	}
	
	@Test
	public void testRemoveMax() {
	
		stageTwo();
	
		heap.removeMax();
		int m = heap.getSizeM();
		assertTrue(m == 6);
		
	}
	
	@Test
	public void testMaxHeapify() {
		
		stageTwo();
		
		heap.maxHeapify(1);
	}
	
	@Test
	public void testMinHeapify() {
		
		stageOne();
		
		heap.minHeapify(1);
	}


}

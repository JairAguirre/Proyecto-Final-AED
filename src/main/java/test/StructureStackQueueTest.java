package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import interfaces.StructureStackQueue;
import junit.framework.TestCase;

class StructureStackQueueTest extends TestCase{

	private StructureStackQueue<String> queue;
	
	public void stageOne() {
		
		queue = new StructureStackQueue<>();
		
		for (int i = 0; i <7; i++) {
			
			queue.push("re"+i);
		}
	}

	public void stageTwo() {
		
		queue = new StructureStackQueue<>();
		
		for (int i = 0; i <7; i++) {
			
			queue.enqueque("re"+i);
		}
	}
	@Test 
	public void testPush() {
		
		stageOne();
		
		int m = queue.size();
		
		assertTrue(m == 7);
	}
	
	@Test 
	public void testPop() throws Exception {
		
		stageOne();
		
		String m =  queue.pop();
		
		assertEquals(m, "re6");
	}
	
	@Test 
	public void testTop() throws Exception {
		
		stageOne();
		
		String m =  queue.top();
		
		assertEquals(m, "re6");
	}
	
	@Test 
	public void testEnqueue() {
		
		stageTwo();
		
		int m = queue.sizeQ();
		
		assertTrue(m == 7);
	}
	
	@Test 
	public void testFront() throws Exception {
		
		stageTwo();
		
		String m = queue.front();
		
		assertEquals(m, "re0");
	}
	
	@Test 
	public void testDequeuet() throws Exception {
		
		stageTwo();
		
		String m = queue.dequeque();
		
		assertTrue(queue.sizeQ() == 6);
	}
	
}

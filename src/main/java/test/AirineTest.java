package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Airline;
import model.City;

class AirineTest extends TestCase{

	
	private Airline airline;
	private String name;
	private String link;
	private int city;
	private City ci;
	private City ci2;
	public void stageOne() {
		
		ci2 = new City("Cali");
		ci = new City("Bogotá");
		airline = new Airline(name, link, 1);
	}
	@Test
	public void testAddCity() {
		
		stageOne();
		
		airline.addCity(ci);
		
		int tam = airline.getCt().size();
		
		assertTrue(tam != 0);
	}
	
	@Test 
	public void testAddEdge() {
		
		stageOne();
		airline.addCity(ci);
		airline.addCity(ci2);
		
		airline.addEdge(ci, ci2, 3.0);
		
		
	}
	
	@Test
	public void testGetMinDistance() {
		
		stageOne();
		airline.addCity(ci);
		airline.addCity(ci2);
		
		double dis =  airline.getMinDistance(ci, ci2);
		double dis2 =  airline.getMinDistance(ci, ci2);
		
		assertTrue(dis == dis2);
	}

	
}

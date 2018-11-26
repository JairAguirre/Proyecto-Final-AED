package test;

import org.junit.Test;

import junit.framework.TestCase;
import model.City;

class CityTest  extends TestCase{

	private City city;
	public void stageOne() {
		
		city =  new City("Cali");
		
	}

	@Test
	public void testName() {
		
		
		assertEquals(city.getName(), "Cali");
	}

}

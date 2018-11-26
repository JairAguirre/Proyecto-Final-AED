package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Airline;
import model.Airport;
import model.City;

class AirPortTest extends TestCase{

	

	private Airport port;
	private Airline avianca;
	public void stageOne() {
		
		port = new Airport();
		avianca = port.getAvianca();
		
	}
	
	public void stageTwo() {
		
		port = new Airport();
		avianca = port.getCopaAirlines();
		
	}

	public void stageThree() {
		
		port = new Airport();
		avianca = port.getLATAM();
		
	}
	@Test
	public void testGetMinDistanceAvianca() {
		
		stageOne();
		
		City ci = port.getCitiesAvianca().get(0);
		City ci2 = port.getCitiesAvianca().get(4);
		double dist = port.getMinDistanceAvianca(ci, ci2);
		
		double dist2 = port.getMinDistanceAvianca(ci, ci2);
		
		assertTrue(ci == ci2);
		
	}
	
	@Test
	public void tetsGetParentMinDidstnceAvianca() {
		
		stageOne();
		City ci = port.getCitiesAvianca().get(0);
		City ci2 = port.getCitiesAvianca().get(4);
		
		
		ArrayList<City> cam1 =  port.getParentMinDidstnceAvianca(ci, ci2);
		ArrayList<City> cam2 =  port.getParentMinDidstnceAvianca(ci, ci2);
		
		assertEquals(cam1, cam2);
	}
	
	@Test
	public void testGetMinDistanceCopaAirlines() {
		
		stageTwo();
		
		City ci = port.getCitiesCopaAirlines().get(0);
		City ci2 = port.getCitiesCopaAirlines().get(4);
		double dist = port.getMinDistanceCopaAirlines(ci, ci2);
		
		double dist2 = port.getMinDistanceCopaAirlines(ci, ci2);
		
		assertTrue(ci == ci2);
		
	}
	
	@Test
	public void tetsGetParentMinDidstnceCopaAirlines() {
		
		stageTwo();
		
		City ci = port.getCitiesCopaAirlines().get(0);
		City ci2 = port.getCitiesCopaAirlines().get(4);
		
		
		ArrayList<City> cam1 =  port.getParentMinDidstnceCopaAirlines(ci, ci2);
		ArrayList<City> cam2 =  port.getParentMinDidstnceCopaAirlines(ci, ci2);
		
		assertEquals(cam1, cam2);
	}
	
	@Test
	public void testGetMinDistanceLATAM() {
		
		stageThree();
		
		City ci = port.getCitiesLATAM().get(0);
		City ci2 = port.getCitiesLATAM().get(4);
		double dist = port.getMinDistanceLATAM(ci, ci2);
		
		double dist2 = port.getMinDistanceLATAM(ci, ci2);
		
		assertTrue(ci == ci2);
		
	}
	
	@Test
	public void tetsGetParentMinDidstnceLatam() {
		
		stageThree();
		
		City ci = port.getCitiesLATAM().get(0);
		City ci2 = port.getCitiesLATAM().get(4);
		
		
		ArrayList<City> cam1 =  port.getParentMinDidstnceLATAM(ci, ci2);
		ArrayList<City> cam2 =  port.getParentMinDidstnceLATAM(ci, ci2);
		
		assertEquals(cam1, cam2);
	}
}

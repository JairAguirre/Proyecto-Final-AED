package model;

import java.util.ArrayList;

public class Airport {
	
	private Airline avianca;
	private Airline CopaAirlines;
	private Airline LATAM;
	
	public Airport() {
		
		avianca = new Airline("Avianca", "link", 4);
		CopaAirlines = new Airline("CopaAirlines", "link", 4);
		LATAM = new Airline("name", "link", 4);
		
		addCities();
		addEdgesKm();
		addEdgesP();
	}
	
	public void addCities() {
		
		//avianca
		avianca.addCity(new City("Bogot�"));
		avianca.addCity(new City("Armenia"));
		avianca.addCity(new City("Barranquilla"));
		avianca.addCity(new City("Bucaramanga"));
		avianca.addCity(new City("Cali"));
		avianca.addCity(new City("Cartagena"));
		avianca.addCity(new City("C�cuta"));
		avianca.addCity(new City("Ibagu�"));
		avianca.addCity(new City("Leticia"));
		avianca.addCity(new City("Manizales"));
		avianca.addCity(new City("Medell�n"));
		avianca.addCity(new City("Monter�a"));
		avianca.addCity(new City("Neiva"));
		avianca.addCity(new City("Pasto"));
		avianca.addCity(new City("Pereira"));
		avianca.addCity(new City("Popay�n"));
		avianca.addCity(new City("Riohacha"));
		avianca.addCity(new City("San Andr�s"));
		avianca.addCity(new City("Santa Marta"));
		avianca.addCity(new City("Tumaco"));
		avianca.addCity(new City("Valledupar"));
		avianca.addCity(new City("Villavicencio"));
		
		//CopaAirlines
		CopaAirlines.addCity(new City("Bogot�"));
		CopaAirlines.addCity(new City("Barranquilla"));
		CopaAirlines.addCity(new City("Bucaramanga"));
		CopaAirlines.addCity(new City("Cali"));
		CopaAirlines.addCity(new City("Cartagena"));
		CopaAirlines.addCity(new City("Medell�n"));
		CopaAirlines.addCity(new City("San Andr�s"));
		CopaAirlines.addCity(new City("Pereira"));
		
		//
		
		
	}
	
	public void addEdgesKm() {
		
		//avianca
		avianca.addEdge(new City("Bogot�"), new City("Armenia"), 181.8);
		avianca.addEdge(new City("Bogot�"), new City("Barranquilla"), 687.92);
		avianca.addEdge(new City("Bogot�"), new City("Bucaramanga"), 288.55);
		avianca.addEdge(new City("Bogot�"), new City("Cali"), 279.23);
		avianca.addEdge(new City("Bogot�"), new City("Cartagena"), 652.53);
		avianca.addEdge(new City("Bogot�"), new City("C�cuta"),  400.01);
		avianca.addEdge(new City("Bogot�"), new City("Ibagu�"), 113.75);
		avianca.addEdge(new City("Bogot�"), new City("Leticia"), 1089.04);
		avianca.addEdge(new City("Bogot�"), new City("Manizales"), 150.6);
		avianca.addEdge(new City("Bogot�"), new City("Medell�n"), 231.91);
		avianca.addEdge(new City("Bogot�"), new City("Monter�a"), 492.19);
		avianca.addEdge(new City("Bogot�"), new City("Neiva"), 231.82);
		avianca.addEdge(new City("Bogot�"), new City("Pasto"), 505.71);
		avianca.addEdge(new City("Bogot�"), new City("Pereira"), 177.1);
		avianca.addEdge(new City("Bogot�"), new City("Popay�n"), 369.57);
		avianca.addEdge(new City("Bogot�"), new City("Riohacha"), 778);
		avianca.addEdge(new City("Bogot�"), new City("San Andr�s"), 1204.95);
		avianca.addEdge(new City("Bogot�"), new City("Santa Marta"), 709.87);
		avianca.addEdge(new City("Bogot�"), new City("Tumaco"), 606);
		avianca.addEdge(new City("Bogot�"), new City("Valledupar"), 641.77);
		avianca.addEdge(new City("Bogot�"), new City("Villavicencio"), 83.58);
		
		avianca.addEdge(new City("Cali"), new City("Barranquilla"), 831.44);
		avianca.addEdge(new City("Cali"), new City("Cartagena"), 769);
		avianca.addEdge(new City("Cali"), new City("Medell�n"), 424);
		avianca.addEdge(new City("Cali"), new City("Pasto"), 258.07);
		avianca.addEdge(new City("Cali"), new City("Tumaco"), 325.35);
		
		
		avianca.addEdge(new City("Medell�n"), new City("Barranquilla"), 531);
		avianca.addEdge(new City("Medell�n"), new City("Bucaramanga"), 288);
		avianca.addEdge(new City("Medell�n"), new City("Cartagena"), 461.2);
		avianca.addEdge(new City("Medell�n"), new City("C�cuta"), 385);
		avianca.addEdge(new City("Medell�n"), new City("Pasto"), 590);
		
		//CopaAirlines 
		CopaAirlines.addEdge(new City("Barranquilla"), new City("San Andr�s"), 778.31);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Bucaramanga"), 465);		
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Cartagena"), 119);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Pereira"), 692);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Medell�n"), 531);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Cali"), 831.44);
		
		CopaAirlines.addEdge(new City("Bogot�"), new City("San Andr�s"), 1204.95);
		CopaAirlines.addEdge(new City("Bogot�"), new City("Bucaramanga"), 288.55);
		CopaAirlines.addEdge(new City("Bogot�"), new City("Medell�n"), 231.91);
		CopaAirlines.addEdge(new City("Bogot�"), new City("Cali"), 279.23);
		CopaAirlines.addEdge(new City("Bogot�"), new City("Pereira"), 177.1);
		CopaAirlines.addEdge(new City("Bogot�"), new City("Cartagena"), 652.53);
		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("San Andr�s"), 1119);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Pereira"), 384);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Cartagena"), 449);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Medell�n"), 287);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Cali"), 557);		
		
		CopaAirlines.addEdge(new City("Cali"), new City("Cartagena"), 782);
		CopaAirlines.addEdge(new City("Cali"), new City("Medell�n"), 424);
		CopaAirlines.addEdge(new City("Cali"), new City("San Andr�s"), 1166);
		CopaAirlines.addEdge(new City("Cali"), new City("Pereira"), 178);
		
		CopaAirlines.addEdge(new City("Cartagena"), new City("Medell�n"), 461);
		CopaAirlines.addEdge(new City("Cartagena"), new City("San Andr�s"), 716);		
		CopaAirlines.addEdge(new City("Cartagena"), new City("Pereira"), 622);
		
		CopaAirlines.addEdge(new City("Medell�n"), new City("San Andr�s"), 974);
		CopaAirlines.addEdge(new City("Medell�n"), new City("Pereira"), 161);
		
		CopaAirlines.addEdge(new City("San Andr�s"), new City("Pereira"), 1087);
		

		//LATAM
	}
	
	public void addEdgesP() {
		
		
	}
	
	
	//distancias minimas
	public double getMinDistanceAvianca(City c1, City c2) {
		return avianca.getMinDistance(c1, c2);
	}
	
	public double getMinDistanceCopaAirlines(City c1, City c2) {
		return CopaAirlines.getMinDistance(c1, c2);
	}
	public double getMinDistanceLATAM(City c1, City c2) {
		return LATAM.getMinDistance(c1, c2);
	}

	//caminos
	public ArrayList<City> getParentMinDidstnceAvianca(City c1, City c2){
		return avianca.getParentMinDidstnce(c1, c2);
	}
	public ArrayList<City> getParentMinDidstnceCopaAirlines(City c1, City c2){
		return CopaAirlines.getParentMinDidstnce(c1, c2);
	}
	public ArrayList<City> getParentMinDidstnceLATAM(City c1, City c2){
		return LATAM.getParentMinDidstnce(c1, c2);
	}
	
	
	
	//get and set

	public Airline getAvianca() {
		return avianca;
	}

	public void setAvianca(Airline avianca) {
		this.avianca = avianca;
	}
	
	
	
	



}

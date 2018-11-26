package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Airport {
	
	private Airline avianca;
	private Airline CopaAirlines;
	private Airline LATAM;
	
	public Airport() {
		
		avianca = new Airline("Avianca", "link", 22);
		CopaAirlines = new Airline("CopaAirlines", "link", 8);
		LATAM = new Airline("LATAM", "link", 14);
		
		addCities();
		addEdgesKm();
		addEdgesP();
	}
	
	public void addCities() {
		
		//avianca
		avianca.addCity(new City("Bogotá"));
		avianca.addCity(new City("Armenia"));
		avianca.addCity(new City("Barranquilla"));
		avianca.addCity(new City("Bucaramanga"));
		avianca.addCity(new City("Cali"));
		avianca.addCity(new City("Cartagena"));
		avianca.addCity(new City("Cúcuta"));
		avianca.addCity(new City("Ibagué"));
		avianca.addCity(new City("Leticia"));
		avianca.addCity(new City("Manizales"));
		avianca.addCity(new City("Medellín"));
		avianca.addCity(new City("Montería"));
		avianca.addCity(new City("Neiva"));
		avianca.addCity(new City("Pasto"));
		avianca.addCity(new City("Pereira"));
		avianca.addCity(new City("Popayán"));
		avianca.addCity(new City("Riohacha"));
		avianca.addCity(new City("San Andrés"));
		avianca.addCity(new City("Santa Marta"));
		avianca.addCity(new City("Tumaco"));
		avianca.addCity(new City("Valledupar"));
		avianca.addCity(new City("Villavicencio"));
		
		//CopaAirlines
		CopaAirlines.addCity(new City("Bogotá"));
		CopaAirlines.addCity(new City("Barranquilla"));
		CopaAirlines.addCity(new City("Bucaramanga"));
		CopaAirlines.addCity(new City("Cali"));
		CopaAirlines.addCity(new City("Cartagena"));
		CopaAirlines.addCity(new City("Medellín"));
		CopaAirlines.addCity(new City("San Andrés"));
		CopaAirlines.addCity(new City("Pereira"));
		
		//LATAM
		
		LATAM.addCity(new City("Medellín"));
		LATAM.addCity(new City("Barranquilla"));
		LATAM.addCity(new City("Bogotá"));
		LATAM.addCity(new City("Bucaramanga"));
		LATAM.addCity(new City("Cali"));
		LATAM.addCity(new City("Cartagena"));
		LATAM.addCity(new City("Cúcuta"));
		LATAM.addCity(new City("Montería"));
		LATAM.addCity(new City("Pereira"));
		LATAM.addCity(new City("San Andrés"));
		LATAM.addCity(new City("Santa Marta"));
		LATAM.addCity(new City("Valledupar"));
		LATAM.addCity(new City("Yopal"));
		LATAM.addCity(new City("Leticia"));
		
		
	}
	
	public void addEdgesKm() {
		
		//avianca
		avianca.addEdge(new City("Bogotá"), new City("Armenia"), 181.8);
		avianca.addEdge(new City("Bogotá"), new City("Barranquilla"), 687.92);
		avianca.addEdge(new City("Bogotá"), new City("Bucaramanga"), 288.55);
		avianca.addEdge(new City("Bogotá"), new City("Cali"), 279.23);
		avianca.addEdge(new City("Bogotá"), new City("Cartagena"), 652.53);
		avianca.addEdge(new City("Bogotá"), new City("Cúcuta"),  400.01);
		avianca.addEdge(new City("Bogotá"), new City("Ibagué"), 113.75);
		avianca.addEdge(new City("Bogotá"), new City("Leticia"), 1089.04);
		avianca.addEdge(new City("Bogotá"), new City("Manizales"), 150.6);
		avianca.addEdge(new City("Bogotá"), new City("Medellín"), 231.91);
		avianca.addEdge(new City("Bogotá"), new City("Montería"), 492.19);
		avianca.addEdge(new City("Bogotá"), new City("Neiva"), 231.82);
		avianca.addEdge(new City("Bogotá"), new City("Pasto"), 505.71);
		avianca.addEdge(new City("Bogotá"), new City("Pereira"), 177.1);
		avianca.addEdge(new City("Bogotá"), new City("Popayán"), 369.57);
		avianca.addEdge(new City("Bogotá"), new City("Riohacha"), 778);
		avianca.addEdge(new City("Bogotá"), new City("San Andrés"), 1204.95);
		avianca.addEdge(new City("Bogotá"), new City("Santa Marta"), 709.87);
		avianca.addEdge(new City("Bogotá"), new City("Tumaco"), 606);
		avianca.addEdge(new City("Bogotá"), new City("Valledupar"), 641.77);
		avianca.addEdge(new City("Bogotá"), new City("Villavicencio"), 83.58);
		
		avianca.addEdge(new City("Cali"), new City("Barranquilla"), 831.44);
		avianca.addEdge(new City("Cali"), new City("Cartagena"), 769);
		avianca.addEdge(new City("Cali"), new City("Medellín"), 424);
		avianca.addEdge(new City("Cali"), new City("Pasto"), 258.07);
		avianca.addEdge(new City("Cali"), new City("Tumaco"), 325.35);
		
		
		avianca.addEdge(new City("Medellín"), new City("Barranquilla"), 531);
		avianca.addEdge(new City("Medellín"), new City("Bucaramanga"), 288);
		avianca.addEdge(new City("Medellín"), new City("Cartagena"), 461.2);
		avianca.addEdge(new City("Medellín"), new City("Cúcuta"), 385);
		avianca.addEdge(new City("Medellín"), new City("Pasto"), 590);
		
		//CopaAirlines 
		CopaAirlines.addEdge(new City("Barranquilla"), new City("San Andrés"), 778.31);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Bucaramanga"), 465);		
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Cartagena"), 119);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Pereira"), 692);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Medellín"), 531);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Cali"), 831.44);
		
		CopaAirlines.addEdge(new City("Bogotá"), new City("San Andrés"), 1204.95);
		CopaAirlines.addEdge(new City("Bogotá"), new City("Bucaramanga"), 288.55);
		CopaAirlines.addEdge(new City("Bogotá"), new City("Medellín"), 231.91);
		CopaAirlines.addEdge(new City("Bogotá"), new City("Cali"), 279.23);
		CopaAirlines.addEdge(new City("Bogotá"), new City("Pereira"), 177.1);
		CopaAirlines.addEdge(new City("Bogotá"), new City("Cartagena"), 652.53);
		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("San Andrés"), 1119);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Pereira"), 384);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Cartagena"), 449);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Medellín"), 287);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Cali"), 557);		
		
		CopaAirlines.addEdge(new City("Cali"), new City("Cartagena"), 782);
		CopaAirlines.addEdge(new City("Cali"), new City("Medellín"), 424);
		CopaAirlines.addEdge(new City("Cali"), new City("San Andrés"), 1166);
		CopaAirlines.addEdge(new City("Cali"), new City("Pereira"), 178);
		
		CopaAirlines.addEdge(new City("Cartagena"), new City("Medellín"), 461);
		CopaAirlines.addEdge(new City("Cartagena"), new City("San Andrés"), 716);		
		CopaAirlines.addEdge(new City("Cartagena"), new City("Pereira"), 622);
		
		CopaAirlines.addEdge(new City("Medellín"), new City("San Andrés"), 974);
		CopaAirlines.addEdge(new City("Medellín"), new City("Pereira"), 161);
		
		CopaAirlines.addEdge(new City("San Andrés"), new City("Pereira"), 1087);
		

		//LATAM
		
		LATAM.addEdge(new City("Bogotá"), new City("San Andrés"), 1204.95);
		LATAM.addEdge(new City("Bogotá"), new City("Cali"), 279.23);
		LATAM.addEdge(new City("Bogotá"), new City("Leticia"), 1089.04);
		LATAM.addEdge(new City("Bogotá"), new City("Yopal"), 204);
		LATAM.addEdge(new City("Bogotá"), new City("Bucaramanga"), 288.55);
		LATAM.addEdge(new City("Bogotá"), new City("Cúcuta"),  400.01);
		LATAM.addEdge(new City("Bogotá"), new City("Valledupar"), 641.77);
		LATAM.addEdge(new City("Bogotá"), new City("Santa Marta"), 709.87);
		LATAM.addEdge(new City("Bogotá"), new City("Barranquilla"), 687.92);
		LATAM.addEdge(new City("Bogotá"), new City("Cartagena"), 652.53);
		LATAM.addEdge(new City("Bogotá"), new City("Montería"), 492.19);
		LATAM.addEdge(new City("Bogotá"), new City("Medellín"), 231.91);
		LATAM.addEdge(new City("Bogotá"), new City("Pereira"), 177.1);
		
		LATAM.addEdge(new City("Cali"), new City("San Andrés"), 1166);
		
		LATAM.addEdge(new City("Santa Marta"), new City("Medellín"), 575);
		
		LATAM.addEdge(new City("San Andrés"), new City("Cartagena"), 716);
		LATAM.addEdge(new City("San Andrés"), new City("Medellín"), 974);
		LATAM.addEdge(new City("San Andrés"), new City("Cali"), 1166);
		
		LATAM.addEdge(new City("Cartagena"), new City("Medellín"), 461);
		
		LATAM.addEdge(new City("Medellín"), new City("San Andrés"), 974);
	
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

	
	public double getMinPriceAavianca(City c1, City c2) {
		return avianca.getMinPriceA(c1, c2);
	}
	public double getMinPriceACopaAirlines(City c1, City c2) {
		return CopaAirlines.getMinPriceA(c1, c2);
	}
	public double getMinPriceALATAM(City c1, City c2) {
		return LATAM.getMinPriceA(c1, c2);
	}
	
	
	public double getMinPriceBavianca(City c1, City c2) {
		return avianca.getMinPriceB(c1, c2);
	}
	public double getMinPriceBCopaAirlines(City c1, City c2) {
		return CopaAirlines.getMinPriceB(c1, c2);
	}
	public double getMinPriceBLATAM(City c1, City c2) {
		return LATAM.getMinPriceB(c1, c2);
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
	
	
	public LinkedList<City> getParentMinPriceAavianca(City c1, City c2){
		return  avianca.getParentMinPriceA(c1, c2);
	}
	public LinkedList<City> getParentMinPriceACopaAirlines(City c1, City c2){
		return  CopaAirlines.getParentMinPriceA(c1, c2);
	}
	public LinkedList<City> getParentMinPriceALATAM(City c1, City c2){
		return  LATAM.getParentMinPriceA(c1, c2);
	}
	
	
	public LinkedList<City> getParentMinPriceBavianca(City c1, City c2){
		return  avianca.getParentMinPriceB(c1, c2);
	}
	public LinkedList<City> getParentMinPriceBCopaAirlines(City c1, City c2){
		return  CopaAirlines.getParentMinPriceB(c1, c2);
	}
	public LinkedList<City> getParentMinPriceBLATAM(City c1, City c2){
		return  LATAM.getParentMinPriceB(c1, c2);
	}
	
	//ciudades
	
	public ArrayList<City> getCitiesAvianca(){
		return avianca.getCt();
	}
	public ArrayList<City> getCitiesCopaAirlines(){
		return CopaAirlines.getCt();
	}
	public ArrayList<City> getCitiesLATAM(){
		return LATAM.getCt();
	}
	
	
	
	
	//get and set

	public Airline getAvianca() {
		return avianca;
	}

	public void setAvianca(Airline avianca) {
		this.avianca = avianca;
	}

	public Airline getCopaAirlines() {
		return CopaAirlines;
	}

	public void setCopaAirlines(Airline copaAirlines) {
		CopaAirlines = copaAirlines;
	}

	public Airline getLATAM() {
		return LATAM;
	}

	public void setLATAM(Airline lATAM) {
		LATAM = lATAM;
	}
	
	
	
	
	



}

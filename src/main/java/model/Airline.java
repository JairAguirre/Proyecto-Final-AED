package model;

import java.util.ArrayList;

import list.GraphL;
import matrix.GraphM;

public class Airline {
	
	private String name;
	private String link;
	private GraphM<City> cities;
	private GraphL<City> prices;
	private ArrayList<City> ct;

	
	public Airline(String name, String link, int city) {
		this.name = name;
		this.link = link;
		cities = new GraphM<City>(city);
		prices = new GraphL<City>(city);
		ct = new ArrayList<City>();
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}



	public GraphM<City> getCities() {
		return cities;
	}



	public void setCities(GraphM<City> cities) {
		this.cities = cities;
	}



	public void addCity(City c) {
		cities.addNodeM(c);
		ct.add(c);
	}
	
	public void addEdge(City c1, City c2, double distance) {
		
		boolean find = false;
		int city1 = 0;
		int city2 = 0;
				
		for(int i = 0; i < ct.size() && !find; i++) {
			
			if(c1.getName().equals(ct.get(i).getName())) {
				
				city1 = i;
				find = true;
			}
			
		}
		
		find = false;
		for(int i = 0; i < ct.size() && !find; i++) {
			
			if(c2.getName().equals(ct.get(i).getName())) {
				
				city2 = i;
				find = true;
			}
			
		}
		
		cities.addEdge(ct.get(city1), ct.get(city2), distance);
	}
	
	public double getMinDistance(City c1, City c2) {
		
		double[] distances = cities.dijkstra(c1);
		
		int pos = cities.getPosN(c2);
		
		return distances[pos];
	}
	
	public ArrayList<City> getParentMinDidstnce(City c1, City c2){
		
		ArrayList<City> path = new ArrayList<City>();
		
		int[] p = cities.dijkstraParent(c1);
		
		int pos1 = cities.getPosN(c1);
		int pos2 = cities.getPosN(c2);
		boolean origin = false;
		
		if(p[pos2] == pos1) {
			
			path.add(c1);
			
		}else {
			
			
			for(int i = 0; i< p.length && !origin; i++) {
				
				int t = p[pos2];
				
				if(t == pos1) {
					path.add(0, cities.getNodes().get(t).getElem());
					origin = true;
					
				}else {
					
					path.add(0, cities.getNodes().get(t).getElem());
					pos2 = t;
				}
				
			}
			
			
		}
		
		return path;
	}



	public GraphL<City> getPrices() {
		return prices;
	}



	public void setPrices(GraphL<City> prices) {
		this.prices = prices;
	}



	public ArrayList<City> getCt() {
		return ct;
	}



	public void setCt(ArrayList<City> ct) {
		this.ct = ct;
	}
	
	
	 

}

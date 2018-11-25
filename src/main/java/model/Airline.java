package model;

import java.util.ArrayList;

import list.GraphL;
import matrix.GraphM;

public class Airline {
	
	private String name;
	private String link;
	private GraphM<City> cities;
	private GraphL<City> prices;

	
	public Airline(String name, String link, int city) {
		this.name = name;
		this.link = link;
		cities = new GraphM<City>(city);
		prices = new GraphL<City>(city);
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
	}
	
	public void addEdge(City c1, City c2, double distance) {
		
		cities.addEdge(c1, c2, distance);
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
	 

}

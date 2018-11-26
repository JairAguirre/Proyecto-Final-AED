package model;

import java.util.ArrayList;
import java.util.LinkedList;

import list.GraphL;
import list.WeightList;
import matrix.GraphM;

public class Airline {
	
	private String name;
	private String link;
	private GraphM<City> cities;
	private GraphL<City> pricesA;
	private GraphL<City> pricesB;
	private ArrayList<City> ct;

	
	public Airline(String name, String link, int city) {
		this.name = name;
		this.link = link;
		cities = new GraphM<City>(city);
		pricesA = new GraphL<City>(city);
		pricesB = new GraphL<City>(city);
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
		try {
			pricesA.addNode(c);
			pricesB.addNode(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public void addEdgePA(City c1, City c2, double distance) {
		
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
		
		try {
			pricesA.addEdge(ct.get(city1), ct.get(city2), distance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addEdgePB(City c1, City c2, double distance) {
		
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
		
		try {
			pricesB.addEdge(ct.get(city1), ct.get(city2), distance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double getMinDistance(City c1, City c2) {
		
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
		
		double[] distances = cities.dijkstra(ct.get(city1));
		
		int pos = cities.getPosN(ct.get(city2));
		
		return distances[pos];
	}
	
	public double getMinPriceA(City c1, City c2) {
		
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
		
		WeightList<City> WL = null;
		try {
			 WL = pricesA.Dijkstra(ct.get(city1), ct.get(city2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return WL.getTotal();
	}
	
	public double getMinPriceB(City c1, City c2) {
		
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
		
		WeightList<City> WL = null;
		try {
			 WL = pricesB.Dijkstra(ct.get(city1), ct.get(city2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return WL.getTotal();
	}
	
	
	public ArrayList<City> getParentMinDidstnce(City c1, City c2){
		
		ArrayList<City> path = new ArrayList<City>();
		
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
		
		int[] p = cities.dijkstraParent(ct.get(city1));
		
		int pos1 = cities.getPosN(ct.get(city1));
		int pos2 = cities.getPosN(ct.get(city2));
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
	
	public LinkedList<City> getParentMinPriceA(City c1, City c2){
		
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
		
		WeightList<City> WL = null;
		try {
			 WL = pricesA.Dijkstra(ct.get(city1), ct.get(city2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return WL.getList();
	}

	public LinkedList<City> getParentMinPriceB(City c1, City c2){
		
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
		
		WeightList<City> WL = null;
		try {
			 WL = pricesB.Dijkstra(ct.get(city1), ct.get(city2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return WL.getList();
	}

	public GraphL<City> getPricesA() {
		return pricesA;
	}



	public void setPricesA(GraphL<City> pricesA) {
		this.pricesA = pricesA;
	}



	public GraphL<City> getPricesB() {
		return pricesB;
	}



	public void setPricesB(GraphL<City> pricesB) {
		this.pricesB = pricesB;
	}



	public ArrayList<City> getCt() {
		return ct;
	}



	public void setCt(ArrayList<City> ct) {
		this.ct = ct;
	}



	

}

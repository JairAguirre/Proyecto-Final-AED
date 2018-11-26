package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Airport {
	
	private Airline avianca;
	private Airline CopaAirlines;
	private Airline LATAM;
	
	public Airport() {
		
		avianca = new Airline("Avianca", "link", 22);
		CopaAirlines = new Airline("CopaAirlines", "link", 9);
		LATAM = new Airline("LATAM", "link", 14);
		
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
		CopaAirlines.addCity(new City("Santa Marta"));
		
		//LATAM
		
		LATAM.addCity(new City("Medell�n"));
		LATAM.addCity(new City("Barranquilla"));
		LATAM.addCity(new City("Bogot�"));
		LATAM.addCity(new City("Bucaramanga"));
		LATAM.addCity(new City("Cali"));
		LATAM.addCity(new City("Cartagena"));
		LATAM.addCity(new City("C�cuta"));
		LATAM.addCity(new City("Monter�a"));
		LATAM.addCity(new City("Pereira"));
		LATAM.addCity(new City("San Andr�s"));
		LATAM.addCity(new City("Santa Marta"));
		LATAM.addCity(new City("Valledupar"));
		LATAM.addCity(new City("Yopal"));
		LATAM.addCity(new City("Leticia"));
		
		
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

		CopaAirlines.addEdge(new City("Barranquilla"), new City("Santa Marta"), 70);		
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Cartagena"), 119);
		CopaAirlines.addEdge(new City("Barranquilla"), new City("Pereira"), 692);

		
		CopaAirlines.addEdge(new City("Bogot�"), new City("Santa Marta"), 739);

		
		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Pereira"), 384);		
		CopaAirlines.addEdge(new City("Bucaramanga"), new City("Santa Marta"), 474);		
		
		

		CopaAirlines.addEdge(new City("Cali"), new City("Pereira"), 178);
		CopaAirlines.addEdge(new City("Cali"), new City("Santa Marta"), 903);
		
		CopaAirlines.addEdge(new City("Cartagena"), new City("Barranquilla"), 119);
		CopaAirlines.addEdge(new City("Cartagena"), new City("Santa Marta"), 168);		
		CopaAirlines.addEdge(new City("Cartagena"), new City("Pereira"), 622);
		
		CopaAirlines.addEdge(new City("Medell�n"), new City("Santa Marta"), 576);
		CopaAirlines.addEdge(new City("Medell�n"), new City("Pereira"), 161);
		
		CopaAirlines.addEdge(new City("Pereira"), new City("Barranquilla"), 692);
		CopaAirlines.addEdge(new City("Pereira"), new City("Bucaramanga"), 384);
		CopaAirlines.addEdge(new City("Pereira"), new City("Cali"), 178);
		CopaAirlines.addEdge(new City("Pereira"), new City("Cartagena"), 622);
		CopaAirlines.addEdge(new City("Pereira"), new City("Medell�n"), 161);
		CopaAirlines.addEdge(new City("Pereira"), new City("Santa Marta"), 733);
		
		CopaAirlines.addEdge(new City("San Andr�s"), new City("Santa Marta"), 126);
		
		CopaAirlines.addEdge(new City("Santa Marta"), new City("Barranquilla"), 70);
		CopaAirlines.addEdge(new City("Santa Marta"), new City("Bogot�"), 739);
		CopaAirlines.addEdge(new City("Santa Marta"), new City("Bucaramanga"), 474);
		CopaAirlines.addEdge(new City("Santa Marta"), new City("Cali"), 903);
		CopaAirlines.addEdge(new City("Santa Marta"), new City("Cartagena"), 168);
		CopaAirlines.addEdge(new City("Santa Marta"), new City("Medell�n"), 576);
		CopaAirlines.addEdge(new City("Santa Marta"), new City("Pereira"), 733);
		CopaAirlines.addEdge(new City("Santa Marta"), new City("San Andr�s"), 126);
		

		//LATAM
		
		LATAM.addEdge(new City("Bogot�"), new City("San Andr�s"), 1204.95);
		LATAM.addEdge(new City("Bogot�"), new City("Cali"), 279.23);
		LATAM.addEdge(new City("Bogot�"), new City("Leticia"), 1089.04);
		LATAM.addEdge(new City("Bogot�"), new City("Yopal"), 204);
		LATAM.addEdge(new City("Bogot�"), new City("Bucaramanga"), 288.55);
		LATAM.addEdge(new City("Bogot�"), new City("C�cuta"),  400.01);
		LATAM.addEdge(new City("Bogot�"), new City("Valledupar"), 641.77);
		LATAM.addEdge(new City("Bogot�"), new City("Santa Marta"), 709.87);
		LATAM.addEdge(new City("Bogot�"), new City("Barranquilla"), 687.92);
		LATAM.addEdge(new City("Bogot�"), new City("Cartagena"), 652.53);
		LATAM.addEdge(new City("Bogot�"), new City("Monter�a"), 492.19);
		LATAM.addEdge(new City("Bogot�"), new City("Medell�n"), 231.91);
		LATAM.addEdge(new City("Bogot�"), new City("Pereira"), 177.1);
		
		LATAM.addEdge(new City("Cali"), new City("San Andr�s"), 1166);
		
		LATAM.addEdge(new City("Santa Marta"), new City("Medell�n"), 575);
		
		LATAM.addEdge(new City("San Andr�s"), new City("Cartagena"), 716);
		LATAM.addEdge(new City("San Andr�s"), new City("Medell�n"), 974);
		LATAM.addEdge(new City("San Andr�s"), new City("Cali"), 1166);
		
		LATAM.addEdge(new City("Cartagena"), new City("Medell�n"), 461);
		
		LATAM.addEdge(new City("Medell�n"), new City("San Andr�s"), 974);
	
	}
	
	public void addEdgesP() {
		
			
	//Avianca
		
		//Temporada Alta
		avianca.addEdgePA(new City("Bogot�"), new City("Armenia"), 165090);
		avianca.addEdgePA(new City("Bogot�"), new City("Barranquilla"), 147719);
		avianca.addEdgePA(new City("Bogot�"), new City("Bucaramanga"), 154892);
		avianca.addEdgePA(new City("Bogot�"), new City("Cali"), 174227);
		avianca.addEdgePA(new City("Bogot�"), new City("Cartagena"), 98646);
		avianca.addEdgePA(new City("Bogot�"), new City("C�cuta"),  240278);
		avianca.addEdgePA(new City("Bogot�"), new City("Ibagu�"), 227870);
		avianca.addEdgePA(new City("Bogot�"), new City("Leticia"), 283838);
		avianca.addEdgePA(new City("Bogot�"), new City("Manizales"), 165090);
		avianca.addEdgePA(new City("Bogot�"), new City("Medell�n"), 108497);
		avianca.addEdgePA(new City("Bogot�"), new City("Monter�a"), 120922);
		avianca.addEdgePA(new City("Bogot�"), new City("Neiva"), 315967);
		avianca.addEdgePA(new City("Bogot�"), new City("Pasto"), 306040);
		avianca.addEdgePA(new City("Bogot�"), new City("Pereira"), 165090);
		avianca.addEdgePA(new City("Bogot�"), new City("Popay�n"), 307782);
		avianca.addEdgePA(new City("Bogot�"), new City("Riohacha"), 187675);
		avianca.addEdgePA(new City("Bogot�"), new City("San Andr�s"), 260831);
		avianca.addEdgePA(new City("Bogot�"), new City("Santa Marta"), 128411);
		avianca.addEdgePA(new City("Bogot�"), new City("Tumaco"), 260631);
		avianca.addEdgePA(new City("Bogot�"), new City("Valledupar"), 237056);
		avianca.addEdgePA(new City("Bogot�"), new City("Villavicencio"), 311504);
				
		avianca.addEdgePA(new City("Cali"), new City("Barranquilla"), 166050);
		avianca.addEdgePA(new City("Cali"), new City("Cartagena"), 179140);
		avianca.addEdgePA(new City("Cali"), new City("Medell�n"), 295050);
		avianca.addEdgePA(new City("Cali"), new City("Pasto"), 444510);
		avianca.addEdgePA(new City("Cali"), new City("Tumaco"), 233170);
		avianca.addEdgePA(new City("Cali"), new City("Bogot�"), 202470);
				
		avianca.addEdgePA(new City("Medell�n"), new City("Barranquilla"), 125760);
		avianca.addEdgePA(new City("Medell�n"), new City("Bucaramanga"), 183470);
		avianca.addEdgePA(new City("Medell�n"), new City("Cartagena"), 183470);
		avianca.addEdgePA(new City("Medell�n"), new City("C�cuta"), 183470);
		avianca.addEdgePA(new City("Medell�n"), new City("Pasto"), 375180);
		avianca.addEdgePA(new City("Medell�n"), new City("Cali"), 331150);
		avianca.addEdgePA(new City("Medell�n"), new City("Bogot�"), 175260);
		
		avianca.addEdgePA(new City("Armenia"), new City("Bogot�"), 125090);
		avianca.addEdgePA(new City("Barranquilla"), new City("Bogot�"), 11112);
		avianca.addEdgePA(new City("Bucaramanga"), new City("Bogot�"), 167892);
		avianca.addEdgePA(new City("Cartagena"), new City("Bogot�"), 121646);
		avianca.addEdgePA(new City("C�cuta"), new City("Bogot�"),  252278);
		avianca.addEdgePA(new City("Ibagu�"), new City("Bogot�"), 221870);
		avianca.addEdgePA(new City("Leticia"), new City("Bogot�"), 258838);
		avianca.addEdgePA(new City("Manizales"), new City("Bogot�"), 17090);
		avianca.addEdgePA(new City("Medell�n"), new City("Bogot�"), 115497);
		avianca.addEdgePA(new City("Monter�a"), new City("Bogot�"), 112922);
		avianca.addEdgePA(new City("Neiva"), new City("Bogot�"), 319967);
		avianca.addEdgePA(new City("Pasto"), new City("Bogot�"), 317040);
		avianca.addEdgePA(new City("Pereira"), new City("Bogot�"), 154090);
		avianca.addEdgePA(new City("Popay�n"), new City("Bogot�"), 314782);
		avianca.addEdgePA(new City("Riohacha"), new City("Bogot�"), 114675);
		avianca.addEdgePA(new City("San Andr�s"), new City("Bogot�"), 240831);
		avianca.addEdgePA(new City("Santa Marta"), new City("Bogot�"), 121411);
		avianca.addEdgePA(new City("Tumaco"), new City("Bogot�"), 256631);
		avianca.addEdgePA(new City("Valledupar"), new City("Bogot�"), 227070);
		avianca.addEdgePA(new City("Villavicencio"), new City("Bogot�"), 301504);
		
		avianca.addEdgePA(new City("Barranquilla"), new City("Cali"), 156000);
		avianca.addEdgePA(new City("Cartagena"), new City("Cali"), 185140);
		avianca.addEdgePA(new City("Medell�n"), new City("Cali"), 290050);
		avianca.addEdgePA(new City("Pasto"), new City("Cali"), 470510);
		avianca.addEdgePA(new City("Tumaco"), new City("Cali"), 245170);
		
		avianca.addEdgePA(new City("Barranquilla"), new City("Medell�n"), 120760);
		avianca.addEdgePA(new City("Bucaramanga"), new City("Medell�n"), 172470);
		avianca.addEdgePA(new City("Cartagena"), new City("Medell�n"), 179470);
		avianca.addEdgePA(new City("C�cuta"), new City("Medell�n"), 189470);
		avianca.addEdgePA(new City("Pasto"), new City("Medell�n"), 372180);
		
		//Temporada Baja
		
		avianca.addEdgePB(new City("Bogot�"), new City("Armenia"), 125134);
		avianca.addEdgePB(new City("Bogot�"), new City("Barranquilla"), 118719);
		avianca.addEdgePB(new City("Bogot�"), new City("Bucaramanga"), 131892);
		avianca.addEdgePB(new City("Bogot�"), new City("Cali"), 140227);
		avianca.addEdgePB(new City("Bogot�"), new City("Cartagena"), 82308);
		avianca.addEdgePB(new City("Bogot�"), new City("C�cuta"),  217958);
		avianca.addEdgePB(new City("Bogot�"), new City("Ibagu�"), 203870);
		avianca.addEdgePB(new City("Bogot�"), new City("Leticia"), 270838);
		avianca.addEdgePB(new City("Bogot�"), new City("Manizales"), 153090);
		avianca.addEdgePB(new City("Bogot�"), new City("Medell�n"), 95497);
		avianca.addEdgePB(new City("Bogot�"), new City("Monter�a"), 101862);
		avianca.addEdgePB(new City("Bogot�"), new City("Neiva"), 306967);
		avianca.addEdgePB(new City("Bogot�"), new City("Pasto"), 297040);
		avianca.addEdgePB(new City("Bogot�"), new City("Pereira"), 149090);
		avianca.addEdgePB(new City("Bogot�"), new City("Popay�n"), 290782);
		avianca.addEdgePB(new City("Bogot�"), new City("Riohacha"), 152675);
		avianca.addEdgePB(new City("Bogot�"), new City("San Andr�s"), 225831);
		avianca.addEdgePB(new City("Bogot�"), new City("Santa Marta"), 103411);
		avianca.addEdgePB(new City("Bogot�"), new City("Tumaco"), 245631);
		avianca.addEdgePB(new City("Bogot�"), new City("Valledupar"), 212056);
		avianca.addEdgePB(new City("Bogot�"), new City("Villavicencio"), 300504);
				
		avianca.addEdgePB(new City("Cali"), new City("Barranquilla"), 142050);
		avianca.addEdgePB(new City("Cali"), new City("Cartagena"), 158140);
		avianca.addEdgePB(new City("Cali"), new City("Medell�n"), 275050);
		avianca.addEdgePB(new City("Cali"), new City("Pasto"), 360510);
		avianca.addEdgePB(new City("Cali"), new City("Tumaco"), 201170);
		avianca.addEdgePB(new City("Cali"), new City("Bogot�"), 175470);
				
		avianca.addEdgePB(new City("Medell�n"), new City("Barranquilla"), 100760);
		avianca.addEdgePB(new City("Medell�n"), new City("Bucaramanga"), 135470);
		avianca.addEdgePB(new City("Medell�n"), new City("Cartagena"), 142470);
		avianca.addEdgePB(new City("Medell�n"), new City("C�cuta"), 131470);
		avianca.addEdgePB(new City("Medell�n"), new City("Pasto"), 332180);
		avianca.addEdgePB(new City("Medell�n"), new City("Cali"), 310150);
		avianca.addEdgePB(new City("Medell�n"), new City("Bogot�"), 142260);
		
		avianca.addEdgePB(new City("Armenia"), new City("Bogot�"), 132090);
		avianca.addEdgePB(new City("Barranquilla"), new City("Bogot�"), 121719);
		avianca.addEdgePB(new City("Bucaramanga"), new City("Bogot�"), 121892);
		avianca.addEdgePB(new City("Cartagena"), new City("Bogot�"), 75646);
		avianca.addEdgePB(new City("C�cuta"), new City("Bogot�"),  215278);
		avianca.addEdgePB(new City("Ibagu�"), new City("Bogot�"), 205870);
		avianca.addEdgePB(new City("Leticia"), new City("Bogot�"), 236838);
		avianca.addEdgePB(new City("Manizales"), new City("Bogot�"), 146090);
		avianca.addEdgePB(new City("Medell�n"), new City("Bogot�"), 96497);
		avianca.addEdgePB(new City("Monter�a"), new City("Bogot�"), 110922);
		avianca.addEdgePB(new City("Neiva"), new City("Bogot�"), 298967);
		avianca.addEdgePB(new City("Pasto"), new City("Bogot�"), 285040);
		avianca.addEdgePB(new City("Pereira"), new City("Bogot�"), 146090);
		avianca.addEdgePB(new City("Popay�n"), new City("Bogot�"), 289782);
		avianca.addEdgePB(new City("Riohacha"), new City("Bogot�"), 152675);
		avianca.addEdgePB(new City("San Andr�s"), new City("Bogot�"), 231831);
		avianca.addEdgePB(new City("Santa Marta"), new City("Bogot�"), 100411);
		avianca.addEdgePB(new City("Tumaco"), new City("Bogot�"), 235631);
		avianca.addEdgePB(new City("Valledupar"), new City("Bogot�"), 213056);
		avianca.addEdgePB(new City("Villavicencio"), new City("Bogot�"), 296504);
		
		avianca.addEdgePB(new City("Barranquilla"), new City("Cali"), 141050);
		avianca.addEdgePB(new City("Cartagena"), new City("Cali"), 146140);
		avianca.addEdgePB(new City("Medell�n"), new City("Cali"), 275050);
		avianca.addEdgePB(new City("Pasto"), new City("Cali"), 362510);
		avianca.addEdgePB(new City("Tumaco"), new City("Cali"), 202170);
		
		avianca.addEdgePB(new City("Barranquilla"), new City("Medell�n"), 100760);
		avianca.addEdgePB(new City("Bucaramanga"), new City("Medell�n"), 141470);
		avianca.addEdgePB(new City("Cartagena"), new City("Medell�n"), 136470);
		avianca.addEdgePB(new City("C�cuta"), new City("Medell�n"), 128470);
		avianca.addEdgePB(new City("Pasto"), new City("Medell�n"), 345180);
				
	//CopaAirlines 

		//Temporada Alta
		CopaAirlines.addEdgePA(new City("Barranquilla"), new City("Santa Marta"), 380546);		
		CopaAirlines.addEdgePA(new City("Barranquilla"), new City("Cartagena"), 250496);
		CopaAirlines.addEdgePA(new City("Barranquilla"), new City("Pereira"), 302865);

		CopaAirlines.addEdgePA(new City("Bogot�"), new City("Santa Marta"), 130284);
				
		CopaAirlines.addEdgePA(new City("Bucaramanga"), new City("Pereira"), 295642);		
		CopaAirlines.addEdgePA(new City("Bucaramanga"), new City("Santa Marta"), 120365);		

		CopaAirlines.addEdgePA(new City("Cali"), new City("Pereira"), 178562);
		CopaAirlines.addEdgePA(new City("Cali"), new City("Santa Marta"), 203642);
				
		CopaAirlines.addEdgePA(new City("Cartagena"), new City("Barranquilla"), 260574);
		CopaAirlines.addEdgePA(new City("Cartagena"), new City("Santa Marta"), 280645);		
		CopaAirlines.addEdgePA(new City("Cartagena"), new City("Pereira"), 220315);
				
		CopaAirlines.addEdgePA(new City("Medell�n"), new City("Santa Marta"), 128945);
		CopaAirlines.addEdgePA(new City("Medell�n"), new City("Pereira"), 297500);
				
		CopaAirlines.addEdgePA(new City("Pereira"), new City("Barranquilla"), 294150);
		CopaAirlines.addEdgePA(new City("Pereira"), new City("Bucaramanga"), 289652);
		CopaAirlines.addEdgePA(new City("Pereira"), new City("Cali"), 153265);
		CopaAirlines.addEdgePA(new City("Pereira"), new City("Cartagena"), 215840);
		CopaAirlines.addEdgePA(new City("Pereira"), new City("Medell�n"), 300875);
		CopaAirlines.addEdgePA(new City("Pereira"), new City("Santa Marta"), 144100);
				
		CopaAirlines.addEdgePA(new City("San Andr�s"), new City("Santa Marta"), 319312);
				
		CopaAirlines.addEdgePA(new City("Santa Marta"), new City("Barranquilla"), 350480);
		CopaAirlines.addEdgePA(new City("Santa Marta"), new City("Bogot�"), 150200);
		CopaAirlines.addEdgePA(new City("Santa Marta"), new City("Bucaramanga"), 154200);
		CopaAirlines.addEdgePA(new City("Santa Marta"), new City("Cali"), 215360);
		CopaAirlines.addEdgePA(new City("Santa Marta"), new City("Cartagena"), 294500);
		CopaAirlines.addEdgePA(new City("Santa Marta"), new City("Medell�n"), 142780);
		CopaAirlines.addEdgePA(new City("Santa Marta"), new City("Pereira"), 165241);
		CopaAirlines.addEdgePA(new City("Santa Marta"), new City("San Andr�s"), 346200);
		
		//Temporada Baja
		CopaAirlines.addEdgePB(new City("Barranquilla"), new City("Santa Marta"), 340546);		
		CopaAirlines.addEdgePB(new City("Barranquilla"), new City("Cartagena"), 212496);
		CopaAirlines.addEdgePB(new City("Barranquilla"), new City("Pereira"), 265865);

		CopaAirlines.addEdgePB(new City("Bogot�"), new City("Santa Marta"), 100284);
				
		CopaAirlines.addEdgePB(new City("Bucaramanga"), new City("Pereira"), 246642);		
		CopaAirlines.addEdgePB(new City("Bucaramanga"), new City("Santa Marta"), 98365);		

		CopaAirlines.addEdgePB(new City("Cali"), new City("Pereira"), 132562);
		CopaAirlines.addEdgePB(new City("Cali"), new City("Santa Marta"), 170642);
				
		CopaAirlines.addEdgePB(new City("Cartagena"), new City("Barranquilla"), 221574);
		CopaAirlines.addEdgePB(new City("Cartagena"), new City("Santa Marta"), 237645);		
		CopaAirlines.addEdgePB(new City("Cartagena"), new City("Pereira"), 229315);
				
		CopaAirlines.addEdgePB(new City("Medell�n"), new City("Santa Marta"), 100945);
		CopaAirlines.addEdgePB(new City("Medell�n"), new City("Pereira"), 251470);
				
		CopaAirlines.addEdgePB(new City("Pereira"), new City("Barranquilla"), 235150);
		CopaAirlines.addEdgePB(new City("Pereira"), new City("Bucaramanga"), 231652);
		CopaAirlines.addEdgePB(new City("Pereira"), new City("Cali"), 116265);
		CopaAirlines.addEdgePB(new City("Pereira"), new City("Cartagena"), 197840);
		CopaAirlines.addEdgePB(new City("Pereira"), new City("Medell�n"), 264875);
		CopaAirlines.addEdgePB(new City("Pereira"), new City("Santa Marta"), 102100);
				
		CopaAirlines.addEdgePB(new City("San Andr�s"), new City("Santa Marta"), 294312);
				
		CopaAirlines.addEdgePB(new City("Santa Marta"), new City("Barranquilla"), 303480);
		CopaAirlines.addEdgePB(new City("Santa Marta"), new City("Bogot�"), 104200);
		CopaAirlines.addEdgePB(new City("Santa Marta"), new City("Bucaramanga"), 112200);
		CopaAirlines.addEdgePB(new City("Santa Marta"), new City("Cali"), 195360);
		CopaAirlines.addEdgePB(new City("Santa Marta"), new City("Cartagena"), 242500);
		CopaAirlines.addEdgePB(new City("Santa Marta"), new City("Medell�n"), 112780);
		CopaAirlines.addEdgePB(new City("Santa Marta"), new City("Pereira"), 121241);
		CopaAirlines.addEdgePB(new City("Santa Marta"), new City("San Andr�s"), 305200);
				

		//LATAM
			
		//Temporada Alta
		LATAM.addEdgePA(new City("Bogot�"), new City("San Andr�s"), 126900);
		LATAM.addEdgePA(new City("Bogot�"), new City("Cali"), 169265);
		LATAM.addEdgePA(new City("Bogot�"), new City("Leticia"), 360155);
		LATAM.addEdgePA(new City("Bogot�"), new City("Yopal"), 189200);
		LATAM.addEdgePA(new City("Bogot�"), new City("Bucaramanga"), 150195);
		LATAM.addEdgePA(new City("Bogot�"), new City("C�cuta"),  201502);
		LATAM.addEdgePA(new City("Bogot�"), new City("Valledupar"), 191877);
		LATAM.addEdgePA(new City("Bogot�"), new City("Santa Marta"), 158790);
		LATAM.addEdgePA(new City("Bogot�"), new City("Barranquilla"), 156752);
		LATAM.addEdgePA(new City("Bogot�"), new City("Cartagena"), 146523);
		LATAM.addEdgePA(new City("Bogot�"), new City("Monter�a"), 141273);
		LATAM.addEdgePA(new City("Bogot�"), new City("Medell�n"), 117130);
		LATAM.addEdgePA(new City("Bogot�"), new City("Pereira"), 227078);
		
		LATAM.addEdgePA(new City("San Andr�s"), new City("Bogot�"), 136850);
		LATAM.addEdgePA(new City("Cali"), new City("Bogot�"), 169265);
		LATAM.addEdgePA(new City("Leticia"), new City("Bogot�"), 360155);
		LATAM.addEdgePA(new City("Yopal"), new City("Bogot�"), 175200);
		LATAM.addEdgePA(new City("Bucaramanga"), new City("Bogot�"), 162195);
		LATAM.addEdgePA(new City("C�cuta"), new City("Bogot�"),  212502);
		LATAM.addEdgePA(new City("Valledupar"), new City("Bogot�"), 184877);
		LATAM.addEdgePA(new City("Santa Marta"), new City("Bogot�"), 142790);
		LATAM.addEdgePA(new City("Barranquilla"), new City("Bogot�"), 165752);
		LATAM.addEdgePA(new City("Cartagena"), new City("Bogot�"), 157523);
		LATAM.addEdgePA(new City("Monter�a"), new City("Bogot�"), 124273);
		LATAM.addEdgePA(new City("Medell�n"), new City("Bogot�"), 142130);
		LATAM.addEdgePA(new City("Pereira"), new City("Bogot�"), 243078);
				
		LATAM.addEdgePA(new City("Cali"), new City("San Andr�s"), 213663);
		LATAM.addEdgePA(new City("San Andr�s"), new City("Cali"), 235800);
				
		LATAM.addEdgePA(new City("Santa Marta"), new City("Medell�n"), 349827);
		LATAM.addEdgePA(new City("Medell�n"), new City("Santa Marta"), 365478);
		LATAM.addEdgePA(new City("San Andr�s"), new City("Medell�n"), 373650);
		LATAM.addEdgePA(new City("Medell�n"), new City("San Andr�s"), 398765);
				
		LATAM.addEdgePA(new City("San Andr�s"), new City("Cartagena"), 197770);
		LATAM.addEdgePA(new City("Cartagena"), new City("San Andr�s"), 212530);
		LATAM.addEdgePA(new City("Cartagena"), new City("Medell�n"), 230209);
				
		//Temporada Baja
		LATAM.addEdgePB(new City("Bogot�"), new City("San Andr�s"), 100900);
		LATAM.addEdgePB(new City("Bogot�"), new City("Cali"), 121265);
		LATAM.addEdgePB(new City("Bogot�"), new City("Leticia"), 332155);
		LATAM.addEdgePB(new City("Bogot�"), new City("Yopal"), 141200);
		LATAM.addEdgePB(new City("Bogot�"), new City("Bucaramanga"), 112195);
		LATAM.addEdgePB(new City("Bogot�"), new City("C�cuta"),  184502);
		LATAM.addEdgePB(new City("Bogot�"), new City("Valledupar"), 172877);
		LATAM.addEdgePB(new City("Bogot�"), new City("Santa Marta"), 125790);
		LATAM.addEdgePB(new City("Bogot�"), new City("Barranquilla"), 120752);
		LATAM.addEdgePB(new City("Bogot�"), new City("Cartagena"), 112523);
		LATAM.addEdgePB(new City("Bogot�"), new City("Monter�a"), 108273);
		LATAM.addEdgePB(new City("Bogot�"), new City("Medell�n"), 99130);
		LATAM.addEdgePB(new City("Bogot�"), new City("Pereira"), 172078);
		
		LATAM.addEdgePB(new City("San Andr�s"), new City("Bogot�"), 100850);
		LATAM.addEdgePB(new City("Cali"), new City("Bogot�"), 121265);
		LATAM.addEdgePB(new City("Leticia"), new City("Bogot�"), 310155);
		LATAM.addEdgePB(new City("Yopal"), new City("Bogot�"), 121200);
		LATAM.addEdgePB(new City("Bucaramanga"), new City("Bogot�"), 112195);
		LATAM.addEdgePB(new City("C�cuta"), new City("Bogot�"),  185502);
		LATAM.addEdgePB(new City("Valledupar"), new City("Bogot�"), 125877);
		LATAM.addEdgePB(new City("Santa Marta"), new City("Bogot�"), 110790);
		LATAM.addEdgePB(new City("Barranquilla"), new City("Bogot�"), 115752);
		LATAM.addEdgePB(new City("Cartagena"), new City("Bogot�"), 114523);
		LATAM.addEdgePB(new City("Monter�a"), new City("Bogot�"), 100273);
		LATAM.addEdgePB(new City("Medell�n"), new City("Bogot�"), 102130);
		LATAM.addEdgePB(new City("Pereira"), new City("Bogot�"), 213078);
				
		LATAM.addEdgePB(new City("Cali"), new City("San Andr�s"), 192663);
		LATAM.addEdgePB(new City("San Andr�s"), new City("Cali"), 200800);
				
		LATAM.addEdgePB(new City("Santa Marta"), new City("Medell�n"), 325827);
		LATAM.addEdgePB(new City("Medell�n"), new City("Santa Marta"), 320478);
		LATAM.addEdgePB(new City("San Andr�s"), new City("Medell�n"), 335650);
		LATAM.addEdgePB(new City("Medell�n"), new City("San Andr�s"), 340765);
				
		LATAM.addEdgePB(new City("San Andr�s"), new City("Cartagena"), 145770);
		LATAM.addEdgePB(new City("Cartagena"), new City("San Andr�s"), 182530);
		LATAM.addEdgePB(new City("Cartagena"), new City("Medell�n"), 197209);
				

		
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

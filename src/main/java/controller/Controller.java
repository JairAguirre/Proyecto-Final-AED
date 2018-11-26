package controller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.*;

public class Controller implements Initializable{
	
	//Links Avianca
	private String linkAvBaja = "";
	private String linkAvAlta = "";
	
	//Links Copa
	private String linkCoBaja = "";
	private String linkCoAlta = "";
	
	//Links Latam
	private String linkLaBaja = "";
	private String linkLaAlta = "";
	
	Airport airport = new Airport();
	
	@FXML
    private Label llegadaAviancaTx;

    @FXML
    private Label CriterioAviancaTx;

    @FXML
    private Label MejorAviancaTx;

    @FXML
    private ComboBox<String> CriterioAvianca;

    @FXML
    private ComboBox<String> TemporadaCopa;

    @FXML
    private Label CriterioCopaTx;

    @FXML
    private Button ComprarCopaBut;

    @FXML
    private Label tempLatamTx;

    @FXML
    private Label MejorOpcionCopa;

    @FXML
    private ComboBox<String> CriterioLatam;

    @FXML
    private ComboBox<String> SalidasAvianca;

    @FXML
    private ComboBox<String> TemporadaAvianca;

    @FXML
    private ImageView ImgAvianca;

    @FXML
    private Button ComprarAviancaBut;

    @FXML
    private Label llegadaLatamTx;

    @FXML
    private Label MejorCopaTx;

    @FXML
    private ImageView ImgCopa;

    @FXML
    private Label TitleLatamTx;

    @FXML
    private ComboBox<String> SalidasCopa;

    @FXML
    private Label Titulo2Avianca;

    @FXML
    private Label MejorOpcionAvianca;

    @FXML
    private Label llegadaCopaTx;

    @FXML
    private ComboBox<String> SalidasLatam;

    @FXML
    private ComboBox<String> LlegadasAvianca;

    @FXML
    private Label destinoLatamTx;

    @FXML
    private Label tempAviancaTx;

    @FXML
    private Label Title2Latam;

    @FXML
    private Label TotalCopa;

    @FXML
    private ComboBox<String> LlegadasCopa;

    @FXML
    private Label CriterioLatamTx;

    @FXML
    private Button ComprarLatamBut;

    @FXML
    private Label TotalAviancaTx;

    @FXML
    private ComboBox<String> LlegadasLatam;

    @FXML
    private Label MejorLatamTx;

    @FXML
    private Label MejorOpcionLatam;

    @FXML
    private Label tempCopaTx;

    @FXML
    private Label TotalLatamTx;

    @FXML
    private Label TotalAvianca;

    @FXML
    private ImageView ImgLatam;

    @FXML
    private Label TotalLatam;

    @FXML
    private Label Titulo2Copa;

    @FXML
    private ComboBox<String> CriterioCopa;

    @FXML
    private Label TitleAviancaTx;

    @FXML
    private Label TotalCopaTx;

    @FXML
    private Label destinoAviancaTx;

    @FXML
    private ComboBox<String> TemporadaLatam;

    @FXML
    private Label TitleCopaTx;

    @FXML
    private Label destinoCopaTx;
    
    public void open(String link) {
    	
    	try {
			Desktop.getDesktop().browse(new URI(link));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    @FXML
    public void comprarAv(ActionEvent event) {
    	
    	if(TemporadaLatam.getSelectionModel().getSelectedItem().equals("Temporada Baja")) {
    		
    		if(SalidasLatam.getSelectionModel().getSelectedItem().equals("Cali")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("San Andres")) {
    				
    				linkLaBaja = "https://www.despegar.com.co/checkout/9cc2e5037ae447b488f8ac7c84c25f88/form";
    				open(linkLaBaja);
    				
    			} else {
    				
    				linkLaBaja = "https://www.despegar.com.co/checkout/822bd2cecbe94371beeded91e7249080/form";
    				open(linkLaBaja);
    				
    			}
    			
    		} else if(SalidasLatam.getSelectionModel().getSelectedItem().equals("San Andres")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Cali")) {
    				
    				linkLaBaja = "https://www.despegar.com.co/checkout/822bd2cecbe94371beeded91e7249080/form";
    				open(linkLaBaja);
    				
    				
    			} else if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Medellin")) {
    				
    				
    				
    			} else if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    				
    			} else if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Cartagena")) {
    				
    				
    				
    			}
    			

    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Cucuta")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Pereira")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Yopal")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Bucaramanga")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Cucuta")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Valledupar")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Barranquilla")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Monteria")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Cartagena")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Medellin")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Leticia")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Santa Marta")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Medellin")) {
    				
    				
    			}
    			
    		} else if (SalidasLatam.getSelectionModel().getSelectedItem().equals("Bogota")) {
    			
    			if(LlegadasLatam.getSelectionModel().getSelectedItem().equals("Leticia")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Cali")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Pereira")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Medellin")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("San Andres")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Monteria")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Cartagena")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Barranquilla")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Santa Marta")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Valledupar")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Cucuta")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Bucaramanga")) {
    				
    				
    			} else if (LlegadasLatam.getSelectionModel().getSelectedItem().equals("Yopal")) {
    				
    				
    			}
    			
    		}
    		
    		
    		
    	}

    }
    
    

    @FXML
    void comprarCo(ActionEvent event) {

    }

    @FXML
    void comprarLa(ActionEvent event) {

    }

    
    public void initBoxes() {
    	
    	TemporadaLatam.getItems().add("Temporada Alta");
    	TemporadaLatam.getItems().add("Temporada Baja");
    	CriterioLatam.getItems().add("Distancia");
    	CriterioLatam.getItems().add("Precio");
    	
    	TemporadaAvianca.getItems().add("Temporada Alta");
    	TemporadaAvianca.getItems().add("Temporada Baja");
    	CriterioAvianca.getItems().add("Distancia");
    	CriterioAvianca.getItems().add("Precio");
    	
    	TemporadaCopa.getItems().add("Temporada Alta");
    	TemporadaCopa.getItems().add("Temporada Baja");
    	CriterioCopa.getItems().add("Distancia");
    	CriterioCopa.getItems().add("Precio");
    	
    	for(int i = 0;i < airport.getCitiesAvianca().size(); i++) {
    		SalidasAvianca.getItems().add(airport.getCitiesAvianca().get(i).getName());
    		
    	}
    	
    	for(int i = 0;i < airport.getCitiesCopaAirlines().size(); i++) {
    		SalidasCopa.getItems().add(airport.getCitiesCopaAirlines().get(i).getName());
    		
    	}
    	

    	for(int i = 0;i < airport.getCitiesLATAM().size(); i++) {
    		SalidasLatam.getItems().add(airport.getCitiesLATAM().get(i).getName());
    		
    	}
    		
    	for(int i = 0;i < airport.getCitiesAvianca().size(); i++) {
    		LlegadasAvianca.getItems().add(airport.getCitiesAvianca().get(i).getName());
    		
    	}
    		
    	for(int i = 0;i < airport.getCitiesLATAM().size(); i++) {
    		LlegadasLatam.getItems().add(airport.getCitiesLATAM().get(i).getName());
    		
    	}
    	
    	for(int i = 0;i < airport.getCitiesCopaAirlines().size(); i++) {
    		LlegadasCopa.getItems().add(airport.getCitiesCopaAirlines().get(i).getName());
    		
    	}
    	
    }

	@Override
	public void initialize(URL Location, ResourceBundle resources) {
		
		Image imagen1 = new Image("/data/MapaAv.jpg");
		ImgAvianca.setImage(imagen1);
		
		Image imagen2 = new Image("/data/MapaLa.jpg");
		ImgLatam.setImage(imagen2);

		Image imagen3 = new Image("data/MapaCo.jpg");
		ImgCopa.setImage(imagen3);
		
		initBoxes();
//		Airport a = new Airport();
//		TotalCopa.setText(String.valueOf(a.getMinDistanceAvianca(new City("Bogotá"), new City("Cali"))));
	}
    
  

}
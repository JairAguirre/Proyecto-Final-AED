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
    public void comprarLa(ActionEvent event) {
    	
    	String linkLatam = "https://www.latam.com/es_co/promociones/cyber-latam/?gclid=CjwKCAiA0O7fBRASEiwAYI9QAp-VtccZJgD63WY6HiRFnwG5vPzFcKRGbzJ36Jz7GwGDIg7wK7bgVhoCc04QAvD_BwE&gclsrc=aw.ds";
    	open(linkLatam);
    	
    }

    @FXML
    void comprarCo(ActionEvent event) {

    }

    @FXML
    void comprarAv(ActionEvent event) {

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
    	
    	
    	
    }

	@Override
	public void initialize(URL Location, ResourceBundle resources) {
		
		Image imagen1 = new Image("/data/MapaAv.jpg");
		ImgAvianca.setImage(imagen1);
		
		Image imagen2 = new Image("/data/MapaLa.jpg");
		ImgLatam.setImage(imagen2);

		Image imagen3 = new Image("data/MapaCo.jpg");
		ImgCopa.setImage(imagen3);
	}
    
  

}
package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable{

	@FXML
    private Label llegadaAviancaTx;

    @FXML
    private Label CriterioAviancaTx;

    @FXML
    private Label MejorAviancaTx;

    @FXML
    private ComboBox<?> CriterioAvianca;

    @FXML
    private ComboBox<?> TemporadaCopa;

    @FXML
    private Label CriterioCopaTx;

    @FXML
    private Button ComprarCopaBut;

    @FXML
    private Label tempLatamTx;

    @FXML
    private Label MejorOpcionCopa;

    @FXML
    private ComboBox<?> CriterioLatam;

    @FXML
    private ComboBox<?> SalidasAvianca;

    @FXML
    private ComboBox<?> TemporadaAvianca;

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
    private ComboBox<?> SalidasCopa;

    @FXML
    private Label Titulo2Avianca;

    @FXML
    private Label MejorOpcionAvianca;

    @FXML
    private Label llegadaCopaTx;

    @FXML
    private ComboBox<?> SalidasLatam;

    @FXML
    private ComboBox<?> LlegadasAvianca;

    @FXML
    private Label destinoLatamTx;

    @FXML
    private Label tempAviancaTx;

    @FXML
    private Label Title2Latam;

    @FXML
    private Label TotalCopa;

    @FXML
    private ComboBox<?> LlegadasCopa;

    @FXML
    private Label CriterioLatamTx;

    @FXML
    private Button ComprarLatamBut;

    @FXML
    private Label TotalAviancaTx;

    @FXML
    private ComboBox<?> LlegadasLatam;

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
    private ComboBox<?> CriterioCopa;

    @FXML
    private Label TitleAviancaTx;

    @FXML
    private Label TotalCopaTx;

    @FXML
    private Label destinoAviancaTx;

    @FXML
    private ComboBox<?> TemporadaLatam;

    @FXML
    private Label TitleCopaTx;

    @FXML
    private Label destinoCopaTx;

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
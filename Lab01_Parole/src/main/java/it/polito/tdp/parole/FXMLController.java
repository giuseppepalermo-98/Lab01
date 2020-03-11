package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtTime;
    
    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	double start = System.nanoTime();
    	
    	this.txtResult.clear();
    	String parola= this.txtParola.getText();
    	elenco.addParola(parola);
    	this.txtParola.clear();
    	
    	for(String s: elenco.getElenco()) {
    	this.txtResult.appendText(s+"\n");
    	}
    	
    	double end = System.nanoTime();
    	this.txtTime.appendText(Integer.toString( (int) (end-start))+"\n");
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	
    	double start = System.nanoTime();
    	elenco.reset();
    	this.txtResult.clear();
    	double end = System.nanoTime();
    	this.txtTime.appendText(Integer.toString( (int) (end-start)) +"\n");
    }
    
    @FXML
    void DeleteParola(ActionEvent event) {
    	double start = System.nanoTime();
    	
    	String parola= this.txtResult.getSelectedText();
    	this.txtResult.clear();
    	elenco.elimina(parola);
    	
    	for(String s: elenco.getElenco()) {
        	this.txtResult.appendText(s+"\n");
        	}
    	
    	double end = System.nanoTime();
    	this.txtTime.appendText(Integer.toString( (int) (end-start))+"\n");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}

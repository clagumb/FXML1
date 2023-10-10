package de.sbs.fswi2;

import java.net.URL;
import java.util.ResourceBundle;

import de.sbs.fswi2.customcontrols.WI2Button;
import de.sbs.fswi2.customcontrols.WI2Label;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainViewController implements Initializable {
		
	// Bereich fü FXML
	@FXML
	private VBox vbox;

	@FXML
	private void beenden(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	private void addLabel(ActionEvent event) {
		WI2Label lokalLabel = new WI2Label();
		lokalLabel.setText("Text " + (vbox.getChildren().size() + 1));
		vbox.getChildren().add(lokalLabel);
	}

	@FXML
	private void deleteLabel(ActionEvent event) {
		vbox.getChildren().remove(vbox.getChildren().size() - 1);
	}

	// NORMALE Klassenmembers des Controlles
	private final int CONROLS_ON_START = 4;
	private Stage stage;
	
	public void setStage(Stage stage) {
		this.stage = stage;
		this.stage.setTitle("FXML1 FSWI-2");
	}
	
	// Interface
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		for (int i = 0; i < CONROLS_ON_START; i++) {
			WI2Label lbl = new WI2Label();
			lbl.setText("Text " + (i + 1));
			vbox.getChildren().add(lbl);
		}
	}
}

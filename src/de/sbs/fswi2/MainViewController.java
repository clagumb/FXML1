package de.sbs.fswi2;

import java.net.URL;
import java.util.ResourceBundle;

import de.sbs.fswi2.customcontrols.WI2Label;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	@FXML
	private VBox vbox;
	
	@FXML
	private void BeendenEventHandler(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	private void AddLabelEventHandler(ActionEvent event) {
		WI2Label lokalLabel = new WI2Label();
		lokalLabel.setText("Text " + (vbox.getChildren().size() + 1));
		vbox.getChildren().add(lokalLabel);
	}

	@FXML
	private void DeleteLabelEventHandler(ActionEvent event) {
		vbox.getChildren().remove(vbox.getChildren().size() - 1);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}

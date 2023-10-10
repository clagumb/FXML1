package de.sbs.fswi2;

import java.net.URL;
import java.util.ResourceBundle;

import de.sbs.fswi2.customcontrols.WI2Button;
import de.sbs.fswi2.customcontrols.WI2Label;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainViewController implements Initializable {

	private final int CONTROLS_ON_START = 5;
	private Stage stage;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		for (int i = 0; i < CONTROLS_ON_START; i++) {
			WI2Label buf = new WI2Label();
			buf.setText("Text " + (i + 1));
			vbox.getChildren().add(buf);
		}
		
	FlowPane pane =	(FlowPane) vbox.getParent();
	WI2Button btn = (WI2Button) pane.getChildren().get(3);
	btn.setStyle("-fx-background-color:black;");	
	}
	
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
		setBackgroundColorStage();
	}

	public void setStage(Stage stage) {
		this.stage = stage;
		stage.setTitle("FXML1 FSWI-2");
	}
	
	private void setBackgroundColorStage() {
		stage.setTitle("TEST");
	}
	
}

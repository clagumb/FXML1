package de.sbs.fswi2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("./mainview.fxml"));
		loader.setRoot(new FlowPane());
		Parent rootNode = loader.load();
		Scene scene = new Scene(rootNode);
		
		MainViewController controller = (MainViewController) loader.getController();
		controller.setStage(stage);
		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
package br.gov.sc.saude.testautoconecta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane root = FXMLLoader.load(getClass().getResource("Layout.fxml"));
		
		Scene scene = new Scene(root, 850, 400);
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("TestAutoConecta");
		primaryStage.show();

	}

}

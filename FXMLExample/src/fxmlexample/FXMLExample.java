package fxmlexample;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;


public class FXMLExample extends Application {
	@Override
	public void start(Stage stage) {
		try {
			GridPane root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
			Scene scene = new Scene(root,300,275);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setTitle("FXML Welcome");
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

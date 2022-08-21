package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;



public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root,Color.BLACK);
		stage.setTitle("here is my window.");
		Image icon = new Image("icon.png");
		stage.getIcons().add(icon);
		stage.setScene(scene);
		stage.show();
			
	}
}

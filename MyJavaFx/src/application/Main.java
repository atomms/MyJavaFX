package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author ernesto
 * @version 1.0
 * @see OneController
 */

public class Main extends Application {
	

		private AnchorPane rootLayout;
	public Stage primaryStage;
	
	/**
	 * init the stage
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("AID School");
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);
			
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,300,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
			
			primaryStage.show();
			
			initRootLayout();
			  

			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * loads the layout 
	 */
	
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/Layouts.fxml"));
			// // Give the controller access to the main app.
//			loader.setController(new WingClipper());
			rootLayout = (AnchorPane) loader.load();		


			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 600, 400);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
		      
			primaryStage.setScene(scene);
		
			// OneController controller = loader.getController();
			// controller.setMainApp(this);

			// imageRaw.setEffect(new GaussianBlur());
			
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

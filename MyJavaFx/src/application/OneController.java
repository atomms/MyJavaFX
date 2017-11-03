package application;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * The only controller for the whole application.
 * 
 * @author ernesto
 */
public class OneController {
	
	//not using yet
	@FXML
	private ImageView refugees;
	
	private Ellipse ceiling;
	
//	private Stage sendStage;

    
    private void initializeCeiling(AnchorPane root) {
        ceiling = new Ellipse();
        ceiling.centerXProperty().bind(root.widthProperty().multiply(0.5));
        ceiling.centerYProperty().setValue(0);
        ceiling.radiusXProperty().bind(root.widthProperty().multiply(0.8));
        ceiling.radiusYProperty().bind(root.heightProperty().multiply(0.6));
    }

	/**
     * Opens an stage to send the profile
     */
    
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Superheader.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Superheader");
            
            //clips
           
            refugees = new ImageView();
//            );
//    
//            ColorAdjust colorAdjust = new ColorAdjust();
//            colorAdjust.setContrast(1);
//            colorAdjust.setHue(0);
//            colorAdjust.setBrightness(0);
//            colorAdjust.setSaturation(0);
////            ceiling_image.setEffect(colorAdjust);
//            ceiling_image.setEffect(new GaussianBlur(5));
//            refugees.setClip(ceiling);
            refugees.setEffect(new GaussianBlur(50));
            
            Scene scene = new Scene(page);
             sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Method to handle the ImageView action in the Main stage 
     */
    
    @FXML
    private void handleSend() {
    	showSendProfile();
//        sendStage.close();
    }

    /**
     * Closes the application when clicked on Exit in the secondary stage
     */
    @FXML
    private void handleClose() {

   	        System.exit(0);
    }
    }

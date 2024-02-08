import java.util.ArrayList;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Duration;



public class controler {

    int time = 3000;
    // public static void pause(Integer time) {
    //     try{
    //         Thread.sleep(time);
    //     }catch(Exception e){
    //         System.out.println(e);
    //     }   
    // }
        PauseTransition pause = new PauseTransition(Duration.seconds(3));
        Image GundamImg1 = new Image("Armor Core 6 img1.jpg");
        Image GundamImg2 =  new Image("Armor Core 6 img2.jpg");
        Image GundamImg3 =  new Image("Armor Core 6 img3.jpg");
        Image GundamImg4 =  new Image("Armor Core 6 img4.jpg");
        Image GundamImg5 =  new Image("Armor Core 6 img5.jpg");
    // String ImgPaths = new ArrayList<String>();
    
 
    @FXML
    private ImageView PhotoFrame;

    @FXML
    private Button SkipImgButton;

    @FXML
    private Text UserImg;

    @FXML
    void SkippedPressed(ActionEvent event) {
        
        
        while (true) {
            
        pause.setOnFinished(Event -> PhotoFrame.setImage(GundamImg2));
        // pause.setOnFinished(Event -> PhotoFrame.setImage(PhotoFrame2));
        // pause.setOnFinished(Event -> PhotoFrame.setImage(PhotoFrame3));
        // pause.setOnFinished(Event -> PhotoFrame.setImage(PhotoFrame4));
        // pause.setOnFinished(Event -> PhotoFrame.setImage(PhotoFrame5));
        }
    }
    @FXML
    public void initialize() {

    
        
  

        // ImgPaths.add("Armor Core 6 img1.jpg");
        // ImgPaths.add("Armor Core 6 img2.jpg");
        // ImgPaths.add("Armor Core 6 img3.jpg");
        // ImgPaths.add("Armor Core 6 img4.jpg");
        // ImgPaths.add("Armor Core 6 img5.jpg");
        
    }
}

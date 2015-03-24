import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JavaFxFrame extends Application {
	
	Label lb_text;
	
public static void main(String[] args) {
	launch(args);
	}   

@Override
public void start(Stage stage) throws Exception {
	lb_text = new Label("JavaFX FRAME FTW!!!");
	
	VBox root = new VBox();
	root.getChildren().add(lb_text);
	
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.setFullScreen(true);
	
	
	stage.show();
	
}
}

import java.awt.Dimension;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
public class mainT2 extends Application {

	Stage window;
	Scene scene1,scene2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window=primaryStage;
		
		//1
	    Label label1=new Label("Welcome to the first scene"); 
	    Button button1 = new Button("Go to scene 2");
	    button1.setOnAction(new EventHandler<ActionEvent>() {		
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene2);		
			}
		});
	    
	    VBox layout1 = new VBox(20);
	    layout1.getChildren().addAll(label1,button1);
	    scene1=new Scene(layout1,200,200);
	    
	    //2
	    Button button2 = new Button("Go to scene 1");
	    button2.setOnAction(new EventHandler<ActionEvent>() {		
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene1);		
			}
		});
	    
	    StackPane layout2 = new StackPane();
	    layout2.getChildren().addAll(button2);
	    scene2=new Scene(layout2,600,300);
	    
	    window.setScene(scene1);
	    window.setTitle("MyTitle");
	    window.show();
	    
		
	}

}

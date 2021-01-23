package application;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StateDesign extends Application {
	 double xInState1;
	 double yInState1;
	 
	 int  kFrameNumber;
	 int objectSelection;
	 ListView ObjectsState;
	@Override
	public void start(Stage primaryStage) {

		/*
	    *	Design Logic:
	    * 1 Please input state number-> KFrame number
	    * 2 Please select object -> choose  object class
	    * 3 Please input change details-> define change 
	    * 4 Present ->    Play Button set actionEvent   timeline.play();             
		*/

		
		
		  Group rootGroup = new Group();
		  Circle c = new Circle(100,100,20);

			rootGroup.getChildren().addAll(c);
			
			
			TextField textSelectTotalStateNumber=new TextField();
			textSelectTotalStateNumber.setLayoutX(100);
			textSelectTotalStateNumber.setLayoutY(100);
			rootGroup.getChildren().addAll(textSelectTotalStateNumber);
			
			Button getTotalStateNumber=new Button("getStateNumber");
			getTotalStateNumber.setLayoutX(100);
			getTotalStateNumber.setLayoutY(150);
			rootGroup.getChildren().addAll(getTotalStateNumber);
			
			getTotalStateNumber.setOnAction((ActionEvent getValueEventX) -> {
				
				String sTotalStateNumber=textSelectTotalStateNumber.getText();
				int dTotalStateNumber = Integer.parseInt(sTotalStateNumber);
	
				System.out.println("Get total state numbers: "+dTotalStateNumber );

				
				ObservableList<Integer> integerList = FXCollections.observableArrayList(dTotalStateNumber);  
				
				int n=1;
				//Code
				// for(int x=getTotalStateNumber; x == 0; x = x-1) {
			   //      n=n+1;
				//System.out.print("State"+ x );
	
		      //   }
			//
				
				ListView<Integer> listView = new ListView<>(integerList);  
				listView.setItems(integerList);  
				listView.setLayoutX(250);
				listView.setLayoutY(100);
				listView.setPrefSize(400, 200);  
				rootGroup.getChildren().add(listView);
			});
			
			
			
			
			TextField text=new TextField();
			text.setLayoutX(900);
			text.setLayoutY(900);
			rootGroup.getChildren().addAll(text);
			
			
			Button getValue=new Button("getValue");
			getValue.setLayoutX(1100);
			getValue.setLayoutY(900);
			rootGroup.getChildren().addAll(getValue);
		
			getValue.setOnAction((ActionEvent getValueEventX) -> {
     		System.out.println("get Value Operation");
     		String xValueS=text.getText();
     		double xValue=Double.parseDouble(xValueS);
     		
     		xInState1=xValue;
      	
      		  System.out.println("get X Value:"+xValue);
      		  
      		System.out.println("x  value in Button "+xValue);
      		Timeline timeline = new Timeline();
			
			
			
 		   KeyFrame one = new KeyFrame(Duration.ZERO, new KeyValue[]{
 				new KeyValue(c.translateXProperty(), 0),
 				new KeyValue(c.translateYProperty(), 0),
 			
 				
 				new KeyValue(c.fillProperty(), Color.valueOf("#a00"))
 			});
 			
 		
          System.out.print("X value before keyFrame"+xValue);
 		   KeyFrame two = new KeyFrame(Duration.millis(1000), new KeyValue[]{
    				new KeyValue(c.translateXProperty(), xValue),
    				new KeyValue(c.translateYProperty(), 500),
    				
    				new KeyValue(c.fillProperty(), Color.valueOf("#0a0"))
    			});
 			
 		
 			KeyFrame three = new KeyFrame(Duration.millis(2000), new KeyValue[]{
 				new KeyValue(c.translateXProperty(), 500),
 				new KeyValue(c.translateYProperty(), 500),
 			
 				new KeyValue(c.fillProperty(), Color.valueOf("#00a"))
 			});
 			timeline.getKeyFrames().addAll(one, two, three);
 		
 			timeline.setCycleCount(1);
 			
 			Button play=new Button("play");
 			play.setLayoutX(1200);
 			play.setLayoutY(900);
 			rootGroup.getChildren().addAll(play);
 			
 		  
 			play.setOnAction((ActionEvent playEvent) -> {
 	     		System.out.println("play Operation");
 	     		timeline.play();
 	     		});
 		  
      		  
     		});
		
			
			
			
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		   Scene scene = new Scene(rootGroup, 1000,900, Color.WHITE);
	        primaryStage.setScene(scene);
	    	primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

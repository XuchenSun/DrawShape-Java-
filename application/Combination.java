/**
 * @class name: Combination
 * @author Xuchen 
 * @Version 0.11.30
 * @Development_Environment_Details: 


1 JDK 8: version Java SE Development Kit 8u271. JDK8 inclues JavaFx library. URL: https://www.oracle.com/ca-en/java/technologies/javase/javase-jdk8-downloads.html

2 IDE Eclipse: 2019-03 version or 2020-09 version. Version of 2019-03 is better. URL: https://www.eclipse.org/downloads/packages/release/2019-03

3 Install JavaFx tools in eclipse: Press help-> Install new software->Add->Write "e(fx)clipse" at name and Write "http://download.eclipse.org/efxclipse/updates-nightly/site" at URL-> install the JavaFx software in Eclipse-> Restart the Eclipse and now the JavaFX application can work.

Attention: Eclipse could choose previous JDK version, but don't do that.  The higher version of JDK must be removed in the Eclipses and add JDK8 address to eclipse. Romoving higher JDK version and adding JDK8 to eclipse is important.

 *@SSH 

Download Git-> use git command to clone project Lima->press git GUI->help-> generate SSH key->set SSH in gitlab account

After setting of SSH, git commands don't need to press email and password.

 * 
 */

package application;
	
import java.io.File;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.util.Duration;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Scale;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


//import from model package
import model.myShapeCircle;
import model.myShapeLine;
import model.myShapeOvail;
import model.myShapePath;
import model.myShapePolygon;
import model.myShapeRect;
import model.myShapeTextArea;
import model.myImage;
import model.myShapeArc;



public class Combination extends Application {
	
	  Point2D dragDistance = null;
	  
	  //X and Y value of mouse drag 
	    double MouseSceneX, MouseSceneY;
	    double MouseTranslateX, MouseTranslateY;
	    
		    double s1circleX ;
			double s1circleY ;
			
			KeyFrame frame1state1,frame2state2,frame3state3,frameNstateN;
			Duration duration1 = Duration.millis(1000);
		    Duration duration2 = Duration.millis(2000);
		    Duration duration3 = Duration.millis(3000);
	        Timeline timeline;
	        ListView framestateList;
	//    Circle circle=new Circle();

	
	@Override
	public void start(Stage stage1) throws Exception {
	


		
		

		stage1.setTitle("preZoom"); 
		// Pane rootPane =new Pane();
         Group rootGroup=new Group();
	 

	        // create a menu 
	        Menu menuFile = new Menu("File"); 
		
	        Menu menuAddObject=new Menu("AddObject");
	        Menu menuState = new Menu("State"); 
	        Menu menuPresent=new Menu("Present");
	        Menu menuSetting=new Menu("Setting");
	        Menu menuHelp=new Menu("Help");
	        Menu Camera=new Menu("Camera");
	      
	        MenuItem menuState1=new MenuItem("Stat1");
	       
	        
	        
	        
	        
	 
	        MenuItem menuState2=new MenuItem("Stat2");
	        
	        
	        
	        
	        Camera.setOnAction(new EventHandler<ActionEvent>() {
	            public void handle(ActionEvent e) {
	                System.out.println("Camera");
	                
	              
	                
	                
	            }
	        });
	    
	        // create menuitems 
	        

	        MenuItem menuItemSave= new MenuItem("Save"); 
	        menuItemSave.setOnAction(new EventHandler<ActionEvent>() {
	            public void handle(ActionEvent e) {
	                System.out.println("Save Operation");
	                
	              
	                
	                
	            }
	        });
	        MenuItem menuItemLoad = new MenuItem("Load"); 
	        menuItemLoad.setOnAction(new EventHandler<ActionEvent>() {
	            public void handle(ActionEvent e) {
	                System.out.println("Load Operation");
	                
	              
	                
	                
	            }
	        });
	        
	        
	        // Add
	        MenuItem menuItemAddLine= new MenuItem("Add Line"); 
	        menuItemAddLine.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent event) {
	        		System.out.println("add line");
	        		myShapeLine lineObject=new myShapeLine();
	        		
	        		Line line=new Line(lineObject.lineStartX,lineObject.lineStartY,lineObject.lineEndX,lineObject.lineEndY);
	        		
	

		  
		        	
		        	    
		        	    
		        	    line.setCursor(Cursor.HAND);
		        	    line.setOnKeyPressed(lineOnKeyPressedEventHandler);
		        	    line.setOnMousePressed(lineOnMousePressedEventHandler);
		        	    line.setOnMouseDragged(lineOnMouseDraggedEventHandler);
		        	    line.setOnMouseClicked(lineOnMouseClickEventHandler);
		        
		        	    
		        	//   check   if line is created, if it is true add line to KeyFrame:frame1state1
	                    
		                
		                
			            //      define line in KeyFrame offset
					   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
					    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
			                
			            //      check stateNumbet and add arc to correct state
					    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
			                
			                
			            //     add state1 to timeline
					    //	    timeline.getKeyFrames().addAll(frame1state1);
		        	    rootGroup.getChildren().add(line);
		        	    
		            Button LargerButton = new Button("Large");
		            LargerButton.setLayoutX(1300);
		            LargerButton.setLayoutY(730);
		            rootGroup.getChildren().add(LargerButton);
		            LargerButton.setOnAction((ActionEvent LineLarger) -> {
     	      		    System.out.println("Larger Object");
     	      		    Scale scaleLarger = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		scaleLarger.setX(1.5); 
	     	      		scaleLarger.setY(1.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleLarger.setPivotX(300); 
	     	      		scaleLarger.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation 
	     	            line.getTransforms().addAll(scaleLarger); 
     	      		    
     	      		    
     	      			});
		            Button SmarlerButton = new Button("Smaller");
		            SmarlerButton.setLayoutX(1370);
		            SmarlerButton.setLayoutY(730);
		            rootGroup.getChildren().add(SmarlerButton);
		            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
     	      		    System.out.println("Smaller Object");
     	      		    Scale scaleSmarler = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		 scaleSmarler.setX(0.5); 
	     	      		 scaleSmarler.setY(0.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleSmarler.setPivotX(300); 
	     	      		scaleSmarler.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation to 
	     	            line.getTransforms().addAll(scaleSmarler); 
     	      		    
     	      		    
     	      			});
		   //       ColorPicker colorPicker = new ColorPicker();
		            ColorPicker colorPicker = new ColorPicker();   
		            colorPicker.setValue(Color.RED);
		               colorPicker.setLayoutX(1300);
		               colorPicker.setLayoutY(700);

		                line.setStroke(colorPicker.getValue());
		                line.setStrokeWidth(5);
		          
		             
		                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
		                 
		                	line.setStroke(colorPicker.getValue());
		                });
		     		  
		                rootGroup.getChildren().add(colorPicker);
		              
		            
	        		    Button VisibilityButton = new Button("Visibility Off"); 
	        		    VisibilityButton.setLayoutX(1300);
	        		    VisibilityButton.setLayoutY(660);
	        		    rootGroup.getChildren().add(VisibilityButton);
	    	     	      		
	    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
	    	     	      		    System.out.println("Delete Object");
	    	     	      		    line.setVisible(false);
	    	     	      		    
	    	     	      		    
	    	     	      		});
	    	     	      		


	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 // Set textAreaOut  default
	        		 TextArea textAreaOut = new TextArea();
	        		 textAreaOut.setVisible(true);
	      
	        		 textAreaOut.setLayoutX(1100);
	        		 textAreaOut.setLayoutY(200);
	        		 textAreaOut.setMaxWidth(200);
	        		 textAreaOut.setMaxHeight(300);
	        		 textAreaOut.setMinSize(200, 300);
	        		
	     	          	String id="Object ID is "+String.valueOf(lineObject.objId)+".  ";
	     	          	String s0="Object_Attributs    ";
	     		        String string1="Line start at point (X,Y)"+"("+String.valueOf(lineObject.lineStartX)+","+String.valueOf(lineObject.lineStartY)+")"+".       ";
	     		        String string2="Line end at point (X,Y)"+"("+String.valueOf(lineObject.lineEndX)+","+String.valueOf(lineObject.lineEndY)+")"+".       ";
	     	        
	     	        textAreaOut.setText(s0+id+string1+string2);
	     	        textAreaOut.setWrapText(true);
	     
	     		     
	     	       rootGroup.getChildren().add(textAreaOut);
	     		
	      
	    	        	
	    	        	
	    	        	
	    	        	
	    	     
	     	        
	     	        
	     	        
	        		
	        		 
	        	
					
	        	};
	        	
	        	
	        	
	        	
	        });
	       
	        
	        MenuItem menuItemAddCircle = new MenuItem("Add Circle");
	       
	        menuItemAddCircle.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent event) {
	        		System.out.println("add Circle");
	         	 myShapeCircle circlObject=new myShapeCircle();
	        		
	         	
	        
	        	
	        		
	        		
	        		
	        	 Circle circle = new Circle(circlObject.circleCenterX,circlObject.circleCenterY,circlObject.circleradius);
	        	
	        		circle.setCursor(Cursor.HAND);
	        		circle.setEffect(new Lighting());

	                circle.setOnMousePressed(circleOnMousePressedEventHandler);
	                circle.setOnMouseDragged(circleOnMouseDraggedEventHandler);
	        		
	                rootGroup.getChildren().add(circle);
	                //   check   if circle is created, if it is true add circle to KeyFrame:frame1state1
                    
	                
	                
		            //      define circle in KeyFrame offset
				   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
				    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
		                
		            //      check stateNumbet and add arc to correct state
				    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
		                
		                
		            //     add state1 to timeline
				    //	    timeline.getKeyFrames().addAll(state1);
	        	    
	                
	                
	                Button LargerButton = new Button("Large");
		            LargerButton.setLayoutX(1300);
		            LargerButton.setLayoutY(730);
		            rootGroup.getChildren().add(LargerButton);
		            LargerButton.setOnAction((ActionEvent LineLarger) -> {
     	      		    System.out.println("Larger Object");
     	      		    Scale scaleLarger = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		scaleLarger.setX(1.5); 
	     	      		scaleLarger.setY(1.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleLarger.setPivotX(300); 
	     	      		scaleLarger.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation to
	     	            circle.getTransforms().addAll(scaleLarger); 
     	      		    
     	      		    
     	      			});
		            Button SmarlerButton = new Button("Smaller");
		            SmarlerButton.setLayoutX(1370);
		            SmarlerButton.setLayoutY(730);
		            rootGroup.getChildren().add(SmarlerButton);
		            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
     	      		    System.out.println("Smarler Object");
     	      		    Scale scaleSmarler = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		 scaleSmarler.setX(0.5); 
	     	      		 scaleSmarler.setY(0.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleSmarler.setPivotX(300); 
	     	      		scaleSmarler.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation to
	     	            circle.getTransforms().addAll(scaleSmarler); 
     	      		    
     	      		    
     	      			});
	                
	                
	        		
	        		 TextArea textArea = new TextArea();
	        		 textArea.setVisible(true);
	      
	        		 textArea.setVisible(true);
	       	      
	        		 textArea.setLayoutX(1100);
	        		 textArea.setLayoutY(200);
	        		 textArea.setMaxWidth(200);
	        		 textArea.setMaxHeight(300);
	        		 textArea.setMinSize(200, 300);
	        	
	        		
	     	        
	        		  String s0="Object_Attributs    ";
	        		  String id="Object ID is "+String.valueOf(circlObject.objId)+".  ";
	     		       String string1="Circle start at point (X,Y)"+"("+String.valueOf(circlObject.circleCenterX)+","+String.valueOf(circlObject.circleCenterY)+")"+"       ";
	     		       String string2="Circle Radius"+String.valueOf(circlObject.circleradius);
	     	        
	     	        textArea.setText(s0+id+string1+string2);
	     	        textArea.setWrapText(true);
	     
	     		     
	     	       rootGroup.getChildren().add(textArea);
	        		
	     		  final ColorPicker colorPicker = new ColorPicker();
	                colorPicker.setValue(Color.BLUE);
	                colorPicker.setLayoutX(1300);
	                colorPicker.setLayoutY(700);

	                circle.setFill(colorPicker.getValue());
	               
	                
	             
	                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
	                 
	                	circle.setFill(colorPicker.getValue());
	                });
	     		  
	                rootGroup.getChildren().add(colorPicker);
	               
        		    Button VisibilityButton = new Button("Visibility Off"); 
        		    VisibilityButton.setLayoutX(1300);
        		    VisibilityButton.setLayoutY(660);
        		    rootGroup.getChildren().add(VisibilityButton);
    	     	      		
    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
    	     	      		    System.out.println("Delete Object");
    	     	      		    circle.setVisible(false);
    	     	      		    
    	     	      		    
    	     	      		});
 	      		
	        		
	        		
	        	
	     		 
	     		 
					
	        	};
	        	
	        	
	        	
	        	
	        });
	        MenuItem menuItemAddArc= new MenuItem("Arc"); 
	        menuItemAddArc.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent event) {
	        		System.out.println("add Arc");
	        		myShapeArc arcObj=new myShapeArc();
	        		Arc arc = new Arc();
	        		arc.setCenterX(arcObj.arcCenterX); 
	        		arc.setCenterY(arcObj.arcCenterY); 
	        		arc.setRadiusX(arcObj.arcRadiusX); 
	        		arc.setRadiusY(arcObj.arcRadiusY); 
	        		arc.setStartAngle(arcObj.arcStartAngle); 
	        		arc.setLength(arcObj.arcLength); 
	        		arc.setType(arcObj.arcType);
	        		 
	        		arc.setEffect(new Lighting());
		        	    
		        	    arc.setCursor(Cursor.HAND);

		        	    arc.setOnMousePressed(arcOnMousePressedEventHandler);
		        	    arc.setOnMouseDragged(arcOnMouseDraggedEventHandler);
		        	    
		        	    
		        	    //   check   if arc is created, if it is true add arc to KeyFrame:frame1state1
	                    
		                
		                
			            //      define arc in KeyFrame offset
					   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
					    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
			                
			            //      check stateNumbet and add arc to correct state
					    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
			                
			                
			            //     add state1 to timeline
					    //	    timeline.getKeyFrames().addAll(state1);
		        	    
		        	    
		        	    final ColorPicker colorPicker = new ColorPicker();
		                colorPicker.setValue(Color.YELLOW);
		                colorPicker.setLayoutX(1300);
		                colorPicker.setLayoutY(700);

		                arc.setFill(colorPicker.getValue());
		               
		               
		                
		                
		                Button LargerButton = new Button("Large");
			            LargerButton.setLayoutX(1300);
			            LargerButton.setLayoutY(730);
			            rootGroup.getChildren().add(LargerButton);
			            LargerButton.setOnAction((ActionEvent LineLarger) -> {
	     	      		    System.out.println("Larger Object");
	     	      		    Scale scaleLarger = new Scale(); 
	     	            
		     	            //Setting the dimensions for the transformation 
		     	      		scaleLarger.setX(1.5); 
		     	      		scaleLarger.setY(1.5); 
			     	            
			     	            //Setting the pivot point for the transformation 
		     	      		scaleLarger.setPivotX(300); 
		     	      		scaleLarger.setPivotY(135); 
		     	             
		     	            //Adding the scale transformation to 
		     	            arc.getTransforms().addAll(scaleLarger); 
	     	      		    
	     	      		    
	     	      			});
			            
			            
			            Button SmarlerButton = new Button("Smaller");
			            SmarlerButton.setLayoutX(1370);
			            SmarlerButton.setLayoutY(730);
			            rootGroup.getChildren().add(SmarlerButton);
			            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
	     	      		    System.out.println("Smaler Object");
	     	      		    Scale scaleSmarler = new Scale(); 
	     	            
		     	            //Setting the dimensions for the transformation 
		     	      		 scaleSmarler.setX(0.5); 
		     	      		 scaleSmarler.setY(0.5); 
			     	            
			     	            //Setting the pivot point for the transformation 
		     	      		scaleSmarler.setPivotX(300); 
		     	      		scaleSmarler.setPivotY(135); 
		     	             
		     	            //Adding the scale transformation to 
		     	            arc.getTransforms().addAll(scaleSmarler); 
	     	      		    
	     	      		    
	     	      			});
		             
		                
			            
			            colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
		                 
		                	arc.setFill(colorPicker.getValue());
		                });
		     		  
			            rootGroup.getChildren().add(colorPicker);
			            rootGroup.getChildren().add(arc);
					
	     		  
	     		 TextArea textArea = new TextArea();
        		 textArea.setVisible(true);
      
        		 textArea.setVisible(true);
       	      
        		 textArea.setLayoutX(1100);
        		 textArea.setLayoutY(200);
        		 textArea.setMaxWidth(200);
        		 textArea.setMaxHeight(300);
        		 textArea.setMinSize(200, 300);
        	
        		
     	         
     		       String s0="Object_Attributs    ";
     		       String id="Object ID is "+String.valueOf(arcObj.objId)+".  ";
     		       String string1="Arc_Start_At_point(X,Y):"+"("+String.valueOf(arcObj.arcCenterX)+","+String.valueOf(arcObj.arcCenterY)+")"+".      ";
     		       String string2="Arc_Radius(X,Y):"+"("+String.valueOf(arcObj.arcRadiusX)+","+String.valueOf(arcObj.arcRadiusY)+")"+".       ";
     		       String string3="Arc_Start_Angle:"+String.valueOf(arcObj.arcStartAngle)+".       ";
     		       String s4="Arc_Length:"+String.valueOf(arcObj.arcLength)+".       ";
     		       String s5="Arc_Type:"+String.valueOf(arcObj.arcType)+".       ";
     	        textArea.setText(s0+id+string1+string2+string3+s4+s5);
     	        textArea.setWrapText(true);
     
    		    Button VisibilityButton = new Button("Visibility Off"); 
    		    VisibilityButton.setLayoutX(1300);
    		    VisibilityButton.setLayoutY(660);
    		    rootGroup.getChildren().add(VisibilityButton);
	     	      		
	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
	     	      		    System.out.println("Delete Object");
	     	      		    arc.setVisible(false);
	     	      		    
	     	      		    
	     	      		});
 	      		 
     	        
     	        
     	        
	     	      		rootGroup.getChildren().add(textArea);
	     		  
	     		  
	     		  
	     		  
	     		  
	     		  
	        	};
	        	
	        	
	        	
	        	
	        });
	        
	        Menu menuItemAddImage= new Menu("Add Image"); 
	        CheckMenuItem checkMenuItemVortex=new CheckMenuItem("Add Vertex Image");
	       
	       
	        
	        menuItemAddImage.getItems().add(checkMenuItemVortex);


	        checkMenuItemVortex.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent eventAddV) {
	        		System.out.println("add Vortex Image");
	        		myImage imageObj=new myImage();
	                
	               
	                
	        		imageObj.imageView.setImage(imageObj.imageV);
	        		imageObj.imageView.setFitHeight(imageObj.heigth);
	        		imageObj.imageView.setFitWidth(imageObj.width);
	        		imageObj.imageView.setLayoutX(300);
	        		imageObj.imageView.setLayoutY(400);
	        		
	                
	        		rootGroup.getChildren().add(imageObj.imageView);
	        	    
                    //   check   if imageObj is created, if it is true add imageObj to KeyFrame:frame1state1
                    
	                
	                
		            //       define imageObj in KeyFrame offset
				   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
				    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
		                
		            //      check stateNumbet and add imageObj to correct state
				    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
		                
		                
		            //     add state1 to timeline
				    //	    timeline.getKeyFrames().addAll(state1);
	                Button LargerButton = new Button("Large");
		            LargerButton.setLayoutX(1300);
		            LargerButton.setLayoutY(730);
		            rootGroup.getChildren().add(LargerButton);
		            LargerButton.setOnAction((ActionEvent LineLarger) -> {
     	      		    System.out.println("Larger Object");
     	      		    Scale scaleLarger = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		scaleLarger.setX(1.5); 
	     	      		scaleLarger.setY(1.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleLarger.setPivotX(300); 
	     	      		scaleLarger.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation 
	     	      		imageObj.imageView.getTransforms().addAll(scaleLarger); 
     	      		    
     	      		    
     	      			});
		            Button SmarlerButton = new Button("Smaller");
		            SmarlerButton.setLayoutX(1370);
		            SmarlerButton.setLayoutY(730);
		            rootGroup.getChildren().add(SmarlerButton);
		            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
     	      		    System.out.println("Smarler Object");
     	      		    Scale scaleSmarler = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		 scaleSmarler.setX(0.5); 
	     	      		 scaleSmarler.setY(0.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleSmarler.setPivotX(300); 
	     	      		scaleSmarler.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation
	     	      		imageObj.imageView.getTransforms().addAll(scaleSmarler); 
     	      		    
     	      		    
     	      			});
        		    Button DeleteButton = new Button("Delete"); 
		    		DeleteButton.setLayoutX(1300);
		    		DeleteButton.setLayoutY(660);
		    		rootGroup.getChildren().add(DeleteButton);
     	      
	        	    
	        	    
	        	    imageObj.imageView.setCursor(Cursor.HAND);

	        	    imageObj.imageView.setOnMousePressed(imageOnMousePressedEventHandler);
	        	    imageObj.imageView.setOnMouseDragged(imageOnMouseDraggedEventHandler);
     	      		
        		    Button VisibilityButton = new Button("Visibility Off"); 
        		    VisibilityButton.setLayoutX(1300);
        		    VisibilityButton.setLayoutY(660);
        		    rootGroup.getChildren().add(VisibilityButton);
    	     	      		
    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
    	     	      		    System.out.println("Delete Object");
    	     	      		 imageObj.imageView.setVisible(false);
    	     	      		    
    	     	      		    
    	     	      		});
     	      		
	                
	                
	          
	            
	                
	                
	            
	         
	           
	               
	                
	                
					
	        	};
	        	
	        	
	        	
	        	
	        });
	        
	        CheckMenuItem checkMenuItemShader=new CheckMenuItem("Add Shader Image");
	        menuItemAddImage.getItems().add(checkMenuItemShader);
	        
	        checkMenuItemShader.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent eventAddShader) {
	        		System.out.println("add Image Shader");
	        		myImage imageObj=new myImage();
	                
	               
	                
	        		imageObj.imageView.setImage(imageObj.image);
	        		imageObj.imageView.setFitHeight(imageObj.heigth);
	        		imageObj.imageView.setFitWidth(imageObj.width);
	        		imageObj.imageView.setLayoutX(300);
	        		imageObj.imageView.setLayoutY(400);
	        		
	                
	        		rootGroup.getChildren().add(imageObj.imageView);
	                imageObj.imageView.setCursor(Cursor.HAND);

	        	    imageObj.imageView.setOnMousePressed(imageOnMousePressedEventHandler);
	        	    imageObj.imageView.setOnMouseDragged(imageOnMouseDraggedEventHandler);
	        	    
                   //   check   if imageObj is created, if it is true add imageObj to KeyFrame:frame1state1
                    
	                
	                
		            //       define imageObj in KeyFrame offset
				   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
				    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
		                
		            //      check stateNumbet and add imageObj to correct state
				    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
		                
		                
		            //     add state1 to timeline
				    //	    timeline.getKeyFrames().addAll(state1);
	        	    Button LargerButton = new Button("Large");
		            LargerButton.setLayoutX(1300);
		            LargerButton.setLayoutY(730);
		            rootGroup.getChildren().add(LargerButton);
		            LargerButton.setOnAction((ActionEvent LineLarger) -> {
     	      		    System.out.println("Larger Object");
     	      		    Scale scaleLarger = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		scaleLarger.setX(1.5); 
	     	      		scaleLarger.setY(1.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleLarger.setPivotX(300); 
	     	      		scaleLarger.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation
	     	      		imageObj.imageView.getTransforms().addAll(scaleLarger); 
     	      		    
     	      		    
     	      			});
		            Button SmarlerButton = new Button("Smaller");
		            SmarlerButton.setLayoutX(1370);
		            SmarlerButton.setLayoutY(730);
		            rootGroup.getChildren().add(SmarlerButton);
		            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
     	      		    System.out.println("Smaller Object");
     	      		    Scale scaleSmarler = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		 scaleSmarler.setX(0.5); 
	     	      		 scaleSmarler.setY(0.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleSmarler.setPivotX(300); 
	     	      		scaleSmarler.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation
	     	      		imageObj.imageView.getTransforms().addAll(scaleSmarler); 
     	      		    
     	      		    
     	      			});
	        	    
		            Button VisibilityButton = new Button("Visibility Off"); 
        		    VisibilityButton.setLayoutX(1300);
        		    VisibilityButton.setLayoutY(660);
        		    rootGroup.getChildren().add(VisibilityButton);
    	     	      		
    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
    	     	      		    System.out.println("Delete Object");
    	     	      		 imageObj.imageView.setVisible(false);
    	     	      		    
    	     	      		    
    	     	      		});
     	      		
	                
	                
	                
	            
	               
	                
	            
	                
	                

	               
	                
	                
					
	        	};
	        	
	        	
	        	
	        	
	        });
	        
	        
	        CheckMenuItem checkMenuItemTexture=new CheckMenuItem("Add Texure Image");
	        menuItemAddImage.getItems().add(checkMenuItemTexture);
	        checkMenuItemTexture.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent eventAddTexture) {
	        		System.out.println("add Image Shader");
	        		myImage imageObj=new myImage();
	                
	               
	                
	        		imageObj.imageView.setImage(imageObj.imageT);
	        		imageObj.imageView.setFitHeight(imageObj.heigth);
	        		imageObj.imageView.setFitWidth(imageObj.width);
	        		imageObj.imageView.setLayoutX(300);
	        		imageObj.imageView.setLayoutY(400);
	        		
	                
	        		rootGroup.getChildren().add(imageObj.imageView);
	                
	                //   check   if imageObj is created, if it is true add imageObj to KeyFrame:frame1state1
                    
	                
	                
		            //       define imageObj in KeyFrame offset
				   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
				    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
		                
		            //      check stateNumbet and add imageObj to correct state
				    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
		                
		                
		            //     add state1 to timeline
				    //	    timeline.getKeyFrames().addAll(state1);
	                
	                Button LargerButton = new Button("Large");
		            LargerButton.setLayoutX(1300);
		            LargerButton.setLayoutY(730);
		            rootGroup.getChildren().add(LargerButton);
		            LargerButton.setOnAction((ActionEvent LineLarger) -> {
     	      		    System.out.println("Larger Object");
     	      		    Scale scaleLarger = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		scaleLarger.setX(1.5); 
	     	      		scaleLarger.setY(1.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleLarger.setPivotX(300); 
	     	      		scaleLarger.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation 
	     	      		imageObj.imageView.getTransforms().addAll(scaleLarger); 
     	      		    
     	      		    
     	      			});
		            Button SmarlerButton = new Button("Smaller");
		            SmarlerButton.setLayoutX(1370);
		            SmarlerButton.setLayoutY(730);
		            rootGroup.getChildren().add(SmarlerButton);
		            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
     	      		    System.out.println("Smaller Object");
     	      		    Scale scaleSmarler = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		 scaleSmarler.setX(0.5); 
	     	      		 scaleSmarler.setY(0.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleSmarler.setPivotX(300); 
	     	      		scaleSmarler.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation 
	     	      		imageObj.imageView.getTransforms().addAll(scaleSmarler); 
     	      		    
     	      		    
     	      			});
		            Button VisibilityButton = new Button("Visibility Off"); 
        		    VisibilityButton.setLayoutX(1300);
        		    VisibilityButton.setLayoutY(660);
        		    rootGroup.getChildren().add(VisibilityButton);
    	     	      		
    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
    	     	      		    System.out.println("Delete Object");
    	     	      		 imageObj.imageView.setVisible(false);
    	     	      		    
    	     	      		    
    	     	      		});
     	      		
	                
	                
     	      	    imageObj.imageView.setCursor(Cursor.HAND);

	        	    imageObj.imageView.setOnMousePressed(imageOnMousePressedEventHandler);
	        	    imageObj.imageView.setOnMouseDragged(imageOnMouseDraggedEventHandler);

	               
	                
	                
					
	        	};
	        	
	        	
	        	
	        	
	        });
	        
	        
	        MenuItem menuItemAddOvail= new MenuItem("Ovail");
	        
	        menuItemAddOvail.setOnAction(new EventHandler<ActionEvent>() {

	 				@Override
	 				public void handle(ActionEvent event) {
	 					
	 					
	 					myShapeOvail ovailObj=new myShapeOvail();
	 					Ellipse ovail = new Ellipse();
	 					ovail.setCenterX(ovailObj.ovailCenterX);
	 					ovail.setCenterY(ovailObj.ovailCenterY);
	 					ovail.setRadiusX(ovailObj.ovailRadiusX);
	 					ovail.setRadiusY(ovailObj.ovailRadiusY);
	 					rootGroup.getChildren().add(ovail);
	 					ovail.setEffect(new Lighting());
	 					
	 					ColorPicker colorPicker = new ColorPicker();
		                colorPicker.setValue(Color.GREEN);
		                colorPicker.setLayoutX(1300);
		                colorPicker.setLayoutY(700);

		                
		                
		                //   check   if ovail is created, if it is true add ovail to KeyFrame:frame1state1
	                    
		                
		                
			            //       define ovail in KeyFrame offset
					   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
					    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
			                
			            //      check stateNumbet and add imageObj to correct state
					    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
			                
			                
			            //     add state1 to timeline
					    //	    timeline.getKeyFrames().addAll(state1);
		                
		                
		                
		                ovail.setFill(colorPicker.getValue());
		               
		                
		             
		                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
		                 
		                	ovail.setFill(colorPicker.getValue());
		                });
		     		  
		                rootGroup.getChildren().add(colorPicker);
	 					
	 					
	 					
			        	    
			        	 ovail.setCursor(Cursor.HAND);

			        	 ovail.setOnMousePressed(ovailOnMousePressedEventHandler);
			        	 ovail.setOnMouseDragged(ovailOnMouseDraggedEventHandler);
	 					
			        	 Button LargerButton = new Button("Large");
				            LargerButton.setLayoutX(1300);
				            LargerButton.setLayoutY(730);
				            rootGroup.getChildren().add(LargerButton);
				            LargerButton.setOnAction((ActionEvent LineLarger) -> {
		     	      		    System.out.println("Larger Object");
		     	      		    Scale scaleLarger = new Scale(); 
		     	            
			     	            //Setting the dimensions for the transformation 
			     	      		scaleLarger.setX(1.5); 
			     	      		scaleLarger.setY(1.5); 
				     	            
				     	            //Setting the pivot point for the transformation 
			     	      		scaleLarger.setPivotX(300); 
			     	      		scaleLarger.setPivotY(135); 
			     	             
			     	            //Adding the scale transformation 
			     	      		ovail.getTransforms().addAll(scaleLarger); 
		     	      		    
		     	      		    
		     	      			});
				            Button SmarlerButton = new Button("Smaller");
				            SmarlerButton.setLayoutX(1370);
				            SmarlerButton.setLayoutY(730);
				            rootGroup.getChildren().add(SmarlerButton);
				            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
		     	      		    System.out.println("Smaller Object");
		     	      		    Scale scaleSmarler = new Scale(); 
		     	            
			     	            //Setting the dimensions for the transformation 
			     	      		 scaleSmarler.setX(0.5); 
			     	      		 scaleSmarler.setY(0.5); 
				     	            
				     	            //Setting the pivot point for the transformation 
			     	      		scaleSmarler.setPivotX(300); 
			     	      		scaleSmarler.setPivotY(135); 
			     	             
			     	            //Adding the scale transformation
			     	      		ovail.getTransforms().addAll(scaleSmarler); 
		     	      		    
		     	      		    
		     	      			});
			        	 
			        	 
	 		     		 TextArea textArea = new TextArea();
	 	        		 textArea.setVisible(true);
	 	      
	 	        		 textArea.setVisible(true);
	 	       	      
	 	        		 textArea.setLayoutX(1100);
	 	        		 textArea.setLayoutY(200);
	 	        		 textArea.setMaxWidth(200);
	 	        		 textArea.setMaxHeight(300);
	 	        		 textArea.setMinSize(200, 300);
	 					 String s0="Object_Attributs    ";
	 	     		       String id="Object ID is "+String.valueOf(ovailObj.objId)+".  ";
	 	     		       String string1="Ovail_Start_At_point(X,Y):"+"("+String.valueOf(ovailObj.ovailCenterX)+","+String.valueOf(ovailObj.ovailCenterY)+")"+".      ";
	 	     		       String string2="Ovail_Radius(X,Y):"+"("+String.valueOf(ovailObj.ovailRadiusX)+","+String.valueOf(ovailObj.ovailRadiusY)+")"+".       ";
	 	     		      
	 	     		
	 	     	        textArea.setText(s0+id+string1+string2);
	 	     	        textArea.setWrapText(true);
	 	     
	 	     		     
	 	     	      rootGroup.getChildren().add(textArea);
	 	    		    Button DeleteButton = new Button("Delete"); 
	 		    		DeleteButton.setLayoutX(1300);
	 		    		DeleteButton.setLayoutY(660);
	 		    		rootGroup.getChildren().add(DeleteButton);
	 	 	      		
	 	 	      	Button VisibilityButton = new Button("Visibility Off"); 
        		    VisibilityButton.setLayoutX(1300);
        		    VisibilityButton.setLayoutY(660);
        		    rootGroup.getChildren().add(VisibilityButton);
    	     	      		
    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
    	     	      		    System.out.println("Delete Object");
    	     	      		 ovail.setVisible(false);
    	     	      		    
    	     	      		    
    	     	      		});
	 					
	 					
	 				}});
	 	        
	        
	        
	        
	        
	        
	        MenuItem menuItemAddPath= new MenuItem("Path");
	        menuItemAddPath.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent event) {
	        		System.out.println("add line");
	        		myShapePath lineObject=new myShapePath();
	        		
	        		Line line1=new Line(lineObject.line1StartX,lineObject.line1StartY,lineObject.line1EndX,lineObject.line1EndY);
	        		
	        		line1.setEffect(new Lighting());
	        		Line line2=new Line(lineObject.line2StartX,lineObject.line2StartY,lineObject.line2EndX,lineObject.line2EndY);
	        		line2.setEffect(new Lighting());
		  
		        	
		        	    
		        	    
		        	    line1.setCursor(Cursor.HAND);
		        	    line1.setOnKeyPressed(lineOnKeyPressedEventHandler);
		        	    line1.setOnMousePressed(lineOnMousePressedEventHandler);
		        	    line1.setOnMouseDragged(lineOnMouseDraggedEventHandler);
		        	    
		        	    line2.setCursor(Cursor.HAND);
		        	    line2.setOnKeyPressed(lineOnKeyPressedEventHandler);
		        	    line2.setOnMousePressed(lineOnMousePressedEventHandler);
		        	    line2.setOnMouseDragged(lineOnMouseDraggedEventHandler);
		        		
		        	    rootGroup.getChildren().add(line1);
		        	    rootGroup.getChildren().add(line2);
		                
		        	    //   check   if path is created, if it is true add path to KeyFrame:frame1state1
	                    
		                
		                
			            //       define imageObj in KeyFrame offset
					   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
					    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
			                
			            //      check stateNumbet and add imageObj to correct state
					    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
			                
			                
			            //     add frame1state1 to timeline
					    //	    timeline.getKeyFrames().addAll(state1);
		                ColorPicker colorPicker = new ColorPicker();
		                colorPicker.setValue(Color.RED);
		                colorPicker.setLayoutX(1300);
		                colorPicker.setLayoutY(700);

		                line1.setStroke(colorPicker.getValue());
		                line1.setStrokeWidth(5);
		                line2.setStroke(colorPicker.getValue());
		                line2.setStrokeWidth(5);
		          
		             
		                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
		                 
		                	line1.setStroke(colorPicker.getValue());
		                	line2.setStroke(colorPicker.getValue());
		                });
		     		  
		                rootGroup.getChildren().add(colorPicker);
		    
	        		 
		                Button VisibilityButton = new Button("Visibility Off"); 
	        		    VisibilityButton.setLayoutX(1300);
	        		    VisibilityButton.setLayoutY(660);
	        		    rootGroup.getChildren().add(VisibilityButton);
	    	     	      		
	    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
	    	     	      		    System.out.println("Delete Object");
	    	     	      		 line1.setVisible(false);
	    	     	      		 line2.setVisible(false);
	    	     	      		    
	    	     	      		    
	    	     	      		});
	    	     	      		


	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	    	     	      		Button LargerButton = new Button("Large");
	    			            LargerButton.setLayoutX(1300);
	    			            LargerButton.setLayoutY(730);
	    			            rootGroup.getChildren().add(LargerButton);
	    			            LargerButton.setOnAction((ActionEvent LineLarger) -> {
	    	     	      		    System.out.println("Larger Object");
	    	     	      		    Scale scaleLarger = new Scale(); 
	    	     	            
	    		     	            //Setting the dimensions for the transformation 
	    		     	      		scaleLarger.setX(1.5); 
	    		     	      		scaleLarger.setY(1.5); 
	    			     	            
	    			     	            //Setting the pivot point for the transformation 
	    		     	      		scaleLarger.setPivotX(300); 
	    		     	      		scaleLarger.setPivotY(135); 
	    		     	             
	    		     	            //Adding the scale transformation to  
	    		     	      		line1.getTransforms().addAll(scaleLarger); 
	    		     	      		line2.getTransforms().addAll(scaleLarger);
	    	     	      		    
	    	     	      			});
	    			            Button SmarlerButton = new Button("Smaller");
	    			            SmarlerButton.setLayoutX(1370);
	    			            SmarlerButton.setLayoutY(730);
	    			            rootGroup.getChildren().add(SmarlerButton);
	    			            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
	    	     	      		    System.out.println("Smaller Object");
	    	     	      		    Scale scaleSmarler = new Scale(); 
	    	     	            
	    		     	            //Setting the dimensions for the transformation 
	    		     	      		 scaleSmarler.setX(0.5); 
	    		     	      		 scaleSmarler.setY(0.5); 
	    			     	            
	    			     	            //Setting the pivot point for the transformation 
	    		     	      		scaleSmarler.setPivotX(300); 
	    		     	      		scaleSmarler.setPivotY(135); 
	    		     	             
	    		     	            //Adding the scale transformation 
	    		     	      		line1.getTransforms().addAll(scaleSmarler); 
	    		     	      		line2.getTransforms().addAll(scaleSmarler); 
	    	     	      		    
	    	     	      			});
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 // Set textAreaOut  default
	        		 TextArea textAreaOut = new TextArea();
	        		 textAreaOut.setVisible(true);
	      
	        		 textAreaOut.setLayoutX(1100);
	        		 textAreaOut.setLayoutY(200);
	        		 textAreaOut.setMaxWidth(200);
	        		 textAreaOut.setMaxHeight(300);
	        		 textAreaOut.setMinSize(200, 300);
	        		
	     	          	String id="Object ID is "+String.valueOf(lineObject.objId)+".  ";
	     	          	String s0="Object_Attributs    ";
	     		        String string1="Line start at point (X,Y)"+"("+String.valueOf(lineObject.line1StartX)+","+String.valueOf(lineObject.line1StartY)+")"+".       ";
	     		        String string2="Line end at point (X,Y)"+"("+String.valueOf(lineObject.line1EndX)+","+String.valueOf(lineObject.line1EndY)+")"+".       ";
	     		       String string3="Line start at point (X,Y)"+"("+String.valueOf(lineObject.line2StartX)+","+String.valueOf(lineObject.line2StartY)+")"+".       ";
	     		        String string4="Line end at point (X,Y)"+"("+String.valueOf(lineObject.line2EndX)+","+String.valueOf(lineObject.line2EndY)+")"+".       ";
	     	        
	     	        textAreaOut.setText(s0+id+string1+string2+string3+string4);
	     	        textAreaOut.setWrapText(true);
	     
	     		     
	     	       rootGroup.getChildren().add(textAreaOut);
	     		
	      
	    	        	
	    	        	
	    	        	
	    	        	
	    	     
	     	        
	     	        
	     	        
	        		
	        		 
	        	
					
	        	};
	        	
	        	
	        	
	        	
	        });
	       
	        MenuItem menuItemAddPolygon= new MenuItem("Polygon");
	        menuItemAddPolygon.setOnAction(new EventHandler<ActionEvent>() {

 				@Override
 				public void handle(ActionEvent event) {
 					
 					myShapePolygon polygonObject=new myShapePolygon();
	        		
 					
 					Polygon polygon=new Polygon();
 					polygon.setEffect(new Lighting());
 					polygon.getPoints().addAll(new Double[]{        
 							polygonObject.polygonX1, polygonObject.polygonY1, 
 							polygonObject.polygonX2, polygonObject.polygonY2, 
 							polygonObject.polygonX3, polygonObject.polygonY3,           
 							polygonObject.polygonX4, polygonObject.polygonY4,  
 							polygonObject.polygonX5, polygonObject.polygonY5,                  
 							polygonObject.polygonX6, polygonObject.polygonY6, 
 					});
 		
 					rootGroup.getChildren().add(polygon);
 				
 //   check           //check if  polygonObject is created, if it is true add polygonObject to KeyFrame:frame1state1
                    
	                
	                
		            //       define polygonObject in KeyFrame offset
				   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
				    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
		                
		            //      check stateNumbet and add imageObj to correct state
				    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
		                
		                
		            //     add state1 to timeline
				    //	    timeline.getKeyFrames().addAll(state1);
 					ColorPicker colorPicker = new ColorPicker();
	                colorPicker.setValue(Color.GREEN);
	                colorPicker.setLayoutX(1300);
	                colorPicker.setLayoutY(700);

	                polygon.setFill(colorPicker.getValue());
	               
	                
	             
	                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
	                 
	                	polygon.setFill(colorPicker.getValue());
	                });
	     		  
	                rootGroup.getChildren().add(colorPicker);
 					
 					
 					
		        	    
	                polygon.setCursor(Cursor.HAND);

	                polygon.setOnMousePressed(polygonOnMousePressedEventHandler);
	                polygon.setOnMouseDragged(polygonOnMouseDraggedEventHandler);
 					
		        	 
	                Button LargerButton = new Button("Large");
		            LargerButton.setLayoutX(1300);
		            LargerButton.setLayoutY(730);
		            rootGroup.getChildren().add(LargerButton);
		            LargerButton.setOnAction((ActionEvent LineLarger) -> {
     	      		    System.out.println("Larger Object");
     	      		    Scale scaleLarger = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		scaleLarger.setX(1.5); 
	     	      		scaleLarger.setY(1.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleLarger.setPivotX(300); 
	     	      		scaleLarger.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation 
	     	      		polygon.getTransforms().addAll(scaleLarger); 
     	      		    
     	      		    
     	      			});
		            Button SmarlerButton = new Button("Smaller");
		            SmarlerButton.setLayoutX(1370);
		            SmarlerButton.setLayoutY(730);
		            rootGroup.getChildren().add(SmarlerButton);
		            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
     	      		    System.out.println("Smaller Object");
     	      		    Scale scaleSmarler = new Scale(); 
     	            
	     	            //Setting the dimensions for the transformation 
	     	      		 scaleSmarler.setX(0.5); 
	     	      		 scaleSmarler.setY(0.5); 
		     	            
		     	            //Setting the pivot point for the transformation 
	     	      		scaleSmarler.setPivotX(300); 
	     	      		scaleSmarler.setPivotY(135); 
	     	             
	     	            //Adding the scale transformation
	     	      		polygon.getTransforms().addAll(scaleSmarler); 
     	      		    
     	      		    
     	      			});
		            Button VisibilityButton = new Button("Visibility Off"); 
        		    VisibilityButton.setLayoutX(1300);
        		    VisibilityButton.setLayoutY(660);
        		    rootGroup.getChildren().add(VisibilityButton);
    	     	      		
    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
    	     	      		    System.out.println("Delete Object");
    	     	      		 polygon.setVisible(false);
    	     	      		
    	     	      		    
    	     	      		    
    	     	      		});
	                
	                
 		     		 TextArea textArea = new TextArea();
 	        		 textArea.setVisible(true);
 	      
 	        		 textArea.setVisible(true);
 	       	      
 	        		 textArea.setLayoutX(1100);
 	        		 textArea.setLayoutY(200);
 	        		 textArea.setMaxWidth(200);
 	        		 textArea.setMaxHeight(300);
 	        		 textArea.setMinSize(200, 300);
 					 String s0="Object_Attributs    ";
 	     		       String id="Object ID is "+String.valueOf(polygonObject.objId)+".  ";
 	     		      
 	     		
 	     	        textArea.setText(s0+id);
 	     	        textArea.setWrapText(true);
 	     
 	     		     
 	     	      rootGroup.getChildren().add(textArea);
 	    		    Button DeleteButton = new Button("Delete"); 
 		    		DeleteButton.setLayoutX(1300);
 		    		DeleteButton.setLayoutY(660);
 		    		rootGroup.getChildren().add(DeleteButton);
 	 	      		
 	 	    
 					
 					
 				}});
 	        
         
	        MenuItem menuItemAddRect= new MenuItem("Rect");
	        menuItemAddRect.setOnAction(new EventHandler<ActionEvent>() {

	   				@Override
	   				public void handle(ActionEvent event) {
	   					
	   					myShapeRect rectObject=new myShapeRect();
	  	        		
	   					
	   					Rectangle rect=new Rectangle();
	   					
	   					rect.setX(rectObject.rectX);
	   					rect.setY(rectObject.rectY);
	   					rect.setWidth(rectObject.rectWidth);
	   					rect.setHeight(rectObject.rectHeight);
	   					rect.setArcWidth(rectObject.rectArcWidth);
	   					rect.setArcHeight(rectObject.rectArcHeight);
	   					
	   					rect.setEffect(new Lighting());
                    	//   check   if rect is created, if it is true add rect to KeyFrame:frame1state1
	                    
		                
		                
			            //      define rect in KeyFrame offset
					   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
					    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
			                
			            //      check stateNumbet and add arc to correct state
					    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
			                
			                
			            //     add state1 to timeline
					    //	    timeline.getKeyFrames().addAll(state1);
	   					rootGroup.getChildren().add(rect);
	   				
	   					
	   					ColorPicker colorPicker = new ColorPicker();
	  	                colorPicker.setValue(Color.GREEN);
	  	                colorPicker.setLayoutX(1300);
	  	                colorPicker.setLayoutY(700);

	  	              rect.setFill(colorPicker.getValue());
	  	               
	  	                
	  	             
	  	                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
	  	                 
	  	                	rect.setFill(colorPicker.getValue());
	  	                });
	  	     		  
	  	              rootGroup.getChildren().add(colorPicker);
	   					
	   					
	   					
	  		         	    
	  	               rect.setCursor(Cursor.HAND);

	  	               rect.setOnMousePressed(rectOnMousePressedEventHandler);
	  	               rect.setOnMouseDragged(rectOnMouseDraggedEventHandler);
	   					
	  		        	 
	  	                Button LargerButton = new Button("Large");
	  		            LargerButton.setLayoutX(1300);
	  		            LargerButton.setLayoutY(730);
	  		          rootGroup.getChildren().add(LargerButton);
	  		            LargerButton.setOnAction((ActionEvent LineLarger) -> {
	       	      		    System.out.println("Larger Object");
	       	      		    Scale scaleLarger = new Scale(); 
	       	            
	  	     	            //Setting the dimensions for the transformation 
	  	     	      		scaleLarger.setX(1.5); 
	  	     	      		scaleLarger.setY(1.5); 
	  		     	            
	  		     	            //Setting the pivot point for the transformation 
	  	     	      		scaleLarger.setPivotX(300); 
	  	     	      		scaleLarger.setPivotY(135); 
	  	     	             
	  	     	            //Adding the scale transformation 
	  	     	      		rect.getTransforms().addAll(scaleLarger); 
	       	      		    
	       	      		    
	       	      			});
	  		            Button SmarlerButton = new Button("Smaller");
	  		            SmarlerButton.setLayoutX(1370);
	  		            SmarlerButton.setLayoutY(730);
	  		          rootGroup.getChildren().add(SmarlerButton);
	  		            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
	       	      		    System.out.println("Smaller Object");
	       	      		    Scale scaleSmarler = new Scale(); 
	       	            
	  	     	            //Setting the dimensions for the transformation 
	  	     	      		 scaleSmarler.setX(0.5); 
	  	     	      		 scaleSmarler.setY(0.5); 
	  		     	            
	  		     	            //Setting the pivot point for the transformation 
	  	     	      		scaleSmarler.setPivotX(300); 
	  	     	      		scaleSmarler.setPivotY(135); 
	  	     	             
	  	     	            //Adding the scale transformation 
	  	     	      		rect.getTransforms().addAll(scaleSmarler); 
	       	      		    
	       	      		    
	       	      			});
	  	                
	  		          Button VisibilityButton = new Button("Visibility Off"); 
	        		    VisibilityButton.setLayoutX(1300);
	        		    VisibilityButton.setLayoutY(660);
	        		    rootGroup.getChildren().add(VisibilityButton);
	    	     	      		
	    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
	    	     	      		    System.out.println("Delete Object");
	    	     	      		 rect.setVisible(false);
	    	     	      		
	    	     	      		    
	    	     	      		    
	    	     	      		});
	  	                
	   		     		 TextArea textArea = new TextArea();
	   	        		 textArea.setVisible(true);
	   	      
	   	        		 textArea.setVisible(true);
	   	       	      
	   	        		 textArea.setLayoutX(1100);
	   	        		 textArea.setLayoutY(200);
	   	        		 textArea.setMaxWidth(200);
	   	        		 textArea.setMaxHeight(300);
	   	        		 textArea.setMinSize(200, 300);
	   					 String s0="Object_Attributs    ";
	   	     		       String id="Object ID is "+String.valueOf(rectObject.objId)+".  ";
	   	     		      
	   	     		
	   	     	        textArea.setText(s0+id);
	   	     	        textArea.setWrapText(true);
	   	     
	   	     		     
	   	     	    rootGroup.getChildren().add(textArea);
	   	    		    
	   					
	   				}});
	        MenuItem menuItemAddText= new MenuItem("Text");
	        menuItemAddText.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent event) {
	        		System.out.println("add TextArea");
	        		myShapeTextArea textAreaObject=new myShapeTextArea();
	        		 TextArea textArea = new TextArea();
	        		 textArea.setVisible(true);
	      
	        		 textArea.setLayoutX(textAreaObject.textAreaLayoutX);
	        		 textArea.setLayoutY(textAreaObject.textAreaLayoutY);
	        		 textArea.setMaxWidth(textAreaObject.textAreaMaxWidth);
	        		 textArea.setMaxHeight(textAreaObject.textAreaMaxHeight);
	        		 textArea.setMinSize(200, 200);
	        		
	        		
	        		 
		        	
		        	    
		        	    
	        		 textArea.setCursor(Cursor.HAND);
	        		 textArea.setOnKeyPressed(lineOnKeyPressedEventHandler);
	        		 textArea.setOnMousePressed(lineOnMousePressedEventHandler);
	        		 textArea.setOnMouseDragged(lineOnMouseDraggedEventHandler);
		        	    
	        	    	//   check   if textArea is created, if it is true add textArea to KeyFrame:frame1state1
	                    
		                
		                
			            //      define textArea in KeyFrame offset
					   //		KeyValue xValue  = new KeyValue(arc.xProperty(), 200); 
					    //		KeyValue yValue  = new KeyValue(arc.yProperty(), 200);
			                
			            //      check stateNumbet and add arc to correct state
					    //	    state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);  
			                
			                
			            //     add state1 to timeline
					    //	    timeline.getKeyFrames().addAll(state1); 
		        		
	        		 rootGroup.getChildren().add(textArea);
		       
		                
		        		
		                ColorPicker colorPicker = new ColorPicker();
		                colorPicker.setValue(Color.RED);
		                colorPicker.setLayoutX(1300);
		                colorPicker.setLayoutY(700);

		               
		     		  
		                rootGroup.getChildren().add(colorPicker);
		    
	        		 
		                Button VisibilityButton = new Button("Visibility Off"); 
	        		    VisibilityButton.setLayoutX(1300);
	        		    VisibilityButton.setLayoutY(660);
	        		    rootGroup.getChildren().add(VisibilityButton);
	    	     	      		
	    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
	    	     	      		    System.out.println("Delete Object");
	    	     	      		 textArea.setVisible(false);
	    	     	      		
	    	     	      		    
	    	     	      		});
	    	     	      		


	        		 
	        		 
	    	     	      	 Button LargerButton = new Button("Large");
	    			            LargerButton.setLayoutX(1300);
	    			            LargerButton.setLayoutY(730);
	    			            rootGroup.getChildren().add(LargerButton);
	    			            LargerButton.setOnAction((ActionEvent LineLarger) -> {
	    	     	      		    System.out.println("Larger Object");
	    	     	      		    Scale scaleLarger = new Scale(); 
	    	     	            
	    		     	            //Setting the dimensions for the transformation 
	    		     	      		scaleLarger.setX(1.5); 
	    		     	      		scaleLarger.setY(1.5); 
	    			     	            
	    			     	            //Setting the pivot point for the transformation 
	    		     	      		scaleLarger.setPivotX(300); 
	    		     	      		scaleLarger.setPivotY(135); 
	    		     	             
	    		     	            //Adding the scale transformation to circle1 
	    		     	      		textArea.getTransforms().addAll(scaleLarger); 
	    	     	      		    
	    	     	      		    
	    	     	      			});
	    			            Button SmarlerButton = new Button("Smaller");
	    			            SmarlerButton.setLayoutX(1370);
	    			            SmarlerButton.setLayoutY(730);
	    			            rootGroup.getChildren().add(SmarlerButton);
	    			            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
	    	     	      		    System.out.println("Smaller Object");
	    	     	      		    Scale scaleSmarler = new Scale(); 
	    	     	            
	    		     	            //Setting the dimensions for the transformation 
	    		     	      		 scaleSmarler.setX(0.5); 
	    		     	      		 scaleSmarler.setY(0.5); 
	    			     	            
	    			     	            //Setting the pivot point for the transformation 
	    		     	      		scaleSmarler.setPivotX(300); 
	    		     	      		scaleSmarler.setPivotY(135); 
	    		     	             
	    		     	            //Adding the scale transformation
	    		     	      		textArea.getTransforms().addAll(scaleSmarler); 
	    	     	      		    
	    	     	      		    
	    	     	      			});
	    		                
	        		 
	    	     	      	
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 
	        		 // Set textAreaOut  default
	        		 TextArea textAreaOut = new TextArea();
	        		 textAreaOut.setVisible(true);
	      
	        		 textAreaOut.setLayoutX(1100);
	        		 textAreaOut.setLayoutY(200);
	        		 textAreaOut.setMaxWidth(200);
	        		 textAreaOut.setMaxHeight(300);
	        		 textAreaOut.setMinSize(200, 300);
	        		
	     	          	String id="Object ID is "+String.valueOf(textAreaObject.objId)+".  ";
	     	          	String s0="Object_Attributs    ";
	     		        String string1="TextArea Layout (X,Y)"+"("+String.valueOf(textAreaObject.textAreaLayoutX)+","+String.valueOf(textAreaObject.textAreaLayoutY)+")"+".       ";
	     		
	     	        
	     	        textAreaOut.setText(s0+id+string1);
	     	        textAreaOut.setWrapText(true);
	     
	     		     
	     	       rootGroup.getChildren().add(textAreaOut);
	     		
	      
	    	        	
	    	        	
	    	        	
	    	        	
	    	     
	     	        
	     	        
	     	        
	        		
	        		 
	        	
					
	        	};
	        	
	        	
	        	
	        	
	        });
	       
	        
	        MenuItem menuItemPlayMusic= new MenuItem("PlayMusic");
	        
	        menuItemPlayMusic.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				   	String musicB= new File("backGroundMusic.mp3").toURI().toString();
			        Media media1 = new Media(musicB);
			      
			        AudioClip mediaPlayer = new AudioClip(media1.getSource());
			        mediaPlayer.play();
			        
			        
 	    		    Button DeleteButton = new Button("Delete"); 
 		    		DeleteButton.setLayoutX(1300);
 		    		DeleteButton.setLayoutY(660);
 		    		rootGroup.getChildren().add(DeleteButton);
 	 	      		
 	 	      		DeleteButton.setOnAction((ActionEvent d) -> {
 	 	      		    System.out.println("Delete Object");
 	 	      		    mediaPlayer.stop();;
 	 	      		    
 	 	      		});
			        
			        
				}});
	        
	        MenuItem menuItemContact= new MenuItem("Contact:Xuchen xuchens@mun.ca");

	        
	        //Edit Attributes
	       
	      
	       
	     
	        
	        
	        
	        
	        //Present
	        MenuItem menuItemPresentModelS1= new MenuItem("State1");
	        menuItemPresentModelS1.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				   	
					
			        // There should have a method to collect objects ID, X and Y values. 
 	    		    // There should be a method to put collect data into a list of Framestate
					myShapeCircle circlObject=new myShapeCircle();
	        		
		         	
			        
		        	
	        		
	        		
	        		
		        	 Circle circle = new Circle(circlObject.circleCenterX,circlObject.circleCenterY,circlObject.circleradius);
		        	
		        		circle.setCursor(Cursor.HAND);
		        		circle.setEffect(new Lighting());

		                circle.setOnMousePressed(circleOnMousePressedEventHandler);
		                circle.setOnMouseDragged(circleOnMouseDraggedEventHandler);
		        		
		                rootGroup.getChildren().add(circle);
		        		
		        		
		                
		                
		                Button LargerButton = new Button("Large");
			            LargerButton.setLayoutX(1300);
			            LargerButton.setLayoutY(730);
			            rootGroup.getChildren().add(LargerButton);
			            LargerButton.setOnAction((ActionEvent LineLarger) -> {
	     	      		    System.out.println("Larger Object");
	     	      		    Scale scaleLarger = new Scale(); 
	     	            
		     	            //Setting the dimensions for the transformation 
		     	      		scaleLarger.setX(1.5); 
		     	      		scaleLarger.setY(1.5); 
			     	            
			     	            //Setting the pivot point for the transformation 
		     	      		scaleLarger.setPivotX(300); 
		     	      		scaleLarger.setPivotY(135); 
		     	             
		     	            //Adding the scale transformation to
		     	            circle.getTransforms().addAll(scaleLarger); 
	     	      		    
	     	      		    
	     	      			});
			            Button SmarlerButton = new Button("Smaller");
			            SmarlerButton.setLayoutX(1370);
			            SmarlerButton.setLayoutY(730);
			            rootGroup.getChildren().add(SmarlerButton);
			            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
	     	      		    System.out.println("Smarler Object");
	     	      		    Scale scaleSmarler = new Scale(); 
	     	            
		     	            //Setting the dimensions for the transformation 
		     	      		 scaleSmarler.setX(0.5); 
		     	      		 scaleSmarler.setY(0.5); 
			     	            
			     	            //Setting the pivot point for the transformation 
		     	      		scaleSmarler.setPivotX(300); 
		     	      		scaleSmarler.setPivotY(135); 
		     	             
		     	            //Adding the scale transformation to
		     	            circle.getTransforms().addAll(scaleSmarler); 
	     	      		    
	     	      		    
	     	      			});
		                
		                
		        		
		        		 TextArea textArea = new TextArea();
		        		 textArea.setVisible(true);
		      
		        		 textArea.setVisible(true);
		       	      
		        		 textArea.setLayoutX(1100);
		        		 textArea.setLayoutY(200);
		        		 textArea.setMaxWidth(200);
		        		 textArea.setMaxHeight(300);
		        		 textArea.setMinSize(200, 300);
		        	
		        		
		     	        
		        		  String s0="Object_Attributs    ";
		        		  String id="Object ID is "+String.valueOf(circlObject.objId)+".  ";
		     		       String string1="Circle start at point (X,Y)"+"("+String.valueOf(circlObject.circleCenterX)+","+String.valueOf(circlObject.circleCenterY)+")"+"       ";
		     		       String string2="Circle Radius"+String.valueOf(circlObject.circleradius);
		     	        
		     	        textArea.setText(s0+id+string1+string2);
		     	        textArea.setWrapText(true);
		     
		     		     
		     	       rootGroup.getChildren().add(textArea);
		        		
		     		  final ColorPicker colorPicker = new ColorPicker();
		                colorPicker.setValue(Color.BLUE);
		                colorPicker.setLayoutX(1300);
		                colorPicker.setLayoutY(700);

		                circle.setFill(colorPicker.getValue());
		               
		                
		             
		                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
		                 
		                	circle.setFill(colorPicker.getValue());
		                });
		     		  
		                rootGroup.getChildren().add(colorPicker);
		               
	        		    Button VisibilityButton = new Button("Visibility Off"); 
	        		    VisibilityButton.setLayoutX(1300);
	        		    VisibilityButton.setLayoutY(660);
	        		    rootGroup.getChildren().add(VisibilityButton);
	    	     	      		
	    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
	    	     	      		    System.out.println("Delete Object");
	    	     	      		    circle.setVisible(false);
	    	     	      		    
	    	     	      		    
	    	     	      		});
	 	      		
					
					
					
					
					Button SaveStateButton = new Button("Save State"); 
 	    		    
 	    		  
 	    		    SaveStateButton.setLayoutX(1300);
 	    		    SaveStateButton.setLayoutY(800);
 		    		rootGroup.getChildren().add(SaveStateButton);
 	 	      		
 	 	      		SaveStateButton.setOnAction((ActionEvent d) -> {
 	 	      		    System.out.println("Save State");
 	 	      		    
 	 	      		    
 	 	      		     s1circleX=circle.getCenterX();
 	 	      		     s1circleY=circle.getCenterY();
 	 	      		    
 	 	      		    
	 	 	      //		 circle.setTranslateX(s1circleX);
	 	 	      	//	 circle.setTranslateY(s1circleY);
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		});
			        
			        
				}});
	        MenuItem menuItemPresentModelS2= new MenuItem("State2");
	        menuItemPresentModelS2.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
					   	
						//There should has a method to collect objects Id, X value and Y value.
						//There should has a method Calculate the offset of objects between state1 and state2
						//There should has a method to add objects to frameState1 and frameState2
						//There should has a method to add frameState1 and frameState2 to the list of framestate
						// There should be a method to add framestate1 and framestate2 to timeline
				        
	 	    		    
						myShapeCircle circlObject=new myShapeCircle();
		        		
			         	
				        
			        	
		        		
		        		
		        		
			        
						Circle circle = new Circle(s1circleX,s1circleY,circlObject.circleradius);
			        	
			        		circle.setCursor(Cursor.HAND);
			        		circle.setEffect(new Lighting());

			                circle.setOnMousePressed(circleOnMousePressedEventHandler);
			                circle.setOnMouseDragged(circleOnMouseDraggedEventHandler);
			        		
			                rootGroup.getChildren().add(circle);
			        		
			        		
			                
			                
			                Button LargerButton = new Button("Large");
				            LargerButton.setLayoutX(1300);
				            LargerButton.setLayoutY(730);
				            rootGroup.getChildren().add(LargerButton);
				            LargerButton.setOnAction((ActionEvent LineLarger) -> {
		     	      		    System.out.println("Larger Object");
		     	      		    Scale scaleLarger = new Scale(); 
		     	            
			     	            //Setting the dimensions for the transformation 
			     	      		scaleLarger.setX(1.5); 
			     	      		scaleLarger.setY(1.5); 
				     	            
				     	            //Setting the pivot point for the transformation 
			     	      		scaleLarger.setPivotX(300); 
			     	      		scaleLarger.setPivotY(135); 
			     	             
			     	            //Adding the scale transformation to
			     	            circle.getTransforms().addAll(scaleLarger); 
		     	      		    
		     	      		    
		     	      			});
				            Button SmarlerButton = new Button("Smaller");
				            SmarlerButton.setLayoutX(1370);
				            SmarlerButton.setLayoutY(730);
				            rootGroup.getChildren().add(SmarlerButton);
				            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
		     	      		    System.out.println("Smarler Object");
		     	      		    Scale scaleSmarler = new Scale(); 
		     	            
			     	            //Setting the dimensions for the transformation 
			     	      		 scaleSmarler.setX(0.5); 
			     	      		 scaleSmarler.setY(0.5); 
				     	            
				     	            //Setting the pivot point for the transformation 
			     	      		scaleSmarler.setPivotX(300); 
			     	      		scaleSmarler.setPivotY(135); 
			     	             
			     	            //Adding the scale transformation to
			     	            circle.getTransforms().addAll(scaleSmarler); 
		     	      		    
		     	      		    
		     	      			});
			                
			                
			        		
			        		 TextArea textArea = new TextArea();
			        		 textArea.setVisible(true);
			      
			        		 textArea.setVisible(true);
			       	      
			        		 textArea.setLayoutX(1100);
			        		 textArea.setLayoutY(200);
			        		 textArea.setMaxWidth(200);
			        		 textArea.setMaxHeight(300);
			        		 textArea.setMinSize(200, 300);
			        	
			        		
			     	        
			        		  String s0="Object_Attributs    ";
			        		  String id="Object ID is "+String.valueOf(circlObject.objId)+".  ";
			     		       String string1="Circle start at point (X,Y)"+"("+String.valueOf(circlObject.circleCenterX)+","+String.valueOf(circlObject.circleCenterY)+")"+"       ";
			     		       String string2="Circle Radius"+String.valueOf(circlObject.circleradius);
			     	        
			     	        textArea.setText(s0+id+string1+string2);
			     	        textArea.setWrapText(true);
			     
			     		     
			     	       rootGroup.getChildren().add(textArea);
			        		
			     		  final ColorPicker colorPicker = new ColorPicker();
			                colorPicker.setValue(Color.BLUE);
			                colorPicker.setLayoutX(1300);
			                colorPicker.setLayoutY(700);

			                circle.setFill(colorPicker.getValue());
			               
			                
			             
			                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
			                 
			                	circle.setFill(colorPicker.getValue());
			                });
			     		  
			                rootGroup.getChildren().add(colorPicker);
			               
		        		    Button VisibilityButton = new Button("Visibility Off"); 
		        		    VisibilityButton.setLayoutX(1300);
		        		    VisibilityButton.setLayoutY(660);
		        		    rootGroup.getChildren().add(VisibilityButton);
		    	     	      		
		    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
		    	     	      		    System.out.println("Delete Object");
		    	     	      		    circle.setVisible(false);
		    	     	      		    
		    	     	      		    
		    	     	      		});
		 	      		
						
						
						
						
						Button SaveStateButton = new Button("Save State"); 
	 	    		    
	 	    		  
	 	    		    SaveStateButton.setLayoutX(1300);
	 	    		    SaveStateButton.setLayoutY(800);
	 		    		rootGroup.getChildren().add(SaveStateButton);
	 	 	      		
	 	 	      		SaveStateButton.setOnAction((ActionEvent d) -> {
	 	 	      		    System.out.println("Save State");
	 	 	      		    
	 	 	      		    
	 	 	      		     s1circleX=circle.getCenterX();
	 	 	      		     s1circleY=circle.getCenterY();
	 	 	      		    
	 	 	      		    
		 	 	      		 circle.setTranslateX(s1circleX);
		 	 	      		 circle.setTranslateY(s1circleY);
	 	 	      		    
	 	 	      		    
	 	 	      		    
	 	 	      		    
	 	 	      		    
	 	 	      		    
	 	 	      		});
				        
				        
					}});
		
	        MenuItem menuItemPresentModelS3= new MenuItem("State3");
	        menuItemPresentModelS3.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				   	
					// There should has a list to store previous data of frameState1 and frameState2
					//There should has a method to collect objects Id, X value and Y value.
					//There should has a method Calculate the offset of objects between state2 and state3
					//There should has a method to add objects to frameState2 and frameState3
					//There should has a method to add frameState2 and frameState3 to timeline 
			        
 	    		    
					myShapeCircle circlObject=new myShapeCircle();
	        		
		         	
			        
		        	
	        		
	        		
	        		
		        
					Circle circle = new Circle(s1circleX,s1circleY,circlObject.circleradius);
		        	
		        		circle.setCursor(Cursor.HAND);
		        		circle.setEffect(new Lighting());

		                circle.setOnMousePressed(circleOnMousePressedEventHandler);
		                circle.setOnMouseDragged(circleOnMouseDraggedEventHandler);
		        		
		                rootGroup.getChildren().add(circle);
		        		
		        		
		                
		                
		                Button LargerButton = new Button("Large");
			            LargerButton.setLayoutX(1300);
			            LargerButton.setLayoutY(730);
			            rootGroup.getChildren().add(LargerButton);
			            LargerButton.setOnAction((ActionEvent LineLarger) -> {
	     	      		    System.out.println("Larger Object");
	     	      		    Scale scaleLarger = new Scale(); 
	     	            
		     	            //Setting the dimensions for the transformation 
		     	      		scaleLarger.setX(1.5); 
		     	      		scaleLarger.setY(1.5); 
			     	            
			     	            //Setting the pivot point for the transformation 
		     	      		scaleLarger.setPivotX(300); 
		     	      		scaleLarger.setPivotY(135); 
		     	             
		     	            //Adding the scale transformation to
		     	            circle.getTransforms().addAll(scaleLarger); 
	     	      		    
	     	      		    
	     	      			});
			            Button SmarlerButton = new Button("Smaller");
			            SmarlerButton.setLayoutX(1370);
			            SmarlerButton.setLayoutY(730);
			            rootGroup.getChildren().add(SmarlerButton);
			            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
	     	      		    System.out.println("Smarler Object");
	     	      		    Scale scaleSmarler = new Scale(); 
	     	            
		     	            //Setting the dimensions for the transformation 
		     	      		 scaleSmarler.setX(0.5); 
		     	      		 scaleSmarler.setY(0.5); 
			     	            
			     	            //Setting the pivot point for the transformation 
		     	      		scaleSmarler.setPivotX(300); 
		     	      		scaleSmarler.setPivotY(135); 
		     	             
		     	            //Adding the scale transformation to
		     	            circle.getTransforms().addAll(scaleSmarler); 
	     	      		    
	     	      		    
	     	      			});
		                
		                
		        		
		        		 TextArea textArea = new TextArea();
		        		 textArea.setVisible(true);
		      
		        		 textArea.setVisible(true);
		       	      
		        		 textArea.setLayoutX(1100);
		        		 textArea.setLayoutY(200);
		        		 textArea.setMaxWidth(200);
		        		 textArea.setMaxHeight(300);
		        		 textArea.setMinSize(200, 300);
		        	
		        		
		     	        
		        		  String s0="Object_Attributs    ";
		        		  String id="Object ID is "+String.valueOf(circlObject.objId)+".  ";
		     		       String string1="Circle start at point (X,Y)"+"("+String.valueOf(circlObject.circleCenterX)+","+String.valueOf(circlObject.circleCenterY)+")"+"       ";
		     		       String string2="Circle Radius"+String.valueOf(circlObject.circleradius);
		     	        
		     	        textArea.setText(s0+id+string1+string2);
		     	        textArea.setWrapText(true);
		     
		     		     
		     	       rootGroup.getChildren().add(textArea);
		        		
		     		  final ColorPicker colorPicker = new ColorPicker();
		                colorPicker.setValue(Color.BLUE);
		                colorPicker.setLayoutX(1300);
		                colorPicker.setLayoutY(700);

		                circle.setFill(colorPicker.getValue());
		               
		                
		             
		                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
		                 
		                	circle.setFill(colorPicker.getValue());
		                });
		     		  
		                rootGroup.getChildren().add(colorPicker);
		               
	        		    Button VisibilityButton = new Button("Visibility Off"); 
	        		    VisibilityButton.setLayoutX(1300);
	        		    VisibilityButton.setLayoutY(660);
	        		    rootGroup.getChildren().add(VisibilityButton);
	    	     	      		
	    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
	    	     	      		    System.out.println("Delete Object");
	    	     	      		    circle.setVisible(false);
	    	     	      		    
	    	     	      		    
	    	     	      		});
	 	      		
					
					
					
					
					Button SaveStateButton = new Button("Save State"); 
 	    		    
 	    		  
 	    		    SaveStateButton.setLayoutX(1300);
 	    		    SaveStateButton.setLayoutY(800);
 		    		rootGroup.getChildren().add(SaveStateButton);
 	 	      		
 	 	      		SaveStateButton.setOnAction((ActionEvent d) -> {
 	 	      		    System.out.println("Save State");
 	 	      		    
 	 	      		    
 	 	      		     s1circleX=circle.getCenterX();
 	 	      		     s1circleY=circle.getCenterY();
 	 	      		    
 	 	      		    
	 	 	      		 circle.setTranslateX(s1circleX);
	 	 	      		 circle.setTranslateY(s1circleY);
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		});
			        
			        
				}});
	
	        
	        
	        MenuItem menuItemPresentPlay= new MenuItem("Play");
	        menuItemPresentPlay.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				   	
					//There should be a method to add frameState to timeline
					// There should be a method to play() timeline
			        
 	    		    
					myShapeCircle circlObject=new myShapeCircle();
	        		
		         	
			        
		        	
	        		
	        		
	        		
		        
					Circle circle = new Circle(s1circleX,s1circleY,circlObject.circleradius);
		        	
		        		circle.setCursor(Cursor.HAND);
		        		circle.setEffect(new Lighting());

		                circle.setOnMousePressed(circleOnMousePressedEventHandler);
		                circle.setOnMouseDragged(circleOnMouseDraggedEventHandler);
		                
		    		    myShapeRect rectObject  = new myShapeRect();

	   					Rectangle rect=new Rectangle();
	   					
	   					rect.setX(rectObject.rectX);
	   					rect.setY(rectObject.rectY);
	   					rect.setWidth(rectObject.rectWidth);
	   					rect.setHeight(rectObject.rectHeight);
	   					rect.setArcWidth(rectObject.rectArcWidth);
	   					rect.setArcHeight(rectObject.rectArcHeight);
	   					
	   					rect.setEffect(new Lighting());
		    			
		    			KeyValue xValue  = new KeyValue(rect.xProperty(), 400); 
		    			KeyValue yValue  = new KeyValue(rect.yProperty(), 200);
		    			
		    			KeyValue xValue2  = new KeyValue(rect.xProperty(), 400); 
		    			KeyValue yValue2  = new KeyValue(rect.yProperty(), 500);
		    			
		    			KeyValue xValue3  = new KeyValue(rect.xProperty(), 600); 
		    			KeyValue yValue3  = new KeyValue(rect.yProperty(), 500);
		    			
		    			KeyFrame state1  = new KeyFrame(Duration.millis(1000), xValue, yValue);
		    			KeyFrame state2  = new KeyFrame(Duration.millis(2000), xValue2, yValue2);
		    			KeyFrame state3  = new KeyFrame(Duration.millis(3000), xValue3, yValue3);
		    			
		    		
		    			
		    			rootGroup.getChildren().addAll(rect);
		    		  
		    			Timeline timeline = new Timeline();
		    			timeline.getKeyFrames().addAll(state1,state2,state3);
		    			timeline.setCycleCount(Timeline.INDEFINITE); 
		    		
		    		//	timeline.setAutoReverse(true);
		    	        timeline.play();
		        		
		                rootGroup.getChildren().add(circle);
		        		
		        		
		                
		                
		                Button LargerButton = new Button("Large");
			            LargerButton.setLayoutX(1300);
			            LargerButton.setLayoutY(730);
			            rootGroup.getChildren().add(LargerButton);
			            LargerButton.setOnAction((ActionEvent LineLarger) -> {
	     	      		    System.out.println("Larger Object");
	     	      		    Scale scaleLarger = new Scale(); 
	     	            
		     	            //Setting the dimensions for the transformation 
		     	      		scaleLarger.setX(1.5); 
		     	      		scaleLarger.setY(1.5); 
			     	            
			     	            //Setting the pivot point for the transformation 
		     	      		scaleLarger.setPivotX(300); 
		     	      		scaleLarger.setPivotY(135); 
		     	             
		     	            //Adding the scale transformation to
		     	            circle.getTransforms().addAll(scaleLarger); 
	     	      		    
	     	      		    
	     	      			});
			            Button SmarlerButton = new Button("Smaller");
			            SmarlerButton.setLayoutX(1370);
			            SmarlerButton.setLayoutY(730);
			            rootGroup.getChildren().add(SmarlerButton);
			            SmarlerButton.setOnAction((ActionEvent LineSmarler) -> {
	     	      		    System.out.println("Smarler Object");
	     	      		    Scale scaleSmarler = new Scale(); 
	     	            
		     	            //Setting the dimensions for the transformation 
		     	      		 scaleSmarler.setX(0.5); 
		     	      		 scaleSmarler.setY(0.5); 
			     	            
			     	            //Setting the pivot point for the transformation 
		     	      		scaleSmarler.setPivotX(300); 
		     	      		scaleSmarler.setPivotY(135); 
		     	             
		     	            //Adding the scale transformation to
		     	            circle.getTransforms().addAll(scaleSmarler); 
	     	      		    
	     	      		    
	     	      			});
		                
		                
		        		
		        		 TextArea textArea = new TextArea();
		        		 textArea.setVisible(true);
		      
		        		 textArea.setVisible(true);
		       	      
		        		 textArea.setLayoutX(1100);
		        		 textArea.setLayoutY(200);
		        		 textArea.setMaxWidth(200);
		        		 textArea.setMaxHeight(300);
		        		 textArea.setMinSize(200, 300);
		        	
		        		
		     	        
			        		  String s0="Object_Attributs    ";
			        		  String id="Object ID is "+String.valueOf(circlObject.objId)+".  ";
			     		      String string1="Circle start at point (X,Y)"+"("+String.valueOf(circlObject.circleCenterX)+","+String.valueOf(circlObject.circleCenterY)+")"+"       ";
			     		      String string2="Circle Radius"+String.valueOf(circlObject.circleradius);
		     	        
		     	        textArea.setText(s0+id+string1+string2);
		     	        textArea.setWrapText(true);
		     
		     		     
		     	       rootGroup.getChildren().add(textArea);
		        		
		     		  final ColorPicker colorPicker = new ColorPicker();
		                colorPicker.setValue(Color.BLUE);
		                colorPicker.setLayoutX(1300);
		                colorPicker.setLayoutY(700);

		                circle.setFill(colorPicker.getValue());
		               
		                
		             
		                colorPicker.setOnAction((ActionEvent eventColorPicker) -> {
		                 
		                	circle.setFill(colorPicker.getValue());
		                });
		     		  
		                rootGroup.getChildren().add(colorPicker);
		               
	        		    Button VisibilityButton = new Button("Visibility Off"); 
	        		    VisibilityButton.setLayoutX(1300);
	        		    VisibilityButton.setLayoutY(660);
	        		    rootGroup.getChildren().add(VisibilityButton);
	    	     	      		
	    	     	      		VisibilityButton.setOnAction((ActionEvent dLine) -> {
	    	     	      		    System.out.println("Delete Object");
	    	     	      		    circle.setVisible(false);
	    	     	      		    
	    	     	      		    
	    	     	      		});
	 	      		
					
					
					
					
					Button SaveStateButton = new Button("Save State"); 
 	    		    
 	    		  
 	    		    SaveStateButton.setLayoutX(1300);
 	    		    SaveStateButton.setLayoutY(800);
 		    		rootGroup.getChildren().add(SaveStateButton);
 	 	      		
 	 	      		SaveStateButton.setOnAction((ActionEvent d) -> {
 	 	      		    System.out.println("Save State");
 	 	      		    
 	 	      		    
 	 	      		     s1circleX=circle.getCenterX();
 	 	      		     s1circleY=circle.getCenterY();
 	 	      		    
 	 	      		    
	 	 	      		 circle.setTranslateX(s1circleX);
	 	 	      		 circle.setTranslateY(s1circleY);
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		    
 	 	      		});
			        
			        
				}});
	
	        
	        
	        // add menu items to menu 
	        //MenuFile
	        menuFile.getItems().add(menuItemSave); 
	        menuFile.getItems().add(menuItemLoad); 
	        
	        //menuAddObjects
	        menuAddObject.getItems().add(menuItemAddLine); 
	        menuAddObject.getItems().add(menuItemAddCircle);
	        menuAddObject.getItems().add(menuItemAddArc);
	        menuAddObject.getItems().add(menuItemAddOvail);
	        menuAddObject.getItems().add(menuItemAddPath);
	        menuAddObject.getItems().add(menuItemAddPolygon);
	        menuAddObject.getItems().add(menuItemAddRect);
	        menuAddObject.getItems().add(menuItemAddText);
	        menuAddObject.getItems().add(menuItemAddImage); 
	       
	        
	      
	        
	        menuState.getItems().addAll(menuState1,menuState2);
		       
	     
	        
	        //menuPresent
	        menuPresent.getItems().add(menuItemPresentModelS1);
	        menuPresent.getItems().add(menuItemPresentModelS2);
	        menuPresent.getItems().add(menuItemPresentModelS3);
	        menuPresent.getItems().add(menuItemPresentPlay);
	        
	        
	      //menuSetting
	        menuSetting.getItems().add(menuItemPlayMusic);
	        
	        
	        //menuHelp
	        menuHelp.getItems().add(menuItemContact);
	        // create a menubar 
	        MenuBar menubar = new MenuBar(); 
	  
	        // add menu to menubar 
	        menubar.getMenus().add(menuFile);
	        menubar.getMenus().add(menuAddObject);
	        menubar.getMenus().add(menuState);
	        menubar.getMenus().add(menuPresent);
	        menubar.getMenus().add(menuSetting);
	        menubar.getMenus().add(menuHelp);
	        menubar.getMenus().add(Camera);
	 
	       

	     
	          
	          
	          // add things to rootPane
	          
	   
	        rootGroup.getChildren().add(menubar);
	        
	        
	        
	        
	       
            
	  
	        // create a scene 
	        Scene scene = new Scene(rootGroup, 1280, 900); 
	        
	      
	  
	        // set the scene 
	        stage1.setScene(scene); 
	  
	        stage1.show(); 

	
	}


	
	


	public static void main(String[] args) {
		launch(args);
	}
	//Mouse Click
	EventHandler<KeyEvent> lineOnKeyPressedEventHandler =
            new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent deletEvent) {
            	 
                     System.out.println("click");
               
            }
        };
	
	
	//Mouse press
	
    EventHandler<MouseEvent> circleOnMousePressedEventHandler = 
            new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                MouseSceneX = t.getSceneX();
                MouseSceneY = t.getSceneY();
                MouseTranslateX = ((Circle)(t.getSource())).getTranslateX();
                MouseTranslateY = ((Circle)(t.getSource())).getTranslateY();
            }
        };
        EventHandler<MouseEvent> lineOnMousePressedEventHandler = 
                new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent t) {
                	MouseSceneX = t.getSceneX();
                	MouseSceneY = t.getSceneY();
                	MouseTranslateX = ((Line)(t.getSource())).getTranslateX();
                	MouseTranslateY = ((Line)(t.getSource())).getTranslateY();
                    
                }
            };
            
            //Click
           EventHandler<MouseEvent> lineOnMouseClickEventHandler = 
                    new EventHandler<MouseEvent>() {
                   
                    @Override
                   public void handle(MouseEvent t) {
                        
                    	System.out.println("Click");
                    	 
  		                
                    }
               };
           EventHandler<MouseEvent> arcOnMousePressedEventHandler = 
                    new EventHandler<MouseEvent>() {

                    @Override
                    public void handle(MouseEvent t) {
                    	MouseSceneX = t.getSceneX();
                    	MouseSceneY = t.getSceneY();
                    	MouseTranslateX = ((Arc)(t.getSource())).getTranslateX();
                    	MouseTranslateY = ((Arc)(t.getSource())).getTranslateY();
                    }
                };
                EventHandler<MouseEvent> ovailOnMousePressedEventHandler = 
                        new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent t) {
                        	MouseSceneX = t.getSceneX();
                        	MouseSceneY = t.getSceneY();
                        	MouseTranslateX = ((Ellipse)(t.getSource())).getTranslateX();
                        	MouseTranslateY = ((Ellipse)(t.getSource())).getTranslateY();
                        }
                    };
                    EventHandler<MouseEvent> polygonOnMousePressedEventHandler = 
                            new EventHandler<MouseEvent>() {

                            @Override
                            public void handle(MouseEvent t) {
                            	MouseSceneX = t.getSceneX();
                            	MouseSceneY = t.getSceneY();
                            	MouseTranslateX = ((Polygon)(t.getSource())).getTranslateX();
                            	MouseTranslateY = ((Polygon)(t.getSource())).getTranslateY();
                            }
                        };
                        EventHandler<MouseEvent> rectOnMousePressedEventHandler = 
                                new EventHandler<MouseEvent>() {

                                @Override
                                public void handle(MouseEvent t) {
                                	MouseSceneX = t.getSceneX();
                                	MouseSceneY = t.getSceneY();
                                	MouseTranslateX = ((Rectangle)(t.getSource())).getTranslateX();
                                	MouseTranslateY = ((Rectangle)(t.getSource())).getTranslateY();
                                }
                            };
                    EventHandler<MouseEvent> imageOnMousePressedEventHandler = 
                            new EventHandler<MouseEvent>() {

                            @Override
                            public void handle(MouseEvent t) {
                            	MouseSceneX = t.getSceneX();
                            	MouseSceneY = t.getSceneY();
                            	MouseTranslateX = ((ImageView)(t.getSource())).getTranslateX();
                            	MouseTranslateY = ((ImageView)(t.getSource())).getTranslateY();
                            }
                        };
        // Mouse drag
        EventHandler<MouseEvent> circleOnMouseDraggedEventHandler = 
            new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                double offsetX = t.getSceneX() - MouseSceneX;
                double offsetY = t.getSceneY() - MouseSceneY;
                double newTranslateX = MouseTranslateX + offsetX;
                double newTranslateY = MouseTranslateY + offsetY;
                
                ((Circle)(t.getSource())).setTranslateX(newTranslateX);
                ((Circle)(t.getSource())).setTranslateY(newTranslateY);
            }
        };
        EventHandler<MouseEvent> lineOnMouseDraggedEventHandler = 
                new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent t) {
                    double offsetX = t.getSceneX() - MouseSceneX;
                    double offsetY = t.getSceneY() - MouseSceneY;
                    double newTranslateX = MouseTranslateX + offsetX;
                    double newTranslateY = MouseTranslateY + offsetY;
                    
                    ((Line)(t.getSource())).setTranslateX(newTranslateX);
                    ((Line)(t.getSource())).setTranslateY(newTranslateY);
                }
            };
            EventHandler<MouseEvent> arcOnMouseDraggedEventHandler =
                    new EventHandler<MouseEvent>() {

                    @Override
                    public void handle(MouseEvent t) {
                        double offsetX = t.getSceneX() - MouseSceneX;
                        double offsetY = t.getSceneY() - MouseSceneY;
                        double newTranslateX = MouseTranslateX + offsetX;
                        double newTranslateY = MouseTranslateY + offsetY;
                        
                        ((Arc)(t.getSource())).setTranslateX(newTranslateX);
                        ((Arc)(t.getSource())).setTranslateY(newTranslateY);
                    }
                };
                EventHandler<MouseEvent> ovailOnMouseDraggedEventHandler =
                        new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent t) {
                            double offsetX = t.getSceneX() - MouseSceneX;
                            double offsetY = t.getSceneY() - MouseSceneY;
                            double newTranslateX = MouseTranslateX + offsetX;
                            double newTranslateY = MouseTranslateY + offsetY;
                            
                            ((Ellipse)(t.getSource())).setTranslateX(newTranslateX);
                            ((Ellipse)(t.getSource())).setTranslateY(newTranslateY);
                        }
                    };
                    EventHandler<MouseEvent> polygonOnMouseDraggedEventHandler =
                            new EventHandler<MouseEvent>() {

                            @Override
                            public void handle(MouseEvent t) {
                                double offsetX = t.getSceneX() - MouseSceneX;
                                double offsetY = t.getSceneY() - MouseSceneY;
                                double newTranslateX = MouseTranslateX + offsetX;
                                double newTranslateY = MouseTranslateY + offsetY;
                                
                                ((Polygon)(t.getSource())).setTranslateX(newTranslateX);
                                ((Polygon)(t.getSource())).setTranslateY(newTranslateY);
                            }
                        };
                        EventHandler<MouseEvent> rectOnMouseDraggedEventHandler =
                                new EventHandler<MouseEvent>() {

                                @Override
                                public void handle(MouseEvent t) {
                                    double offsetX = t.getSceneX() - MouseSceneX;
                                    double offsetY = t.getSceneY() - MouseSceneY;
                                    double newTranslateX = MouseTranslateX + offsetX;
                                    double newTranslateY = MouseTranslateY + offsetY;
                                    
                                    ((Rectangle)(t.getSource())).setTranslateX(newTranslateX);
                                    ((Rectangle)(t.getSource())).setTranslateY(newTranslateY);
                                }
                            };
                    EventHandler<MouseEvent> imageOnMouseDraggedEventHandler =
                            new EventHandler<MouseEvent>() {

                            @Override
                            public void handle(MouseEvent t) {
                                double offsetX = t.getSceneX() - MouseSceneX;
                                double offsetY = t.getSceneY() - MouseSceneY;
                                double newTranslateX = MouseTranslateX + offsetX;
                                double newTranslateY = MouseTranslateY + offsetY;
                                
                                ((ImageView)(t.getSource())).setTranslateX(newTranslateX);
                                ((ImageView)(t.getSource())).setTranslateY(newTranslateY);
                            }
                        };
}

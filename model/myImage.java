
/**
 * @class name: myImage
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

package model;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class myImage {
	private static int count=0;
	public int objId=0;
	//image
	 
	 //Loading picture from JPG to String 
	 public String fileV = new File("meVertex.jpg").toURI().toString();// This is the Vertex picture of 3D of mine which uses a lot of vertexs
	 public String fileS= new File("meShader.jpg").toURI().toString();// With the function of shader, the surface of vertex will be smooth
	 public String fileT = new File("meTexture.jpg").toURI().toString();// Texture is the last step, and after that the 3D model is ready.

	 //Show image picture
	 public Image image = new Image(fileS);
	 public Image imageV = new Image(fileV);
	 public Image imageT = new Image(fileT);
	 
	 
	 
	 // generat a new ImageView
	 public ImageView imageView = new ImageView();
	 
	 
	 
	 
	 public final double w = image.getWidth();
	 public final double h = image.getHeight();
	 public final double max = Math.max(w, h);
	 public final int width = (int) (300 * w / max);
	 public final int heigth = (int) (300 * h / max);
	 
	 
	 public static int getCount(){
	     return count;
	 }
	 public myImage(){
		 objId=++count;
		 
		 System.out.println("Image is created!");
		 System.out.println("Image Id is "+objId);

		 
	 }
	 
}

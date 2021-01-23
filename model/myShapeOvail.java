/**
 * @class name: myShapeOvail
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

public class myShapeOvail {
	private static int count=400;
	public int objId=0;
	public float ovailCenterX=300.0f; 
	public float ovailCenterY=150.0f; 
	public float ovailRadiusX=150.0f; 
	public float ovailRadiusY=75.0f; 
	
	public static int getCount(){
	     return count;
	 }
	 public myShapeOvail(){
		 objId=++count;
		 
		 System.out.println("Ovail is created!");
		 System.out.println("Ovail Id is "+objId);

		 
	 }
}

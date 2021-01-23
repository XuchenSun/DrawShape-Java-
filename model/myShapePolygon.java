/**
 * @class name: myShapePolygon
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

public class myShapePolygon {
	private static int count=600;
	public int objId=0;
	
	
	public double polygonX1=200.0;
	public double polygonY1=50.0; 
	public double polygonX2=400.0;
	public double polygonY2=50.0;
	public double polygonX3=450.0;
	public double polygonY3=150.0;
	public double polygonX4=400.0;
	public double polygonY4=250.0;
	public double polygonX5=200.0;
	public double polygonY5=250.0;
	public double polygonX6=150.0;
	public double polygonY6=150.0;
	 public static int getCount(){
	     return count;
	 }
	public myShapePolygon(){
		 objId=++count;
		 
		 System.out.println("Polygon  is created!");
		 System.out.println("Polygon Id is "+objId);

		 
	}
}

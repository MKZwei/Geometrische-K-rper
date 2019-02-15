/**
* Abstrakte Basisklasse Urform
*/

public abstract class Urform {
	protected double a;
	
	/**
	* Eine geometrisches Objekt wird angelegt.
	*
	* @param a Laenge a vom Objekt
	*/
	public Urform(double a) {
		this.a = a;
	}
	/**
	* Bestimmung des Umfangs
	*
	* @return double Wert vom Umfang
	*/
	public abstract double umfang();
	
	/**
	* Bestimmung der Flaeche
	*
	* @return double Wertder Flaeche
	*/
	public abstract double flaeche();
}

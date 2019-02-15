/**
* Abstrakte Unterklasse Quadrat
*/
public class Quadrat extends Urform {
	/**
	* Zugriff auf die Laenge a
	* @return double Rueckgabe von a
	*/
	public double getA() {
		return this.a;
	}
	
	/**
	* Erzeugt das Quadrat Objekt.
	*
	* @param a Seitenlaenge a
	*/
	public Quadrat(double a) {
		super(a);
	}
	
	/**
	* Bestimmung des Quadrat Umfangs
	*
	* @return double Wert vom Umfang
	*/
	public double umfang() {
		double umfang = 4 * this.a;
		return umfang;
	}
	
	/**
	* Bestimmung der Flaeche im Quadrat
	*
	* @return double Wert der Flaeche
	*/
	public double flaeche() {
		double flaeche = Math.pow(this.a, 2);
		return flaeche;
	}
	
	/**
	* Vergleich von zwei Quadrat Objekten.
	*
	* @override
	* @param o das zu vergleichende Quadrat Objekt
	* @return boolean true, wenn Objekte gleich sind
	*/
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if(!(o instanceof Quadrat))
			return false;
		if (this.a == ((Quadrat)o).a)
			return true;
		else
			return false;
	}
	
	/**
	* @override
	*/
	public String toString() {
		return "Quadrat: a = " + this.a + "\n";
	}
}


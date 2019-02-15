/**
* Abstrakte Unterklasse Kreis
*/
public class Kreis extends Urform {
	/**
	* Zugriff auf den Radius a
	* @return double Rueckgabe von a
	*/
	public double getA() {
		return this.a;
	}
	
	/**
	* Erzeugt das Kreis Objekt.
	*
	* @param a Radius a
	*/
	public Kreis(double a) {
		super(a);
	}
	
	/**
	* Bestimmung des Kreis Umfangs
	*
	* @return double Wert vom Umfang
	*/
	public double umfang() {
		double umfang = 2 * Math.PI * this.a;
		return umfang;
	}
	
	/**
	* Bestimmung der Kreis Flaeche
	*
	* @return double Wert der Flaeche
	*/
	public double flaeche() {
		double flaeche = Math.PI * Math.pow(this.a, 2);
		return flaeche;
	}
	
	/**
	* Vergleich von zwei Kreis Objekten.
	*
	* @override
	* @param o das zu vergleichende Kreis Objekt
	* @return boolean true, wenn Objekte gleich sind
	*/
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if(!(o instanceof Kreis))
			return false;
		if (this.a == ((Kreis)o).a)
			return true;
		else
			return false;
	}
	
	/**
	* @override
	*/
	public String toString() {
		return "Kreis: Radius = " + this.a + "\n";
	}
	
}

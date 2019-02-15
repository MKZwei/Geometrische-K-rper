/**
* Abstrakte Unterklasse Rechteck
*/
public class Rechteck extends Urform {
	private double b;
	
	/**
	* Zugriff auf die Laenge a
	* @return double Rueckgabe von a
	*/
	public double getA() {
		return this.a;
	}
	
	/**
	* Zugriff auf die Laenge b
	* @return double Rueckgabe von b
	*/
	public double getB() {
		return this.b;
	}
	
	/**
	* Erzeugt das Rechteck Objekt.
	*
	* @param a Seitenlaenge a
	*@param b Seitenlaenge b
	*/
	public Rechteck(double a, double b) {
		super(a);
		this.b = b;
	}
	
	
	/**
	* Bestimmung des Rechteck Umfangs
	*
	* @return double Wert vom Umfang
	*/
	public double umfang() {
		double umfang = 2 * (this.a + this.b);
		return umfang;
	}
	
	/**
	* Bestimmung der Flaeche im Rechteck
	*
	* @return double Wert der Flaeche
	*/
	public double flaeche() {
		double flaeche = this.a * this.b;
		return flaeche;
	}
	
	/**
	* Vergleich vonja zwei Rechteck Objekten.
	*
	* @override
	* @param o das zu vergleichende Rechteck Objekt
	* @return boolean true, wenn Objekte gleich sind
	*/
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if(!(o instanceof Rechteck))
			return false;
		if (this.a == ((Rechteck)o).a && this.b == ((Rechteck)o).b)
			return true;
		else
			return false;
	}
	
	/**
	* @override
	*/
	public String toString() {
		return "Rechteck: a = " + this.a + ", b = " + this.b;
	}
}

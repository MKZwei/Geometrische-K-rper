/**
* Abstrakte Unterklasse Dreieck
*/
public class Dreieck extends Urform {
	private double b;
	private double c;
	
	/**
	* Zugriff auf das Attribut a
	* @return double Rueckgabe von a
	*/
	public double getA() {
		return this.a;
	}
	
	/**
	* Zugriff auf das Attribut b
	* @return double Rueckgabe von b
	*/
	public double getB() {
		return this.b;
	}
	
	/**
	* Zugriff auf das Attribut b
	* @return double Rueckgabe von b
	*/
	public double getC() {
		return this.c;
	}
	
	/**
	* Erzeugt das Dreieck Objekt.
	*
	* @param a Seitenlaenge a
	* @param b Seitenlaenge b
	* @param c Seitenlaenge c
	*/
	public Dreieck(double a, double b, double c) {
		super(a);
		this.b = b;
		this.c = c;
	}
	
	/**
	* Bestimmung des Dreieck Umfangs
	*
	* @return double Wert vom Umfang
	*/
	public double umfang() {
		double umfang = this.a + this.b + this.c;
		return umfang;
	}
	
	/**
	* Bestimmung der Flaeche im Dreieck
	*
	* @return double Wert der Flaeche
	*/
	public double flaeche() {
		double s = (this.a + this.b + this.c) / 2;
		double flaeche =  Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return flaeche;
	}
	
	/**
	* Vergleich vonja zwei Dreieck Objekten.
	*
	* @override
	* @param o das zu vergleichende Dreieck Objekt
	* @return boolean true, wenn Objekte gleich sind
	*/
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if(!(o instanceof Dreieck))
			return false;
		if (this.a == ((Dreieck)o).a && this.b == ((Dreieck)o).b && this.c == ((Dreieck)o).c)
			return true;
		else
			return false;
	}
	
	/**
	* @override
	*/
	public String toString() {
		return "Dreieck: a = " + this.a + ", b = " + this.b + ", c = " + this.c;
	}
}

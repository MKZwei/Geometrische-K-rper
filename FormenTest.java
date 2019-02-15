import java.io.Console;

/**
* Hauptklasse FormenTest
*/
public class FormenTest {
	/**
	* Ein geometrisches Objekt wird erzeugt.
	*
	* @param s String Array mit den zu erzeugenden Objekt
	* @return Urform Ausgabe des Objekts
	*/
	public static Urform erzeuge(String[] s) {
		Urform objekt = null;
		
			// Fall Quadrat
			if (s[0].equals("Quadrat")) {
				if (s[1] == s[s.length-1]) {
					objekt = new Quadrat(Double.parseDouble(s[1]));
				}
				else {
					objekt = null;
				}
			}
			// Fall Rechteck
			if (s[0].equals("Rechteck")) {
				if (s.length == 3) {
					objekt = new Rechteck(Double.parseDouble(s[1]), Double.parseDouble(s[2]));
				}
				else {
					objekt = null;
				}
			}
			// Fall Dreieck
			if (s[0].equals("Dreieck")) {
				if (s.length == 4) {
					objekt = new Dreieck(Double.parseDouble(s[1]), Double.parseDouble(s[2]), Double.parseDouble(s[3]));
				}
				else {
					objekt = null;
				}
			}
			// Fall Kreis
			if (s[0].equals("Kreis")) {
				if (s[1] == s[s.length-1]) {
					objekt = new Kreis(Double.parseDouble(s[1]));
				}
				else {
					objekt = null;
				}
			}
		return objekt; 
	}
	/**
	* Objekte werden erzeugt.
	* Flaeche und Umfang des Objekts wird berechnet
	* Objekte werden untereinander auf Gleichheit getestet
	*
	*@throws NumberFormatException wird geworfen, wenn keine Zahlen 
	* im auswahlmenue eingegeben werden
	*/
	public static void main(String[] args) {
			Console cons = System.console();
			System.out.println("\n");
			
			try {
				cons.printf("Wieviele Objekte möchten sie erzeugen? \n");
				String input = cons.readLine("Anzahl Objekte: ");
				int numbOfObjects = Integer.parseInt(input);
				
				int i;
				Urform[] form = new Urform[numbOfObjects];
				for (i = 0; i < form.length; i++) { // Anzahl der Objekte
					form[i] = null;
				
				
					int counter = 0;
					while (counter < 1) { // Waehle Objekt, Berechne Flaeche und Umfang
						cons.printf("Folgende Optionen: [1]Quadrat [2]Rechteck [3]Dreieck [4]Kreis \n");
						String input1 = cons.readLine("Option: ");
						int option = Integer.parseInt(input1);
					
						switch (option) {
							case 1: cons.printf("Einen Wert für die Seitenlänge eintragen. \n");
								String input2 = cons.readLine("Seitenlänge: ");
								String[] quadrat = {"Quadrat", input2};
							
								form[i] = erzeuge(quadrat);
								if (form[i] != null) {
									System.out.println(form[i]);
								}
								else {
									cons.printf("Nur einen Wert eingeben!");
								}
							
								cons.printf("Drücken sie die RETURN-Taste um Fläche und Umfang vom Quadrat zu ermitteln");
								String hit = cons.readLine();
								cons.printf("Fläche: %.2f, Umfang: %.2f %n", erzeuge(quadrat).flaeche(), erzeuge(quadrat).umfang());
								break;
							case 2: cons.printf("Zwei Werte für die Seitenlänge eintragen. \n");
								String input3 = cons.readLine("Seitenlänge a: ");
								String input4 = cons.readLine("Seitenlänge b: ");
								String[] rechteck = {"Rechteck", input3, input4};
								
								form[i] = erzeuge(rechteck);
								if (form[i] != null) {
									System.out.println(form[i]);
								}
								else {
									cons.printf("Nur zwei Werte eingeben!");
								}
							
								cons.printf("Drücken sie die RETURN-Taste um Fläche und Umfang vom Rechteck zu ermitteln");
								String hit1 = cons.readLine();
								cons.printf("Fläche: %.2f, Umfang: %.2f %n", erzeuge(rechteck).flaeche(), erzeuge(rechteck).umfang());
								break;
							case 3: cons.printf(" Drei Werte für die Seitenlänge eintragen. \n");
								String input5 = cons.readLine("Seitenlänge a: ");
								String input6 = cons.readLine("Seitenlänge b: ");
								String input7 = cons.readLine("Seitenlänge c: ");
								String[] dreieck = {"Dreieck", input5, input6, input7};
								
								form[i] = erzeuge(dreieck);
								if (form[i] != null) {
									System.out.println(form[i]);
								}
								else {
									cons.printf("Nur drei Werte eingeben!");
								}
							
								cons.printf("Drücken sie die RETURN-Taste um Fläche und Umfang vom Dreieck zu ermitteln");
								String hit2 = cons.readLine();
								cons.printf("Fläche: %.2f, Umfang: %.2f %n", erzeuge(dreieck).flaeche(), erzeuge(dreieck).umfang());
								break;
							case 4: cons.printf("Einen Wert für den Radius eintragen. \n");
								String input8 = cons.readLine("Radius: ");
								String[] kreis = {"Kreis", input8};
								
								form[i] = erzeuge(kreis);
								if (form[i] != null) {
									System.out.println(form[i]);
								}
								else {
									cons.printf("Nur einen Wert eingeben!");
								}
							
								cons.printf("Drücken sie die RETURN-Taste um Fläche und Umfang vom Kreis zu ermitteln");
								String hit3 = cons.readLine();
								cons.printf("Fläche: %.2f, Umfang: %.2f %n", erzeuge(kreis).flaeche(), erzeuge(kreis).umfang());
								break;
						}
						System.out.println("Objekt " + (i+1) + ": " + form[i]);
						counter++;
					}
				}
				cons.printf("\n\n");
				// Anzahl der Vergleiche
				cons.printf("Übertprüfe die Gleichheit der Objekte\n\n");
				cons.printf("Wieviele Vergleiche möchten Sie durchführen? \n");
				String eingabe = cons.readLine("Anzahl der Vergleiche: ");
				int vergleiche = Integer.parseInt(eingabe);
				// Auswahl der zu vergleichenden Objekte
				for (int j = 0; j < vergleiche; j++) {
					cons.printf("Wählen sie die Objekte, die miteinander verglichen werden sollen. \n");
					String eingabe1 = cons.readLine("Erstes Objekt: ");
					int objekt1 = Integer.parseInt(eingabe1);
					String eingabe2 = cons.readLine("Zweites Objekt: ");
					int objekt2 = Integer.parseInt(eingabe2);
				
					if (form[objekt1-1].equals(form[objekt2-1]) == true) { // Vergleiche Objekte
						System.out.println("Gleiche Objekte");
					}
					else {
						System.out.println("Verschiedene Objekte");
					}
				}
			}
			catch (NumberFormatException e) {
				System.err.println("Nur Zahlen eingeben: " + e.getMessage());
			}
		}
				
			
		
		
}


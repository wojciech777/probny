
/**
 * class TablicaInt jest to klasa pomocnicza zaimplementowana w celu ³atwego
 * przechowywania pieniedzy i przeprowadzania operacji na nich w przystepny
 * sposob
 * 
 * @author Wojciech Bomba
 * 
 */
public class TablicaInt {
	/**
	 * publiczna tablica w ktorej przechowywane sa ilosci monet o poszczegolnych
	 * nominalach
	 */
	public int[] tablica = new int[6];

	
	/**
	 * konstruktor bezparametrowy ustawiajacy ilosci poszczegolnych monet na 0
	 */
	TablicaInt() {
		for (int i = 0; i < tablica.length; ++i)
			tablica[i] = 0;
	}

	/**
	 * konstruktor parametrowy ustawiajacy ilosci poszczegolnych monet na 5
	 * 
	 * @param liczba
	 *            -liczba ktorej wartosc w tej implementacji nie ma znaczenia:
	 *            chodzilo jedynie o wywolanie odpowiedniego konstruktora
	 */
	TablicaInt(int liczba) {
		for (int i = 0; i < tablica.length; ++i)
			tablica[i] = 5;
	}
	
	/**
	 * metoda wyzeruj() ustawia ilosci wszystkich nominalow na 0
	 */
	void wyzeruj() {
		for (int i = 0; i < tablica.length; ++i)
			tablica[i] = 0;
	}

	/**
	 * metoda przepisz przepisuje ilosci poszczegolnych nominalow z obiektu
	 * zadanego jako argument do naszego obiektu
	 * 
	 * @param other
	 *            -obiekt ktory sluzy jako wzorzec do tworzenia kopii
	 */
	void przepisz(TablicaInt other) {
		for (int i = 0; i < tablica.length; ++i)
			tablica[i] = other.tablica[i];
	}

	/**
	 * metoda dodaj zwieksza ilosci poszczegolnych monet o wartosci przechowywane
	 * w innym obiekcie
	 * 
	 * @param other
	 *            -obiekt z którego dodajemy ilosci poszczegolnych monet
	 */
	void dodaj(TablicaInt other) {
		for (int i = 0; i < tablica.length; ++i)
			tablica[i] += other.tablica[i];
	}

	/**
	 * metoda odejmij zmniejsza ilosci poszczegolnych monet o wartosci
	 * przechowywane w w innym obiekcie
	 * 
	 * @param other
	 *            -obiekt z którego odejmujemy ilosci poszczegolnych monet
	 */
	void odejmij(TablicaInt other) {
		for (int i = 0; i < tablica.length; ++i)
			tablica[i] -= other.tablica[i];
	}

	/**
	 * metoda suma
	 * 
	 * @return bezwgledna suma wszystkich monet przechowywanych w naszym skarbcu
	 */
	int suma() {
		int wynik = 0;
		wynik += (tablica[0] * 10);
		wynik += (tablica[1] * 20);
		wynik += (tablica[2] * 50);
		wynik += (tablica[3] * 100);
		wynik += (tablica[4] * 200);
		wynik += (tablica[5] * 500);
		return wynik;
	}

	/**
	 * metoda wypiszZawartosc() wypisuje kazda monete podajac na wyjsciu jej
	 * nominal
	 */
	void wypiszZawartosc() {
		for (int i = 0; i < tablica[0]; ++i)
			System.out.print("10 ");
		for (int i = 0; i < tablica[1]; ++i)
			System.out.print("20 ");
		for (int i = 0; i < tablica[2]; ++i)
			System.out.print("50 ");
		for (int i = 0; i < tablica[3]; ++i)
			System.out.print("100 ");
		for (int i = 0; i < tablica[4]; ++i)
			System.out.print("200 ");
		for (int i = 0; i < tablica[5]; ++i)
			System.out.print("500 ");
		System.out.println();
	}

	
}


public class Proba {
	static String[] wyrazy = {"wojtek","kamil"};
	
	static String[] returnWyraz() {
		return wyrazy;
	}
	
	static void change(String s) {
		s.replace('w', 'k');
	}
	public static void main (String[] args) {
		String[] bufor = returnWyraz();
		bufor[0] = "mateusz";
		System.out.println(wyrazy[0]);
		
		String nowy = new String("wojtek");
		change(nowy);
		System.out.println(nowy);
		nowy.replace('w', 'k');
		System.out.println(nowy);
		
		//jak na razie nie znalazlem metody ktora by modyfikowala Stringa 
	}
}

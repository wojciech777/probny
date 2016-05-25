import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class wyrazeniaRegularne {
	static StringBuilder check(String lancuch) {
		StringBuilder wynik= new StringBuilder();
		Pattern pattern = Pattern.compile("[<]{1}[aA]{1}[^(href)]+(href){1}[\\s]*[=]{1}[\\s]*[\"]{1}[^\"]*[\"]{1}[>]{1}[^<]*[<]{1}[/]{1}[aA]{1}[>]{1}");
		Matcher matcher = pattern.matcher(lancuch);
		while(matcher.find()) {
			wynik.append(matcher.group()).append("\n");
		}
		
		return wynik;
	}
	
	static void wypiszAdresy(String links) {
		Pattern pattern = Pattern.compile("[\"]{1}(http){1}[^\"]*[\"]{1}");
		Matcher matcher = pattern.matcher(links);
		System.out.println("czesc jestem grzes");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
	public static void main(String[] args) throws IOException {
//   	String wyraz= "<a  href uuuuu<a href";
//		String wyraz= "<A href = \"wojtek\">wojtek</A>  <A href = \"wojtek\">wojtek</A>";
//		wyraz= "<A href = \"wojtek\">wojtek<A>";
//		System.out.println(check(wyraz));
		
		URL polaczenie= new URL("http://student.agh.edu.pl/~bombasjw/jeden.html");
		BufferedReader reader = new BufferedReader(new InputStreamReader(polaczenie.openStream()));
		StringBuilder sb= new StringBuilder();
		
		String ln;
		while(((ln= reader.readLine())!= null)){
			sb.append(ln).append(" ");
		}
		String wyjscie = sb.toString();
		//System.out.println(wyjscie);
		System.out.println(check(wyjscie).toString());
		
		wypiszAdresy(check(wyjscie).toString());
	}
}

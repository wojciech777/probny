import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class html {
	public static void main(String[] args) throws IOException{
		URL polaczenie= new URL("http://www.agh.edu.pl");
		BufferedReader reader = new BufferedReader(new InputStreamReader(polaczenie.openStream()));
		StringBuilder sb= new StringBuilder();
		
		String ln;
		while(((ln= reader.readLine())!= null)){
			sb.append(ln).append(" ");
		}
		String wyjscie = sb.toString();
		System.out.println(wyjscie);
	}
	
}
//Crowler ktory 
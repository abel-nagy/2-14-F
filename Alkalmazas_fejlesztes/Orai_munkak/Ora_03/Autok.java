
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Autok {
	
	/*= Variables =======================================================================*/
	
	ArrayList<Auto> autok;
	
	/*= Constructor =====================================================================*/
	
	public Autok(String path, int darabszam, String separator) {
		
		autok = new ArrayList<>();
		
		try {

			println("\n1. Feladat");
			ReadFile(path, darabszam, separator);
			
			// II. R�szfeladat
			println("\tII. R�szfeladat:");
			SzinKivalasztas(new String[]{"feh�r", "k�k"});
			
			// III. R�szfeladat
			println("\tIII. R�szfeladat");
			println("\t\t" + TipusSzamlal("Opel") + " darab 'Opel' auto van.");
			
			// IV. R�szfeladat
			println("\tIV. R�szfeladat");
			MaxKivalasztas();
			
			// V. R�szfeladat
			println("\tV. R�szfeladat");
			println("\t\t" + AtlagEletkor() + " �v a kocsik �tlag �letkora.");
			
		} catch (Exception e) {
			println("!!! Hiba t�rt�nt a '" + path + "' f�jl beolvas�sakor. L�sd a r�szleteket: ");
			println(e.toString());
		}
		
	}
	
	/*= Functions =======================================================================*/
	
	void SzinKivalasztas(String[] szinek) {
		
		for(Auto a : autok) {
			for(String s : szinek) {
				if(a.szin.contains(s)) {
					println("\t\t" + a.rendszam + ": " + a.szin);
				}
			}
		}
		
	}
	
	int TipusSzamlal(String tipus) {
		
		int counter = 0;
		
		for(Auto a : autok) {
			if(a.tipus.contains(tipus)) {
				counter++;
			}
		}
		
		return counter;
	}
	
	void MaxKivalasztas() {
		
		int id = 0;
		int maxAr = autok.get(0).ar;
		
		for(Auto a : autok) {
			if(a.ar > maxAr) {
				id = a.id;
				maxAr = a.ar;
			}
		}
		
		println("\t\t" + autok.get(id).rendszam + ": " + autok.get(id).tipus + " | " + autok.get(id).forgalmi);
		
	}
	
	int AtlagEletkor() {
		
		int eletkor = 0;
		
		for(Auto a : autok) {
			eletkor += Calendar.getInstance().get(Calendar.YEAR) - a.forgalmi;
		}
		
		return eletkor / autok.size();
		
	}
	
	/*= Helper Functions ================================================================*/
	
	void println(String msg) { System.out.println(msg); }
	
	int tryParse(String num, int def) {
		
		try {
			return Integer.parseInt(num);
		} catch(Exception e) {
			return def;
		}
		
	}
	
	void ReadFile(String path, int darabszam, String separator) throws IOException {
		
		File file = new File(path);
		
		Scanner scanner = new Scanner(file);
		String line = "";
		
		scanner.nextLine();
		int i = 0;
		
		while (scanner.hasNext()) {
			line = scanner.nextLine();
			String[] adatok = line.split(separator);
			autok.add(new Auto(i, adatok[0], adatok[1], adatok[2], tryParse(adatok[3], 0), tryParse(adatok[4], 0), tryParse(adatok[5], 0), tryParse(adatok[6], 0)));
			i++;
		}
		
		scanner.close();
		
	}
	
	
}

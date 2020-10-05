
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
			
			// II. Részfeladat
			println("\tII. Részfeladat:");
			SzinKivalasztas(new String[]{"fehér", "kék"});
			
			// III. Részfeladat
			println("\tIII. Részfeladat");
			println("\t\t" + TipusSzamlal("Opel") + " darab 'Opel' auto van.");
			
			// IV. Részfeladat
			println("\tIV. Részfeladat");
			MaxKivalasztas();
			
			// V. Részfeladat
			println("\tV. Részfeladat");
			println("\t\t" + AtlagEletkor() + " év a kocsik átlag életkora.");
			
		} catch (Exception e) {
			println("!!! Hiba történt a '" + path + "' fájl beolvasásakor. Lásd a részleteket: ");
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

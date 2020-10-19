import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Orszagok {
	
	static ArrayList<Orszag> orszagok;
	
	public static void Start() {
		
		orszagok = new ArrayList<Orszag>();
		
		// 1. Feladat
		try {
			Feladat1();
		} catch (IOException e) {
			Print(e.toString());
		}
		
		// 2. Feladat
		Print("\t2. Feladat\n" + orszagok.size() + " országot tároltam el.");
		
		// 3. Feladat
		Feladat3();
		
		// 4. Feladat
		Print("\n\t4. Feladat\n" + Feladat4() + " európai ország van.");
		
		// 5. Feladat
		Feladat5();
		
		// 6. Feladat
		Feladat6();
		
		// 7. Feladat
		Print("\n\t7. Feladat\n- Kérek egy ország nevet: ");
		Feladat7();
		
		// 8. Feladat
		try {
			Feladat8();
		} catch (IOException e) {
			Print("Dikk. Besszart a gép! EVAKUÁLÁS!!!!");
			Print(e.toString());
		}
		
	}
	
	static void Feladat1() throws IOException {
		FileReader fr = new FileReader("orszagok.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while( (line = br.readLine()) != null ) {
			String[] tmp = line.split(";");
			orszagok.add(new Orszag(tmp[0], tmp[1], tmp[2], TryParse(tmp[3]), TryParse(tmp[4])));
		}
		orszagok.remove(0);
		br.close();
		fr.close();
	}
	
	static void Feladat3() {
		Print("\n\t3. Feladat");
		for(Orszag orszag : orszagok) {
			if(orszag.foldresz.equals("Ázsia")) {
				Print(orszag.nev + ", " + orszag.fovaros);
			}
		}
	}
	
	static int Feladat4() {
		int i = 0;
		
		for (Orszag orszag : orszagok) {
			if(orszag.foldresz.equals("Európa")) {
				i++;
			}
		}
		
		return i;
	}
	
	static void Feladat5() {
		Print("\n\t5. Feladat");
		for (Orszag orszag : orszagok) {
			if(orszag.nev.charAt(0) == 'M') {
				Print(orszag.nev + ": (" + orszag.foldresz + "), " + orszag.fovaros + " ||| Lakossága: " + orszag.lakossag + ", Területe: " + orszag.terulet);
			}
		}
	}
	
	static void Feladat6() {
		int min = orszagok.get(0).lakossag;
		int indx = 0;
		
		for(int i = 1; i < orszagok.size(); i++) {
			if(orszagok.get(i).lakossag < min) {
				indx = i;
				min = orszagok.get(i).lakossag;
			}
		}
		
		Print("\n\t6. Feladat\nLegkisebb lakosú ország:\n" + orszagok.get(indx).nev + ": " + min);
		
	}
	
	static int Feladat7() {
		Scanner sc = new Scanner(System.in);
		String orsz = sc.nextLine();
		
		for(Orszag orszag : orszagok) {
			if(orszag.nev.equals(orsz)) {
				Print("Fõvárosa: " + orszag.fovaros + ", Lakossága: " + orszag.lakossag);
				return 0;
			}
		}
		
		Print("Nincs ilyen ország a fájlban. :/");
		return 0;
		
	}
	
	static void Feladat8() throws IOException {
		
		FileWriter fw = new FileWriter("nepsuruseg.dat");
		
		for (Orszag orszag : orszagok) {
			fw.write(orszag.nev + ": " + orszag.lakossag/orszag.terulet);
			fw.append("\n");
			Print(orszag.nev + ": " + orszag.lakossag/orszag.terulet);
		}
		
		fw.close();
	}
	
	
	
	static int TryParse(String num) {
		try {
			return Integer.parseInt(num);
		} catch(Exception e) {
			return 0;
		}
	}
	
	static void Print(String msg) {
		System.out.println(msg);
	}
	
}

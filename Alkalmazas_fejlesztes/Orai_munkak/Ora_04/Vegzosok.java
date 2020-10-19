import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vegzosok {
	
	static ArrayList<Diak> diakok;

	public static void Start() {
		diakok = new ArrayList<Diak>();
		
		// 1. Feladat
		try {
			Feladat1();
		} catch(IOException e) {
			Print(e.toString());
		}
		
		// 2. Feladat
		//Print("\n\t2. Feladat\n- Kérek egy diák nevet:");
		//Feladat2();
		
		// 3. Feladat
		Print("\n\t3. Feladat\n" + diakok.size()  + " végzõsünk volt idén.");
		
		// 4. Feladat
		Feladat4();
		
		// 5. Feladat
		Feladat5();
		
		// 6. Feladat
		Feladat6();
		
		// 7. Feladat
		Feladat7();
		
		// 8. Feladat
		Feladat8();
		
	}
	
	static void Feladat1() throws IOException {
		FileReader fr = new FileReader("vegzosok.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while( (line = br.readLine()) != null ) {
			String[] tmp = line.split("\t");
			diakok.add(new Diak(tmp[1], tmp[0], TryParse(tmp[2]), tmp[3], tmp[4]));
		}
		diakok.remove(0);
		br.close();
		fr.close();
		
		/*for (Diak diak : diakok) {
			Print(diak.nev);
		}*/
	}
	
	static int Feladat2() {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		for(Diak diak : diakok) {
			if(diak.nev.equals(in)) {
				Print(diak.nev + " diákunk " + diak.evfolyam + "-ban/ben végzett " + diak.szak + "-ként.");
				return 0;
			}
		}
		
		Print("Nincs ilyen diák a fájlban. :/");
		return 0;
	}
	
	static void Feladat4() {
		Print("\n\t4. Feladat");
		for(Diak diak : diakok) {
			if(diak.szak.equals("Jármûlakatos")) {
				Print(diak.nev + "");
			}
		}
	}
	
	static void Feladat5() {
		int fiu = 0, lany = 0;
		for (Diak diak : diakok) {
			if(diak.neme.equals("F")) {
				fiu++;
			} else {
				lany++;
			}
		}
		Print("\n\t5. Feladat\n" + lany + " lány és " + fiu + " fiú van a végzõsök között.");
	}
	
	static void Feladat6() {
		int max = diakok.get(0).nev.length();
		int indx = 0;
		
		for(int i = 1; i < diakok.size(); i++) {
			if(diakok.get(i).nev.length() > max) {
				indx = i;
				max = diakok.get(i).nev.length();
			}
		}
		
		Print("\n\t6. Feladat\nLeghosszabb nevû végzõs:\n" + diakok.get(indx).nev + ": " + diakok.get(indx).evfolyam);
		
	}
	
	static void Feladat7() {
		Print("\n\t7. Feladat\n2006-os végzõsök:");
		for (Diak diak : diakok) {
			if(diak.evfolyam == 2006) {
				Print(diak.nev + ": (" + diak.neme + ") " + diak.evfolyam + "." + diak.osztaly + " | " + diak.szak);
			}
		}
	}
	
	static void Feladat8() {
		ArrayList<String> szakok = new ArrayList<String>();
		
		for (String string : szakok) {
			Print("");
		}
	}
	
	static boolean DoesExist(ArrayList<String> arr, String item) {
		
		for (String string : arr) {
			if(item.equals(string)) {
				return false;
			}
		}
		
		return true;
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

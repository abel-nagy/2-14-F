import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Valasztas {
	
	
	static int 		i_jeloltekSzama = 0;
	static int[]    sa_keruletek  	= new int[100];
	static int[]    sa_szavazatok 	= new int[100];
	static String[] sa_nevek      	= new String[100];
	static String[] sa_partok     	= new String[100];
	

	/* ================================================================================= */
	
	
	public static void main(String[] args) {
		
		try {
			
			ReadFile("./szavazatok.txt");
			
			println("2. Feladat:");
			println("A helyhat�s�gi v�laszt�son " + i_jeloltekSzama + " k�pvisel�jel�lt indult.\n\n");
			
			double szavazok_szama = (double) SzavazokSzama();
			double szavazok = 12345.0;
			println("3. Feladat");
			println("A v�laszt�son " + Math.round(szavazok_szama) + " �llampolg�r, a jogosultak " + Math.round((szavazok_szama/szavazok*100.0)*100.0 )/100.0 + "%-a vett r�szt.");
			
		} catch(IOException e) {
			println("Nem tal�ltam f�jlt!\nVagy kicsit java-sabban:");
			println(e.toString());
		}
		
	}
	
	
	/* ================================================================================= */
	
	
	// 1. Feladat
	public static void ReadFile(String path) throws IOException {
		
		File file = new File(path);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = "";
		
		int i = 0;
		
		while( (line = br.readLine()) != null  ) {
			String[] datas = line.split(" ");
			
			sa_keruletek[i]  = tryParse(datas[0], 0);
			sa_szavazatok[i] = tryParse(datas[1], 0);
			sa_nevek[i]      = datas[2] + " " + datas[3];
			sa_partok[i]     = datas[4];
			
			i++;
		}
		
		i_jeloltekSzama = i;
		
		br.close();
		
	}
	
	// 2. Feladat
	public static int SzavazokSzama() {
		
		int szavazok = 0;
		
		for(int i = 0; i < i_jeloltekSzama; i++) {
			szavazok += sa_szavazatok[i];
		}
		
		return szavazok;
		
	}
	
	
	/* ================================================================================= */
	
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static int tryParse(String value, int defaultValue) {
		try {
			return Integer.parseInt(value);
		} catch(NumberFormatException e) {
			return defaultValue;
		}
	}
	

}
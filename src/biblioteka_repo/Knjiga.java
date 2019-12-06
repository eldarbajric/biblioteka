package biblioteka_repo;

import java.util.ArrayList;
import java.util.Scanner;

public class Knjiga {
	
	int brojKnjige;
	String nazivKnjige;
	String zanr;
	int brojStrana;
	int brojKnjiga;
	static ArrayList<String> sveKnjige = new ArrayList<String>(); 	
	static ArrayList<String> izdateKnjige = new ArrayList<String>();
	String testBranchCommit;
	
	Knjiga(){
		
	}
	
	Knjiga (String nazivKnjige, String zanr, int brojKnjige) {
		this.nazivKnjige = nazivKnjige;
		this.zanr = zanr;
		this.brojKnjige = brojKnjige;
		brojKnjiga++;
		sveKnjige.add(this.nazivKnjige.toLowerCase().replaceAll(" ", ""));
	}
	
	
	@SuppressWarnings("resource")
	public static boolean checkForKnjiga() {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite knjigu: ");
		String knjiga = unos.nextLine();
		
		knjiga = knjiga.toLowerCase();
		knjiga = knjiga.replaceAll(" ", "");
		
		if(sveKnjige.contains(knjiga)) {
			System.out.println("Knjiga je dostupna.");
			return true;
		}else {
			System.out.println("Nazalost knjiga nije dostupna.");
			return false;
		}
		
	}
	
	public String showInfo() {
		return "Naziv knjige:" + this.nazivKnjige + " |" + " Zanr:" + this.zanr + " |" + " Broj knjige: "
				+ this.brojKnjige;

	}
	
}

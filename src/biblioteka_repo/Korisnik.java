package biblioteka_repo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Korisnik extends Autor {

	int brojRacuna;
	String imeKorisnika;
	int brojKnjiga = 0;
	static ArrayList<String> korisniciIds = new ArrayList<String>();
	

	Korisnik() {

	}

	Korisnik(int brojRacuna, String imeKorisnika) {
		this.brojRacuna = brojRacuna;
		this.imeKorisnika = imeKorisnika;

		if (korisniciIds.contains(String.valueOf(this.brojRacuna)))
			throw new IllegalArgumentException("Racun vec postoji!");
		if (this.brojRacuna < 0)
			throw new IllegalArgumentException("Broj Racuna mora biti veci od nule!");

		korisniciIds.add(String.valueOf(this.brojRacuna));

	}

	public int getBrojKnjiga() {
		return brojKnjiga;
	}
	
	
//	Kada zatvorim unos(scanner) baca exception u show menu metodi linija 93
	public void posudivanje() {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite naziv knjige: ");
		String nazivKnjige = unos.nextLine();

		
		
		nazivKnjige = nazivKnjige.toLowerCase().replaceAll(" ", "");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar datumPosudivanja = Calendar.getInstance();
		datumPosudivanja.setTime(new Date());

		if (brojKnjiga >= 3) {
			System.out.println(imeKorisnika + " - Maximalan broj knjiga dostignut!");
		} else if (!sveKnjige.contains(nazivKnjige)) {
			System.out.println("Knjiga nazalost nije dostupna");
		} else if (sveKnjige.contains(nazivKnjige) && brojKnjiga <= 3) {
			brojKnjiga++;
			izdateKnjige.add(nazivKnjige);
			sveKnjige.remove(nazivKnjige);
			System.out.println(
					"Uspjesno ste posudili knjigu. Datum izdavanja: " + sdf.format(datumPosudivanja.getTime()));

		}
		
	}

	public void vracanje(String nazivKnjige) {
		nazivKnjige = nazivKnjige.toLowerCase().replaceAll(" ", "");
		sveKnjige.add(nazivKnjige);
		izdateKnjige.remove(nazivKnjige);
		brojKnjiga--;
		System.out.println("Hvala! " + this.imeKorisnika);

	}
	
	


	void showMenu() {
		String option = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("Welcome to our library :)");
		System.out.println("Your ID is: " + brojRacuna);
		
		System.out.println("A.- Check if book is available.");
		System.out.println("B.- Loan a book.");
		System.out.println("C.- Return a book.");
		System.out.println("E.- Exit.");
		
		menuLoop:
		do {
			System.out.println("********************************");
			System.out.println("Enter an option");
			System.out.println("********************************");
			option = sc.next();
			option.toUpperCase();
	

			switch (option) {
			case "A":
				System.out.println("-----------------------------");
				checkForKnjiga();
				System.out.println("-----------------------------");
				System.out.println("\n");
				break;
					
			case "B":
				System.out.println("-----------------------------");
				posudivanje();
				System.out.println("-----------------------------");
					break;
					
			case "C":
				System.out.println("-----------------------------");
				System.out.println("Unesite naziv knjige: ");
				String knjigaVrati = sc.nextLine();
				vracanje(knjigaVrati);
				System.out.println("-----------------------------");
					break;
			
			case "E":
				System.out.println("-----------------------------");
				System.out.println("Hvala na koristenju nasih usluga. Dovidjenja.");
				System.out.println("-----------------------------");
					break menuLoop;
			}

		}while(option != "E");
	}
}

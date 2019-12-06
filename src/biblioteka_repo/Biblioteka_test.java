package biblioteka_repo;

public class Biblioteka_test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Korisnik eldar = new Korisnik(1234, "Eldar Bajric");
		Korisnik muzafer = new Korisnik(1278, "Muzafer Muzaferovic");
		
		
		Knjiga ivoKnjiga1 = new Knjiga("Na drini cuprija", "Roman", 333);
		Knjiga ivoKnjiga2 = new Knjiga("Prokleta avlija", "Roman/Fikcija", 160);
		Knjiga farukKnjiga1 = new Knjiga("Pod pritiskom", "Kratke price", 350);
		Knjiga mesaKnjiga1 = new Knjiga("Dervis i smrt", "Roman", 376);
	
		
		
		
//		Knjiga.checkForKnjiga();
//		
//		System.out.println(muzafer.brojKnjiga);
//		System.out.println(eldar.brojKnjiga);
//		eldar.vracanje("na drini cuprija");
////		
//		Knjiga.checkForKnjiga();
//		
//		System.out.println(muzafer.brojKnjiga);
//		System.out.println(eldar.brojKnjiga);
		
		eldar.showMenu();
	}

}

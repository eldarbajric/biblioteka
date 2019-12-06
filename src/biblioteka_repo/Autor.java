package biblioteka_repo;

public class Autor extends Knjiga{
		
	String imeIprezime;
	Knjiga [] djela = new Knjiga[100];
	String mjestoRodjenja;
	int godinaRodjenja;
	private String email;
	
	Autor () {
		
	}
	
	Autor (String imeIprezime,String mjestoRodjenja, int godinaRodjenja){
		this.imeIprezime = imeIprezime;
		this.mjestoRodjenja = mjestoRodjenja;
		this.godinaRodjenja = godinaRodjenja;
	}
	
	
	public void addDjelo(Knjiga nazivKnjige) {
		for(int i = 0; i < djela.length; i++) {
			if(djela[i] == null) {
			djela[i] = nazivKnjige;
			break;
			}
		}
	}
	
	public void getDjela() {
		for(int i = 0; i < djela.length; i++) {
			if(djela[i] != null) {
			System.out.print(djela[i] + ", ");
			
			}
		}
	}
	
	public String getName() {
		return imeIprezime;
	}
	
	public int getBirthDay() {
		return godinaRodjenja;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setZanr(String zanr) {
		this.zanr = zanr;
	}
	
	
	
	public void showAutorInfo() {
		System.out.print("Ime i prezime: " + imeIprezime + "; Zanr: " + zanr + "; Mjesto rodjenja: " + mjestoRodjenja + "; Godina rodjenja: " + godinaRodjenja + "." +  
				" Djela: ");
		getDjela();
		System.out.println("\n");
	}
	
	
	

}

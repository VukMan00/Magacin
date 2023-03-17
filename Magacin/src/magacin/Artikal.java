package magacin;

import java.time.LocalDate;

public abstract class Artikal {
<<<<<<< HEAD

	private String naziv;
	private String sifra;
	private String opis;
	private int kolicina;
	private LocalDate datum;

=======
	private String naziv;
	private String sifra;
	private String opis;
	private int kolicina;
	
>>>>>>> refs/heads/implementacijainterfejsa
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null) {
			throw new NullPointerException("Naziv ne moze da bude null");
		}
		if(naziv.isEmpty()) {
			throw new IllegalArgumentException("Naziv ne moze da bude prazan string");
		}
		this.naziv = naziv;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		if(naziv==null) {
			throw new NullPointerException("Sifra ne moze da bude null");
		}
		if(naziv.isEmpty()) {
			throw new IllegalArgumentException("Sifra ne moze da bude prazan string");
		}
		if(sifra.length()<0) {
			throw new IndexOutOfBoundsException("Sifra mora biti veca od nule");
		}
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis==null) {
			throw new NullPointerException("Opis ne moze da bude null");
		}
		if(opis.isEmpty()) {
			throw new IllegalArgumentException("Opis ne moze da bude prazan string");
		}
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina<0) {
			throw new IllegalArgumentException("Kolicina ne moze da bude manja od nule");
		}
		this.kolicina = kolicina;
	}
}

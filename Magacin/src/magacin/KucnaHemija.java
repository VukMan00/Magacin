package magacin;

import java.time.LocalDate;
import java.util.Objects;

public class KucnaHemija extends Artikal{

	private String naziv;
	private String sifra;
	private String opis;
	private int kolicina;
	private LocalDate datum;
	
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
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		if(datum==null) {
			throw new NullPointerException("Datum ne moze da bude null");
		}
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		return Objects.hash(datum, kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(datum, other.datum) && kolicina == other.kolicina && Objects.equals(naziv, other.naziv)
				&& Objects.equals(opis, other.opis) && Objects.equals(sifra, other.sifra);
	}
	@Override
	public String toString() {
		return "KucnaHemija [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina
				+ ", datum=" + datum + "]";
	}
	
	
	
	
	
}

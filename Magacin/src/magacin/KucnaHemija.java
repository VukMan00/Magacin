package magacin;

import java.time.LocalDate;
import java.util.Objects;

public class KucnaHemija{

	private String naziv;
	private String sifra;
	private String opis;
	private int kolicina;
	private LocalDate datum;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
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

package specifikacijamagacina;

import magacin.Artikal;

public interface SpecifikacijaMagacina {

	void addArtikal(Artikal artikal);
	void removeArtikal(Artikal artikal);
	Artikal getArtikal(String sifra);
}

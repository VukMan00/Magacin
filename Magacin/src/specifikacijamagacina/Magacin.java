package specifikacijamagacina;

import java.util.ArrayList;
import java.util.List;

import magacin.Artikal;

public class Magacin implements SpecifikacijaMagacina{

	List<Artikal> artikli;
	
	Magacin(){
		artikli = new ArrayList<>();
	}

	@Override
	public void addArtikal(Artikal artikal) {
		if(artikal!=null) {
			artikli.add(artikal);
		}
	}

	@Override
	public void removeArtikal(Artikal artikal) {
		if(artikal!=null) {
			artikli.remove(artikal);
		}
	}

	@Override
	public Artikal getArtikal(String sifra) {
		if(sifra==null || sifra.isEmpty()) {
			return null;
		}
		
		for(Artikal artikal:artikli) {
			if(artikal.getSifra().equals(sifra)) {
				return artikal;
			}
		}
		
		return null;
	}

}

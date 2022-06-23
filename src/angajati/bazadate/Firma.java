package angajati.bazadate;

import java.util.ArrayList;

import angajati.tipuriAngajati.Angajat;

public class Firma {

	public ArrayList<Angajat> listaAngajati;

	public Firma() {
		listaAngajati = new ArrayList<Angajat>();
	}

	public boolean addAngajat(Angajat a) {

		return listaAngajati.add(a);

	}

	public ArrayList<Angajat> getNumeAngajat(String tipAngajat) {
		ArrayList<Angajat> listaAngajati = new ArrayList<Angajat>();
		for (Angajat a : listaAngajati) {
			if (a.getNume().equals(tipAngajat))
				listaAngajati.add(a);
		}
		return listaAngajati;
	}

	public double getSalariuMediu() {
		double salariuMediu = 0;
		double nr = 0;
		ArrayList<Angajat> listaAngajati = new ArrayList<Angajat>();
		for (Angajat a : listaAngajati) {
			listaAngajati.add(a);

			salariuMediu = a.getCalculSalar() + salariuMediu;
			nr++;

		}
		return Math.floor(salariuMediu / nr);

	}

}

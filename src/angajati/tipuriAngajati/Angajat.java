package angajati.tipuriAngajati;

import angajati.utils.InvalidName;
import angajati.utils.Salar;

public abstract class Angajat implements Salar {

	protected String nume;

	public Angajat(String nume) throws InvalidName {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {

		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Angajatul " + nume + "\n";
	}

}

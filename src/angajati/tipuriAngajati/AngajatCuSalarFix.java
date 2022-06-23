package angajati.tipuriAngajati;

import angajati.utils.InvalidName;

public class AngajatCuSalarFix extends Angajat {

	private double salariuFix;

	public AngajatCuSalarFix(String nume, double salariuFix) throws InvalidName {
		super(nume);
		this.salariuFix = salariuFix;
	}

	public double getSalariuFix() {
		return salariuFix;
	}

	public void setSalariuFix(double salariuFix) {
		this.salariuFix = salariuFix;
	}

	@Override
	public double getCalculSalar() {
		return this.salariuFix;
	}

	public void schimbareSalarFix(double salariuNou) {

		this.salariuFix = salariuNou;

	}

	@Override
	public String toString() {
		return "Angajatul " + nume + " Cu Salariul Fix  de " + salariuFix + "\n";
	}

}

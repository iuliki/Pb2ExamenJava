package angajati.tipuriAngajati;

import angajati.utils.InvalidName;

public class AngajatCuOra extends Angajat {

	private int nrOre;
	private double salariuOra;

	public AngajatCuOra(String nume, int nrOre, double salariuOra) throws InvalidName {
		super(nume);
		this.nrOre = nrOre;
		this.salariuOra = salariuOra;
	}

	public int getNrOre() {
		return nrOre;
	}

	public void setNrOre(int nrOre) {
		this.nrOre = nrOre;
	}

	public double getSalariuOra() {
		return salariuOra;
	}

	public void setSalariuOra(double salariuOra) {
		this.salariuOra = salariuOra;
	}

	public int adaugareOre(int orePlus) {
		return this.getNrOre() + orePlus;

	}

	public void schimbaSalarPeOra(double salariuNou) {
		this.salariuOra = salariuNou;
	}

	@Override
	public double getCalculSalar() {
		return this.nrOre * this.salariuOra;
	}

	public String toString() {
		return "Angajatul " + nume + " Angajat la ora cu salariul" + salariuOra + "\n";
	}

}

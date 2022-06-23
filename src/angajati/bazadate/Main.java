package angajati.bazadate;

import angajati.tipuriAngajati.Angajat;
import angajati.tipuriAngajati.AngajatCuOra;
import angajati.tipuriAngajati.AngajatCuSalarFix;
import angajati.utils.InvalidName;

public class Main {

	public static void main(String[] args) {

		Firma f1 = new Firma();

		try {
			Angajat a1 = new AngajatCuSalarFix("Ana", 100);
			Angajat a2 = new AngajatCuSalarFix("Iulia", 200);
			Angajat a3 = new AngajatCuSalarFix("Maria", 300);

			Angajat a4 = new AngajatCuOra("Ana", 8, 10);
			Angajat a9 = new AngajatCuOra("Ana", 8, 10);
			Angajat a5 = new AngajatCuOra("Iulia", 6, 20);
			Angajat a6 = new AngajatCuOra("Maria", 4, 30);

			f1.addAngajat(a1);
			f1.addAngajat(a2);
			f1.addAngajat(a3);
			f1.addAngajat(a4);
			f1.addAngajat(a5);
			f1.addAngajat(a6);

		} catch (InvalidName e) {
			System.out.println(e);
		}

		System.out.println(f1.listaAngajati + "\n");

		System.out.println("Salariul mediu pe firma f1 este de: " + f1.getSalariuMediu());

	}

}

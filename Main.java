public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Angajator angajator = new Angajator("Qualitance");
		Angajat vladDogaru = new Angajat("Dogaru", "Vlad", 1920105, 21, 1000, "neinteresant", 1, angajator.numeFirma);
		angajator.angajare(vladDogaru);
		angajator.disponibilizare(vladDogaru);
		Angajat cristianIonita = new Angajat("Ionita", "Cristian", 1920531, 21, 1200, "maiInteresantCaDogaru", 2, angajator.numeFirma);
		angajator.angajare(cristianIonita);
		angajator.modificareSalariala(cristianIonita, 1500);
		System.out.println(angajator.cautareSalariat("Ionita", "Cristian"));
		angajator.afisareAngajati();
		System.out.println(cristianIonita.salariu);
	}
}

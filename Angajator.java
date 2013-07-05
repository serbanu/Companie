import java.util.ArrayList;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: Vladx
 * Date: 7/4/13
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Angajator implements OperatiuniHR {
	String numeFirma;
	ArrayList<Angajat> employees;
	
	public Angajator(String numeFirma) {
		this.numeFirma = numeFirma;
		employees = new ArrayList<Angajat>();
	}
	
	@Override
	public void angajare(Persoana persoana) {
		// TODO Auto-generated method stub
		employees.add((Angajat)persoana);
	}

	@Override
	public void disponibilizare(Angajat angajat) {
		// TODO Auto-generated method stub
		if(employees.contains(angajat)) {
			employees.remove(angajat);
		}
	}

	@Override
	public void modificareSalariala(Angajat angajat, int valoare) {
		// TODO Auto-generated method stub
		if(employees.contains(angajat)) {		
				angajat.salariu = valoare;
		}
	}

	@Override
	public Angajat cautareSalariat(String nume, String prenume) {
		// TODO Auto-generated method stub
		for(Angajat employee : employees) {
			if(employee.nume.equals(nume) && employee.prenume.equals(prenume)) {
				return employee;
			}
		}
		return new Angajat("", "", 0, 0, 0, "", 0, "");
	}
	
	public void afisareAngajati() {
		for(Angajat employee : employees) {
			System.out.println(employee.nume +  " " + employee.prenume);
		}
	}
}

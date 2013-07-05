/**
 * Created with IntelliJ IDEA.
 * User: Vladx
 * Date: 7/4/13
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */
public interface OperatiuniHR {

    public void angajare(Persoana persoana);
    public void disponibilizare(Angajat angajat);
    public void modificareSalariala(Angajat angajat, int valoare);
    public Angajat cautareSalariat(String nume, String prenume);
}

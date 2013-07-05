/**
 * Created with IntelliJ IDEA.
 * User: Vladx
 * Date: 7/4/13
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Angajat extends Persoana {
    int salariu;
    String post;
    int vechime;
    String angajator;
    
    public Angajat(String nume, String prenume, float CNP, int varsta,
    				int salariu, String post, int vechime, String angajator) {
    	super(nume, prenume, CNP, varsta);
    	this.salariu = salariu;
    	this.post = post;
    	this.vechime = vechime;
    	this.angajator = angajator;
    }
}

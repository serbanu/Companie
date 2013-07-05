/**
 * Created with IntelliJ IDEA.
 * User: Vladx
 * Date: 7/4/13
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student extends Persoana {
    String facultate;
    int anStudiu;
    int medieGeneralaAnAnterior;
    
    public Student(String nume, String prenume, float CNP, int varsta,
    				String facultate, int anStudiu, int medieGeneralaAnAnterior) {
    	super(nume, prenume, CNP, varsta);
    	this.facultate = facultate;
    	this.anStudiu = anStudiu;
    	this.medieGeneralaAnAnterior = medieGeneralaAnAnterior;
    	
    }
}

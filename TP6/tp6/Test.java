/**
 * 
 */
package tp6;

/**
 * @author Crenier Amaury
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		Personne pers = new Personne("Jules", "Dupont", 123434);
		Personne emp = new Employe("Jules", "Dupont", 123434, 1500, "EPHEC");
		Personne ind = new Independant("Jules", "Dupont", 123434, 5555);
		System.out.println(pers);
		System.out.println(emp);
		System.out.println(ind);
	}

}

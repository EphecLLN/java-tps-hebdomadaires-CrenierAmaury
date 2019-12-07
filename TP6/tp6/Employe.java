/**
 * 
 */
package tp6;

/**
 * @author amaur
 *
 */
public class Employe extends Personne{
	
	int salaire;
	String employeur;
	
	public Employe() {
		super();
		salaire = 0;
		employeur = " ";
	}
	
	public Employe(String nom, String prenom, int registreNational, int salaire, String employeur) {
		super(nom, prenom, registreNational);
		this.salaire = salaire;
		this.employeur = employeur;
	}
	
	public int getSalaire(){
		return salaire;
	}
	
	public String getEmployeur() {
		return employeur;
	}
	
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	public void setEmployeur(String employeur) {
		this.employeur = employeur;
	}
	
	public boolean equals() {
		
	}
	
	public String toString() {
		return super.toString() + " employé par " + employeur;
	}
}

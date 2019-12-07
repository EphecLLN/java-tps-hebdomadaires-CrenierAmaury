/**
 * 
 */
package tp6;

/**
 * @author amaur
 *
 */
public class Personne {
	
	String nom;
	String prenom;
	int registreNational;
	
	public Personne() {
		String nom = "toto";
		String prenom = "toto";
		int registreNational = "00000000000";
	}
	
	public Personne(String nom, String prenom, int registreNational) {
		this.nom = nom;
		this.prenom prenom;
		this.registreNational = registreNational;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public int getRegistreNational(){
		return registreNational;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	public void setRegistreNational(int registreNational){
		this.registreNational = registreNational;
	}
	
	public boolean equals() {
		
	}
	
	public String toString() {
		return nom + " " + prenom;
		
	}
}

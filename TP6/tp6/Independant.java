/**
 * 
 */
package tp6;

/**
 * @author amaur
 *
 */
public class Independant extends Personne{
	
	int numeroTVA;
	
	public Independant() {
		super();
		numeroTVA = "0";
	}
	
	public Independant(String nom, String prenom, int registreNational, int numeroTVA) {
		super(nom, prenom, registreNational);
		this.numeroTVA = numeroTVA;
	}
	
	public int getNumeroTVA(){
		return numeroTVA;
	}
	
	public void setNumeroTVA(int numeroTVA){
		this.numeroTVA = numeroTVA;
	}
	
	public boolean equals() {
		
	}
	
	public String toString() {
		return super.toString() + " avec le numéro de TVA: " + numeroTVA;
	}
}

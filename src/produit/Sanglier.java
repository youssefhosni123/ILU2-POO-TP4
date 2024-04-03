package produit;
import personnages.Gaulois;
public class Sanglier {
	private double poids;
	private Gaulois chasseur;
	private String nom = "Sanglier";
	//constructeur 
	public Sanglier(double poids,Gaulois chasseur)
	{
		this.chasseur=chasseur;
		this.poids=poids;
	}
	public double getpoids()
	{
		return poids;
	}
	public Gaulois getchasseur()
	{
		return chasseur;
	}
	public void setchasseur()
	{
		this.chasseur=chasseur;
	}
	public void setpoids()
	{
		this.poids=poids;
	}
	// Méthode pour afficher les détails du sanglier
    @Override
    public String toString() {
        return nom + " de " + poids + " kg chassé par " + chasseur.getNom() + ".";
    }

}

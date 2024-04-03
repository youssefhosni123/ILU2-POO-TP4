package produit;

public class Poisson {
	private String datePeche;
	private String nom="Poisson";
	//constructeur
	public Poisson(String datePeche)
	{
		this.datePeche=datePeche;
	}
	public String getdatePeche()
	{
		return datePeche;
	}
	public String getNom()
	{
		return nom;
	}
	public void setdatePeche(String datePehe) {
		this.datePeche=datePeche;
	}
	@Override
    public String toString() {
        return nom + " pêché " + datePeche;

}
}

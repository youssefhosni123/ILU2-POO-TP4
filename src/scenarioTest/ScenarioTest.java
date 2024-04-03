package scenarioTest;
import produit.Poisson;
import produit.Sanglier;
import villagegauloisold.Etal;
import villagegauloisold.IEtal;


public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] etals = new IEtal[3];
		IEtal<Sanglier> etalsanglier = new Etal<>();
		IEtal<Poisson> etalpoisson = new Etal<>();
		etals[0]=etalsanglier;
		etals[1]=etalpoisson;
	
	}
	//Dans cette version, nous avons créé un étal de sanglier en utilisant la classe Etal avec le type Sanglier. Ensuite, nous avons modifié la déclaration de la variable "marche" pour qu'elle soit un tableau d'étals de sangliers (IEtal<Sanglier>[]). Cela garantit que seuls les étals de sangliers peuvent être ajoutés au tableau "marche". Enfin, nous avons assigné l'étal de sanglier créé précédemment à la première position du tableau "marche".
	
}

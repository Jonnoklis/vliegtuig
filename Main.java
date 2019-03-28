package mobiel;
import mobiel.s5;
import mobiel.Samsung;
import mobiel.Fabriek;


public class Main
{
	
	public static void main(String[] args)
	{
		Fabriek fabriek = new Fabriek();
		fabriek.maakS5(100);
		fabriek.maakS5(101);
		fabriek.printGegevens();
		
		

	}

}

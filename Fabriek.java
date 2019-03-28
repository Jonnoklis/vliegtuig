package mobiel;
import mobiel.s5;
import mobiel.Samsung;
import mobiel.Mobiel;

import java.util.ArrayList;

public class Fabriek
{
	ArrayList<Mobiel> lijst = new ArrayList<>();
	
	public void maakS5(int code){
		Samsung s5 = new s5(code);
		s5.getBreedt();
		s5.getLengte();
		s5.setCode(code);
		lijst.add(s5);
		
	}
	
	public void printGegevens() {
		for(Mobiel mobiel : lijst) {
			System.out.println("Omtrek is " + mobiel.getBreedt() * mobiel.getLengte() + " de code is " + mobiel.getCode()) ;
		}
	}
	
	
}

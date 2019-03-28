package mobiel;
import mobiel.Mobiel;

public class Samsung extends Mobiel
{
	

	public Samsung()
	{
		super();
	}

	private String merk = "Samsung";
	private int ratingMerk = 9;
	
	@Override
	public String getMerk()
	{
		return merk;
	}
	
	@Override
	public int getRatingMerk()
	{
		return ratingMerk;
	}
	
	
	
}

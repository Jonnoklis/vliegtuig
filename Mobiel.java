package mobiel;

public class Mobiel
{
	private int code;
	private String merk;
	private int ratingMerk;
	private int lengte;
	private int breedt;
	private boolean touchscreen;
	
	public Mobiel() {
		
	}
	
	public int getRatingMerk()
	{
		return ratingMerk;
	}
	public void setRatingMerk(int ratingMerk)
	{
		this.ratingMerk = ratingMerk;
	}
	public String getMerk()
	{
		return merk;
	}
	public void setMerk(String merk)
	{
		this.merk = merk;
	}
	public int getBreedt()
	{
		return breedt;
	}
	public void setBreedt(int breedt)
	{
		this.breedt = breedt;
	}
	public boolean isTouchscreen()
	{
		return touchscreen;
	}
	public void setTouchscreen(boolean touchscreen)
	{
		this.touchscreen = touchscreen;
	}
	public int getLengte()
	{
		return lengte;
	}
	public void setLengte(int lengte)
	{
		this.lengte = lengte;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}
	
	
	
}

package Persona;

public class Persona 
{
	
	public String nome;
	public String cognome;
	public int eta;
	
//	public boolean verifica_maggiorenne ()
//	{
//		return eta >=18;
//	}	
//	
	public boolean verifica_maggiorenne (int limite)
	{
		return eta >=limite;
	}	
	
	
	
	public boolean verifica_maggiorenne ()
	{
		return verifica_maggiorenne(18);
	}	
	
	
	

}

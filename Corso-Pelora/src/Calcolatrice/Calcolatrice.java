package Calcolatrice;
public class Calcolatrice {
	
	private double risultato;
	
	public double somma(double...var)
	{
		
		for (int i = 0; i< var.length; i++)
			this.risultato +=var[i];
		return this.risultato;
	}
	
	public double prodotto (double... var)
	{
		this.risultato = 0;
		for (double op: var)
	     this.risultato +=op;
		return this.risultato;
	}
	
	public double sottrazione(double... var)
	{
		this.risultato = 0;
		for (double op:var)
			this.risultato -= op;
		return this.risultato;
	}
	

	public double divisione(double... var)
	{
		this.risultato = 0;
		for(double op : var)
		{
			if( op != 0.0 )
				this.risultato /= op;
		}
		
		return this.risultato;
	}
	
	
	
}

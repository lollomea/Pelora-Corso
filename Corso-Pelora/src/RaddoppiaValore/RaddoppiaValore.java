package RaddoppiaValore;

public class RaddoppiaValore 
{

	public void raddoppia(Valore val)
	{
		System.out.println("\nPassaggio di un oggetto (per RIFERIMENTO)");
		System.out.println(">>>>> nel metodo entra: "+val.numero);
		val.numero *=2;
		System.out.println(">>>>> nel metodo diventa "+val.numero+"\n");
	}
	
	
	public void raddoppia(int val)
	{
		System.out.println("\nPassaggio di un int (per VALORE)");
		System.out.println(">>>>> nel metodo entra: "+val);
		val *=2;
		System.out.println(">>>>> nel metodo diventa "+val+"\n");
	}
	
	
}

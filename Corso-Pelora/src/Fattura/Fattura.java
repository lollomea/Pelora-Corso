package Fattura;

public class Fattura {
	
	private double impFatt;
	private static double totFatt;
	
	public Fattura(double impFatt)
	{
		this.impFatt = impFatt;
		totFatt += impFatt;

		System.out.println("\nNuova fattura registrata di "+this.impFatt +" euro!");
		System.out.println("Totale fatture registrate "+totFatt+" euro!");
	}
	

}

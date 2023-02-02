package Fattura;
public class ConvertiValute 
{
    public static void convertiEuroDollaro(double euro,double tassoCambio) 
    {
        double dollari = euro * tassoCambio;
        System.out.println("\n"+euro+" euro equivalgono a "+dollari+" dollari");
    }
    
}

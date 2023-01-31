import Persona.*;
import RaddoppiaValore.RaddoppiaValore;
import RaddoppiaValore.Valore;

public class main {

	public static void main(String[] args) 
	{

		//Primo Oggetto
		Persona p1 = new Persona();
		p1.nome    = "Lorenzo";
		p1.cognome = " Mearelli";
        p1.eta     = 34; 
        
        //Secondo Oggetto
        Persona p2 = new Persona();
        p2.nome    = "Raffaele";
        p2.cognome = "Franco";
        p2.eta     = 31;
        
        
        //Terzo Oggetto
        Persona p3 = new Persona();
        p3.nome    = "Antonio";
        p3.cognome = "Pepe";
        p3.eta     = 29;
        
        
//        if ( p1.verifica_maggiorenne() )
//        	System.out.println(p1.nome + " è maggiorenne");
//        else
//        	System.out.println(p1.nome + " è minorenne");
//        
//        if ( p2.verifica_maggiorenne(40) )
//        	System.out.println(p2.nome + " è maggiorenne");
//        else
//        	System.out.println(p2.nome + " è minorenne");
//        
//        if ( p3.verifica_maggiorenne(23) )
//        	System.out.println(p3.nome + " è maggiorenne");
//        else
//        	System.out.println(p3.nome + " è minorenne");
	
	
//	System.out.println("Il docente è " + p1.nome + " " + p1.cognome );
//	System.out.println("L'alunno è " + p2.nome + " " + p2.cognome );
//	System.out.println("L'alunno è " + p3.nome + " " + p3.cognome );
	
	
        
        /*PASSAGGIO ARGOMENTI PER RIFERIMENTO E PER VALORE*/
        
        Valore val = new Valore();
        val.numero = 3;
       
        int numeroPrimitivo = 9;
        
        
        RaddoppiaValore x2 = new RaddoppiaValore();
        
        x2.raddoppia(numeroPrimitivo);
        x2.raddoppia(val);
        
        
        System.out.println("\nRisultati nel main");
        System.out.println("Passato per riferimento: "+val.numero);
        System.out.println("Passato per valore: "+numeroPrimitivo);
        
        
        
        
        
        
	
	
	}

}

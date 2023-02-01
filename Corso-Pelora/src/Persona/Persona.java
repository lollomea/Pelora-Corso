package Persona;

public class Persona 
{
	
	public String nome;
	public String cognome;
	public int eta;
	
	
	
	//Metodi GET e SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	

	//Costruttore di default che non è necessario definire
	public Persona()
	{
		
	}
	
	//Costruttore  personalizzato
	public Persona(String n, String c, int e)
	{
		nome    = n;
		cognome = c;
		eta     = e;
	}
	
	public Persona(String cognome, String nome)
	{
		//il this sta ad indicare il riferimento all'oggetto in se stesso
		//in questo caso this.cognome fa riferimento alla variabile di istanza cognome
		//mentre cognome al parametro formale del metodo, visto che si chiamano allo stesso modo con this facciamo distinzione
		//e il programma non saprebbe distinguere quale sia il parametro formare e quale la variabile d'istanza
		this.cognome = cognome;
		this.nome = nome;
	}
	
	
	public Persona( String cognome)
	{
		this.cognome = cognome;
	}
	
	
	
	
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

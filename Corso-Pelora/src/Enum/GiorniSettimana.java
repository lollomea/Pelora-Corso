package Enum;

public enum GiorniSettimana 
{
    LUNEDI(8),
    MARTEDI(8),
    MERCOLEDI(8),
    GIOVEDI(8),
    VENERDI(8),
    SABATO(0),
    DOMENICA(0);

    private int oreLav;
    GiorniSettimana(int oreLav)
    {
        this.oreLav=oreLav;
    }
    
    
    public int getOre()
    {
        return this.oreLav;
    }


}

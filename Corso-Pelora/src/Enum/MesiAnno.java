package Enum;

public enum MesiAnno 
{
    GENNAIO(31,"gen"),
    FEBBRAIO(28,"feb"),
    MARZO(31,"mar"),
    APRILE(30,"apr"),
    MAGGIO(31,"mag"),
    GIUGNO(30,"giu"),
    LUGLIO(31,"lug"),
    AGOSTO(31,"ago"),
    SETTEMBRE(30,"set"),
    OTTOBRE(31,"ott"),
    NOVEMBRE(30,"nov"),
    DICEMBRE(31,"dic");


    private int giorni;
    private String abbr;
    MesiAnno(int giorni, String abbr)
    {
        this.abbr   = abbr;
        this.giorni = giorni;
    }

    public int getGiorni()
    {
        return this.giorni;
    }

    public String getAbbr()
    {
        return this.abbr;
    }



    
}

package enumeracion;

public enum Continentes {
    
    AFRICA(53),
    ASIA(46),
    EUROPA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}

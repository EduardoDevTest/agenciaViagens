package enums;

public enum Destinos {

    CATAR("QATAR"),
    SIRIA("Síria"),
    ESTADOSUNIDOS("USA"),
    BRASIL("BRAZIL");

    private String pais;

    Destinos(String pais){
        this.pais = pais;

    }

    public String getPais(){
     return this.pais;
    }

}

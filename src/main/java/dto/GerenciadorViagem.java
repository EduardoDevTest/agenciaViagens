package dto;

import enums.Destinos;

public class GerenciadorViagem {
    private Destinos destino;


    // construtor é um método que apenas traz o nome do método, usado na invocação do objeto
    //quando eu invocar esse objeto ele ja traz o atributo
    public GerenciadorViagem(Destinos localDoDestino) {
        this.destino = localDoDestino;
        //encapsulamento seria proteger os atributos ou seja vamos impedir que todos tenham acasso aos atributos da classe
        // para isso vamos alterar o tipo do modificador para privado. Dessa forma se o atributo sa classe or usado em outras classes
        // ou objetos não podera ocorrer uma mudança de valor desse atributo.

    }

    public Destinos getDestino() {
        return this.destino;

    }

    public void setDestino(Destinos localDoDestino){
        this.destino = localDoDestino;
    }


}

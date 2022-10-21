package app;

import dto.GerenciadorViagem;
import enums.Destinos;

import java.sql.SQLOutput;

public class App {


    public static void main(String[] args) {

        GerenciadorViagem viagemNacional = new GerenciadorViagem(Destinos.ESTADOSUNIDOS);

           viagemNacional.setDestino(Destinos.BRASIL);

           System.out.println(viagemNacional.getDestino().getPais());

    }

}

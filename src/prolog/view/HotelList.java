/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog.view;

import java.util.Arrays;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
import java.util.Map;

/**
 *
 * @author Michel
 */
public class HotelList {

    private String nomeHotel;
    private String endereco;
    private String telefone;
    private String estrela;
    private String estacao;

    public HotelList(String nomeHotel, String endereco, String telefone, String estrela, String estacao) {
        this.nomeHotel = nomeHotel;
        this.endereco = endereco;
        this.telefone = telefone;
        this.estrela = estrela;
        this.estacao = estacao;
    }

    
    public String[] listaHoteis() {

        String c = "consult('hoteis.pl')";
        if (!Query.hasSolution(c)) {
            System.out.println(c + "Falhou");
        }

        Variable X = new Variable("X");
        Query qHotel = new Query("hotel", new Term[]{X});

        Map<String, Term>[] solutions = qHotel.allSolutions();

        String[] nHoteis = new String[4];

        nHoteis[0] = "-- SELECIONE --";
        for (int i = 0; i < solutions.length; i++) {
            nHoteis[i + 1] = solutions[i].get("X").toString();
        }

        return nHoteis;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstrela() {
        return estrela;
    }

    public void setEstrela(String estrela) {
        this.estrela = estrela;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    

}

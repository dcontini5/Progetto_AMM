/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progettoamm.Classi;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Quontini
 */
public class Gruppi {
    
    private String nome;
    private String urlFotoGruppo;
    private ArrayList<UtentiRegistrati> iscritti;
    private int id;
    
     /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the urlFotoGruppo
     */
    public String getUrlFotoGruppo() {
        return urlFotoGruppo;
    }

    /**
     * @param urlFotoGruppo the urlFotoGruppo to set
     */
    public void setUrlFotoGruppo(String urlFotoGruppo) {
        this.urlFotoGruppo = urlFotoGruppo;
    }

    /**
     * @return the iscritti
     */
    public ArrayList<UtentiRegistrati> getIscritti() {
        return iscritti;
    }

    /**
     * @param iscritti the iscritti to set
     */
    public void setIscritti(ArrayList<UtentiRegistrati> iscritti) {
        this.iscritti = iscritti;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
 
     @Override
    public boolean equals(Object altroGruppo){
        if (altroGruppo instanceof Gruppi)
            if (this.getId() == ((Gruppi)altroGruppo).getId()) return true;
        return false;
    }
    
    
    
}

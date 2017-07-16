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
public class GruppiFactory {
    
    private static GruppiFactory singleton;
    
    public static GruppiFactory getIstance(){
    
        if(singleton==null) singleton=new GruppiFactory();
        return singleton;
    }
    
    private ArrayList<Gruppi> listaGruppi = new ArrayList<Gruppi>();
    
    public GruppiFactory(){
    
        UtentiRegistratiFactory utentiRegistratiFactory = new UtentiRegistratiFactory();
        ArrayList<UtentiRegistrati> iscritti = new ArrayList<UtentiRegistrati>();

        Gruppi gruppo1 = new Gruppi();
        gruppo1.setId(0);
        gruppo1.setNome("Maratone");
        gruppo1.setUrlFotoGruppo("M2/img/runner-clip-art.jpg");
        iscritti.add(utentiRegistratiFactory.getUtentiById(0));
        iscritti.add(utentiRegistratiFactory.getUtentiById(3));
        gruppo1.setIscritti(iscritti);
        iscritti.clear();
        
        Gruppi gruppo2 = new Gruppi();
        gruppo2.setId(1);
        gruppo2.setNome("Fisica Del Teletrasporto");
        gruppo2.setUrlFotoGruppo("M2/img/atom.jpg");
        iscritti.add(utentiRegistratiFactory.getUtentiById(1));
        iscritti.add(utentiRegistratiFactory.getUtentiById(2));
        iscritti.add(utentiRegistratiFactory.getUtentiById(3));
        gruppo2.setIscritti(iscritti);
        iscritti.clear();
        
        listaGruppi.add(gruppo1);
        listaGruppi.add(gruppo2);
        
        
    }
    
    public Gruppi getGruppiById(int id){
    
          
        for (Gruppi gruppo : this.listaGruppi) {
            if (gruppo.getId() == id) {
                return gruppo;
            }
        }
        return null;
    
    
    }
    
    public List<Gruppi> getGruppiListByUser(UtentiRegistrati utente) {
    
        List<Gruppi> listaGruppi = new ArrayList<Gruppi>();

        for (Gruppi gruppo : this.listaGruppi) {
            if (gruppo.getIscritti().contains(utente)) {
                listaGruppi.add(gruppo);
            }
        }
        return listaGruppi;
    }
    
    
}

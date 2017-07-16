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
public class UtentiRegistratiFactory {


    private UtentiRegistratiFactory singleton;
   
    
    public UtentiRegistratiFactory getIstance() {
    
        if(singleton==null) singleton = new UtentiRegistratiFactory();
        return singleton;

    }
    
    private ArrayList<UtentiRegistrati> listaUtenti= new ArrayList<UtentiRegistrati>();
    
    public UtentiRegistratiFactory(){

        GruppiFactory gruppiFactory = new GruppiFactory();
        
        UtentiRegistrati utente1 = new UtentiRegistrati();
        utente1.setId(0);
        utente1.setNome("Mychael");
        utente1.setCognome("Myers");
        utente1.setEmail("MyckyMays@gmail.it");
        utente1.setPassword("1234");
        utente1.setUrlFotoProfilo("M2/img/Michael_myers.jpg");
        utente1.setDataNascita("11/12/1959");
        
        

        
        UtentiRegistrati utente2 = new UtentiRegistrati();
        utente1.setId(1);
        utente1.setNome("Freddy");
        utente1.setCognome("Krueger");
        utente1.setEmail("Sweetdreams@gmail.it");
        utente1.setPassword("1234");
        utente1.setUrlFotoProfilo("M2/img/krueger-glove,jpg");
        utente1.setDataNascita("6/6/1966");
        

        
        UtentiRegistrati utente3 = new UtentiRegistrati();
        utente1.setId(2);
        utente1.setNome("Jason");
        utente1.setCognome("Voorhees");
        utente1.setEmail("j_vores@gmail.it");
        utente1.setPassword("1234");
        utente1.setUrlFotoProfilo("M2/img/jason.jpg");
        utente1.setDataNascita("1/2/1947");
        
      
        
        UtentiRegistrati utente4 = new UtentiRegistrati();
        utente1.setId(3);
        utente1.setNome("Tizio");
        utente1.setCognome("Spaventato");
        utente1.setEmail("paura@gmail.it");
        utente1.setPassword("1234");
        utente1.setUrlFotoProfilo("M2/img/babadook.jpg");
        utente1.setDataNascita("1/1/1998");
        
        listaUtenti.add(utente1);
        listaUtenti.add(utente2);
        listaUtenti.add(utente3);
        listaUtenti.add(utente4);
    
    }
    
    public UtentiRegistrati getUtentiById(int id){
    
        for (UtentiRegistrati utenti : this.listaUtenti) {
            if (utenti.getId() == id) {
                return utenti;
            }
        }
        return null;
    
    }
}

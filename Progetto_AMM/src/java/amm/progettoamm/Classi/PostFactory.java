/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progettoamm.Classi;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Quontini
 */
public class PostFactory {
    
    private static PostFactory singleton;
    
    public static PostFactory getIstance(){
    
        if(singleton==null) singleton=new PostFactory();
        return singleton;
    }
    
    private ArrayList<Post> listaPost = new ArrayList<Post>();
    
    public PostFactory(){
    
     //   GruppiFactory gruppiFactory = new GruppiFacrory();
        UtentiRegistratiFactory utentiRegistratiFactory = new UtentiRegistratiFactory();
        
        
        
        
        Post post1 = new Post();
        post1.setContent("Gli omicidi sono come le mele, uno al giorno leva il medico di torno, sopratutto se uccidi il medico xD");
        post1.setId(0);
        post1.setPostType(Post.Type.TEXT);
        post1.setUser(utentiRegistratiFactory.getUtentiById(0));
        
        Post post2 = new Post();
        post2.setContent("Manicure fatta!! Chi mette mi piace? M2/img/NEC11644.jpg");
        post2.setId(1);
      //  post2.setGruppo(gruppiFactory.getGruppiById(0));
        post2.setPostType(Post.Type.IMAGE);
        post2.setUser(utentiRegistratiFactory.getUtentiById(1));
        
        Post post3 = new Post();
        post3.setContent("Cercate un posto in cui passare l'estate e divertirvi da morire? Venire a http://fridaythe13th.wikia.com/wiki/Camp_Crystal_Lake.");
        post3.setId(3);
       //  post2.setGruppo(gruppiFactory.getGruppiById(1));
        post3.setPostType(Post.Type.LINK);
        post3.setUser(utentiRegistratiFactory.getUtentiById(2));
        
        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);     

    }
    
    public Post getPostById(int id){
        
        for (Post post : this.listaPost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    
    }
    public List<Post> getPostListByGroup(Gruppi gruppo){
           
        List<Post> listaPost = new ArrayList<Post>();

        for (Post post: this.listaPost) {
            if (post.getGruppo().equals(gruppo)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    
    }
    
    public List<Post> getPostListByUser(UtentiRegistrati utente) {
    
        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost) {
            if (post.getUser().equals(utente)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
    
}

package application;

import magasins.Article;
import magasins.Cart;
import magasins.Magasin;
import magasins.User;

public class Application {

    public static void main(String[] args) {
        
        System.out.println(" ****** Ouverture d'un magasin ****** ");
        System.out.println();
        
        Magasin carouf = new Magasin();
        Article lait = new Article("Lait");
        Article eau = new Article("Eau");
        Article biscuit = new Article("Biscuits");
        Article carotte = new Article("Carottes");
         
        for (int i = 0; i < 100; i++) {
            carouf.addArticle(lait);
            carouf.addArticle(eau);
            carouf.addArticle(biscuit);
        }
        
        for (int i = 0; i < 50; i++) {
            carouf.addArticle(carotte);
          
        }
        
       
        Cart cart1 = new Cart();
        User dupont = new User("Dupont", "dupont@sfr.fr", 34);
        carouf.registerUser(dupont);
        
        for (int i = 0; i < 6; i++) {
            carouf.addArticleToCart(carotte, dupont);
        }
        for (int i = 0; i < 4; i++) {
            carouf.addArticleToCart(biscuit, dupont);
        }
        
        
        System.out.println(carouf.getStock());
        
        System.out.println(carouf);
        
        
        System.out.println("------------------------------------");
       
        carouf.payCart(dupont);
        
        System.out.println(carouf);
        
        
      
       
        
    
       
        
        
        
        
//        System.out.println(lait);
//        System.out.println(eau);
//        System.out.println(biscuit);
        
        

        
    }

}

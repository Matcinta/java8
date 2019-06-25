package magasin;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import magasins.Article;
import magasins.Magasin;
import magasins.User;

public class MagasinTest {

    Magasin magTest;
    Article apple = new Article("Apple");
    Article banana = new Article("Banana");
    User user1 = new User("Dupont", "mail@email.com", 56);
    
    
    @BeforeEach
    public void init() {
        magTest = new Magasin();
        magTest.addArticle(apple);
        magTest.addArticle(banana);
       
    }
    
//    @Test
//    public void testRegisterUser(User u) {
//        
//        Assert.assertArrayEquals(u );;
//    }
    
    @Test
    public void testSize() {
        Assert.assertEquals("verifier la taille de la liste du magasin", 2, magTest.getStock().size());
    }
    
    @Test
    public void testAddArticle() {
        magTest.addArticle(new Article("lemons"));
        Assert.assertEquals("Ajoute 1 nouvel article au magasin", 3, magTest.getStock().size());
    }
    
    @Test
    public void testRegisterUser() {
        boolean exist = magTest.getClients().containsKey(user1);
        Assert.assertFalse(exist);
        
        magTest.registerUser(user1);
        exist = magTest.getClients().containsKey(user1);
        
        Assert.assertEquals("Ajoute 1 nouvel utilisateur au magasin", 1, magTest.getClients().size());    
    }
    
    @Test
    public void testAddNArticle() {
        magTest.addNArticle(new Article ("tomatos"), 2);
        Assert.assertEquals("Ajoute n nouveaux articles au magasin", 3, magTest.getStock().size());
        
    }
    
    @Test
    public void testGetArticleStock() {
        magTest.getArticleStock(banana);
        Assert.assertEquals("Verifie le stock d'un article", 1, magTest.getArticleStock(banana));
    }
    
    @Test
    public void testAddArticleToCart() {
        magTest.addArticleToCart(banana, user1);
        Assert.assertEquals("Ajoute un article à un panier", 1, magTest.getClients().size());
    }
    
    @Test
    public void testPayCart() {
        magTest.payCart(user1);
        Assert.assertEquals("Regle (et vide) le contenu du panier d'un client et actualise le stock du magasin", 0, magTest.getStock().size());
    }
    
}

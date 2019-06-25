package magasins;

import java.util.HashMap;
import java.util.Map;

/**
 * La classe Magasin est dédiée à la création d'un magasin contenant une liste de clients et un stock d'articles.
 * Différentes méthodes permettent d'ajouter des articles au stock, d'ajouter des articles dans le panier d'un client,
 * d'actualiser le stock du magasin si un client règle son panier, etc.
 *  
 * @author Mathilde Munier
 */

public class Magasin {

    
   
    private Map<User, Cart> clients = new HashMap<>();
    private Map<Article, Integer> stock = new HashMap<>();

    public Magasin() {
        super();
        
    }

    

    public Map<User, Cart> getClients() {
        return clients;
    }

    public void setUsersMap(Map<User, Cart> clients) {
        this.clients = clients;
    }

    public Map<Article, Integer> getStock() {
        return stock;
    }

    public void setStock(Map<Article, Integer> stock) {
        this.stock = stock;
    }

   
    /**
     * La méthode “registerUser” permet d'ajouter un client à la liste des clients du magasin
     * @param u Le client que l'on souhaite ajouter à la liste des clients du magasin
     */
    
    public void registerUser(User u) {
        clients.put(u, new Cart());
    }

    /**
     * La méthode “addArticle” permet d'ajouter une unité d'article au stock du magasin
     * @param a L'article que l'on souhaite ajouter au stock du magasin.
     */
    
    public void addArticle(Article a) {
        if (stock.containsKey(a)) {
            int previousStock = stock.get(a);
            stock.put(a, previousStock + 1);
        } else
        stock.put(a, 1);

    }
    
    /**
     * La méthode “addNArticle” permet d'ajouter N unités d'articles au stock du magasin
     * @param article L'article que l'on souhaite ajouter au stock du magasin.
     * @param n Le nombre d'unités de l'article que l'on souhaite ajouter au stock du magasin.
     */
    
    public void addNArticle(Article article, int n) {
        for (int i = 0; i < n; i++) {
            this.addArticle(article);
        }
    }
    
    /**
     * La méthode “getArticleStock” permet de connaitre le stock disponible d'un article donné présent dans le magasin.
     * @param article L'article dont on souhaite connaitre l'état du stock.
     * @return le nombre d'unités d'un article dont on souhaite connaitre l'état du stock
     */
    
    public int getArticleStock(Article article) {
        int result = 0;
        if (stock.containsKey(article)) {
            result = stock.get(article);
        }
        return result;
    }
    
    /**
     * La méthode “addArticleToCart” permet d'ajouter une unité d'un article donné dans le panier d'un client donné.
     * Si l'article existe en stock et que l'utilisateur fait partie de la liste des clients
     * alors on peut ajouter l'article à son panier
     * @param article L'article que l'on souhaite ajouter au panier d'un utilisateur.
     * @param user L'utilisateur du panier à qui l'on veut ajouter un article.
     */
    
    public void addArticleToCart(Article article, User user) {
        
        if (stock.containsKey(article)
            && stock.get(article) > 0
            && clients.containsKey(user)) {
            Cart panier = clients.get(user);
            
            if(panier.containsKey(article)) {
                int quantite = panier.get(article);
                panier.put(article, quantite + 1);
            } else {
                panier.put(article, 1);
            }
        }
    }

    /**
     * La méthode “payCart” permet de déduire le contenu du panier d'un client qui souhaite le régler, du stock du magasin,
     * et en même temps de vider le contenu du panier du client.
     * @param u Le client souhaitant regler son panier.
     */
    
    public void payCart(User u) {
        if (clients.containsKey(u)) {
            Cart panier = clients.get(u);
            panier.forEach((article, qtt) -> {
                int stockQtt = stock.get(article);
                if (stockQtt >= qtt) {
                    stock.put(article, stockQtt - qtt);
                    panier.put(article, 0);
                   
                } else {
                    System.out.println("L'article "
                                        + article
                                        + " est en stock insuffisant. ("
                                        + qtt 
                                        + " demandés contre "
                                        + stockQtt
                                        + " en stock)");
                }
            });
        }
        
        //this.articlesMap.remove(c.getCartContent())
      }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + "\nListe des utilisateurs du magasin:\n\t" + clients
                + "\n\nArticles disponibles en magasin:\n\t" + stock;
    }

}

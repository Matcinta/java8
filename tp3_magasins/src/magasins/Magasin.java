package magasins;

import java.util.HashMap;
import java.util.Map;

/**
 * La classe Magasin est d�di�e � la cr�ation d'un magasin contenant une liste de clients et un stock d'articles.
 * Diff�rentes m�thodes permettent d'ajouter des articles au stock, d'ajouter des articles dans le panier d'un client,
 * d'actualiser le stock du magasin si un client r�gle son panier, etc.
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
     * La m�thode �registerUser� permet d'ajouter un client � la liste des clients du magasin
     * @param u Le client que l'on souhaite ajouter � la liste des clients du magasin
     */
    
    public void registerUser(User u) {
        clients.put(u, new Cart());
    }

    /**
     * La m�thode �addArticle� permet d'ajouter une unit� d'article au stock du magasin
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
     * La m�thode �addNArticle� permet d'ajouter N unit�s d'articles au stock du magasin
     * @param article L'article que l'on souhaite ajouter au stock du magasin.
     * @param n Le nombre d'unit�s de l'article que l'on souhaite ajouter au stock du magasin.
     */
    
    public void addNArticle(Article article, int n) {
        for (int i = 0; i < n; i++) {
            this.addArticle(article);
        }
    }
    
    /**
     * La m�thode �getArticleStock� permet de connaitre le stock disponible d'un article donn� pr�sent dans le magasin.
     * @param article L'article dont on souhaite connaitre l'�tat du stock.
     * @return le nombre d'unit�s d'un article dont on souhaite connaitre l'�tat du stock
     */
    
    public int getArticleStock(Article article) {
        int result = 0;
        if (stock.containsKey(article)) {
            result = stock.get(article);
        }
        return result;
    }
    
    /**
     * La m�thode �addArticleToCart� permet d'ajouter une unit� d'un article donn� dans le panier d'un client donn�.
     * Si l'article existe en stock et que l'utilisateur fait partie de la liste des clients
     * alors on peut ajouter l'article � son panier
     * @param article L'article que l'on souhaite ajouter au panier d'un utilisateur.
     * @param user L'utilisateur du panier � qui l'on veut ajouter un article.
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
     * La m�thode �payCart� permet de d�duire le contenu du panier d'un client qui souhaite le r�gler, du stock du magasin,
     * et en m�me temps de vider le contenu du panier du client.
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
                                        + " demand�s contre "
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

package application;

import stringtransform.StringTransform;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringTransform test = new StringTransform ();
       
        // a. Si �operation� vaut �concat�, la m�thode �transform� doit
        // retourner la concat�nation de �initial� et �modificateur�
        System.out.println(test.transform("chAt", "concat", "pito"));
        
        
//        b. Si �operation� vaut �upper�, la m�thode �transform� doit
//        retourner la chaine �initial� en majuscule. �modificateur�
//        est alors inutile.
        System.out.println(test.transform("chat", "upper", "pito"));
        
//        c. Si �operation� vaut �lower�, la m�thode �transform� doit
//        retourner la chaine �initial� en minuscule. �modificateur�
//        est alors inutile.
        System.out.println(test.transform("chat", "lower", "pito"));
        
//        d. Si �operation� vaut �zip�, la methode �transform� doit
//        retourner les cha�nes �initial� et �modificateur� altern�es.
//        Exemple : transform(�Hello�, �zip�, �World�) doit
//        retourner �HWeolrllod�;
        System.out.println(test.transform("chat", "zip", "rat"));
        System.out.println(test.transform("rat", "zip", "chien"));
        
//        e. Si �operation� vaut �reverse�, la m�thode �transform�
//        retourne la chaine �initial� � l�envers.
        System.out.println(test.transform("Hello", "reverse", "World"));
        
//        f. Si �operation� vaut �tacnoc�, la m�thode �transform�
//        retourne la concat�nation de �modificateur� � l�envers et
//        de �initial� � l�envers.
        System.out.println(test.transform("chat", "tacnoc", "rat"));
        
    }
    

}

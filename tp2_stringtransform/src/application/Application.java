package application;

import stringtransform.StringTransform;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringTransform test = new StringTransform ();
       
        // a. Si “operation” vaut “concat”, la méthode “transform” doit
        // retourner la concaténation de “initial” et “modificateur”
        System.out.println(test.transform("chAt", "concat", "pito"));
        
        
//        b. Si “operation” vaut “upper”, la méthode “transform” doit
//        retourner la chaine “initial” en majuscule. “modificateur”
//        est alors inutile.
        System.out.println(test.transform("chat", "upper", "pito"));
        
//        c. Si “operation” vaut “lower”, la méthode “transform” doit
//        retourner la chaine “initial” en minuscule. “modificateur”
//        est alors inutile.
        System.out.println(test.transform("chat", "lower", "pito"));
        
//        d. Si “operation” vaut “zip”, la methode “transform” doit
//        retourner les chaînes “initial” et “modificateur” alternées.
//        Exemple : transform(“Hello”, “zip”, “World”) doit
//        retourner “HWeolrllod”;
        System.out.println(test.transform("chat", "zip", "pitoo"));
        
        
        
    }
    

}

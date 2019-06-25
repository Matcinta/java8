package stringtransform;

/**
 * La classe StringTransform est dédiée à la mise en oeuvre de méthodes de
 * transformation de chaines de caractères
 * 
 * @author Mathilde Munier
 */

public class StringTransform {

    /**
     * La méthode "transform" réalise des modifications sur des chaines de
     * caractères passées en paramètre la modification a effectuée est choisie par
     * l'utilisateur
     * 
     * @param initial   La première chaine de caractères à prendre en compte
     * @param operation correspond à l'opération que l'on souhaite effectuer sur la
     *                  ou les chaines de caractères passées en paramètres
     * @param modificateur La deuxième chaine de caractères à prendre en compte
     * @return la (les) chaine(s) de caractères passée(s) en paramètre modifiée(s)
     */
    public String transform(String initial, String operation, String modificateur) {
        String result = "";

        /**
         * Si “operation” vaut “concat”, la méthode “transform” retourne la
         * concaténation de “initial” et “modificateur”
         */

        if (operation.equals("concat")) {
            result = initial.concat(modificateur);
        }

        /**
         * Si “operation” vaut “upper”, la méthode “transform” retourne la chaine de
         * caractères “initial” en majuscules. “modificateur” est alors inutile.
         */

        if (operation.equals("upper")) {
            result = initial.toUpperCase();
        }

        /**
         * Si “operation” vaut “lower”, la méthode “transform” retourne la chaine de
         * caractères “initial” en minuscule. “modificateur” est alors inutile.
         */

        if (operation.equals("lower")) {
            result = initial.toLowerCase();
        }

        /**
         * Si “operation” vaut “zip”, la methode “transform” retourne les chaînes
         * “initial” et “modificateur” alternées. Exemple : transform(“Hello”, “zip”,
         * “World”) doit retourner “HWeolrllod”;
         */

        if (operation.equals("zip")) {
            if (initial.length() <= modificateur.length()) {

                for (int i = 0; i < initial.length(); i++) {
                    result = result + initial.charAt(i) + modificateur.charAt(i);

                }
            }
            if (initial.length() > modificateur.length()) {

                for (int i = 0; i < modificateur.length(); i++) {
                    result = result + initial.charAt(i) + modificateur.charAt(i);

                }
            }
        }

        /**
         * Si “operation” vaut “reverse”, la méthode “transform” retourne la chaine
         * “initial” à l’envers.
         */

        if (operation.equals("reverse")) {
            for (int i = initial.length() - 1; i >= 0; i--) {
                result = result + initial.charAt(i);

            }
        }

        /**
         * Si “operation” vaut “tacnoc”, la méthode “transform” retourne la
         * concaténation de “modificateur” à l’envers et de “initial” à l’envers.
         */
        
        if (operation.equals("tacnoc")) {
            String result1 = "";
            String result2 = "";
            for (int i = initial.length() - 1; i >= 0; i--) {
                result1 = result1 + initial.charAt(i);
            }
            for (int i = modificateur.length() - 1; i >= 0; i--) {
                result2 = result2 + modificateur.charAt(i);
            }
            result = result1.concat(result2);
        }
        return result;
    }
}

package stringtransform;

/**
 * La classe StringTransform est d�di�e � la mise en oeuvre de m�thodes de
 * transformation de chaines de caract�res
 * 
 * @author Mathilde Munier
 */

public class StringTransform {

    /**
     * La m�thode "transform" r�alise des modifications sur des chaines de
     * caract�res pass�es en param�tre la modification a effectu�e est choisie par
     * l'utilisateur
     * 
     * @param initial   La premi�re chaine de caract�res � prendre en compte
     * @param operation correspond � l'op�ration que l'on souhaite effectuer sur la
     *                  ou les chaines de caract�res pass�es en param�tres
     * @param modificateur La deuxi�me chaine de caract�res � prendre en compte
     * @return la (les) chaine(s) de caract�res pass�e(s) en param�tre modifi�e(s)
     */
    public String transform(String initial, String operation, String modificateur) {
        String result = "";

        /**
         * Si �operation� vaut �concat�, la m�thode �transform� retourne la
         * concat�nation de �initial� et �modificateur�
         */

        if (operation.equals("concat")) {
            result = initial.concat(modificateur);
        }

        /**
         * Si �operation� vaut �upper�, la m�thode �transform� retourne la chaine de
         * caract�res �initial� en majuscules. �modificateur� est alors inutile.
         */

        if (operation.equals("upper")) {
            result = initial.toUpperCase();
        }

        /**
         * Si �operation� vaut �lower�, la m�thode �transform� retourne la chaine de
         * caract�res �initial� en minuscule. �modificateur� est alors inutile.
         */

        if (operation.equals("lower")) {
            result = initial.toLowerCase();
        }

        /**
         * Si �operation� vaut �zip�, la methode �transform� retourne les cha�nes
         * �initial� et �modificateur� altern�es. Exemple : transform(�Hello�, �zip�,
         * �World�) doit retourner �HWeolrllod�;
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
         * Si �operation� vaut �reverse�, la m�thode �transform� retourne la chaine
         * �initial� � l�envers.
         */

        if (operation.equals("reverse")) {
            for (int i = initial.length() - 1; i >= 0; i--) {
                result = result + initial.charAt(i);

            }
        }

        /**
         * Si �operation� vaut �tacnoc�, la m�thode �transform� retourne la
         * concat�nation de �modificateur� � l�envers et de �initial� � l�envers.
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

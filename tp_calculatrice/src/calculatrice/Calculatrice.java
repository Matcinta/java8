package calculatrice;

/**
 * La classe Calculatrice est d�di�e � la mise en oeuvre de m�thodes de
 * r�solution math�matique
 * 
 * @author Mathilde Munier
 */

public class Calculatrice {

    /**
     * La m�thode "plus" r�alise la somme de deux nombres entiers de type int
     * 
     * @param a Le premier nombre que l'on va additionner
     * @param b Le second nombre que l'on va additionner
     * @return La somme de a et b
     */
    public int plus(int a, int b) {
        if (b < 0) {
            for (int i = 0; i > b; i--) {
                a--;
            }
        } else {
            for (int i = 0; i < b; i++) {
                a++;
            }

        }
        return a;
    }
    
    /**
     * La m�thode "moins" r�alise la soustraction de deux nombres entiers de type int
     * @param a le premier nombre que l'on veut soustraire
     * @param b Le second nombre que l'on va soustraire au premier chiffre a
     * @return La diff�rence de a et b
     */
    
    public int moins(int a, int b) {
        if (b < 0) {
            for (int i = 0; i > b; i--)
                a++; 
              
        }
        for (int i = 0; i < b; i++) {
           a--; 
        }
        return a;
    }
    
    /**
     * La m�thode "mul" r�alise la multiplication de deux nombres entiers de type int
     * @param a Le premier nombre que l'on va multiplier
     * @param b le multiplicateur
     * @return La multiplication de a et b
     */
    
    public int mul(int a, int b) {
        int result = 0;
        
        int bAbs = valAbsolue(b);
        int aAbs = valAbsolue(a);
            for (int i = 0; i < bAbs; i++) {
                result = this.plus(aAbs, result); 
            }
        if (b < 0 || a < 0) {
            result = valNegative(result);
        }
  
        if (b < 0 && a <0) {
         result = valAbsolue(result);
        }
        
        return result;
    }
    
    /**
     * La m�thode "div" r�alise la division de deux nombres entiers de type int
     * @param a Le premier nombre que l'on va diviser
     * @param b Le second nombre, diviseur de a
     * @return La division de a par b
     */
    
    public int div(int a, int b) {
        
        int result = 0;
        if (b == 0) {
           throw new ArithmeticException(); 
        } 
        int bAbs = valAbsolue(b);
        int aAbs = valAbsolue(a);
        while (aAbs >= bAbs) {
            aAbs = moins (aAbs, bAbs);
            result++;
        }
        if (b < 0 || a < 0) {
            result = valNegative(result);
        }
  
        if (b < 0 && a <0) {
         result = valAbsolue(result);
        }
             
       
        return result;
    }
    
    /**
     * La m�thode "mod" retourne le reste de a divis� par b 
     * @param a le num�rateur entier de type int
     * @param b le diviseur entier de type int
     * @return le reste de la division de a par b
     */
    public int mod(int a, int b) { // int result = this.moins(a, this.mul(b, this.div(a, b)));
        while (a>= b) {
            a = moins (a,b); 
        }
        return a;
    }
    
    /**
     * La m�thode "pow" r�alise la puissance de deux nombres entiers de type int
     * @param a le nombre � transformer en puissance
     * @param b l'exposant
     * @return le r�sultat de a � la puissance b
     */
    public int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = this.mul(a, result);
        }
        return result;
    }
    
    public int valAbsolue(int val) {
       if (val<0) {
           val = moins (0, val);
       }
       return val;
    }
    
    public int valNegative(int val) {
        if (val > 0) {
            val = moins (0, val);
        }
        return val;
    }
}

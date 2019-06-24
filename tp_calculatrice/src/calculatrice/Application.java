package calculatrice;

public class Application {

    public static void main(String[] args) {

        Calculatrice calc = new Calculatrice();

        System.out.println("Des additions: ");
        System.out.println(calc.plus(5, -3));
        System.out.println(calc.plus(10, 3));

        System.out.println("Des soustractions: ");
        System.out.println(calc.moins(5, -3));
        System.out.println(calc.moins(6, 4));

        System.out.println("Des multiplications: ");
        System.out.println(calc.mul(5, -2));
        System.out.println(calc.mul(-10, -2));

        System.out.println("Des divisions: ");
        System.out.println(calc.div(15, 5));
        System.out.println(calc.div(-4, 2));
        System.out.println(calc.div(-4, -2));

        try {
            System.out.println(calc.div(4, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erreur: impossible de diviser par 0!");
        }

        System.out.println("Des modulos: ");
        System.out.println(calc.mod(21, 5));
        System.out.println(calc.mod(20, 5));

        System.out.println("Des puissances: ");
        System.out.println(calc.pow(2, 2));
        System.out.println(calc.pow(3, 2));

    }

}
